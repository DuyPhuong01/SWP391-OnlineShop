/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.SubCategoryDAO;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PostCategory {
    int category_id;
    String category_name;
    String description;
    boolean status;
    List<PostSubCategory>subcategories; // cái này ko nên cho vào b à, nếu ở đây có r thì bên sub ko có PostCategory, xong r đấy ok tks :((
    public PostCategory() {
    }

    public PostCategory(int category_id, String category_name, String description, boolean status) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.description = description;
        this.status = status;
    }
    public PostCategory(int category_id, String category_name, String description, boolean status, List<PostSubCategory> subcategories) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.description = description;
        this.status = status;
        this.subcategories = subcategories;
    }

    public int getCategory_id() {
        return category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isStatus() {
        return status;
    }

    public List<PostSubCategory> getSubcategories() {
        return subcategories;
    }

    @Override
    public String toString() {
        return "PostCategory{" + "category_id=" + category_id + ", category_name=" + category_name + ", description=" + description + ", status=" + status + ", subcategories=" + subcategories + '}';
    }
}