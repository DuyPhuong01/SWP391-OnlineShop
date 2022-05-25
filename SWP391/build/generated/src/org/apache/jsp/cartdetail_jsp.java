package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cartdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.rtl.min.css\" integrity=\"sha384-dc2NSrAXbAkjrdm9IYrX10fQq9SDG6Vjz7nQVKdKcJl3pC+k37e7qJR5MVSCS+wR\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <!-- ===== CSS ===== -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/stylecartdetails.css\" />\n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("    \n");
      out.write("    <div class=\"shopping-cart\">\n");
      out.write("        <div class=\"px-4 px-lg-0\">\n");
      out.write("\n");
      out.write("            <div class=\"pb-5\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12 p-5 bg-white rounded shadow-sm mb-5\">\n");
      out.write("\n");
      out.write("                            <!-- Shopping cart table -->\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"col\" class=\"border-0 bg-lightt\">\n");
      out.write("                                                <div class=\"p-2 px-3 text-uppercase\">Sản Phẩm</div>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th scope=\"col\" class=\"border-0 bg-lightt\">\n");
      out.write("                                                <div class=\"py-2 text-uppercase\">Đơn Giá</div>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th scope=\"col\" class=\"border-0 bg-lightt\">\n");
      out.write("                                                <div class=\"py-2 text-uppercase\">Số Lượng</div>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th scope=\"col\" class=\"border-0 bg-lightt\">\n");
      out.write("                                                <div class=\"py-2 text-uppercase\">Xóa</div>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"o\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">\n");
      out.write("                                                <div class=\"p-2\">\n");
      out.write("                                                    <img src=\"images/bg.jpg\" alt=\"\" width=\"70\" class=\"img-fluid rounded shadow-sm\">\n");
      out.write("                                                    <div class=\"ml-3 d-inline-block align-middle\">\n");
      out.write("                                                        <h5 class=\"mb-0\"> <a href=\"detail?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"text-dark d-inline-block\">name</a></h5><span class=\"text-muted font-weight-normal font-italic\"></span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </th>\n");
      out.write("                                            <td class=\"align-middle\"><strong>100.000₫</strong></td>\n");
      out.write("                                            <td class=\"align-middle\">\n");
      out.write("                                                <a href=\"#\"><button class=\"btnSub\">-</button></a> \n");
      out.write("                                                <strong>1</strong>\n");
      out.write("                                                <a href=\"#\"><button class=\"btnAdd\">+</button></a>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td class=\"align-middle\"><a href=\"#\" class=\"text-dark\">\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-danger\">Delete</button>\n");
      out.write("                                                </a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr> \n");
      out.write("                                    </c:forEach>\n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End -->\n");
      out.write("                        <section class=\"home-sp\">\n");
      out.write("                            <div class=\"page-trang table\">\n");
      out.write("                                <a href=\"#\"></a>\n");
      out.write("                                <a href=\"#\"></a>\n");
      out.write("                            </div>\n");
      out.write("                        </section>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row py-5 p-4 bg-white rounded shadow-sm\">\n");
      out.write("                    <div class=\"col-lg-3\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                                <div class=\"bg-lightt rounded-pill px-4 py-3 text-uppercase font-weight-bold\">Thành tiền</div>\n");
      out.write("                                <div class=\"p-4\">\n");
      out.write("                                    <ul class=\"list-unstyled mb-4\">\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Tổng tiền hàng</strong><strong></strong></li>\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Phí vận chuyển</strong><strong>Free ship</strong></li>\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">VAT</strong><strong></strong></li>\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Tổng thanh toán</strong>\n");
      out.write("                                            <h5 class=\"font-weight-bold\"></h5>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul><a href=\"cartcontact.html\" onclick=\"myFunction()\" class=\"btn btn-dark rounded-pill py-2 btn-block\">Mua hàng</a>\n");
      out.write("                                </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    <script src=\"js/script.js\"></script>\n");
      out.write("</body>\n");
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
