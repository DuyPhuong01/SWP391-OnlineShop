/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class PostCategory {
    int category_id;
    String category_name;
    String descriptionl;
    boolean status;

    public PostCategory() {
    }

    public PostCategory(int category_id, String category_name, String descriptionl, boolean status) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.descriptionl = descriptionl;
        this.status = status;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getDescriptionl() {
        return descriptionl;
    }

    public void setDescriptionl(String descriptionl) {
        this.descriptionl = descriptionl;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
