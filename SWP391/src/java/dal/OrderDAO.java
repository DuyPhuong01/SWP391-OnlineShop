/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.mail.internet.MailDateFormat;
import model.Account;
import model.Cart;
import model.Customer;
import model.Guest;
import model.Item;

/**
 *
 * @author win
 */
public class OrderDAO extends DBContext{
    public void addOrderUser(Account customer,Cart cart,String note){
         LocalDate curDate=LocalDate.now();
         String date=curDate.toString(); //order date =current time
         double freight=0;//ship
          try {
            //add order
              String sql="";
                  sql="insert into orders(user_id,order_date,ship_name,ship_gender,ship_address,ship_email,\n" +
            "freight,ship_mobile,ship_city,status,note,total_price)\n" +
            "values(?,?,?,?,?,?,?,?,?,?,?,?)";
              PreparedStatement st=connection.prepareStatement(sql);
              st.setInt(1, customer.getUser_id());
              st.setString(2,date);
              st.setString(3, customer.getFull_name());
              st.setBoolean(4,customer.isGender());
              st.setString(5,customer.getAddress());
              st.setString(6, customer.getEmail());
              st.setDouble(7, freight);
              st.setString(8,customer.getPhone());
              st.setString(9,customer.getCity());
              st.setInt(10, 0);//Default
              st.setString(11, note);
              st.setDouble(12,cart.getTotalMoney()-freight);//total=price-freight
              st.executeUpdate();
              // get id of newsest order added
            String sql1="select top 1 order_id from [orders] order by order_id desc";
            PreparedStatement st1=connection.prepareStatement(sql1);
              ResultSet rs=st1.executeQuery();
              // add table order details
              if(rs.next()){
                  int oid=rs.getInt("order_id");//order id
                  for (Item i : cart.getItems()) {
                      String sql2="insert into order_details\n" +
                        "values(?,?,?,?)";
                         PreparedStatement st2=connection.prepareStatement(sql2);
                      st2.setInt(1, oid);
                      st2.setInt(2, i.getProduct().getProduct_id());
                      st2.setInt(3,i.getQuantity());
                      st2.setDouble(4, i.getPrice());
                      st2.executeUpdate();
                  }
              }
                //update quantity product
                String sql3="update products set "
                        + "unit_in_stock=unit_in_stock-? where product_id=?";
                PreparedStatement st3=connection.prepareStatement(sql3);
                        for (Item i : cart.getItems()) {
                            st3.setInt(1, i.getQuantity());
                            st3.setInt(2, i.getProduct().getProduct_id());
                            st3.executeUpdate();
                   }
        } catch (Exception e) {
              System.out.println(e);
        }
         
    }
    public void addOrderGuest(Guest guest,Cart cart,String note){
         LocalDate curDate=LocalDate.now();
         String date=curDate.toString(); //order date =current time
         double freight=0;//ship
          try {
            //add order
              String sql="";
                  sql="insert into orders(order_date,ship_name,ship_gender,ship_address,ship_email,\n" +
            "freight,ship_mobile,ship_city,status,note,total_price)\n" +
            "values(?,?,?,?,?,?,?,?,?,?,?)";
              PreparedStatement st=connection.prepareStatement(sql);
              st.setString(1,date);
              st.setString(2, guest.getName());
              st.setBoolean(3,guest.isGender());
              st.setString(4,guest.getAddress());
              st.setString(5, guest.getEmail());
              st.setDouble(6, freight);
              st.setString(7,guest.getPhone());
              st.setString(8,guest.getCity());
              st.setInt(9, 0);//Default
              st.setString(10, note);
              st.setDouble(11,cart.getTotalMoney()-freight);//total=price-freight
              st.executeUpdate();
              // get id of newsest order added
            String sql1="select top 1 order_id from [orders] order by order_id desc";
            PreparedStatement st1=connection.prepareStatement(sql1);
              ResultSet rs=st1.executeQuery();
              // add table order details
              if(rs.next()){
                  int oid=rs.getInt("order_id");//order id
                  for (Item i : cart.getItems()) {
                      String sql2="insert into order_details\n" +
                        "values(?,?,?,?)";
                         PreparedStatement st2=connection.prepareStatement(sql2);
                      st2.setInt(1, oid);
                      st2.setInt(2, i.getProduct().getProduct_id());
                      st2.setInt(3,i.getQuantity());
                      st2.setDouble(4, i.getPrice());
                      st2.executeUpdate();
                  }
              }
                //update quantity product
                String sql3="update products set "
                        + "unit_in_stock=unit_in_stock-? where product_id=?";
                PreparedStatement st3=connection.prepareStatement(sql3);
                        for (Item i : cart.getItems()) {
                            st3.setInt(1, i.getQuantity());
                            st3.setInt(2, i.getProduct().getProduct_id());
                            st3.executeUpdate();
                   }
        } catch (Exception e) {
              System.out.println(e);
        }
    }
 
}
