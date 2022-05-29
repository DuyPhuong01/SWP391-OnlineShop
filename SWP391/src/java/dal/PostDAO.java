
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Post;

public class PostDAO extends DBContext {
    public List<Post> getActivePosts() {
        CategoryDAO category_dao = new CategoryDAO();
        List<Post> list = new ArrayList<>();
        String sql = "select * from posts where featured=1";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Post post = new Post(rs.getInt("post_id"),
                        rs.getInt("user_id"), 
                        rs.getString("thumbnail"),
                        rs.getString("title"),
                        rs.getTimestamp("updated_date"), 
                        category_dao.getPostCategory(rs.getInt("category_id")), 
                        rs.getString("post_details"),
                        rs.getBoolean("featured")
                );
                list.add(post);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }
    public List<Post> getHotActivePosts(int numberOfPost) {
        CategoryDAO category_dao = new CategoryDAO();
        List<Post> list = new ArrayList<>();
        String sql = "select * from posts where featured=1 order by updated_date desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()&&(numberOfPost--)>0) {
                Post post = new Post(rs.getInt("post_id"),
                        rs.getInt("user_id"), 
                        rs.getString("thumbnail"), 
                        rs.getString("title"), 
                        rs.getTimestamp("updated_date"), 
                        category_dao.getPostCategory(rs.getInt("category_id")), 
                        rs.getString("post_details"),
                        rs.getBoolean("featured")
                );
                list.add(post);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }
}
