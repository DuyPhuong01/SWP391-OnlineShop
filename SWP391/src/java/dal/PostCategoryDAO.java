/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.PostCategory;

/**
 *
 * @author Admin
 */
public class PostCategoryDAO extends DBContext {
    
    public PostCategory getPostCategory(int id) {
        String sql = "select * from post_categories where category_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                PostCategory category = new PostCategory(rs.getInt("category_id"),
                        rs.getString("category_name"),
                        rs.getString("description"),
                        rs.getBoolean("status")
                );
                return category;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return null;
    }
    public static void main(String[] args) {
        PostCategoryDAO p = new PostCategoryDAO();
        System.out.println(p.getPostCategory(1).getCategory_name());
    }
}
