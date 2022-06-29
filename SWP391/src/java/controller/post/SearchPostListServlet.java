/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.post;

import dal.AccountDAO;
import dal.CategoryDAO;
import dal.PostDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
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
public class SearchPostListServlet extends HttpServlet {

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
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Access denied');");
            out.println("window.location.href = \"http://localhost:8080/swp/home#divOne\";");
            out.println("</script>");
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
        if(account==null){ //have  not login
            processRequest(request, response);
        }

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           HttpSession session = request.getSession();
//        Account account = (Account) session.getAttribute("account");
//        if(account==null){ //have  not login
//            processRequest(request, response);
//        }
        String word=request.getParameter("search");
        int categoryID=Integer.parseInt(request.getParameter("category"));
        int authorID=Integer.parseInt(request.getParameter("author"));
        int featureID=Integer.parseInt(request.getParameter("feature"));
        int sortID=Integer.parseInt(request.getParameter("sort"));
        int currentPage=Integer.parseInt(request.getParameter("page"));
        int numper_page=6;
        PostDAO postDAO=new PostDAO();
        List<Post> posts = postDAO.getPosts(word,categoryID, authorID, featureID, sortID, currentPage,numper_page); //get all product for page 1
        CategoryDAO categoryDAO=new CategoryDAO();
        List<ProductCategory> postCategory = categoryDAO.getPostCategory();
        AccountDAO accountDAO=new AccountDAO();
        List<Account> authors = accountDAO.getAuthors();
        int maxPage=postDAO.countPostPaging(word, categoryID, authorID, featureID, 6); //num of max page 6 post per page
    
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String postHTML="";//contain htm; of list post
        
        
        
        postHTML+="  <div data-v-75520c46=\"\" class=\"row main-content\">\n" +
"                                 <!--header-->\n" +
"                           <div class=\"row navbar-content\">\n" +
"                               <div class=\"col-2\">ID</div>\n" +
"                               <div class=\"col-4\">Title</div>\n" +
"                               <div class=\"col-2\">Author</div>\n" +
"                               <div class=\"col-2\">Status</div>\n" +
"                               <div class=\"col-2\">Action </div>\n" +
"                           </div>\n" +
"                              <!--list-item-->\n" +
"                            <div class=\"list-post_container \">\n" +
"                                <!--a post-->\n" +
"                                <ul class=\"list-post\" id=\"listpost\">\n";
       
                            //Convert List of post to html
                for (Post post : posts) {
            postHTML+="       <li>\n" +
"                                <div class=\"row item-detail\">\n" +
"                                    <div class=\"col-1\">"
                    + post.getPost_id()
                    + "</div>\n" +
"                                    <div class=\"col-5 title-item\">\n" +
"                                        <div class=\"col-4 image-item\">\n" +
"                                            <img src=\""
                    + post.getThumbnail()
                    + "\" />\n" +
"                                        </div>\n" +
"                                        <div class=\"col-8 title\">\n" +
"                                            <p class=\"title-detail\">\n" +
                                                post.getTitle()
                    + "\n" +
"                                            </p>\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                    <div class=\"col-2\">"
                    + post.getAuthor()
                    + "</div>\n" +
"                                    <div class=\"col-2\">\n";
                    
       postHTML+= "                                        <select id=\"feature_item\" style=\" width: 65%; height: 40px;font-size: 13px;\" onchange=\"ChangeFeature("
               + post.getPost_id()
               + ",$(this).children('option:selected').val())\">\n" +
"                                            <option value=\"1\" style=\"font-size: 13px;\"";
       if(post.isFeatured()){//feature on
           postHTML+="selected";
       }
        postHTML+="  >\n" +
"                                                Show \n" +
"                                            </option>\n" +
"                                            <option value=\"0\" style=\"font-size: 13px;\" ";
        if(!post.isFeatured()){//feature off
            postHTML+="selected";
        }
        postHTML+=" >\n" +
"                                                Hide\n" +
"                                            </option>\n" +
"                                        </select>\n";
        postHTML+=
             
"                                    </div>\n" +
"                                    <div class=\"col-2 action-container\">\n" +
"                                      <button type=\"button\" class=\"edit-btn btn btn-secondary btn-sm \">\n" +
"                                          <i class=\"fa-solid fa-pen-to-square\"></i>\n" +
"                                          <a href=\"/swp/marketing/postdetails?id="+post.getPost_id()+"&action=edit\">View</a>\n" +
"                                      </button>\n" +
"                                      <button type=\"button\" class=\" view-btn btn btn-primary btn-sm \">\n" +
"                                          <i class=\"fa-solid fa-eye\"></i><a href=\"/swp/marketing/postdetails?id="+post.getPost_id()+"&action=view\">View</a></button>\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                                    </li>";
        }
                           //Convert Page to html
             postHTML+= 
"                                </ul>\n" +
"                           </div>\n" +
"                              <!--//footer-->\n" +
"                              <footer>\n" +
"                                  <div class=\"pagination\">\n" +
"                                                 <div class=\"content-paging content-paging-footer\" name=\"page\">\n" +
"                                                     <div class=\"title-paging\"> <span>Page "
                     + currentPage
                     + " of "
                     + maxPage
                     + "<span></div>\n" +
"                                                     <nav class=\"\" aria-label=\"...\">\n" +
"                                                        <ul class=\"pagination\">\n";
                    if(currentPage!=1){//currentpage in interval page
                        String previos="    <li class=\"page-item\" >\n" +
"                                            <a class=\"page-link\"  onclick=\"Paging("
                                + (currentPage-1)
                                + ")\" >Previous</a>\n" +
"                                            </li>";
                        postHTML+=previos;
                    }else{
                        String previos="  <li class=\"page-item disabled\">\n" +
"                                           <a class=\"page-link\" >Previous</a>\n" +
"                                         </li>";
                        postHTML+=previos;
                    }
                    
                    postHTML+=
"                                            <select class=\"select-paginate\" id=\"paging\" onchange=\"SubmitForm($('#paging').children('option:selected').val())\">\n";
                                            for (int i = 1; i <=maxPage; i++) {
                                                String tmp="";
                                                
                                              tmp="<option value=\""
                                                      + i
                                                      + "\"";
                                              postHTML+=tmp;
                                              
                                              if(currentPage==i){//match currenpage
                                                  postHTML+="selected";
                                              }
                                               tmp=" >"
                                                       + i
                                                       + "</option>"; 
                                               postHTML+=tmp;
                                    }
                                               postHTML+="</select>";
                                                         
                     if(currentPage!=maxPage){//currentpage in interval page
                        String next="    <li class=\"page-item\" >\n" +
"                                            <a class=\"page-link\"  onclick=\"Paging("
                                + (currentPage+1)
                                + ")\" >Next</a>\n" +
"                                            </li>";
                        postHTML+=next;
                    }else{
                        String next="  <li class=\"page-item disabled\">\n" +
"                                           <a class=\"page-link\" >Next</a>\n" +
"                                         </li>";
                        postHTML+=next;
                    }
                 postHTML+=   "</ul>\n" +
"                                                      </nav>\n" +
"                                               </div>\n" +
"                                  </div>\n" +
"                              </footer>\n" +
"                            \n" +
"                       </div>";
                 
                 out.println(postHTML);
        }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
