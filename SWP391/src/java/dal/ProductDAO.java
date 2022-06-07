/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import model.ProductImage;

/**
 *
 * @author Admin
 */
public class ProductDAO extends DBContext {
    private Product filProductInfor(ResultSet rs) throws SQLException{
        CategoryDAO category_dao = new CategoryDAO();
        int product_id = rs.getInt("product_id");
        return new Product(product_id,
            rs.getString("name"),
            rs.getString("model"),
            rs.getString("thumbnail"),
            rs.getString("brief_infor"),
            category_dao.getProductSubCategory(rs.getInt("sub_category_id")),
            rs.getInt("unit_in_stock"),
            rs.getDouble("original_price"),
            rs.getDouble("sale_price"),
            rs.getInt("status")
        );
    }
    
    private Product filProductDetails(ResultSet rs) throws SQLException{
        CategoryDAO category_dao = new CategoryDAO();
        int product_id = rs.getInt("product_id");
        return new Product(product_id,
            rs.getString("name"),
            rs.getString("model"),
            rs.getString("thumbnail"),
            rs.getString("brief_infor"),
            getProductImages(product_id),
            category_dao.getProductSubCategory(rs.getInt("sub_category_id")),
            rs.getInt("unit_in_stock"),
            rs.getString("updated_date"),
            rs.getDouble("original_price"),
            rs.getDouble("sale_price"),
            rs.getString("product_details"), null,
            rs.getInt("featured")==1,
            rs.getInt("status")
        );
    }
    
    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();
        String sql = "select * from products order by updated_date desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product product = filProductInfor(rs);
                productList.add(product);
            }
            return productList;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Product> getAllProducts(int[] categories, String key) {
//        select * from products where title like '%%' and category_id in (1, 2)
        List<Product> productList = new ArrayList<>();
        String sql = "select * from products ";
        sql += "where title like '%" + key + "%' ";
        if (categories != null) {
            sql += "and category_id in (";
            for (int i = 0; i < categories.length; i++) {
                sql += categories[i] + ",";
            }
            if (sql.endsWith(",")) {
                sql = sql.substring(0, sql.length() - 1);
            }
            sql += ")";
        }
        sql += " order by updated_date desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product product = filProductInfor(rs);
                productList.add(product);
            }
            return productList;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    public List<Product> getAllProducts(int[] categories, String key, String orderOption) {
//        select * from products where title like '%%' and category_id in (1, 2)
        CategoryDAO category_dao = new CategoryDAO();
        List<Product> productList = new ArrayList<>();
        String sql = "select * from products ";
        sql += "where name like '%" + key + "%' ";
        if (categories != null) {
            sql += "and category_id in (";
            for (int i = 0; i < categories.length; i++) {
                sql += categories[i] + ",";
            }
            if (sql.endsWith(",")) {
                sql = sql.substring(0, sql.length() - 1);
            }
            sql += ")";
        }
        if(orderOption.equals("newest")){
            sql += " order by updated_date desc";
        } else if(orderOption.equals("oldest")){
            sql += " order by updated_date asc";
        } else if(orderOption.equals("lowestPrice")){
            sql += " order by original_price asc";
        } else {
            sql += " order by original_price desc";
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product product = filProductInfor(rs);
                productList.add(product);
            }
            return productList;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Product> getListByPage(List<Product> list, int start, int end) {
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }

    public Product getProduct(int id) {
        String sql = "select * from products where product_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Product product = filProductDetails(rs);
                return product;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return null;
    }

    public List<ProductImage> getProductImages(int product_id) {
        List<ProductImage> list = new ArrayList<>();
        String sql = "select * from product_images where product_id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, product_id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ProductImage productiamge = new ProductImage(rs.getInt("image_id"),
                        rs.getString("url"),
                        rs.getString("description")
                );
                list.add(productiamge);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }
    public List<Product> getNewestActiveProducts(int numberOfProduct) {
        CategoryDAO category_dao = new CategoryDAO();
        List<Product> list = new ArrayList<>();
        String sql = "select * from products where featured=1 order by updated_date desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next() && numberOfProduct-->0) {
                Product product = filProductInfor(rs);
                list.add(product);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }
    public List<Product> getLastActiveProducts(int number) {
        CategoryDAO category_dao = new CategoryDAO();
        List<Product> list = new ArrayList<>();
        String sql = "select top "+number+" * from products where featured=1 order by product_id desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product product = filProductInfor(rs);
                list.add(product);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }
    public List<Product> getProducts(int number, boolean featured) {
        List<Product> list = new ArrayList<>();
        String sql = "select top(?) * from products where featured=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, number);
            st.setInt(2, featured?1:0);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product product = filProductInfor(rs);
                list.add(product);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }
}
