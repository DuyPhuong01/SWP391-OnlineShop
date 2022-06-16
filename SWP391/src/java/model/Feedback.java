
package model;

/**
 *
 * @author Duy Phuong
 */
public class Feedback {
    private Account account;//
    private Product product;//
    private String fullName;
    private String phoneNum;
    private boolean gender;
    private String email;
    private int rate;//
    private String feedback;//
    private String fileName;

    public Feedback() {
    }

    public Feedback(Account account, Product product, String fullName, String phoneNum, boolean gender, String email, int rate, String feedback, String fileName) {
        this.account = account;
        this.product = product;
        this.fullName = fullName;
        this.phoneNum = phoneNum;
        this.gender = gender;
        this.email = email;
        this.rate = rate;
        this.feedback = feedback;
        this.fileName = fileName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    
}
