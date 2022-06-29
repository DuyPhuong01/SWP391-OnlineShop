/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.marketing;

import com.google.gson.Gson;
import dal.AccountDAO;
import dal.FeedbackDAO;
import dal.PostDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import util.DateTimeUtil;

/**
 *
 * @author Admin
 */
@WebServlet(name = "MarketingDashBoardServlet", urlPatterns = {"/marketing/dashboard"})
public class MarketingDashBoardServlet extends HttpServlet {

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
            out.println("<title>Servlet MarketingDashBoardServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MarketingDashBoardServlet at " + request.getContextPath() + "</h1>");
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
        
//        get session account
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        if (account != null) {
            //khai bao doi tuong cac lop data access object
            PostDAO postDAO = new PostDAO();
            FeedbackDAO feedbackDAO = new FeedbackDAO();
            ProductDAO productDAO = new ProductDAO();
            AccountDAO accountDAO = new AccountDAO();

            //khoi tao cac bien va gan gia tri
            int totalPosts, totalGeneralFeedbacks, totalProductFeedbacks, totalProducts, totalAccounts;
            totalPosts = postDAO.countPosts();
            totalAccounts = accountDAO.getTotalCustomers();
            totalGeneralFeedbacks = feedbackDAO.getTotalGeneralFeedbacks();
            totalProductFeedbacks = feedbackDAO.getTotalProductFeedbacks();
            totalProducts = productDAO.getTotalProducts();

//            get startdate and enddate
            String startDate = request.getParameter("startDate");
            String endDate = request.getParameter("endDate");
            LocalDate start, end;
            
//            set default if null and convert from string to LocalDate
            if (startDate == null) {
                start = DateTimeUtil.getStartDateDefault();
                end = DateTimeUtil.getEndDateDefault();
                
            } else {
                start = DateTimeUtil.getStartDate(startDate);
                end = DateTimeUtil.getEndDate(endDate);
            }
            
//            get statistic of new customer by day
            List newCustomers = accountDAO.getCustomersByDays(start, end);
            List<String> dates = DateTimeUtil.getStringOfDateItems(start, end);
            for (int i = 0; i < dates.size(); i++) {
                System.out.println(dates.get(i));
        }
            
//            chart type
            request.setAttribute("chartType", "line");
            
            //start and end date
            request.setAttribute("startDate", start);
            request.setAttribute("endDate", end.minusDays(1));
//        set attribute
            request.setAttribute("dates", dates);
            request.setAttribute("customers", newCustomers);

             //statistic 
            request.setAttribute("totalPosts", totalPosts);
            request.setAttribute("totalAccounts", totalAccounts);
            request.setAttribute("totalProducts", totalProducts);
            request.setAttribute("totalFeedbacks", totalProductFeedbacks + totalGeneralFeedbacks);
            request.getRequestDispatcher("/marketing/dashboard.jsp").forward(request, response);
        } else {
            PrintWriter out = response.getWriter();
            out.println("access denied");
        }
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
        processRequest(request, response);
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