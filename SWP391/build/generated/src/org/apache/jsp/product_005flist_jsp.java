package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <!Doctype html>\r\n");
      out.write("        <html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("        <head>\r\n");
      out.write("            <meta charset=\"utf-8\">\r\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("            <title>Bootstrap demo</title>\r\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"./asserts/css/base.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"./asserts/css/post_list.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"./asserts/css/product_list.css\">\r\n");
      out.write("\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"./asserts/fontawesome-free-6.0.0/css/all.min.css\">\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("            <div class=\"container header-navbar\">\r\n");
      out.write("                <div class=\"row \" style=\"height: 50px; width: 100%; margin-bottom: 10px;\">\r\n");
      out.write("                    <!-- navbar filter  -->\r\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg  navbar-dark bg-dark header-navbar\" style=\"width: 100%;\">\r\n");
      out.write("                        <div class=\"container-fluid\">\r\n");
      out.write("                            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarText\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("              <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"navbarText\">\r\n");
      out.write("                                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 col-md\">\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link \" aria-current=\"page\" href=\"#\">Home</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link \" href=\"#\">Post List</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" href=\"#\">Customers List</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" href=\"#\">Feedbacks List </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link active\" href=\" # \">Product List</a>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("      <!--navbar horizon-->\r\n");
      out.write("      <div class=\"container navbar-horizon \" style=\"height: 48x; \">\r\n");
      out.write("        <div class=\"row \" style=\"height: 100%; \">\r\n");
      out.write("          <div class=\"col-md-2 \">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-10 navbar-path \">\r\n");
      out.write("              <p>Home/Product list</p>\r\n");
      out.write("              <div class=\"col-md-9 \">\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-1 \">\r\n");
      out.write("                <div class=\"dropdown sidebar-item \">\r\n");
      out.write("                  <button style=\"width: 100%; \" class=\"btn btn-secondary dropdown-toggle \" type=\"button \" id=\"dropdownMenu2 \" data-bs-toggle=\"dropdown \" aria-expanded=\"false \">\r\n");
      out.write("                    Sort by\r\n");
      out.write("                  </button>\r\n");
      out.write("                  <ul class=\" sidebar-btn dropdown-menu \" aria-labelledby=\"dropdownMenu2 \" \">\r\n");
      out.write("                                            <li><button class=\"dropdown-item\" type=\"button\">Action</button></li>\r\n");
      out.write("                                            <li><button class=\"dropdown-item\" type=\"button\">Another action</button></li>\r\n");
      out.write("                                            <li><button class=\"dropdown-item\" type=\"button\">Something else here</button></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--side bar-->\r\n");
      out.write("            <div class=\"container body_page nav\" style=\"height: 1000px;\">\r\n");
      out.write("                <div class=\"row col-md-2 sidebar\">\r\n");
      out.write("                    <!-- List category -->\r\n");
      out.write("                    <div class=\"sidebar-content\">\r\n");
      out.write("                        <p>Filter</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"dropdown sidebar-item\">\r\n");
      out.write("                        <button style=\"width: 100%;\" class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"dropdownMenu2\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            Category\r\n");
      out.write("          </button>\r\n");
      out.write("                        <ul class=\" sidebar-btn dropdown-menu\" aria-labelledby=\"dropdownMenu2\" \">\r\n");
      out.write("            <li><button class=\"dropdown-item \" type=\"button \">Action</button></li>\r\n");
      out.write("            <li><button class=\"dropdown-item \" type=\"button \">Another action</button></li>\r\n");
      out.write("            <li><button class=\"dropdown-item \" type=\"button \">Something else here</button></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"dropdown sidebar-item \">\r\n");
      out.write("          <button style=\"width: 100%; \" class=\"btn btn-secondary dropdown-toggle \" type=\"button \" id=\"dropdownMenu2 \" data-bs-toggle=\"dropdown \" aria-expanded=\"false \">\r\n");
      out.write("            Status\r\n");
      out.write("          </button>\r\n");
      out.write("          <ul class=\" sidebar-btn dropdown-menu \" aria-labelledby=\"dropdownMenu2 \" \">\r\n");
      out.write("                            <li><button class=\"dropdown-item\" type=\"button\">Action</button></li>\r\n");
      out.write("                            <li><button class=\"dropdown-item\" type=\"button\">Another action</button></li>\r\n");
      out.write("                            <li><button class=\"dropdown-item\" type=\"button\">Something else here</button></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"search-item\">\r\n");
      out.write("                        <div class=\"sidebar-item sidebar-item__search\">\r\n");
      out.write("                            <div class=\"sidebar-item__search sidebar-item__search-content col-md-10\">\r\n");
      out.write("                                <input type=\"text\" style=\"width: 100%;\" class=\"search-input\" placeholder=\"Search\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"sidebar-item__search sidebar-item__search-icon col-md-4\">\r\n");
      out.write("                                <i class=\"fa-solid fa-magnifying-glass search-icon\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- content  -->\r\n");
      out.write("                <div class=\"row col-md-10 content content-main-page \">\r\n");
      out.write("                    <div class=\"content-paging\">\r\n");
      out.write("                        <div class=\"row product-list_info col-md-12\">\r\n");
      out.write("                            <div class=\"col-md-1 product_id\">\r\n");
      out.write("                                ID\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-2 product_thumbnail\">\r\n");
      out.write("                                Thumbnail\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-4 product_title\">\r\n");
      out.write("                                Titile\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-1 product_category\">\r\n");
      out.write("                                Category\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-2 product_listprice\">\r\n");
      out.write("                                List price\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-2 product_saleprice\">\r\n");
      out.write("                                Sale price\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- <div class=\"paging col-md-2\">\r\n");
      out.write("                <nav aria-label=\"...\">\r\n");
      out.write("                    <ul class=\"pagination\">\r\n");
      out.write("                      <li class=\"page-item disabled\">\r\n");
      out.write("                        <a class=\"page-link\" href=\"#\" tabindex=\"-1\">Previous</a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                      <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("                      <li class=\"page-item active\">\r\n");
      out.write("                        <a class=\"page-link\" href=\"#\">2 <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                      <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("                      <li class=\"page-item\">\r\n");
      out.write("                        <a class=\"page-link\" href=\"#\">Next</a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                  </nav>\r\n");
      out.write("              </div> -->\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- A post -->\r\n");
      out.write("                    <div class=\"container container-content\">\r\n");
      out.write("                        <ul class=\"list-content-item list-product-item\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"col-md-1 product_id\">\r\n");
      out.write("                                    ID\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 content-item_img\">\r\n");
      out.write("                                    <div class=\"img-item\">\r\n");
      out.write("                                        <img src=\"https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone11-select-2019-family?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022175704\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4 product_title\">\r\n");
      out.write("                                    Titile\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-1 product_category\">\r\n");
      out.write("                                    Category\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 product_listprice\">\r\n");
      out.write("                                    List price\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 product_saleprice\">\r\n");
      out.write("                                    Sale price\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"col-md-1 product_id\">\r\n");
      out.write("                                    ID\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 content-item_img\">\r\n");
      out.write("                                    <div class=\"img-item\">\r\n");
      out.write("                                        <img src=\"https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone11-select-2019-family?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022175704\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4 product_title\">\r\n");
      out.write("                                    Titile\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-1 product_category\">\r\n");
      out.write("                                    Category\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 product_listprice\">\r\n");
      out.write("                                    List price\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 product_saleprice\">\r\n");
      out.write("                                    Sale price\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"col-md-1 product_id\">\r\n");
      out.write("                                    ID\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 content-item_img\">\r\n");
      out.write("                                    <div class=\"img-item\">\r\n");
      out.write("                                        <img src=\"https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone11-select-2019-family?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022175704\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4 product_title\">\r\n");
      out.write("                                    Titile\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-1 product_category\">\r\n");
      out.write("                                    Category\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 product_listprice\">\r\n");
      out.write("                                    List price\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 product_saleprice\">\r\n");
      out.write("                                    Sale price\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"col-md-1 product_id\">\r\n");
      out.write("                                    ID\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 content-item_img\">\r\n");
      out.write("                                    <div class=\"img-item\">\r\n");
      out.write("                                        <img src=\"https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone11-select-2019-family?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022175704\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4 product_title\">\r\n");
      out.write("                                    Titile\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-1 product_category\">\r\n");
      out.write("                                    Category\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 product_listprice\">\r\n");
      out.write("                                    List price\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 product_saleprice\">\r\n");
      out.write("                                    Sale price\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"col-md-1 product_id\">\r\n");
      out.write("                                    ID\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 content-item_img\">\r\n");
      out.write("                                    <div class=\"img-item\">\r\n");
      out.write("                                        <img src=\"https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone11-select-2019-family?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022175704\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4 product_title\">\r\n");
      out.write("                                    Titile\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-1 product_category\">\r\n");
      out.write("                                    Category\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 product_listprice\">\r\n");
      out.write("                                    List price\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 product_saleprice\">\r\n");
      out.write("                                    Sale price\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"col-md-1 product_id\">\r\n");
      out.write("                                    ID\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 content-item_img\">\r\n");
      out.write("                                    <div class=\"img-item\">\r\n");
      out.write("                                        <img src=\"https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone11-select-2019-family?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022175704\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4 product_title\">\r\n");
      out.write("                                    Titile\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-1 product_category\">\r\n");
      out.write("                                    Category\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 product_listprice\">\r\n");
      out.write("                                    List price\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-2 product_saleprice\">\r\n");
      out.write("                                    Sale price\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <!--footer-->\r\n");
      out.write("                        <div class=\"content-paging content-paging-footer\">\r\n");
      out.write("                            <nav aria-label=\"...\">\r\n");
      out.write("                                <ul class=\"pagination pagination--footer\">\r\n");
      out.write("                                    <li class=\"page-item disabled\">\r\n");
      out.write("                                        <a class=\"page-link\" href=\"#\" tabindex=\"-1\">Previous</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("                                    <li class=\"page-item active\">\r\n");
      out.write("                                        <a class=\"page-link\" href=\"#\">2 <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("                                    <li class=\"page-item\">\r\n");
      out.write("                                        <a class=\"page-link\" href=\"#\">Next</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </nav>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        </body>\r\n");
      out.write("\r\n");
      out.write("        </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}