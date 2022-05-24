
package model;

import java.sql.Timestamp;

public class Post {

    private int post_id;
    private int user_id;
    private String thumbnail;
    private String title;
    private Timestamp updated_date;
    private int category_id;
    private String post_details;
    private boolean featured;

    public Post() {
    }

    public Post(int post_id, int user_id, String thumbnail, String title, Timestamp updated_date, int category_id, String post_details, boolean featured) {
        this.post_id = post_id;
        this.user_id = user_id;
        this.thumbnail = thumbnail;
        this.title = title;
        this.updated_date = updated_date;
        this.category_id = category_id;
        this.post_details = post_details;
        this.featured = featured;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Timestamp updated_date) {
        this.updated_date = updated_date;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getPost_details() {
        return post_details;
    }

    public void setPost_details(String posts_detail) {
        this.post_details = posts_detail;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }
    
}
