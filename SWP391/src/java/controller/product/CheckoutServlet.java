/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.product;

import dal.OrderDAO;
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
import model.Customer;
import model.Item;
import model.Product;

/**
 *
 * @author win
 */
@WebServlet(name = "CheckoutServlet", urlPatterns = {"/checkout"})
public class CheckoutServlet extends HttpServlet {

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
            out.println("<title>Servlet CheckoutServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CheckoutServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
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
                }
            }
        }
        System.out.println("---txt geted:"+txt);
        Cart cart=new Cart(txt, allproduct);
        
        System.out.println("-----my cart");
        for (Item item : cart.getItems()) {
            System.out.println(item);
        }
      Customer a=new Customer(2, "Bùi Anh Dũng", "Đại Học FPT-Hà Nội", "DungBAHE150633@gmail.com");
        request.setAttribute("cart", cart);
        request.setAttribute("cus", a);
        request.getRequestDispatcher("cartcontact.jsp").forward(request, response);
//        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          ProductDAO productDAO=new ProductDAO();
        List<Product> allproduct = productDAO.getAllProducts();
        Cookie[] arr=request.getCookies();  //get cookie in browsing
        String txt="";
        
        if(arr!=null){//exist cookie
            for(Cookie cookie : arr) {
                if(cookie.getName().equals("cart"))//cookie name cart
                {
                    txt+=cookie.getValue();
                }
            }
        }
        Cart cart=new Cart(txt, allproduct);
//        HttpSession session=request.getSession();
//        Customer a=(Customer)session.getAttribute("account");
          
                //DEMO
        OrderDAO oderDAO=new OrderDAO();
        Customer a=new Customer(2, "Bùi Anh Dũng", "Đại Học FPT-Hà Nội", "DungBAHE150633@gmail.com");
        oderDAO.addOrder(a, cart);//add order
        Cookie c=new Cookie("cart", "");//reset cart after order
        c.setMaxAge(0);
        response.addCookie(c);
        request.getRequestDispatcher("productslist").forward(request, response);
        
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
