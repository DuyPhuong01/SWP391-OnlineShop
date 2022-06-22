package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Post;
import model.Tag;

public class PostDAO extends DBContext {

    private Post filpostDetails(ResultSet rs) throws SQLException {
        CategoryDAO category_dao = new CategoryDAO();
        int post_id = rs.getInt("post_id");
        return new Post(
                post_id,
                rs.getInt("user_id"),
                rs.getString("thumbnail"),
                rs.getString("title"),
                rs.getString("sub_title"),
                getTags(post_id),
                rs.getTimestamp("publication_date"),
                rs.getTimestamp("updated_date"),
                category_dao.getPostCategory(rs.getInt("category_id")),
                rs.getString("post_details"),
                rs.getBoolean("featured")
        );
    }

    public List<Post> getPosts(int featured, int start, int end) {
        return getPosts("publication_date", featured, "", -1, null, start, end);
    }

    public List<Post> getPosts(boolean featured, int start, int end) {
        return getPosts("publication_date", featured ? 1 : 0, "", -1, null, start, end);
    }

    public List<Post> getPosts(String orderOption, int featured, String title_search_key, int category_id, List<Integer> tag_id_list, int start, int end) {
        /**
         * select * from ( select ROW_NUMBER() over (order by updated_date desc)
         * as Row,p.* from posts p inner join tag_post tp on p.post_id =
         * tp.post_id where p.title like '%%' and p.category_id = 1 and
         * tp.tag_id in (1) ) all_posts where Row between 1 and 22
         */
        
        List<Post> list = new ArrayList<>();
        String sql = "select * from (select ROW_NUMBER() over (order by " + orderOption + ") as Row,p.* from posts p "
                + "inner join tag_post tp on p.post_id = tp.post_id "
                + "where p.featured=? and p.title like '%" + title_search_key + "%' ";
        if (category_id > 0) {
            sql += "and p.category_id =" + category_id;
        }
        if (tag_id_list != null && tag_id_list.size()>0) {
            sql += "and tp.tag_id in (";
            for (int tag_id : tag_id_list) {
                sql += tag_id + ",";
            }
            if (sql.endsWith(",")) {
                sql = sql.substring(0, sql.length() - 1);
            }
            sql += ")";
        }
        sql += ") all_posts where Row between " + start + " and " + end;
        System.out.println(sql);
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, featured);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Post post = filpostDetails(rs);
                list.add(post);
            }
            st.close();
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }
    
    public Post getPost(int id){
        String sql = "select * from posts where post_id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next())
                return filpostDetails(rs);
            st.close();
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return null;
    }
    
    public int countPosts() {
        String sql = "select count(post_id) from posts";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            st.close();
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return 0;
    }
    public int countPosts(int featured, String title_search_key, int category_id, List<Integer> tag_id_list) {
        String sql = "select count(p.post_id) as count from posts p "
                + "inner join tag_post tp on p.post_id = tp.post_id "
                + "where p.featured=? and p.title like '%" + title_search_key + "%' ";
        if (category_id > 0) {
            sql += "and p.category_id =" + category_id;
        }
        if (tag_id_list != null && tag_id_list.size()>0) {
            sql += "and tp.tag_id in (";
            for (int tag_id : tag_id_list) {
                sql += tag_id + ",";
            }
            if (sql.endsWith(",")) {
                sql = sql.substring(0, sql.length() - 1);
            }
            sql += ")";
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, featured);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt("count");
            }
            st.close();
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc="Tag">
    public List<Tag> getTags(int post_id) {
        List<Tag> list = new ArrayList<>();
        String sql = "select t.* from tags t "
                + "inner join tag_post tp on t.tag_id = tp.tag_id "
                + "where tp.post_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, post_id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Tag tag = new Tag(rs.getInt("tag_id"), rs.getString("tag_name"));
                list.add(tag);
            }
            st.close();
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }
    // </editor-fold>

}
