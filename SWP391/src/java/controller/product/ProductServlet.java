
package controller.product;

import dal.ProductDAO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;

@WebServlet(name = "ProductServlet", urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {

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
            out.println("<title>Servlet ProductServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        ProductDAO product_dao = new ProductDAO();
        String productid_raw = request.getParameter("id");
        
        try{
            int productId = Integer.parseInt(productid_raw);
            String filePath = getFolderUploadPath()+"product_id="+productId+".txt";
            System.out.println(filePath);
            File f = new File(filePath);
            request.setAttribute("product", product_dao.getProduct(productId));
            if(f.exists())request.setAttribute("specifications", getProductSpecifications(f));
            request.setAttribute("pageNumber", 1);
            request.setAttribute("orderOption", "newest");
            
            request.getRequestDispatcher("productdetails.jsp").forward(request, response);
        } catch (NumberFormatException e){
            System.out.println(e);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    public String getFolderUploadPath() {
        String path = getServletContext().getRealPath("/").replace("\\build", "") + "file/product_details/";
        File folderUpload = new File(path);
        if (!folderUpload.exists()) {
            folderUpload.mkdirs();
        }
        return path;
    }
    
    public List getProductSpecifications(File f){
        List<List> list = new ArrayList<>();
        try{
            FileInputStream fr = new FileInputStream(f);
            BufferedReader bf = new BufferedReader(new InputStreamReader(fr, "UTF-8"));
            String line;
            while((line = bf.readLine()) != null){
                List<List> spe = new ArrayList<>();
                if(line.equals("commonSpecifications")) continue;
                if(line.equals("specificationsDetails")) break;
                List<String> name = new ArrayList<>();
                List<String> value = new ArrayList<>();
                StringTokenizer stk = new StringTokenizer(line, "|");
                name.add(stk.nextToken().trim());
                for(int i=0; i<stk.countTokens(); i++)
                    value.add(stk.nextToken().trim());
                spe.add(name);
                spe.add(value);
                list.add(spe);
            }
            bf.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return list;
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
