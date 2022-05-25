
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ProductCategory;

public class CategoryDAO extends DBContext {
    public ProductCategory getProductCategory(int category_id) {
        String sql = "select * from product_categories where category_id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, category_id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                ProductCategory product_category = new ProductCategory(rs.getInt("category_id"),
                        rs.getString("category_name"),
                        rs.getString("description"),
                        rs.getInt("status")
                );
                return product_category;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return null;
    }
    public List<ProductCategory> getProductCategory() {
        List<ProductCategory> list = new ArrayList<>();
        String sql = "select * from product_categories";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ProductCategory product_category = new ProductCategory(rs.getInt("category_id"),
                        rs.getString("category_name"),
                        rs.getString("description"),
                        rs.getInt("status")
                );
                list.add(product_category);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }
    public ProductCategory getPostCategory(int category_id) {
        String sql = "select * from post_categories where category_id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, category_id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                ProductCategory category = new ProductCategory(rs.getInt("category_id"),
                        rs.getString("category_name"),
                        rs.getString("description"),
                        rs.getInt("status")
                );
                return category;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return null;
    }
    public List<ProductCategory> getPostCategory() {
        List<ProductCategory> list = new ArrayList<>();
        String sql = "select * from post_categories";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ProductCategory category = new ProductCategory(rs.getInt("category_id"),
                        rs.getString("category_name"),
                        rs.getString("description"),
                        rs.getInt("status")
                );
                list.add(category);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }
    
     //search category name by category id
    public String getCategoryNameByID(int id){
        ProductCategory productCategory = getProductCategory(id);
        return productCategory.getCategory_name();
    }     
}
