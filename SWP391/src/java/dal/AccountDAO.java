/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import util.SendingEmailUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import model.Account;
import service.EmailService;
import service.EmailServiceIml;

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

    public Account getAccountByID(Account acc) {
        try {
            String sql = "SELECT *"
                    + "  FROM [accounts]\n"
                    + "  WHERE [user_id] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, acc.getUser_id());
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
    public Account getAccountByID(int id) {
        try {
            String sql = "SELECT *"
                    + "  FROM [accounts]\n"
                    + "  WHERE [user_id] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
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

    public Account getAccountByEmail(String email) {
        try {
            String sql = "SELECT *"
                    + "  FROM [accounts]\n"
                    + "  WHERE [email] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
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

    public boolean checkAccountImageExist(String img) {
        String sql = "SELECT [image_url]\n"
                + "  FROM [accounts]\n"
                + "  WHERE [image_url] = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "images\\account-images\\" + img);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
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
                + "           ,[image_url]\n"
                + "           ,[city]\n"
                + "           ,[country]\n"
                + "           ,[registered_date]\n"
                + "           ,[role_id]\n"
                + "           ,[active])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,'images\\account-images\\acc.png','(Nah)','(Nah)',getdate(),1,'0')";
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
                return "Success";
            }
        } catch (Exception e) {
        }
        return "Success";
    }

    public void updateAccount(Account a) {
        String sql = "UPDATE [accounts]\n"
                + "   SET [full_name] = ?\n"
                + "      ,[gender] = ?\n"
                + "      ,[city] = ?\n"
                + "      ,[country] = ?\n"
                + "      ,[address] = ?\n"
                + "      ,[phone] = ?\n"
                + " WHERE [user_id] = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, a.getFull_name());
            stm.setBoolean(2, a.isGender());
            stm.setString(3, a.getCity());
            stm.setString(4, a.getCountry());
            stm.setString(5, a.getAddress());
            stm.setString(6, a.getPhone());
            stm.setInt(7, a.getUser_id());

            ResultSet rs = stm.executeQuery();
        } catch (SQLException e) {
        }
    }

    public void updateAccountImg(Account a) {
        String sql = "UPDATE [accounts]\n"
                + "   SET [image_url] = ?\n"
                + " WHERE [user_id] = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, a.getImage_url());
            stm.setInt(2, a.getUser_id());

            ResultSet rs = stm.executeQuery();
        } catch (SQLException e) {
        }
    }

    public void updateHashCode(Account acc) {
        String sql = "UPDATE [accounts]\n"
                + "   SET [hash] = ?\n"
                + " WHERE [email] = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, acc.getMyHash());
            stm.setString(2, acc.getEmail());
            ResultSet rs = stm.executeQuery();
        } catch (SQLException e) {
        }
    }

    public void updateFeatured(Account acc, String text) {
        String sql = "UPDATE [accounts]\n"
                + "   SET [featured] = ?\n"
                + " WHERE [email] = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, text);
            stm.setString(2, acc.getEmail());
            ResultSet rs = stm.executeQuery();
        } catch (SQLException e) {
        }
    }

    public void updatePassword(String mail, String pass) {
        String sql = "UPDATE [accounts]\n"
                + "   SET [password] = ?\n"
                + " WHERE [email] = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, pass);
            stm.setString(2, mail);
            ResultSet rs = stm.executeQuery();
        } catch (SQLException e) {
        }
    }

    public int getTotalCustomers() {
        String sql = "select count(user_id) from accounts";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return 0;
    }

    public int getNumberOfRegisteredCustomerByDay(LocalDate start) {
        String sql = "select COUNT(user_id) from accounts where registered_date between ? and ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, start.toString());
            st.setString(2, start.plusDays(1).toString());
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return 0;
    }

    public List getCustomersByDays(LocalDate start, LocalDate end) {
        List list = new ArrayList<>();
        for (LocalDate i = start; i.compareTo(end) < 0; i = i.plusDays(1)) {
            list.add(getNumberOfRegisteredCustomerByDay(i));
        }

        return list;
    }

    public List<Account> getAuthors() {
        List<Account> list = new ArrayList<>();
        try {
            String sql="select distinct a.user_id from  accounts a \n" +
            "inner join \n" +
            "posts p on a.user_id=p.user_id\n" +
            "group by a.user_id";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account account=getAccountByID(rs.getInt("user_id"));
                list.add(account);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
