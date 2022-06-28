/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.sale;

import dal.OrderDAO;
import dal.SaleDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.OrderStatus;
import model.Sale;
import util.DateTimeUtil;

/**
 *
 * @author Admin
 */
public class SaleServlet extends HttpServlet {

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
            out.println("<title>Servlet SaleServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SaleServlet at " + request.getContextPath() + "</h1>");
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
        SaleDAO saleDAO = new SaleDAO();
        OrderDAO orderDAO = new OrderDAO();
//        get startDate and endDate
        LocalDate start, end;
        start = DateTimeUtil.getStartDateDefault();
        end = DateTimeUtil.getEndDateDefault();

//        get list of dateList and revenue by date
        List<String> dates = DateTimeUtil.getStringOfDateItems(start, end);
        List revenue = saleDAO.getListOfTotalRevenueByDay(start, end);

//        get all sale and status of order
        List<Sale> saleList = saleDAO.getAllSaleMember();
        List<OrderStatus> statusList = orderDAO.getAllOrderStatusForSale();

        totalSuccessOrderDoGet(request, response);
        generalStatistic(request, response);
        
        request.setAttribute("dates", dates);
        request.setAttribute("revenue", revenue);
        request.setAttribute("saleList", saleList);
        request.setAttribute("statusList", statusList);
        request.setAttribute("time", 1);

        request.getRequestDispatcher("sale/dashboard.jsp").forward(request, response);
    }

    private void totalSuccessOrderDoGet(HttpServletRequest request, HttpServletResponse response) {
        SaleDAO saleDAO = new SaleDAO();
        LocalDate start, end;
        start = DateTimeUtil.getStartDateDefault();
        end = DateTimeUtil.getEndDateDefault();
        List totalOrder = saleDAO.getListOfTotalOrderByDayBySale(start, end, 0);
        List successOrder = saleDAO.getListOfTotalSuccessOrderByDayBySale(start, end, 0);
        List<String> dates = DateTimeUtil.getStringOfDateItems(start, end);
        request.setAttribute("labels", dates);
        request.setAttribute("totalOrder", totalOrder);
        request.setAttribute("successOrder", successOrder);
        request.setAttribute("saleIdOrder", 0);
        request.setAttribute("timeOrder", 1);
    }

    private void totalSuccessOrderDoPost(HttpServletRequest request, HttpServletResponse response) {
        String time = request.getParameter("orderTrendTime");
        String saleId_raw = request.getParameter("orderTrendSaleId");
        int saleId;
        SaleDAO saleDAO = new SaleDAO();
        LocalDate start, end;

        start = DateTimeUtil.getStartDate(time);
        end = DateTimeUtil.getEndDateDefault();
        try {
            saleId = Integer.parseInt(saleId_raw);

            List totalOrder = saleDAO.getListOfTotalOrderByDayBySale(start, end, saleId);
            List successOrder = saleDAO.getListOfTotalSuccessOrderByDayBySale(start, end, saleId);
            List<String> dates = DateTimeUtil.getStringOfDateItems(start, end);

            request.setAttribute("labels", dates);
            request.setAttribute("totalOrder", totalOrder);
            request.setAttribute("successOrder", successOrder);
            request.setAttribute("saleIdOrder", saleId);
            request.setAttribute("timeOrder", time);
        } catch (NumberFormatException e) {

        }
    }
    private void generalStatistic(HttpServletRequest request, HttpServletResponse response) {
        OrderDAO orderDAO = new OrderDAO();
        int totalOrder = orderDAO.getTotalOrder();
        int totalOrderToday = orderDAO.getTotalOrderToday();
        SaleDAO saleDAO = new SaleDAO();
        double totalRevenueToday = saleDAO.getTotalRevenueToday();
        double totalRevenue = saleDAO.getTotalRevenue();
        System.out.println(totalOrderToday);
        System.out.println(totalRevenueToday);
        request.setAttribute("totalOrderAllTime", totalOrder);
        request.setAttribute("totalOrderToday", totalOrderToday);
        request.setAttribute("totalRevenueToday", totalRevenueToday);
        request.setAttribute("totalRevenue", totalRevenue);
        
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
        SaleDAO saleDAO = new SaleDAO();
        OrderDAO orderDAO = new OrderDAO();
//        get parameter
        String time = request.getParameter("time");
        String saleId_raw = request.getParameter("saleId");
        String orderStatus_raw = request.getParameter("status");
        int saleId = 0, orderStatus = 0;

        try {
            saleId = Integer.parseInt(saleId_raw);
            orderStatus = Integer.parseInt(orderStatus_raw);
        } catch (NumberFormatException e) {

        }
//        get startDate and endDate
        LocalDate start, end;

        start = DateTimeUtil.getStartDate(time);
        end = DateTimeUtil.getEndDateDefault();

//        get list of dateList and revenue by date
        List<String> dates = DateTimeUtil.getStringOfDateItems(start, end);
        List revenue = saleDAO.getListOfTotalRevenueByDayBySale(start, end, saleId, orderStatus);

//        get all sale and status of order
        List<Sale> saleList = saleDAO.getAllSaleMember();
        List<OrderStatus> statusList = orderDAO.getAllOrderStatusForSale();

        generalStatistic(request, response);
        totalSuccessOrderDoPost(request, response);
        request.setAttribute("dates", dates);
        request.setAttribute("revenue", revenue);
        request.setAttribute("saleList", saleList);
        request.setAttribute("statusList", statusList);
        request.setAttribute("saleId", saleId);
        request.setAttribute("orderStatus", orderStatus);
        request.setAttribute("time", time);

        request.getRequestDispatcher("sale/dashboard.jsp").forward(request, response);
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
