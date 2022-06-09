/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import controller.authentication.SendingEmail;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Email;

/**
 *
 * @author tretr
 */
public class AccountDAO extends DBContext {

    public Account getAccountByUsernamePassword(String username, String password) {
        try {
            String sql = "SELECT *"
                    + "  FROM [accounts]\n"
                    + "  WHERE [username] = ? AND [password] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Account account = new Account(rs.getInt("user_id"), rs.getString("username"), rs.getString("password"),
                        rs.getString("full_name"), rs.getInt("role_id"), rs.getBoolean("gender"), rs.getString("email"),
                        rs.getString("city"), rs.getString("country"), rs.getString("address"), rs.getString("phone"),
                        rs.getString("image_url"), rs.getBoolean("featured"), rs.getString("hash"), rs.getInt("active"));
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Account checkAccountExist(String user) {
        String sql = "select * from [accounts]\n"
                + "where [username] = ?\n";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public Account checkEmailExist(String mail) {
        String sql = "select * from [accounts]\n"
                + "where [email] = ?\n";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, mail);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public String singup(Account acc) {
        String sql = "INSERT INTO [dbo].[accounts]\n"
                + "           ([username]\n"
                + "           ,[password]\n"
                + "           ,[full_name]\n"
                + "           ,[gender]\n"
                + "           ,[email]\n"
                + "           ,[phone]\n"
                + "           ,[address]\n"
                + "           ,[hash]\n"
                + "           ,[active])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,'0')";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, acc.getUsername());
            stm.setString(2, acc.getPassword());
            stm.setString(3, acc.getFull_name());
            stm.setBoolean(4, acc.isGender());
            stm.setString(5, acc.getEmail());
            stm.setString(6, acc.getPhone());
            stm.setString(7, acc.getAddress());
            stm.setString(8, acc.getMyHash());
            int i = stm.executeUpdate();
            if (i != 0) {
                //send Email
                Email e = new Email();
                String subject = "Acctive Accout.";
                String message = "<!DOCTYPE html>\n"
                        + "<html lang=\"en\">\n"
                        + "\n"
                        + "<head>\n"
                        + "</head>\n"
                        + "\n"
                        + "<body>\n"
                        + "    <h3 style=\"color: blue;\">Acctive Accout to continue</h3>\n"
                        + "    <div>Click the link below to active your account </div>\n"
                        + "    <a href=\"" + "http://localhost:8080/swp/activate?key1=" + acc.getEmail() + "&key2=" + acc.getMyHash() + "\">Active Account</a>\n"
                        + "    <h3 style=\"color: blue;\">Thank you very much!</h3>\n"
                        + "\n"
                        + "</body>\n"
                        + "\n"
                        + "</html>";
                e.setFrom("toanpvhe150958@fpt.edu.vn");
                e.setFromPassword("daicatoan123");
                e.setTo(acc.getEmail());
                e.setSubject(subject);
                e.setContent(message);

                SendingEmail se = new SendingEmail();
                se.sendEmail(e);
                return "Success";
            }
        } catch (Exception e) {
        }
        return "Success";
    }

    public static void main(String[] args) {
        AccountDAO adb = new AccountDAO();
        Account a = new Account(7, "toanpv123", "123", "pham toan", 0, true, "123@123", "hanoi", "vn", "hd - hn", "09999999", "tt", true);
        adb.singup(a);
        System.out.println(a.getEmail());
    }
}
