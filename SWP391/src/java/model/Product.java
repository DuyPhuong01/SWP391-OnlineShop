/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.CategoryDAO;
import dal.ProductDAO;
import java.sql.Timestamp;

/**
 *
 * @author Admin
 */
public class Product {
    private int product_id;
    private String title;
    private int category_id;
    private int unit_in_stock;
    private Timestamp updated_date;
    private double original_price;
    private double sale_price;
    private String product_details;
    private boolean featured;
    private  int status;

    
   
    public Product() {
    }

    public Product(int product_id, String title, int category_id, int unit_in_stock, Timestamp updated_date, double original_price, double sale_price, String product_details, boolean featured, int status) {
        this.product_id = product_id;
        this.title = title;
        this.category_id = category_id;
        this.unit_in_stock = unit_in_stock;
        this.updated_date = updated_date;
        this.original_price = original_price;
        this.sale_price = sale_price;
        this.product_details = product_details;
        this.featured = featured;
        this.status = status;
    }

   

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

        //get thumbnail
    public String getThumbnail() {
       ProductDAO productDAO=new ProductDAO();
        String thumbnail = productDAO.getThumbnailByID(product_id);//get thumbnail
        return thumbnail;
    }
        //get category
    public String getCategory() {
        CategoryDAO categoryDAO=new CategoryDAO();
        String categoryNameByID = categoryDAO.getCategoryNameByID(category_id); //search
        return categoryNameByID;
    }
    public int getUnit_in_stock() {
        return unit_in_stock;
    }

    public void setUnit_in_stock(int unit_in_stock) {
        this.unit_in_stock = unit_in_stock;
    }

    public Timestamp getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Timestamp updated_date) {
        this.updated_date = updated_date;
    }

    public double getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(double original_price) {
        this.original_price = original_price;
    }

    public double getSale_price() {
        return sale_price;
    }

    public void setSale_price(double sale_price) {
        this.sale_price = sale_price;
    }

    public String getProduct_details() {
        return product_details;
    }

    public void setProduct_details(String product_details) {
        this.product_details = product_details;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", title=" + title + ", category_id=" + category_id + ", unit_in_stock=" + unit_in_stock + ", updated_date=" + updated_date + ", original_price=" + original_price + ", sale_price=" + sale_price + ", product_details=" + product_details + ", featured=" + featured + ", status=" + status + '}';
    }
    
    
    

    
    

}
