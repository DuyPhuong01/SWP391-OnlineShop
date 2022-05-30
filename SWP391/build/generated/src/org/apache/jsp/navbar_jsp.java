package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_import_url_nobody.release();
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
      out.write("<nav class=\"navbar navbar-expand-lg bg-light\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"home\">Logo</a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav mb-2 mb-lg-0\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"productslist\">Products</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"blogslist\">Blogs</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"feedbackslist\">Feedbacks</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <form class=\"d-flex\" action=\"productslist\" role=\"search\">\r\n");
      out.write("                <input class=\"form-control me-2\" name=\"search\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                <button class=\"btn btn-outline-primary\" type=\"submit\">Search</button>\r\n");
      out.write("            </form>\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <ul class=\"navbar-nav mb-2 mb-lg-0\" style=\"padding-top: 5px;\">\r\n");
        out.write("\r\n");
        out.write("                    <li class=\"nav-item dropdown me-2\">\r\n");
        out.write("                        <a class=\"btn btn-outline-primary\" href=\"#divOne\" class=\"first-button\">Login</a>\r\n");
        out.write("                        ");
        if (_jspx_meth_c_import_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        </li>\r\n");
        out.write("\r\n");
        out.write("                        <li class=\"nav-item align-items-center\">\r\n");
        out.write("                            <form action=\"showcart\" method=\"GET\">\r\n");
        out.write("                                <button type=\"submit\" class=\"btn btn-primary position-relative\">\r\n");
        out.write("                                    <i class='bx bx-cart-alt align-items-center'></i>\r\n");
        out.write("                                    <span class=\"position-absolute top-0 start-100 translate-middle badge rounded-pill\" style=\"background-color: #807d7d; color: #ffffff;\">\r\n");
        out.write("                                        4\r\n");
        out.write("                                        <span class=\"visually-hidden\">Product in cart</span>\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                </button>\r\n");
        out.write("                            </form>\r\n");
        out.write("\r\n");
        out.write("                        </li>\r\n");
        out.write("                    </ul>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_import_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_import_0.setUrl("login.jsp");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write("                <ul class=\"navbar-nav mb-2 mb-lg-0\" style=\"padding-top: 5px;\">\r\n");
        out.write("                    <img src=\"images/account-images/acc.png\" class=\"img-thumbnail\" style=\"width: 50px;height: 50px; border-radius: 50%;\">\r\n");
        out.write("                    <li class=\"nav-item dropdown me-2\">\r\n");
        out.write("                        <div class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">My Account</div>\r\n");
        out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
        out.write("                            <li><a class=\"dropdown-item\" href=\"userprofile\">Profile</a></li>\r\n");
        out.write("                            <li><a class=\"dropdown-item\" href=\"myorders\">My Orders</a></li>\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <hr class=\"dropdown-divider\">\r\n");
        out.write("                            </li>\r\n");
        out.write("                            <li><a class=\"dropdown-item\" href=\"changepassword\">Change password</a></li>\r\n");
        out.write("                            <li><a class=\"dropdown-item\" href=\"logout\">Log out</a></li>\r\n");
        out.write("                        </ul>\r\n");
        out.write("                    </li>\r\n");
        out.write("\r\n");
        out.write("                    <li class=\"nav-item align-items-center\">\r\n");
        out.write("                        <form action=\"showcart\" method=\"GET\">\r\n");
        out.write("                            <button type=\"submit\" class=\"btn btn-primary position-relative\">\r\n");
        out.write("                                <i class='bx bx-cart-alt align-items-center'></i>\r\n");
        out.write("                                <span class=\"position-absolute top-0 start-100 translate-middle badge rounded-pill\" style=\"background-color: #807d7d; color: #ffffff;\">\r\n");
        out.write("                                    4\r\n");
        out.write("                                    <span class=\"visually-hidden\">Product in cart</span>\r\n");
        out.write("                                </span>\r\n");
        out.write("                            </button>\r\n");
        out.write("                        </form>\r\n");
        out.write("                    </li>\r\n");
        out.write("                </ul>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
