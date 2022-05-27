/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.product;

import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cart;
import model.Item;
import model.Product;

/**
 *
 * @author win
 */
@WebServlet(name = "ProcessServlet", urlPatterns = {"/process"})
public class ProcessServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProcessServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProcessServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         ProductDAO productDAO=new ProductDAO();
        List<Product> allproduct = productDAO.getAllProducts();
        Cookie[] arr=request.getCookies();  //get cookie in browsing
        String txt="";
        if(arr!=null){//exist cookie
            for (Cookie cookie : arr) {
                if(cookie.getName().equals("cart"))//cookie name cart
                {
                    txt+=cookie.getValue();
                    cookie.setMaxAge(0);//remove
                    response.addCookie(cookie);
                }
            }
        }
        
        Cart cart=new Cart(txt, allproduct);
        String num_raw=request.getParameter("num");
        String id_raw=request.getParameter("id");
        int id=0;   //save id modification
        int num=0; //save number item modification
        try {
            id=Integer.parseInt(id_raw);
            Product p=productDAO.getProductById(id);// number of item in stock
            int numStore=p.getUnit_in_stock();
            num=Integer.parseInt(num_raw);
            if(num==-1&&(cart.getQuantityById(id)<=1)){// -1 item and item in cart <=1--> delete
                cart.removeItem(id);
            }else{
                if(num==1&&cart.getQuantityById(id)>=numStore){ //quantity in cart greeater than in stock
                    num=0;
                }
                double price=p.getSale_price();
                Item t=new Item(p,num,price);
                cart.addItem(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        List<Item>items =cart.getItems();
        txt="";
        if(items.size()>0){//cart has item
            txt=items.get(0).getProduct().getProduct_id()+":"+
                    items.get(0).getQuantity(); //note first item
            for (int i = 1; i < items.size(); i++) {//note first item continue item
                txt=","+items.get(i).getProduct().getProduct_id()+":"+
                        items.get(i).getQuantity();
            }
        }
        Cookie c=new Cookie("cart", txt);
        c.setMaxAge(2*24*60*60);//set cookie in 2 day
        response.addCookie(c);
        request.setAttribute("cart", cart);
        request.getRequestDispatcher("cartdetail.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDAO productDAO=new ProductDAO();
        List<Product> allproduct = productDAO.getAllProducts();
        Cookie[] arr=request.getCookies();  //get cookie in browsing
        String txt="";
        if(arr!=null){//exist cookie
            for (Cookie cookie : arr) {
                if(cookie.getName().equals("cart"))//cookie name cart
                {
                    txt+=cookie.getValue();
                    cookie.setMaxAge(0);//remove
                    response.addCookie(cookie);
                }
            }
        }
        String out="";
        String id=request.getParameter("id");
        String[] ids=txt.split(",");//contain all id of item in cart
//        for (int i = 0; i <ids.length ; i++) {//get all element item
//            String[] s=ids[i].split(":");
//            if(!s[0].equals(id)){//not item need delete
//                if(out.isEmpty()){ //out have not item
//                    out=ids[i];
//                }else{
//                    txt+=","+ids[i];
//                }
//            }
//        }
        for (int i = 0; i < ids.length; i++) {//get all element item
            String[] s=ids[i].split(":");
            if(!s[0].equals(id)){//not item need delete
                if(out.isEmpty()){//out have not item
                    out=ids[i];
                }else{
                    out+=","+ids[i];
                }
            }
        }
        if(!out.isEmpty()){
            Cookie c=new Cookie("cart", out);
            c.setMaxAge(24*24*60);
            response.addCookie(c);
        }
        Cart cart=new Cart(out, allproduct);
        request.setAttribute("cart", cart);
        request.getRequestDispatcher("cartdetail.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
