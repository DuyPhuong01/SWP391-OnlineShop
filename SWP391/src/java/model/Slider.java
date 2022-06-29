
package model;

/**
 *
 * @author Duy Phuong
 */
public class Slider {
    private int id;
    private String imagePath;
    private String title;
    private String url;
    private String status;
    private String notes;

    public Slider() {
    }

    public Slider(int id, String imagePath, String title, String url, String status, String notes) {
        this.id = id;
        this.imagePath = imagePath;
        this.title = title;
        this.url = url;
        this.status = status;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
}
