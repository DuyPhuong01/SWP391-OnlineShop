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
import javax.servlet.http.HttpSession;
import model.Account;
import model.Cart;
import model.Order;
import model.Product;

/**
 *
 * @author win
 */
@WebServlet(name = "ShowCartServlet", urlPatterns = {"/showcart"})
public class ShowCartServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShowCart1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowCart1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession(true);
        Account account = (Account) session.getAttribute("account");
        int userID;
        if (account == null) { //role:guest
            userID = -1;
        } else {  //role:user
            userID = account.getUser_id();
        }
        ProductDAO productDAO = new ProductDAO();
        List<Product> allproduct = productDAO.getAllProducts();
        Cookie[] arr = request.getCookies();  //get cookie in browsing
        String cookieContent = "";
        if (arr != null) {//exist cookie
            for (Cookie cookie : arr) {
                if (cookie.getName().equals("cart"))//cookie name cart
                {
                    cookieContent += cookie.getValue();
                }
            }
        }
        Cart cart;
        cart = new Cart(cookieContent, allproduct, userID);
        request.setAttribute("cart", cart);

        request.getRequestDispatcher("cartdetail.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Account acocunt = (Account) session.getAttribute("account");
        OrderDAO orderDAO = new OrderDAO();
        String orderId_raw = request.getParameter("orderId");
        int orderId;
        try {
            orderId = Integer.parseInt(orderId_raw);
            Order myOrder = orderDAO.getOrderByUserIdAndOrderId(acocunt.getUser_id(), orderId);
            if (myOrder == null) {
                PrintWriter out = response.getWriter();
                out.println("access denied");
            } else {
                request.setAttribute("order", myOrder);
                request.getRequestDispatcher("updateorders.jsp").forward(request, response);
            }

        } catch (IOException | NumberFormatException e) {

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
