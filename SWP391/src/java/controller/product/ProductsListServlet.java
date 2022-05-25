package controller.product;

import dal.CategoryDAO;
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
import model.Product;
import model.ProductCategory;
import model.Cart;
import model.Item;
import model.Product;

@WebServlet(name = "ProductsListServlet", urlPatterns = {"/productslist"})
public class ProductsListServlet extends HttpServlet {

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
            out.println("<title>Servlet ProductListServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductListServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
           ProductDAO productDAO=new ProductDAO();
        List<Product> allproduct = productDAO.getAll();
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
        Cart cart=new Cart(txt, allproduct);
        int quantityItem;//quantity item selected
        List<Item>listItem=cart.getItems();
        if(listItem!=null){//exist cart
            quantityItem=listItem.size();
        }else{
            quantityItem=0;
        }
        request.setAttribute("size", quantityItem);
        request.setAttribute("listP", allproduct);
        request.getRequestDispatcher("productslist.jsp").forward(request, response);
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
        
        String key = request.getParameter("key");
        
        String[] categoriesRaw = request.getParameterValues("category");
        int[] categories;
        
//        convert array of category to int
        if (categoriesRaw == null) {
            categories = null;
        } else {
            categories = new int[categoriesRaw.length];
            for (int i = 0; i < categories.length; i++) {
                categories[i] = Integer.parseInt(categoriesRaw[i]);
            }
        }

//        assign key is empty if it is null
        if (key == null) {
            key = "";
        }

        CategoryDAO categoryDAO = new CategoryDAO();
        ProductDAO productDAO = new ProductDAO();
        
//        get the product category list
        List<ProductCategory> productCategoriesList = categoryDAO.getProductCategory();

        
        final int NUMBER_OF_LATEST_PRODUCT = 6;//CONSTANT that specified the number of latest product to be taken
        
        List<Product> latestProduct = productDAO.getLastActiveProducts(NUMBER_OF_LATEST_PRODUCT); //get latest product

        List<Product> allProductList = productDAO.getAllProducts(categories, key); //get all product that have specified category and contain key
        
//        check category that be checked by user
        boolean checked[] = new boolean[productCategoriesList.size()];
        for (int i = 0; i < checked.length; i++) {
            if (isCheck(productCategoriesList.get(i).getCategory_id(), categories)) {
                checked[i] = true;
            } else {
                checked[i] = false;
            }
        }
        
        
        //pagination
        String pageNumberRaw = request.getParameter("page");
        int pageNumber, numberPage;
        final int NUMBER_ITEMS_PER_PAGE = 8;

        try {
            
            //assign pageNumber = 1 if it null, otherwise parse
            if (pageNumberRaw == null) {
                pageNumber = 1;
            } else {
                pageNumber = Integer.parseInt(pageNumberRaw);

            }
            
            //get number of page 
            if (allProductList.size() % NUMBER_ITEMS_PER_PAGE == 0) {
                numberPage = allProductList.size() / NUMBER_ITEMS_PER_PAGE;
            } else {
                numberPage = allProductList.size() / NUMBER_ITEMS_PER_PAGE + 1;
            }
            
            //get start and end position in the list of all product
            int start, end;
            start = (pageNumber - 1) * NUMBER_ITEMS_PER_PAGE;
            end = Math.min(pageNumber * NUMBER_ITEMS_PER_PAGE, allProductList.size());
            
            //get product by page
            List<Product> productListByPage = productDAO.getListByPage(allProductList, start, end);
            
            request.setAttribute("key", key);
            request.setAttribute("pageNumber", pageNumber);
            request.setAttribute("numberPage", numberPage);
            request.setAttribute("productCategoriesList", productCategoriesList);
            request.setAttribute("checked", checked);
            request.setAttribute("productListByPage", productListByPage);
            request.setAttribute("latestProduct", latestProduct);
            
//            forward to jsp
            request.getRequestDispatcher("productslist.jsp").forward(request, response);
        } catch (NumberFormatException e) {

        }

    }
    //check whether or not category_id contain in array 
    private boolean isCheck(int category, int[] checkedCategories) {
        if (checkedCategories == null) {
            return false;
        } else {
            for (int i = 0; i < checkedCategories.length; i++) {
                if (category == checkedCategories[i]) {
                    return true;
                }
            }
            return false;
        }
        processRequest(request, response);
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
