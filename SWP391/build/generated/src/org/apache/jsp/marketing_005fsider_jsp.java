package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class marketing_005fsider_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\"crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!-- ======= Icons used for dropdown (you can use your own) ======== -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/marketing_sider.css\">\r\n");
      out.write("        <style type=\"text/css\"></style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"bg-light\">\r\n");
      out.write("                    <aside class=\"row\"> \r\n");
      out.write("                        <!-- ============= COMPONENT ============== -->\r\n");
      out.write("                        <nav class=\"sidebar card py-2 mb-4\">\r\n");
      out.write("                            <ul class=\"nav flex-column\" id=\"nav_accordion\">\r\n");
      out.write("                                <li class=\"nav-item \" style=\"margin-left: 40px\" >\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\"> Dashboard</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item has-submenu\">\r\n");
      out.write("                                    <div class=\"nav-item_icon\">\r\n");
      out.write("                                        <i class=\"fa-solid fa-cart-arrow-down\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"nav-item_content\">\r\n");
      out.write("                                        <a class=\"nav-link nav-item_content__title\" href=\"#\"> Product Manager <i class=\"bi small bi-caret-down-fill\"></i> </a>\r\n");
      out.write("                                        <ul class=\"submenu collapse\">\r\n");
      out.write("                                            <li><a class=\"nav-link\" href=\"#\">All </a></li>\r\n");
      out.write("                                            <li><a class=\"nav-link\" href=\"#\">Add product </a></li>\r\n");
      out.write("                                            <li><a class=\"nav-link\" href=\"#\">product Hided </a> </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item has-submenu\">\r\n");
      out.write("                                    <div class=\"nav-item_icon\">\r\n");
      out.write("                                        <i class=\"fa-solid fa-blog\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"nav-item_content\">\r\n");
      out.write("                                        <a class=\"nav-link nav-item_content__title\" href=\"#\"> Post Manager <i class=\"bi small bi-caret-down-fill\"></i> </a>\r\n");
      out.write("                                        <ul class=\"submenu collapse\">\r\n");
      out.write("                                            <li><a class=\"nav-link\" href=\"#\">All </a></li>\r\n");
      out.write("                                            <li><a class=\"nav-link\" href=\"#\">Add Post </a></li>\r\n");
      out.write("                                            <li><a class=\"nav-link\" href=\"#\">Post Hided </a> </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item has-submenu\">\r\n");
      out.write("                                    <div class=\"nav-item_icon\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"nav-item_content\" style=\"margin-left: 14px\">\r\n");
      out.write("                                        <a class=\"nav-link nav-item_content__title\" href=\"#\"> Slider Manager <i class=\"bi small bi-caret-down-fill\"></i> </a>\r\n");
      out.write("                                        <ul class=\"submenu collapse\">\r\n");
      out.write("                                            <li><a class=\"nav-link\" href=\"#\">All </a></li>\r\n");
      out.write("                                            <li><a class=\"nav-link\" href=\"#\">Add Slider </a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item has-submenu\">\r\n");
      out.write("                                    <div class=\"nav-item_icon\" style=\"margin-left: 40px\">\r\n");
      out.write("                                        <!-- <i class=\"fa-solid fa-cart-arrow-down\"></i> -->\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"nav-item_content\">\r\n");
      out.write("                                        <a class=\"nav-link nav-item_content__title\" href=\"#\"> Customer Manager <i class=\"bi small bi-caret-down-fill\"></i> </a>\r\n");
      out.write("                                        <ul class=\"submenu collapse\">\r\n");
      out.write("                                            <li><a class=\"nav-link\" href=\"#\">All </a></li>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item has-submenu\">\r\n");
      out.write("                                    <div class=\"nav-item_icon\">\r\n");
      out.write("\r\n");
      out.write("                                        <i class=\"fa-solid fa-message\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"nav-item_content\">\r\n");
      out.write("                                        <a class=\"nav-link nav-item_content__title\" href=\"#\"> Feedbacks Manager <i class=\"bi small bi-caret-down-fill\"></i> </a>\r\n");
      out.write("                                        <ul class=\"submenu collapse\">\r\n");
      out.write("                                            <li><a class=\"nav-link\" href=\"#\">All </a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item\" >\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\" style=\"margin-left: 40px;\"> Other link </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                        <!-- ============= COMPONENT END// ============== -->\t\r\n");
      out.write("                    </aside>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/marketing_sider.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
