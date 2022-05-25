/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author win
 */
public class Order {
   private int order_id;
   private int user_id;
   private Timestamp order_Date;
   private Timestamp require_date;
   private Timestamp shipped_Date;
   private int ship_via;
   private double freign;
   private String ship_name;
   private String ship_address;
   private boolean gender;
   private String ship_mobile;
   private String ship_email; 
   private int status;
   private double total_price;
   
    public Order() {
    }

    public Order(int order_id, int user_id, Timestamp order_Date, Timestamp require_date, Timestamp shipped_Date, int ship_via, double freign, String ship_name, String ship_address, boolean gender, String ship_mobile, String ship_email, int status, double total_price) {
        this.order_id = order_id;
        this.user_id = user_id;
        this.order_Date = order_Date;
        this.require_date = require_date;
        this.shipped_Date = shipped_Date;
        this.ship_via = ship_via;
        this.freign = freign;
        this.ship_name = ship_name;
        this.ship_address = ship_address;
        this.gender = gender;
        this.ship_mobile = ship_mobile;
        this.ship_email = ship_email;
        this.status = status;
        this.total_price = total_price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }
    
    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Timestamp getOrder_Date() {
        return order_Date;
    }

    public void setOrder_Date(Timestamp order_Date) {
        this.order_Date = order_Date;
    }

    public Timestamp getRequire_date() {
        return require_date;
    }

    public void setRequire_date(Timestamp require_date) {
        this.require_date = require_date;
    }

    public Timestamp getShipped_Date() {
        return shipped_Date;
    }

    public void setShipped_Date(Timestamp shipped_Date) {
        this.shipped_Date = shipped_Date;
    }

    public int getShip_via() {
        return ship_via;
    }

    public void setShip_via(int ship_via) {
        this.ship_via = ship_via;
    }

    public double getFreign() {
        return freign;
    }

    public void setFreign(double freign) {
        this.freign = freign;
    }

    public String getShip_name() {
        return ship_name;
    }

    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }

    public String getShip_address() {
        return ship_address;
    }

    public void setShip_address(String ship_address) {
        this.ship_address = ship_address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getShip_mobile() {
        return ship_mobile;
    }

    public void setShip_mobile(String ship_mobile) {
        this.ship_mobile = ship_mobile;
    }

    public String getShip_email() {
        return ship_email;
    }

    public void setShip_email(String ship_email) {
        this.ship_email = ship_email;
    }

    @Override
    public String toString() {
        return "Order{" + "order_id=" + order_id + ", user_id=" + user_id + ", order_Date=" + order_Date + ", require_date=" + require_date + ", shipped_Date=" + shipped_Date + ", ship_via=" + ship_via + ", freign=" + freign + ", ship_name=" + ship_name + ", ship_address=" + ship_address + ", gender=" + gender + ", ship_mobile=" + ship_mobile + ", ship_email=" + ship_email + '}';
    }
    
}
