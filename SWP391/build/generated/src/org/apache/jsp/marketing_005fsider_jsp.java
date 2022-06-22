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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\"crossorigin=\"anonymous\"></script>\n");
      out.write("<!-- ======= Icons used for dropdown (you can use your own) ======== -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/marketing_sider.css\">\n");
      out.write("<style type=\"text/css\"></style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-light\">\n");
      out.write("        <div class=\"container sider-container\">\n");
      out.write("        <section class=\"section-content py-3\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<aside class=\"col-lg-3\"> \n");
      out.write("<!-- ============= COMPONENT ============== -->\n");
      out.write("<nav class=\"sidebar card py-2 mb-4\">\n");
      out.write("<ul class=\"nav flex-column\" id=\"nav_accordion\">\n");
      out.write("\t <li class=\"nav-item\">\n");
      out.write("\t\t<a class=\"nav-link\" href=\"#\"> Dashboard</a>\n");
      out.write("\t</li>\n");
      out.write("\t<li class=\"nav-item has-submenu\">\n");
      out.write("\t\t<div class=\"nav-item_icon\">\n");
      out.write("\t\t\t<i class=\"fa-solid fa-cart-arrow-down\"></i>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"nav-item_content\">\n");
      out.write("\t\t\t<a class=\"nav-link nav-item_content__title\" href=\"#\"> Product Manager <i class=\"bi small bi-caret-down-fill\"></i> </a>\n");
      out.write("\t\t\t<ul class=\"submenu collapse\">\n");
      out.write("\t\t\t\t<li><a class=\"nav-link\" href=\"#\">All </a></li>\n");
      out.write("\t\t\t\t<li><a class=\"nav-link\" href=\"#\">Add product </a></li>\n");
      out.write("\t\t\t\t<li><a class=\"nav-link\" href=\"#\">product Hided </a> </li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</li>\n");
      out.write("\t<li class=\"nav-item has-submenu\">\n");
      out.write("\t\t<div class=\"nav-item_icon\">\n");
      out.write("\t\t\t<i class=\"fa-solid fa-blog\"></i>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"nav-item_content\">\n");
      out.write("\t\t\t<a class=\"nav-link nav-item_content__title\" href=\"#\"> Post Manager <i class=\"bi small bi-caret-down-fill\"></i> </a>\n");
      out.write("\t\t\t<ul class=\"submenu collapse\">\n");
      out.write("\t\t\t\t<li><a class=\"nav-link\" href=\"#\">All </a></li>\n");
      out.write("\t\t\t\t<li><a class=\"nav-link\" href=\"#\">Add Post </a></li>\n");
      out.write("\t\t\t\t<li><a class=\"nav-link\" href=\"#\">Post Hided </a> </li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</li>\n");
      out.write("\t<li class=\"nav-item has-submenu\">\n");
      out.write("\t\t<div class=\"nav-item_icon\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"nav-item_content\" style=\"margin-left: 14px\">\n");
      out.write("\t\t\t<a class=\"nav-link nav-item_content__title\" href=\"#\"> Slider Manager <i class=\"bi small bi-caret-down-fill\"></i> </a>\n");
      out.write("\t\t\t<ul class=\"submenu collapse\">\n");
      out.write("\t\t\t\t<li><a class=\"nav-link\" href=\"#\">All </a></li>\n");
      out.write("\t\t\t\t<li><a class=\"nav-link\" href=\"#\">Add Slider </a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</li>\n");
      out.write("\t<li class=\"nav-item has-submenu\">\n");
      out.write("\t\t<div class=\"nav-item_icon\" style=\"margin-left: 20px\">\n");
      out.write("\t\t\t<!-- <i class=\"fa-solid fa-cart-arrow-down\"></i> -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"nav-item_content\">\n");
      out.write("\t\t\t<a class=\"nav-link nav-item_content__title\" href=\"#\"> Customer Manager <i class=\"bi small bi-caret-down-fill\"></i> </a>\n");
      out.write("\t\t\t<ul class=\"submenu collapse\">\n");
      out.write("\t\t\t\t<li><a class=\"nav-link\" href=\"#\">All </a></li>\n");
      out.write("\t\t</div>\n");
      out.write("\t</li>\n");
      out.write("\t<li class=\"nav-item has-submenu\">\n");
      out.write("\t\t<div class=\"nav-item_icon\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<i class=\"fa-solid fa-message\"></i>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"nav-item_content\">\n");
      out.write("\t\t\t<a class=\"nav-link nav-item_content__title\" href=\"#\"> Feedbacks Manager <i class=\"bi small bi-caret-down-fill\"></i> </a>\n");
      out.write("\t\t\t<ul class=\"submenu collapse\">\n");
      out.write("\t\t\t\t<li><a class=\"nav-link\" href=\"#\">All </a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</li>\n");
      out.write("\t<li class=\"nav-item\">\n");
      out.write("\t\t<a class=\"nav-link\" href=\"#\"> Other link </a>\n");
      out.write("\t</li>\n");
      out.write("</ul>\n");
      out.write("</nav>\n");
      out.write("<!-- ============= COMPONENT END// ============== -->\t\n");
      out.write("\t\t</aside>\n");
      out.write("\t\t<main class=\"col-lg-9\">\n");
      out.write("\n");
      out.write("<h6>Demo for sidebar collapsible menu with Boostrap 5 methods, without jquery. <br> Based on Bootstrap 5 scripts.  </h6>\n");
      out.write("<p>For this demo page you should connect to the internet to receive files from CDN  like Bootstrap5 CSS, Bootstrap5 JS</p>\n");
      out.write("\n");
      out.write("<p class=\"text-muted\"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("proident, sunt in culpa qui officia deserunt mollit anim id est laborum. </p>\n");
      out.write("\n");
      out.write("<a href=\"https://bootstrap-menu.com/detail-sidebar-nav-collapse.html\" class=\"btn btn-success\"> &laquo Back to tutorial or Download code</a>\n");
      out.write("\n");
      out.write("\t\t</main>\n");
      out.write("\t</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</div><!-- container //  -->\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"js/marketing_sider.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
