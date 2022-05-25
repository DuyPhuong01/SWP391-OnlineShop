/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author win
 */
public class Cart {
    private List<Item> items; //contain items selected

    public Cart() {
        items=new ArrayList<>();
    }
    
        
    /*return cart*/
    public List<Item> getItems() {
        return items;
    }
    
    /*return quantity of a item in cart*/
    public int getQuantityById(int id){
        int quantiy=getItemById(id).getQuantity();
        return quantiy;
    }
    
    /*find item matched by id in list*/
    public Item getItemById(int id){
        for (Item item : items) {
          if(item.getProduct().getProduct_id()==id){//product matched by id in list)
              System.out.println("Get Item by id"+item);
              return item;//return item if found
          }
        }
                      System.out.println("Get Item by id=null");

          return null;
    }
    public void addItem(Item t){
        try {
            System.out.println("-----add item"+t);
        if(getItemById(t.getProduct().getProduct_id())!=null){
            Item item = getItemById(t.getProduct().getProduct_id());
            System.out.println("item exist:"+item);
            int oldQuantity = item.getQuantity();
            item.setQuantity(oldQuantity+t.getQuantity());
      }else{
            System.out.println("new item added");
              items.add(t);//add mew item incart
          }
        } catch (Exception e) {
            System.out.println("item added null");
            System.out.println(e);
        }
//        Item itemChecked = getItemById(t.getProduct().getProduct_id()); //check item =exist incart
//        if(itemChecked!=null){  //item existed in cart
//        itemChecked.setQuantity(itemChecked.getQuantity()+t.getQuantity()); //update quantity in cart
    }
    
        /*Remove a item*/
    public void removeItem(int id){
        if(getItemById(id)!=null){//item existed
            items.remove(getItemById(id));
        }
    }
    
        /*get total money of cart*/
    public  double getTotalMoney(){
        double total=0;
        for(Item item:items){
            total+=(item.getQuantity()*item.getPrice());
        }
        return total;
    }
    
        /*Get product by id*/
    private Product getProductById(int id,List<Product> list){
            for (Product product : list) {
                if(product.getProduct_id()==id){    //found product
                    return product;
                }
        }
                return null;  //can't found product
    }
    public Cart(String txt,List<Product>list){
        items=new ArrayList<>();
        try {
            
        if(txt!=null&&txt.length()!=0){   //exist cart
            String[] item=txt.split(","); //item split by , in cookie
            for (String i : item) {
                String[]atr=i.split(":");  // 2 attribute of a item split by ; in cookie
                int id=Integer.parseInt(atr[0]);
                int quantity=Integer.parseInt(atr[1]);
                Product p=getProductById(id, list);
                System.out.println("-----------------------cart constructor:id"+id+"-----"+p);
                Item t=new Item(p,quantity,p.getSale_price());
                System.out.println("-----------------------cart constructor item:"+t);
                addItem(t);//add item to cart
            }
            
    }
        } catch (Exception e) {
                            System.out.println("-----------------------cart constructor item:null");

            System.out.println(e);
        }
    }
}
