/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
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
import model.Role;
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

    public Account getAccountByID(int id) {
        Account account = new Account();
        account.setUser_id(id);
        return getAccountByID(account);
    }

    public static List<String> getListScreen(int role_id) {
        try {
            Connection conn = DBContext.getConnection();
            List<String> s = new ArrayList<>();
            String sql = "SELECT s.screen_name\n"
                    + "FROM [permissions] p  join [screens] s \n"
                    + "ON p.screen_id = s.screen_id\n"
                    + "WHERE p.[role_id] = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, role_id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                s.add(rs.getString("screen_name"));
            }
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Role> getListRole() {
        List<Role> s = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT [role_id]\n"
                    + "      ,[role_name]\n"
                    + "  FROM [roles]";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                if (rs.getInt("role_id") != 6) {
                    Role r = new Role();
                    r.setrId(rs.getInt("role_id"));
                    r.setrName(rs.getString("role_name"));
                    s.add(r);
                }
            }
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Account> searchByRid(int did, int gender, int active, String search) {
        ArrayList<Account> accounts = new ArrayList<>();
        try {
            String sql = "SELECT a.[user_id]\n"
                    + "      ,a.[username]\n"
                    + "      ,a.[password]\n"
                    + "      ,a.[full_name]\n"
                    + "      ,a.[role_id]\n"
                    + "      ,a.[gender]\n"
                    + "      ,a.[email]\n"
                    + "      ,a.[city]\n"
                    + "      ,a.[country]\n"
                    + "      ,a.[address]\n"
                    + "      ,a.[phone]\n"
                    + "      ,a.[image_url]\n"
                    + "      ,a.[featured]\n"
                    + "      ,a.[hash]\n"
                    + "      ,a.[active]\n"
                    + "      ,a.[registered_date]\n"
                    + "	  ,r.[role_name]\n"
                    + "  FROM [accounts] a INNER JOIN [roles] r on a.[role_id] = r.[role_id]";
            if (did > 0 && gender > -1 && active > -1 && search != "") {
                sql += " WHERE a.[role_id] = ? and a.[gender] = ? and a.[active] = ? and a.[full_name] like ? or a.[phone] like ? or a.[email] like ?";
            }
            if (did > 0 && gender > -1 && active > -1 && search == "") {
                sql += " WHERE a.[role_id] = ? and a.[gender] = ? and a.[active] = ?";
            }
            if (did == 0 && gender > -1 && active > -1 && search != "") {
                sql += " WHERE a.[gender] = ? and a.[active] = ? and a.[full_name] like ? or a.[phone] like ? or a.[email] like ?";
            }
            if (did > 0 && gender == -1 && active > -1 && search != "") {
                sql += " WHERE a.[role_id] = ? and a.[active] = ? and a.[full_name] like ? or a.[phone] like ? or a.[email] like ?";
            }
            if (did > 0 && gender > -1 && active == -1 && search != "") {
                sql += " WHERE a.[role_id] = ? and a.[gender] = ? and a.[full_name] like ? or a.[phone] like ? or a.[email] like ?";
            }
            if (did == 0 && gender > -1 && active > -1 && search == "") {
                sql += " WHERE a.[gender] = ? and a.[active] = ?";
            }
            if (did > 0 && gender == -1 && active > -1 && search == "") {
                sql += " WHERE a.[role_id] = ? and a.[active] = ?";
            }
            if (did > 0 && gender > -1 && active == -1 && search == "") {
                sql += " WHERE a.[role_id] = ? and a.[gender] = ?";
            }
            if (did == 0 && gender == -1 && active > -1 && search != "") {
                sql += " WHERE a.[active] = ? and a.[full_name] like ? or a.[phone] like ? or a.[email] like ?";
            }
            if (did > 0 && gender == -1 && active == -1 && search != "") {
                sql += " WHERE a.[role_id] = ? and a.[full_name] like ? or a.[phone] like ? or a.[email] like ?";
            }
            if (did == 0 && gender > -1 && active == -1 && search != "") {
                sql += " WHERE a.[gender] = ? and a.[full_name] like ? or a.[phone] like ? or a.[email] like ?";
            }
            if (did == 0 && gender == -1 && active > -1 && search == "") {
                sql += " WHERE a.[active] = ?";
            }
            if (did > 0 && gender == -1 && active == -1 && search == "") {
                sql += " WHERE a.[role_id] = ?";
            }
            if (did == 0 && gender > -1 && active == -1 && search == "") {
                sql += " WHERE a.[gender] = ?";
            }
            PreparedStatement stm = connection.prepareStatement(sql);
            if (did > 0 && gender > -1 && active > -1 && search != "") {
                stm.setInt(1, did);
                stm.setInt(2, gender);
                stm.setInt(3, active);
                stm.setString(4, "%" + search + "%");
                stm.setString(5, "%" + search + "%");
                stm.setString(6, "%" + search + "%");
            }
            if (did > 0 && gender > -1 && active > -1 && search == "") {
                stm.setInt(1, did);
                stm.setInt(2, gender);
                stm.setInt(3, active);
            }
            if (did == 0 && gender > -1 && active > -1 && search != "") {
                stm.setInt(1, gender);
                stm.setInt(2, active);
                stm.setString(3, "%" + search + "%");
                stm.setString(4, "%" + search + "%");
                stm.setString(5, "%" + search + "%");
            }
            if (did > 0 && gender == -1 && active > -1 && search != "") {
                stm.setInt(1, did);
                stm.setInt(2, active);
                stm.setString(3, "%" + search + "%");
                stm.setString(4, "%" + search + "%");
                stm.setString(5, "%" + search + "%");
            }
            if (did > 0 && gender > -1 && active == -1 && search != "") {
                stm.setInt(1, did);
                stm.setInt(2, gender);
                stm.setString(3, "%" + search + "%");
                stm.setString(4, "%" + search + "%");
                stm.setString(5, "%" + search + "%");
            }
            if (did == 0 && gender > -1 && active > -1 && search == "") {
                stm.setInt(1, gender);
                stm.setInt(2, active);
            }
            if (did > 0 && gender == -1 && active > -1 && search == "") {
                stm.setInt(1, did);
                stm.setInt(2, active);
            }
            if (did > 0 && gender > -1 && active == -1 && search == "") {
                stm.setInt(1, did);
                stm.setInt(2, gender);
            }
            if (did == 0 && gender == -1 && active > -1 && search != "") {
                stm.setInt(1, active);
                stm.setString(2, "%" + search + "%");
                stm.setString(3, "%" + search + "%");
                stm.setString(4, "%" + search + "%");
            }
            if (did > 0 && gender == -1 && active == -1 && search != "") {
                stm.setInt(1, did);
                stm.setString(2, "%" + search + "%");
                stm.setString(3, "%" + search + "%");
                stm.setString(4, "%" + search + "%");
            }
            if (did == 0 && gender > -1 && active == -1 && search != "") {
                stm.setInt(1, gender);
                stm.setString(2, "%" + search + "%");
                stm.setString(3, "%" + search + "%");
                stm.setString(4, "%" + search + "%");
            }
            if (did == 0 && gender == -1 && active > -1 && search == "") {
                stm.setInt(1, active);
            }
            if (did > 0 && gender == -1 && active == -1 && search == "") {
                stm.setInt(1, did);
            }
            if (did == 0 && gender > -1 && active == -1 && search == "") {
                stm.setInt(1, gender);
            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Role r = new Role();
                r.setrId(rs.getInt("role_id"));
                r.setrName(rs.getString("role_name"));
                Account a = new Account();
                a.setUser_id(rs.getInt("user_id"));
                a.setUsername(rs.getString("username"));
                a.setPassword(rs.getString("password"));
                a.setFull_name(rs.getString("full_name"));
                a.setRole(r);
                a.setGender(rs.getBoolean("gender"));
                a.setEmail(rs.getString("email"));
                a.setCity(rs.getString("city"));
                a.setCountry(rs.getString("country"));
                a.setPhone(rs.getString("phone"));
                a.setImage_url(rs.getString("image_url"));
                a.setActive(rs.getInt("active"));
                accounts.add(a);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accounts;
    }

    public List<Account> getListByPage(List<Account> list, int start, int end) {
        ArrayList<Account> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
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
//    public Account getAccountByID(int id) {
//        try {
//            String sql = "SELECT *"
//                    + "  FROM [accounts]\n"
//                    + "  WHERE [user_id] = ?";
//            PreparedStatement stm = connection.prepareStatement(sql);
//            stm.setInt(1, id);
//            ResultSet rs = stm.executeQuery();
//            if (rs.next()) {
//                Account account = new Account(rs.getInt("user_id"), rs.getString("username"), rs.getString("password"),
//                        rs.getString("full_name"), rs.getInt("role_id"), rs.getBoolean("gender"), rs.getString("email"),
//                        rs.getString("city"), rs.getString("country"), rs.getString("address"), rs.getString("phone"),
//                        rs.getString("image_url"), rs.getBoolean("featured"), rs.getString("hash"), rs.getInt("active"));
//                return account;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }

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

    public String singup(Account acc, int choise) {
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
                + "     VALUES";
        if (choise == 1) {
            sql += "(?,?,?,?,?,?,?,?,'images\\account-images\\acc.png','(Nah)','(Nah)',getdate(),?,'1')";
        } else {
            sql += "(?,?,?,?,?,?,?,?,'images\\account-images\\acc.png','(Nah)','(Nah)',getdate(),1,'0')";
        }
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
            if (choise == 1) {
                stm.setInt(9, acc.getRole_id());
            }
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
            String sql = "select distinct a.user_id from  accounts a \n"
                    + "inner join \n"
                    + "posts p on a.user_id=p.user_id\n"
                    + "group by a.user_id";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account account = getAccountByID(rs.getInt("user_id"));
                list.add(account);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List getListOfNewlyRegisterCustomer(LocalDate start, LocalDate end) {
        List result = new ArrayList();
        for (LocalDate i = start; i.compareTo(end) < 0; i = i.plusDays(1)) {
            result.add(RegisteredCustomerByDay(i));
        }
        return result;
    }

    private int RegisteredCustomerByDay(LocalDate start) {
        String sql = "select COUNT(*) from accounts where registered_date between ? and ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, start.toString());
            st.setString(2, start.plusDays(1).toString());
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {

        }
        return 0;
    }

    public List getListOfNewlyBoughtCustomer(LocalDate start, LocalDate end) {
        List result = new ArrayList();
        for (LocalDate i = start; i.compareTo(end) < 0; i = i.plusDays(1)) {
            result.add(NewlyBoughtCustomerByDay(i));
        }
        return result;
    }

    private int NewlyBoughtCustomerByDay(LocalDate start) {
        String sql = "select count(distinct o.user_id) from orders o\n"
                + "inner join accounts a\n"
                + "on o.user_id = a.user_id\n"
                + "where order_date between ? and ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, start.toString());
            st.setString(2, start.plusDays(1).toString());
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {

        }
        return 0;
    }

    public static void main(String[] args) {
        AccountDAO d = new AccountDAO();
//        ArrayList<Account> r = d.searchByRid(0);
//        for (Account role : r) {
//            System.out.println(role.getFull_name());
//        }
    }
}
