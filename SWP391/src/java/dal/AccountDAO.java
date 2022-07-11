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
import model.Customer;
import model.Slider;
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
    public String AddCustomer(Customer acc) {
        //check id exist
        if(checkAccountExist(acc.getUsername())!=null){
            return "User name have been exist";
        }
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
                + "           ,[active]\n"
                + "           ,[featured])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?,?,getdate(),?,?,?)";
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
            stm.setString(9, acc.getImage_url());
            stm.setString(10, acc.getCity());
            stm.setString(11, acc.getCountry());
            stm.setInt(12, acc.getRole_id());
            stm.setInt(13, acc.getActive());
            stm.setBoolean(14, acc.isFeature());
            int i = stm.executeUpdate();
            if (i != 0) {
                //send Email
                return "Success";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "Fail";
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

    //convert order id to string 
    private String convertOrderID(int id) {
        String content = "";
        switch (id) {
            case 1:
                return "user_id";
            case 2:
                return "full_name";
            case 3:
                return "gender";
            case 4:
                return "email";
            case 5:
                return "featured";
            default:
                return "user_id";//default 
        }
    }

    //get property of customer from database
    public Customer fillCustomerDetails(ResultSet rs) {
        try {
            return new Customer(rs.getInt("user_id"), rs.getString("full_name"),
                    rs.getBoolean("gender"), rs.getString("email"), rs.getString("phone"), rs.getBoolean("featured"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null; //exception
    }

    //count page of customer search
    public int countCustomerPaging(String word, int searchOption, int status, int numperpage) {
        int num = 1;//default
        String sql = "select  count(user_id) from\n"
                + "accounts where role_id=1";
        if (!word.equals("") && searchOption == 1) { //have option word
            sql += " and  full_name like '%"
                    + word
                    + "%'";
        }
        if (!word.equals("") && searchOption == 2) { //have option word
            sql += " and  email like '%"
                    + word
                    + "%'";
        }
        if (!word.equals("") && searchOption == 3) { //have option word
            sql += " and  phone like '%"
                    + word
                    + "%'";
        }
        if (status == 1) {
            sql += " and featured ="
                    + 1;
        }
        if (status == 0) {
            sql += " and featured ="
                    + 0;
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                num = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (num == 0) {
            return 1;//minimum=1
        } else if (num % numperpage == 0) { //number full page
            return num / numperpage;
        }
        return num / numperpage + 1;
    }

    //Get customer paging for customer list in admin role
    public List<Customer> getCustomers(String word, int searchOption, int status, int orderID,int op, int page, int numperpage) {
        List<Customer> list = new ArrayList<>();
        String sql = "select  user_id,full_name,featured, email,phone,gender from\n"
                + "accounts where role_id=1";
        if (!word.equals("") && searchOption == 1) { //have option word
            sql += " and  full_name like '%"
                    + word
                    + "%'";
        }
        if (!word.equals("") && searchOption == 2) { //have option word
            sql += " and  email like '%"
                    + word
                    + "%'";
        }
        if (!word.equals("") && searchOption == 3) { //have option word
            sql += " and  phone like '%"
                    + word
                    + "%'";
        }
        if (status == 1) {
            sql += " and featured ="
                    + 1;
        }
        if (status == 0) {
            sql += " and featured ="
                    + 0;
        }
        sql += " \norder by";
        sql += " " + convertOrderID(orderID);
        sql+=(op==1)?" asc":" desc";

        sql += " OFFSET "
                + (page - 1) * numperpage
                + " ROWS FETCH NEXT "
                + numperpage
                + " ROWS ONLY";
        System.out.println(sql);
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Customer customer = fillCustomerDetails(rs);
                list.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

     //update status of slider
    public boolean updateFeatured(int id, int featured) {
        String sql = "UPDATE Accounts\n"
                + "SET featured = "
                + featured
                + "\n"
                + "WHERE user_id="
                + id;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;//exception
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
        int num = d.countCustomerPaging("", 1, 1, 6);
        System.out.println(num);
    }
}
