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

/**
 *
 * @author win
 */
public class ProductDAO extends DBContext{
        //Get First Product
    public Product getFirstProduct() {
        String sql = "select * from products";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4), rs.getInt(5), rs.getDouble(6),
                        rs.getDouble(7), rs.getString(8), rs.getInt(9), rs.getBoolean(10));
                return product;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    //Get All product
    public List<Product> getAll() {
        List<Product> listProduct = new ArrayList<>(); //contain all product
        String sql = "select * from products";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) { //have next element
                Product product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4), rs.getInt(5), rs.getDouble(6),
                        rs.getDouble(7), rs.getString(8), rs.getInt(9), rs.getBoolean(10));
                listProduct.add(product);//add item to list
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listProduct;
    }

    //get product by id
    public Product getProductById(int id) {
        String sql = "select * from products where product_id = ?";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4), rs.getInt(5), rs.getDouble(6),
                        rs.getDouble(7), rs.getString(8), rs.getInt(9), rs.getBoolean(10));
                return product;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return null;
    }

}
