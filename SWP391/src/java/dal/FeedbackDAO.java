/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;
import model.Feedback;

/**
 *
 * @author tretr
 */
public class FeedbackDAO extends DBContext {

    public void insertFeedback(Feedback f) {
        String sql = "INSERT INTO [product_feedbacks]\n"
                + "           ([user_id]\n"
                + "           ,[product_id]\n"
                + "           ,[star]\n"
                + "           ,[feedbacks_content]\n"
                + "           ,[full_name]\n"
                + "           ,[phone]\n"
                + "           ,[gender]\n"
                + "           ,[email]\n"
                + "           ,[image_url]\n"
                + "           ,[feedback_date])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,GETDATE())";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, f.getAccount().getUser_id());
            stm.setInt(2, f.getProduct().getProduct_id());
            stm.setFloat(3, f.getRate());
            stm.setString(4, f.getFeedback());
            stm.setString(5, f.getFullName());
            stm.setString(6, f.getPhoneNum());
            stm.setBoolean(7, f.isGender());
            stm.setString(8, f.getEmail());
            stm.setString(9, f.getFileName());
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void insertGeneralFeedback(Feedback f) {
        String sql = "INSERT INTO [general_feedbacks]\n"
                + "           ([star]\n"
                + "           ,[feedbacks_content]\n"
                + "           ,[full_name]\n"
                + "           ,[phone]\n"
                + "           ,[gender]\n"
                + "           ,[email]\n"
                + "           ,[image_url]\n"
                + "           ,[feedback_date])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,GETDATE())";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setFloat(1, f.getRate());
            stm.setString(2, f.getFeedback());
            stm.setString(3, f.getFullName());
            stm.setString(4, f.getPhoneNum());
            stm.setBoolean(5, f.isGender());
            stm.setString(6, f.getEmail());
            stm.setString(7, f.getFileName());
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }

    public boolean  checkImageExist(String img) {
        String sql = "SELECT [image_url]\n"
                + "  FROM [product_feedbacks]\n"
                + "  WHERE [image_url] = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "images\\feedback-images\\"+img);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }
    public boolean  checkImageGeneralExist(String img) {
        String sql = "SELECT [image_url]\n"
                + "  FROM [general_feedbacks]\n"
                + "  WHERE [image_url] = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "images\\feedback-images\\"+img);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }
}
