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
import model.Cart;
import model.Customer;
import model.Item;

/**
 *
 * @author win
 */
public class OrderDAO extends DBContext{
    public void addOrder(Customer c,Cart cart){
         LocalDate curDate=LocalDate.now();
         String date=curDate.toString(); //order date
         double freight=20000;//ship
          try {
            //add order
           String sql="insert into orders(user_id,order_date,ship_address,ship_email,freight)\n" +
"values(?,?,?,?,?)";
              PreparedStatement st=connection.prepareStatement(sql);
              st.setInt(1, c.getId());
              st.setString(2,date);
              st.setString(3,c.getAddress());
              st.setString(4, c.getEmail());
              st.setDouble(5,freight);
              st.executeUpdate();
              // get id of newsest order added
            String sql1="select top 1 order_id from [orders] order by order_id desc";
            PreparedStatement st1=connection.prepareStatement(sql1);
              ResultSet rs=st1.executeQuery();
              // add tabale order details
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
