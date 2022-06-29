/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.marketing;

import dal.AccountDAO;
import dal.CategoryDAO;
import dal.PostDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Post;
import model.ProductCategory;

/**
 *
 * @author Admin
 */
@WebServlet(name = "PostListServlet", urlPatterns = {"/marketing/postslist"})
public class PostListServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Access denied');");
            out.println("window.location.href = \"http://localhost:8080/swp/home#divOne\";");
            out.println("</script>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        if(account==null){ //have  not login
            processRequest(request, response);
        }
        
         PostDAO postDAO=new PostDAO();
        int currentPage=1;//start page=1
        int numper_page=6;
        List<Post> posts = postDAO.getPosts("",0, 0, -1, 0, currentPage,numper_page); //get all product for page 1
        CategoryDAO categoryDAO=new CategoryDAO();
        List<ProductCategory> postCategory = categoryDAO.getPostCategory();
        AccountDAO accountDAO=new AccountDAO();
        List<Account> authors = accountDAO.getAuthors();
        int maxPage=postDAO.countPostPaging("", 0, 0, -1, 6); //num of max page 6 post per page
        request.setAttribute("curpage", currentPage);
        request.setAttribute("posts", posts);
        request.setAttribute("categories", postCategory);
        request.setAttribute("maxpage",maxPage);
        request.setAttribute("authors", authors);
        request.getRequestDispatcher("/marketing/postlist.jsp").forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
