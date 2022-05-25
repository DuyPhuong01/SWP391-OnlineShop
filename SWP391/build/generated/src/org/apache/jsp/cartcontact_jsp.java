package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cartcontact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cart Contacts</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("    </head>\n");
      out.write("       <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <h1>Cart contacts</h1>\n");
      out.write("\n");
      out.write("                    <nav style=\"--bs-breadcrumb-divider: '>'\" aria-label=\"breadcrumb\">\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"cartdetail.html\">Cart Details</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\" aria-current=\"page\">\n");
      out.write("                                Cart Contacts\n");
      out.write("                            </li>\n");
      out.write("                        </ol>\n");
      out.write("                    </nav>\n");
      out.write("                    <div>\n");
      out.write("                        Shipment Details<br />\n");
      out.write("                        Do not have account? <a href=\"#\">Register</a><br />\n");
      out.write("                    </div>\n");
      out.write("                    <form class=\"row g-3\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <label for=\"inputEmail4\" class=\"form-label\">Name</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"inputEmail4\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <label for=\"inputEmail4\" class=\"form-label\">Email</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"inputEmail4\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <label for=\"inputPassword4\" class=\"form-label\"\n");
      out.write("                                   >Phone Number</label\n");
      out.write("                            >\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"inputPassword4\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <label for=\"inputAddress\" class=\"form-label\">Address</label>\n");
      out.write("                            <input\n");
      out.write("                                type=\"text\"\n");
      out.write("                                class=\"form-control\"\n");
      out.write("                                id=\"inputAddress\"\n");
      out.write("                                placeholder=\"1234 Main St\"\n");
      out.write("                                />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <label for=\"inputAddress2\" class=\"form-label\">Address 2</label>\n");
      out.write("                            <input\n");
      out.write("                                type=\"text\"\n");
      out.write("                                class=\"form-control\"\n");
      out.write("                                id=\"inputAddress2\"\n");
      out.write("                                placeholder=\"Apartment, studio, or floor\"\n");
      out.write("                                />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <label for=\"inputCity\" class=\"form-label\">City</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputCity\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <label for=\"inputState\" class=\"form-label\">State</label>\n");
      out.write("                            <select id=\"inputState\" class=\"form-select\">\n");
      out.write("                                <option selected>Choose...</option>\n");
      out.write("                                <option>...</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-2\">\n");
      out.write("                            <label for=\"inputZip\" class=\"form-label\">Zip</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputZip\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <div class=\"d-grid gap-2 d-md-flex justify-content-md-end\">\n");
      out.write("                                <button class=\"btn btn-primary me-md-2\" type=\"button\">\n");
      out.write("                                    Back to cart\n");
      out.write("                                </button>\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"button\" onclick=\"\"><a href=\"homepage.html\" style=\"color: #fff; text-decoration: none;\">Order now</a></button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"ratio\" style=\"--bs-aspect-ratio: 10%\">\n");
      out.write("                        <div></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <ul class=\"list-group list-group-flush\">\n");
      out.write("                        <li class=\"list-group-item\">\n");
      out.write("                            <div class=\"shadow-sm p-3 mb-5 bg-body rounded\">List Items</div>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col\"></div>\n");
      out.write("                                <div class=\"col\"></div>\n");
      out.write("                                <div class=\"col\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col\">Img</div>\n");
      out.write("                                <div class=\"col\">title</div>\n");
      out.write("                                <div class=\"col\">Quantity</div>\n");
      out.write("                                <div class=\"col d-flex justify-content-end\">1000$</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col\">Img</div>\n");
      out.write("                                <div class=\"col\">title</div>\n");
      out.write("                                <div class=\"col\">Quantity</div>\n");
      out.write("                                <div class=\"col d-flex justify-content-end\">1000$</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col\">Img</div>\n");
      out.write("                                <div class=\"col\">title</div>\n");
      out.write("                                <div class=\"col\">Quantity</div>\n");
      out.write("                                <div class=\"col d-flex justify-content-end\">1000$</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col\">Img</div>\n");
      out.write("                                <div class=\"col\">title</div>\n");
      out.write("                                <div class=\"col\">Quantity</div>\n");
      out.write("                                <div class=\"col d-flex justify-content-end\">1000$</div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"list-group-item\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col\">Cash</div>\n");
      out.write("                                <div class=\"d-flex justify-content-end\">1000000000$</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col\">Transport fee</div>\n");
      out.write("                                <div class=\"d-flex justify-content-end\">100$</div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list-group-item\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col\">Total</div>\n");
      out.write("                                <div class=\"d-flex justify-content-end\">1000000100$</div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js\"\n");
      out.write("            integrity=\"sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("        ></script>\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js\"\n");
      out.write("            integrity=\"sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("        ></script>\n");
      out.write("\n");
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
