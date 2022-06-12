/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Cart;
import model.Guest;
import model.Item;
import model.Order;
import model.OrderDetail;
import model.OrderInformation;
import model.Product;

/**
 *
 * @author win
 */
public class OrderDAO extends DBContext{
    
        private Order filOrderInfor(ResultSet rs) throws SQLException {
        OrderDAO order_dao = new OrderDAO();
        int order_id = rs.getInt("order_id");
        return new Order(order_id,rs.getInt("user_id"),rs.getString("order_date"),rs.getString("require_date"),
                rs.getString("shipped_date"), rs.getInt("ship_via"), rs.getDouble("freight"),rs.getString("ship_name"),
                rs.getString("ship_address"), rs.getBoolean("ship_gender"), rs.getString("ship_mobile"),rs.getString("ship_email"),rs.getString("ship_city")
                , rs.getInt("status"), rs.getString("note"), rs.getString("payment"), rs.getDouble("total_price"));
        }
    public Order addOrderUser(Account customer,Cart cart,String note){
         LocalDate curDate=LocalDate.now();
         String date=curDate.toString(); //order date =current time
         double freight=cart.getFreight();//ship
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
              st.setInt(10, 1);//Default
              st.setString(11, note);
              st.setDouble(12,cart.getTotalMoney()+freight);//total=price-freight
              st.executeUpdate();
              // get id of newsest order added
            String sql1="select top 1 order_id from [orders] order by order_id desc";
            PreparedStatement st1=connection.prepareStatement(sql1);
              ResultSet rs=st1.executeQuery();
              // add table order details
              int order_id=0;
              if(rs.next()){//have item found
                  order_id=rs.getInt("order_id");
                  for (Item i : cart.getItems()) {
                      String sql2="insert into order_details\n" +
                        "values(?,?,?,?)";
                         PreparedStatement st2=connection.prepareStatement(sql2);
                      st2.setInt(1, order_id);
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
             //return order id
             Order order = getOrderByOrderID(order_id);
             return order;
        } catch (Exception e) {
              System.out.println(e);
        }
          return null; //exception
    }
    public Order addOrderGuest(Guest guest,Cart cart,String note){
         LocalDate curDate=LocalDate.now();
         String date=curDate.toString(); //order date =current time
         double freight=cart.getFreight();//ship
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
              st.setInt(9, 1);//Default
              st.setString(10, note);
              st.setDouble(11,cart.getTotalMoney()+freight);
              st.executeUpdate();
              // get id of newsest order added
              int order_id=0;
            String sql1="select top 1 order_id from [orders] order by order_id desc";
            PreparedStatement st1=connection.prepareStatement(sql1);
              ResultSet rs=st1.executeQuery();
              // add table order details
              if(rs.next()){  //have item found
                   order_id=rs.getInt("order_id");
                  for (Item i : cart.getItems()) {
                      String sql2="insert into order_details\n" +
                        "values(?,?,?,?)";
                         PreparedStatement st2=connection.prepareStatement(sql2);
                      st2.setInt(1, order_id);
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
                        for (Item i : cart.getItems()) { //select item in cart
                            st3.setInt(1, i.getQuantity());
                            st3.setInt(2, i.getProduct().getProduct_id());
                            st3.executeUpdate();
                   }
                // return order_id
                Order order = getOrderByOrderID(order_id);
                return order;
        } catch (Exception e) {
              System.out.println(e);
        }
                return null; //exception
    }
    
      //get order by order id
    public Order getOrderByOrderID(int orderID){
        String sql="select* from [orders] where order_id=? ";
        try {
             PreparedStatement st=connection.prepareStatement(sql);
             st.setInt(1, orderID);
              ResultSet rs=st.executeQuery();
              if(rs.next()){//result set return a order
                  Order order=filOrderInfor(rs);
                  return order;
              }
        } catch (Exception e) {
        }
        return null;//exception or can't find order
    }
     
      //get order detail by order ID
      public List<OrderDetail> getOrderDetailsByOrderID(int orderID){
             List<OrderDetail>listOrderDetails=new ArrayList<>();
             String sql="select od.* from orders o inner join order_details od\n" +
                "on o.order_id=od.order_id\n" +
                "inner join products p\n" +
                "on p.product_id=od.product_id\n" +
                "where o.order_id=?";
            try {
              PreparedStatement st=connection.prepareStatement(sql);
              st.setInt(1, orderID);
              ResultSet rs=st.executeQuery();
             while(rs.next()){ //result set have next item
                 //add an item in list order details
                 listOrderDetails.add(new OrderDetail(rs.getInt("order_id"), rs.getInt("product_id"),
                 rs.getInt("quantity"),rs.getDouble("price")));
             }
             return listOrderDetails;
         } catch (Exception e) {
                System.out.println(e);
         }
            return null;
    }
    
     //get Cart Summited by order ID coresspinding
     public Cart getCartSubmitted(int orderID){
            ProductDAO productDAO=new ProductDAO();
            Cart cart=new Cart();
            List<OrderDetail> listOrderDetails = getOrderDetailsByOrderID(orderID); 
            for (OrderDetail orderDetail: listOrderDetails) { //iterate over the list order details
                Product product = productDAO.getProduct(orderDetail.getProduct_id());
                Item item=new Item(product,orderDetail.getQuantity() ,orderDetail.getPrice());
                cart.addItem(item);  //add  item to cart
         }
            return cart;
    }
    
     //get order information by order id
    public OrderInformation getOrderInformationByOrderID(int orderID){
            Order orderByOrderID = getOrderByOrderID(orderID);
            Cart cartSubmitted = getCartSubmitted(orderID);
            OrderInformation orderInformation=new OrderInformation(orderByOrderID, cartSubmitted);//get an orderInformation
            return orderInformation;
    }
    
    //change information by order Order (add payment step)
    public void UpdateOrderInformation(Order order){
            int order_id = order.getOrder_id();
            String sql="updatr order"
                    + "set order_date=GETDATE(),ship_name=?,ship_gender=?,ship_address=?,ship_email=?,\n" +
            "freight=?,ship_mobile=?,ship_city=?,status=?,note=?,payment=?,total_price=?)";
            try {
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, order.getShip_name());
            st.setBoolean(2, order.isShip_gender());
            st.setString(3, order.getShip_address());
            st.setString(4,order.getShip_email());
            st.setDouble(5, order.getFreight());
            st.setString(6, order.getShip_mobile());
            st.setString(7, order.getShip_city());
            st.setInt(8, order.getStatus());
            st.setString(9,order.getNote());
            st.setString(10,order.getPayment());
            st.setDouble(11,order.getTotal_price());
            st.executeUpdate();
        } catch (Exception e) {
                System.out.println(e);
        }
    }
    
    // delete assign order by order id
    public void DeleteOrderByOrderID(int orderID){
        String sql1="delete from order_details\n" +
        "where order_id=? ";
        String sql2="delete from orders\n" +
        "where order_id=?";
        try {
            //delete order from order details
         PreparedStatement st1=connection.prepareStatement(sql1);
         st1.setInt(1, orderID);
         st1.executeUpdate();
            // delete order from order
        PreparedStatement st2=connection.prepareStatement(sql2);
         st2.setInt(1, orderID);
         st2.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        OrderDAO orderDAO=new OrderDAO();
            Order orderByOrderID = orderDAO.getOrderByOrderID(6);
            System.out.println(orderByOrderID);
    }

}
