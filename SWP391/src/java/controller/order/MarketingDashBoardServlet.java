/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.order;

import dal.AccountDAO;
import dal.FeedbackDAO;
import dal.PostDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.servlet.ServletException;
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
            totalPosts = postDAO.getTotalPosts();
            totalAccounts = accountDAO.getTotalCustomers();
            totalGeneralFeedbacks = feedbackDAO.getTotalGeneralFeedbacks();
            totalProductFeedbacks = feedbackDAO.getTotalProductFeedbacks();
            totalProducts = productDAO.getTotalProducts();

            String startDate = request.getParameter("startDate");
            String endDate = request.getParameter("endDate");
            LocalDate start, end;
            if (startDate == null) {
                start = DateTimeUtil.getStartDateDefault();
                end = DateTimeUtil.getEndDateDefault();
                System.out.println(start);
                System.out.println(end);
            } else {
                start = DateTimeUtil.getStartDate(startDate);
                end = DateTimeUtil.getEndDate(endDate);
            }

            String getNumberOfCustomerByDay = "";
            for (LocalDate i = start; i.compareTo(end) < 0; i = i.plusDays(1)) {
                getNumberOfCustomerByDay += accountDAO.getNumberOfRegisteredCustomerByDay(i) + ";";
            }

            getNumberOfCustomerByDay = getNumberOfCustomerByDay.substring(0, getNumberOfCustomerByDay.length() - 1);
            String getDates = DateTimeUtil.getStringOfDateItems(start, end);

            request.setAttribute("startDate", start);
            request.setAttribute("endDate", end.minusDays(1));
//        set attribute
            request.setAttribute("dates", getDates);
            request.setAttribute("customers", getNumberOfCustomerByDay);

            request.setAttribute("totalPosts", totalPosts);
            request.setAttribute("totalAccounts", totalAccounts);
//        request.setAttribute("totalGeneralFeedbacks", totalGeneralFeedbacks);
            request.setAttribute("totalProducts", totalProducts);
            request.setAttribute("totalFeedbacks", totalProductFeedbacks + totalGeneralFeedbacks);
            request.getRequestDispatcher("marketingdashboard.jsp").forward(request, response);
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
