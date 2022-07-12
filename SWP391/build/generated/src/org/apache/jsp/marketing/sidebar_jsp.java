package org.apache.jsp.marketing;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div id=\"sidebar\" class=\"p-2 bg-white shadow-sm\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <a type=\"button\" href=\"/swp/home\" class=\"p-2\" data-bs-toggle=\"tooltip\">\r\n");
      out.write("            <i class=\"fa-solid fa-house\"></i>\r\n");
      out.write("            <span>Home</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <a type=\"button\" href=\"dashboard\" class=\"p-2\" data-bs-toggle=\"tooltip\">\r\n");
      out.write("            <i class=\"fa-solid fa-table-cells\"></i>\r\n");
      out.write("            <span>Dashboard</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <a type=\"button\" href=\"productslist\" class=\"p-2\" data-bs-toggle=\"tooltip\">\r\n");
      out.write("            <i class=\"fa-solid fa-list\"></i>\r\n");
      out.write("            <span>Products List</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <a type=\"button\" href=\"postslist\" class=\"p-2\" data-bs-toggle=\"tooltip\">\r\n");
      out.write("            <i class=\"fa-solid fa-blog\"></i>\r\n");
      out.write("            <span>Posts List</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <a type=\"button\" href=\"customerslist\" class=\"p-2\" data-bs-toggle=\"tooltip\">\r\n");
      out.write("            <i class=\"fa-solid fa-people-group\"></i>\r\n");
      out.write("            <span>Customers List</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <a type=\"button\" href=\"feedbackslist\" class=\"p-2\" data-bs-toggle=\"tooltip\">\r\n");
      out.write("            <i class=\"fa-solid fa-comments\"></i>\r\n");
      out.write("            <span>Feedbacks List</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <a type=\"button\" href=\"sliderslist\" class=\"p-2\" data-bs-toggle=\"tooltip\">\r\n");
      out.write("            <i class=\"fa-solid fa-audio-description\"></i>\r\n");
      out.write("            <span>Sliders List</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"position-absolute bottom-0\">\r\n");
      out.write("        <a type=\"button\" href=\"../logout\" class=\"p-2\" data-bs-toggle=\"tooltip\">\r\n");
      out.write("            <i class=\"fa-solid fa-right-from-bracket\"></i>\r\n");
      out.write("            <span>Logout</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
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
