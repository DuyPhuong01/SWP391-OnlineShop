package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cartcompletion_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Cart Contacts</title>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("        <!--CSS-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylecartcontact.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylecartcompletition.css\"/>\r\n");
      out.write("        <!--font-awesome-->\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/3c84cb624f.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container-lg mb-5\">\r\n");
      out.write("                <nav style=\"--bs-breadcrumb-divider: '>'\" aria-label=\"breadcrumb\">\r\n");
      out.write("                    <ol class=\"breadcrumb\">\r\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"showcart\" class=\"text-decoration-none text-muted\">Cart Details</a></li>\r\n");
      out.write("                        <li class=\"breadcrumb-item active\" aria-current=\"page\">\r\n");
      out.write("                            Cart Contacts\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"breadcrumb-item active\" aria-current=\"page\">\r\n");
      out.write("                            Cart Completion\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-3\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <div class=\"p-3 bg-white rounded shadow-sm mb-3\">\r\n");
      out.write("                            <!--cart status-->\r\n");
      out.write("                            <div class=\"status\">\r\n");
      out.write("                                <div class=\"stepper\">\r\n");
      out.write("                                    \r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                       ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("       \r\n");
      out.write("                       ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("       \r\n");
      out.write("                       ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("       \r\n");
      out.write("                                \r\n");
      out.write("                            <!--line-->\r\n");
      out.write("                            <div class=\"j7z7l_\">\r\n");
      out.write("                                <div class=\"_1AsWWl\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--cart contact-->\r\n");
      out.write("                            <div class=\"text-center\">\r\n");
      out.write("                                <h3 class=\"pb-3 text-uppercase font-weight-bold\">Cart Contact</h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_10(_jspx_page_context))
        return;
      out.write("              \r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_20(_jspx_page_context))
        return;
      out.write("              \r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("                                   \r\n");
      out.write("    </body>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://unpkg.com/@popperjs/core@2\"></script>\r\n");
      out.write("    <script src=\"js/form.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("                                            const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle=\"tooltip\"]')\r\n");
      out.write("                                            const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl))\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("o");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("order");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.order}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("navbar.jsp");
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

  private boolean _jspx_meth_c_import_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_1.setPageContext(_jspx_page_context);
    _jspx_th_c_import_1.setParent(null);
    _jspx_th_c_import_1.setUrl("sider.jsp");
    int[] _jspx_push_body_count_c_import_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_1 = _jspx_th_c_import_1.doStartTag();
      if (_jspx_th_c_import_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_1.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <div class=\"stepper__step \">\r\n");
        out.write("                                        <div class=\"stepper__step-icon \" style=\"border-color: #df8650bd;\r\n");
        out.write("    color: red;\">\r\n");
        out.write("                                            <svg enable-background=\"new 0 0 32 32\" viewBox=\"0 0 32 32\" x=\"0\" y=\"0\" class=\"shopee-svg-icon icon-order-problem\">\r\n");
        out.write("                                            <g>\r\n");
        out.write("                                            <g>\r\n");
        out.write("                                            <path d=\"m5 3.4v23.7c0 .4.3.7.7.7.2 0 .3 0 .3-.2.5-.4 1-.5 1.7-.5.9 0 1.7.4 2.2 1.1.2.2.3.4.5.4s.3-.2.5-.4c.5-.7 1.4-1.1 2.2-1.1s1.7.4 2.2 1.1c.2.2.3.4.5.4s.3-.2.5-.4c.5-.7 1.4-1.1 2.2-1.1.9 0 1.7.4 2.2 1.1.2.2.3.4.5.4s.3-.2.5-.4c.5-.7 1.4-1.1 2.2-1.1.7 0 1.2.2 1.7.5.2.2.3.2.3.2.3 0 .7-.4.7-.7v-23.7z\" fill=\"none\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"3\">\r\n");
        out.write("\r\n");
        out.write("                                            </path>\r\n");
        out.write("                                            </g>\r\n");
        out.write("                                            <line fill=\"none\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"3\" x1=\"16\" x2=\"16\" y1=\"9\" y2=\"15\">\r\n");
        out.write("\r\n");
        out.write("                                            </line>\r\n");
        out.write("                                            <circle cx=\"16\" cy=\"20.5\" r=\"2\" stroke=\"none\">\r\n");
        out.write("\r\n");
        out.write("                                            </circle>\r\n");
        out.write("                                            </g>\r\n");
        out.write("                                            </svg>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                        <div class=\"stepper__step-text\">\r\n");
        out.write("                                            Order has been cancelled</div>\r\n");
        out.write("                                        <div class=\"stepper__step-date\">\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status>0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <div class=\"stepper__step stepper__step--finish\">\r\n");
        out.write("                                        <div class=\"stepper__step-icon   ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\">\r\n");
        out.write("                                                <svg enable-background=\"new 0 0 32 32\" viewBox=\"0 0 32 32\" x=\"0\" y=\"0\"\r\n");
        out.write("                                                     class=\"shopee-svg-icon icon-order-order\">\r\n");
        out.write("                                                <g>\r\n");
        out.write("                                                <path\r\n");
        out.write("                                                    d=\"m5 3.4v23.7c0 .4.3.7.7.7.2 0 .3 0 .3-.2.5-.4 1-.5 1.7-.5.9 0 1.7.4 2.2 1.1.2.2.3.4.5.4s.3-.2.5-.4c.5-.7 1.4-1.1 2.2-1.1s1.7.4 2.2 1.1c.2.2.3.4.5.4s.3-.2.5-.4c.5-.7 1.4-1.1 2.2-1.1.9 0 1.7.4 2.2 1.1.2.2.3.4.5.4s.3-.2.5-.4c.5-.7 1.4-1.1 2.2-1.1.7 0 1.2.2 1.7.5.2.2.3.2.3.2.3 0 .7-.4.7-.7v-23.7z\"\r\n");
        out.write("                                                    fill=\"none\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\"\r\n");
        out.write("                                                    stroke-width=\"3\">\r\n");
        out.write("\r\n");
        out.write("                                                </path>\r\n");
        out.write("                                                <g>\r\n");
        out.write("                                                <line fill=\"none\" stroke-linecap=\"round\" stroke-miterlimit=\"10\" stroke-width=\"3\" x1=\"10\"\r\n");
        out.write("                                                      x2=\"22\" y1=\"11.5\" y2=\"11.5\">\r\n");
        out.write("\r\n");
        out.write("                                                </line>\r\n");
        out.write("                                                <line fill=\"none\" stroke-linecap=\"round\" stroke-miterlimit=\"10\" stroke-width=\"3\" x1=\"10\"\r\n");
        out.write("                                                      x2=\"22\" y1=\"18.5\" y2=\"18.5\">\r\n");
        out.write("\r\n");
        out.write("                                                </line>\r\n");
        out.write("                                                </g>\r\n");
        out.write("                                                </g>\r\n");
        out.write("                                                </svg>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <div class=\"stepper__step-text\">\r\n");
        out.write("                                                Submitted</div>\r\n");
        out.write("                                            <div class=\"stepper__step-date\">\r\n");
        out.write("                                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.order_Date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                    <div class=\"stepper__step stepper__step--finish\">\r\n");
        out.write("                                        <div class=\"stepper__step-icon ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\">\r\n");
        out.write("                                                <svg enable-background=\"new 0 0 32 32\" viewBox=\"0 0 32 32\" x=\"0\" y=\"0\"\r\n");
        out.write("                                                     class=\"shopee-svg-icon icon-order-paid\">\r\n");
        out.write("                                                <g>\r\n");
        out.write("                                                <path clip-rule=\"evenodd\"\r\n");
        out.write("                                                      d=\"m24 22h-21c-.5 0-1-.5-1-1v-15c0-.6.5-1 1-1h21c .5 0 1 .4 1 1v15c0 .5-.5 1-1 1z\"\r\n");
        out.write("                                                      fill=\"none\" fill-rule=\"evenodd\" stroke-miterlimit=\"10\" stroke-width=\"3\">\r\n");
        out.write("\r\n");
        out.write("                                                </path>\r\n");
        out.write("                                                <path clip-rule=\"evenodd\"\r\n");
        out.write("                                                      d=\"m24.8 10h4.2c.5 0 1 .4 1 1v15c0 .5-.5 1-1 1h-21c-.6 0-1-.4-1-1v-4\" fill=\"none\"\r\n");
        out.write("                                                      fill-rule=\"evenodd\" stroke-miterlimit=\"10\" stroke-width=\"3\">\r\n");
        out.write("\r\n");
        out.write("                                                </path>\r\n");
        out.write("                                                <path\r\n");
        out.write("                                                    d=\"m12.9 17.2c-.7-.1-1.5-.4-2.1-.9l.8-1.2c.6.5 1.1.7 1.7.7.7 0 1-.3 1-.8 0-1.2-3.2-1.2-3.2-3.4 0-1.2.7-2 1.8-2.2v-1.3h1.2v1.2c.8.1 1.3.5 1.8 1l-.9 1c-.4-.4-.8-.6-1.3-.6-.6 0-.9.2-.9.8 0 1.1 3.2 1 3.2 3.3 0 1.2-.6 2-1.9 2.3v1.2h-1.2z\"\r\n");
        out.write("                                                    stroke=\"none\">\r\n");
        out.write("\r\n");
        out.write("                                                </path>\r\n");
        out.write("                                                </g>\r\n");
        out.write("                                                </svg>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <div class=\"stepper__step-text\">\r\n");
        out.write("                                                payment information confirmation\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <div class=\"stepper__step-date\">\r\n");
        out.write("                                                19:51 08-06-2022</div>\r\n");
        out.write("                                        </div>\r\n");
        out.write("\r\n");
        out.write("                                        <div class=\"stepper__step stepper__step--pending\">\r\n");
        out.write("                                            <div class=\"stepper__step-icon  ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\">\r\n");
        out.write("                                                <svg enable-background=\"new 0 0 32 32\" viewBox=\"0 0 32 32\" x=\"0\" y=\"0\"\r\n");
        out.write("                                                     class=\"shopee-svg-icon icon-order-received\">\r\n");
        out.write("                                                <g>\r\n");
        out.write("                                                <polygon fill=\"none\"\r\n");
        out.write("                                                         points=\"2 28 2 19.2 10.6 19.2 11.7 21.5 19.8 21.5 20.9 19.2 30 19.1 30 28\"\r\n");
        out.write("                                                         stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"3\">\r\n");
        out.write("\r\n");
        out.write("                                                </polygon>\r\n");
        out.write("                                                <polyline fill=\"none\" points=\"21 8 27 8 30 19.1\" stroke-linecap=\"round\"\r\n");
        out.write("                                                          stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"3\">\r\n");
        out.write("\r\n");
        out.write("                                                </polyline>\r\n");
        out.write("                                                <polyline fill=\"none\" points=\"2 19.2 5 8 11 8\" stroke-linecap=\"round\"\r\n");
        out.write("                                                          stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"3\">\r\n");
        out.write("\r\n");
        out.write("                                                </polyline>\r\n");
        out.write("                                                <line fill=\"none\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\"\r\n");
        out.write("                                                      stroke-width=\"3\" x1=\"16\" x2=\"16\" y1=\"4\" y2=\"14\">\r\n");
        out.write("\r\n");
        out.write("                                                </line>\r\n");
        out.write("                                                <path\r\n");
        out.write("                                                    d=\"m20.1 13.4-3.6 3.6c-.3.3-.7.3-.9 0l-3.6-3.6c-.4-.4-.1-1.1.5-1.1h7.2c.5 0 .8.7.4 1.1z\"\r\n");
        out.write("                                                    stroke=\"none\">\r\n");
        out.write("\r\n");
        out.write("                                                </path>\r\n");
        out.write("                                                </g>\r\n");
        out.write("                                                </svg>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <div class=\"stepper__step-text\">\r\n");
        out.write("                                                active</div>\r\n");
        out.write("                                            <div class=\"stepper__step-date\">\r\n");
        out.write("\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                        <div class=\"stepper__step stepper__step--finish\">\r\n");
        out.write("                                            <div class=\"stepper__step-icon  ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\">\r\n");
        out.write("                                                <svg enable-background=\"new 0 0 32 32\" viewBox=\"0 0 32 32\" x=\"0\" y=\"0\"\r\n");
        out.write("                                                     class=\"shopee-svg-icon icon-order-shipping\">\r\n");
        out.write("                                                <g>\r\n");
        out.write("                                                <line fill=\"none\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"3\" x1=\"18.1\"\r\n");
        out.write("                                                      x2=\"9.6\" y1=\"20.5\" y2=\"20.5\">\r\n");
        out.write("\r\n");
        out.write("                                                </line>\r\n");
        out.write("                                                <circle cx=\"7.5\" cy=\"23.5\" fill=\"none\" r=\"4\" stroke-miterlimit=\"10\" stroke-width=\"3\">\r\n");
        out.write("\r\n");
        out.write("                                                </circle>\r\n");
        out.write("                                                <circle cx=\"20.5\" cy=\"23.5\" fill=\"none\" r=\"4\" stroke-miterlimit=\"10\" stroke-width=\"3\">\r\n");
        out.write("\r\n");
        out.write("                                                </circle>\r\n");
        out.write("                                                <line fill=\"none\" stroke-miterlimit=\"10\" stroke-width=\"3\" x1=\"19.7\" x2=\"30\" y1=\"15.5\"\r\n");
        out.write("                                                      y2=\"15.5\">\r\n");
        out.write("\r\n");
        out.write("                                                </line>\r\n");
        out.write("                                                <polyline fill=\"none\" points=\"4.6 20.5 1.5 20.5 1.5 4.5 20.5 4.5 20.5 18.4\"\r\n");
        out.write("                                                          stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"3\">\r\n");
        out.write("\r\n");
        out.write("                                                </polyline>\r\n");
        out.write("                                                <polyline fill=\"none\" points=\"20.5 9 29.5 9 30.5 22 24.7 22\" stroke-linejoin=\"round\"\r\n");
        out.write("                                                          stroke-miterlimit=\"10\" stroke-width=\"3\">\r\n");
        out.write("\r\n");
        out.write("                                                </polyline>\r\n");
        out.write("                                                </g>\r\n");
        out.write("                                                </svg>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <div class=\"stepper__step-text\">\r\n");
        out.write("                                                transporting </div>\r\n");
        out.write("                                            <div class=\"stepper__step-date\">\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                        <div class=\"stepper__step\">\r\n");
        out.write("                                            <div class=\"stepper__step-icon  ");
        if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\">\r\n");
        out.write("                                                <svg enable-background=\"new 0 0 32 32\" viewBox=\"0 0 32 32\" x=\"0\" y=\"0\"\r\n");
        out.write("                                                     class=\"shopee-svg-icon icon-order-rating\">\r\n");
        out.write("                                                <polygon fill=\"none\"\r\n");
        out.write("                                                         points=\"16 3.2 20.2 11.9 29.5 13 22.2 19 24.3 28.8 16 23.8 7.7 28.8 9.8 19 2.5 13 11.8 11.9\"\r\n");
        out.write("                                                         stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"3\">\r\n");
        out.write("\r\n");
        out.write("                                                </polygon>\r\n");
        out.write("                                                </svg>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <div class=\"stepper__step-text\">\r\n");
        out.write("                                                Finish/rating</div>\r\n");
        out.write("                                            <div class=\"stepper__step-date\">\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                        <div class=\"stepper__line\">\r\n");
        out.write("                                            <div class=\"stepper__line-background\" style=\"background: rgb(224, 224, 224);\">\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <!-- caculator status -->\r\n");
        out.write("                                            <div class=\"stepper__line-foreground\"\r\n");
        out.write("                                                 style=\"width: calc((100% - 140px) * ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status/4}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("); background: rgb(45, 194, 88);\">\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status>0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("stepper__step-icon--finish");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status>1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("stepper__step-icon--finish");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status>2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("stepper__step-icon--finish");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status>3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("stepper__step-icon--finish");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status>4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("stepper__step-icon--finish");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status==1||order.status==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write("                            <!--return-->\r\n");
        out.write("                            <div class=\"_1umrlw\">\r\n");
        out.write("                                <div class=\"_2c2kYQ\">Warning!:If you do not complete order confirmation, the order will be deleted after 1 day by the administrator </div>\r\n");
        out.write("                                <div class=\"_2iv7q8\">\r\n");
        out.write("                                    <button class=\"stardust-button stardust-button--primary _2x5SvJ\"\r\n");
        out.write("                                            onclick=\"window.location.href = 'productslist'\">Finish later</button>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"_1umrlw\">\r\n");
        out.write("                                <div class=\"_2c2kYQ\">\r\n");
        out.write("                                    Note:You can cancel your order until the active status is confirmed\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <form action=\"cancel_order\" method=\"post\">\r\n");
        out.write("                                <div class=\"_2iv7q8\">\r\n");
        out.write("                                    <button  type=\"submit\" class=\"stardust-button stardust-button--secondary _2x5SvJ\">\r\n");
        out.write("                                        Cancel order\r\n");
        out.write("                                    </button>\r\n");
        out.write("                                <input hidden value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.order_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" name=\"order_id\"/>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                </form>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status==3||order.status==4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write("                            <!--return-->\r\n");
        out.write("                              <div class=\"_1umrlw\">\r\n");
        out.write("                                <div class=\"_2c2kYQ\"> </div>\r\n");
        out.write("                                <div class=\"_2iv7q8\">\r\n");
        out.write("                                    <button class=\"stardust-button stardust-button--primary _2x5SvJ\"\r\n");
        out.write("                                            onclick=\"window.location.href = 'productslist'\">Back to product list</button>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"_1umrlw\">\r\n");
        out.write("                                <div class=\"_2c2kYQ\">Waiting to next processing </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status==5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write("                            <!--return-->\r\n");
        out.write("                            <div class=\"_1umrlw\">\r\n");
        out.write("                                <div class=\"_2c2kYQ\">Order completion </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_if_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent(null);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status==0||order.status>2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n");
        out.write("                            <form id=\"checkout\" class=\"row g-3\" action=\"cartcompletion\" method=\"post\">\r\n");
        out.write("                                <input hidden value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.order_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" name=\"orderID\">\r\n");
        out.write("                                <div class=\"col-6\">\r\n");
        out.write("                                    <div class=\"input-group mb-3\">\r\n");
        out.write("                                        <span class=\"input-group-text\" id=\"basic-addon1\">Full name*</span>\r\n");
        out.write("                                        <input disabled type=\"text\" class=\"form-control\" name=\"name\"\r\n");
        out.write("                                               value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.ship_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" aria-describedby=\"basic-addon1\" required>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"col-6\">\r\n");
        out.write("                                    <div class=\"input-group mb-3\">\r\n");
        out.write("                                        <span class=\"input-group-text\" id=\"basic-addon1\">Phone</span>\r\n");
        out.write("                                        <input disabled type=\"tel\" class=\"form-control\" placeholder=\"+84\" name=\"phone\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.ship_mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\r\n");
        out.write("                                               aria-label=\"tel\" aria-describedby=\"basic-addon1\" required>\r\n");
        out.write("\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"col-8\">\r\n");
        out.write("                                    <div class=\"input-group mb-3\">\r\n");
        out.write("                                        <span class=\"input-group-text\" id=\"basic-addon1\">Email</span>\r\n");
        out.write("                                        <input disabled type=\"mail\" class=\"form-control\" placeholder=\"email\" name=\"email\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.ship_email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\r\n");
        out.write("                                               aria-label=\"email\" aria-describedby=\"basic-addon1\" required>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"col-4\">\r\n");
        out.write("                                    <div class=\"input-group mb-3\">\r\n");
        out.write("                                        <span class=\"input-group-text\" id=\"basic-addon1\">City</span>\r\n");
        out.write("                                        <input disabled type=\"text\" class=\"form-control\" placeholder=\"city\" name=\"city\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.ship_city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\r\n");
        out.write("                                               aria-label=\"city\" aria-describedby=\"basic-addon1\" required>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"col-4\">\r\n");
        out.write("                                    <div class=\"input-group mb-3\">\r\n");
        out.write("                                        <span class=\"input-group-text\" id=\"basic-addon1\">Gender</span>\r\n");
        out.write("                                        <select name=\"gender\" id=\"inputState\" class=\"form-select\" required>\r\n");
        out.write("                                            <option disabled selected disabled hidden>Choose...</option>\r\n");
        out.write("                                            <option  disabled value=\"1\"");
        if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write(" >Male</option>\r\n");
        out.write("                                            <option  disabled value=\"0\"");
        if (_jspx_meth_c_if_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write(">Female</option>\r\n");
        out.write("                                            </select>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                    <div class=\"col-8\">\r\n");
        out.write("                                        <div class=\"input-group mb-3\">\r\n");
        out.write("                                            <span class=\"input-group-text\" id=\"basic-addon1\">Address</span>\r\n");
        out.write("                                            <input disabled type=\"text\" class=\"form-control\" placeholder=\"Address\"\r\n");
        out.write("                                                   name=\"address\"\r\n");
        out.write("                                                   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.ship_address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\r\n");
        out.write("                                            aria-label=\"address\" aria-describedby=\"basic-addon1\" required>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"mb-3\">\r\n");
        out.write("                                    <label for=\"note\" class=\"form-label\">Note</label>\r\n");
        out.write("                                    <textarea disabled class=\"form-control\" id=\"note\" form=\"checkout\" name=\"note\" rows=\"3\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.note}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                    </textarea>\r\n");
        out.write("                                </div>        \r\n");
        out.write("                                <!--                            <div>\r\n");
        out.write("                                                                Already have an account? <a href=\"login\">Login</a><br />\r\n");
        out.write("                                                            </div>-->\r\n");
        out.write("\r\n");
        out.write("                        </div>\r\n");
        out.write("\r\n");
        out.write("                        <div class=\"p-3 bg-white rounded shadow-sm cart-contain\">\r\n");
        out.write("                            <table class=\"table table-hover\">\r\n");
        out.write("                                <thead>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <th >ID</th>\r\n");
        out.write("                                        <th colspan=\"2\">Product</th>\r\n");
        out.write("                                        <th class=\"text-center\">Price</th>\r\n");
        out.write("                                        <th class=\"text-center\">Quantity</th>\r\n");
        out.write("                                        <th class=\"text-end\">Sub total</th>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                </thead>\r\n");
        out.write("                                <tbody class=\"table-group-divider\">\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </tbody>\r\n");
        out.write("                            </table>\r\n");
        out.write("                            <ul class=\"list-unstyled mb-4\">\r\n");
        out.write("                                <li class=\"d-flex justify-content-between py-3 border-bottom\">\r\n");
        out.write("                                    <div class=\"payment-container col-12\" style=\" pointer-events: none;\">\r\n");
        out.write("                                        <div class=\"col-12\">\r\n");
        out.write("                                            Choose Payment Method\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                        <div class=\"col-12 bg-white rounded shadow-sm main-banking\">\r\n");
        out.write("                                            <div class=\"radio-toolbar\">\r\n");
        out.write("                                                <input type=\"radio\"\r\n");
        out.write("                                                       ");
        if (_jspx_meth_c_if_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                       \r\n");
        out.write("                                                       id=\"radioApple\" name=\"payment\" value=\"1\"  onclick=\"checkPayment(this.value)\">\r\n");
        out.write("                                                <label for=\"radioApple\">Ship COD</label>\r\n");
        out.write("\r\n");
        out.write("                                                <input type=\"radio\"\r\n");
        out.write("                                                       ");
        if (_jspx_meth_c_if_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                       id=\"radioBanana\" name=\"payment\"  value=\"2\" onclick=\"checkPayment(this.value)\">\r\n");
        out.write("                                                <label for=\"radioBanana\">Banking Transfer</label>\r\n");
        out.write("\r\n");
        out.write("                                                <input type=\"radio\" \r\n");
        out.write("                                                         ");
        if (_jspx_meth_c_if_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                       id=\"radioOrange\" name=\"payment\" value=\"3\" onclick=\"checkPayment(this.value)\">\r\n");
        out.write("                                                <label for=\"radioOrange\">VNPAY QR</label> \r\n");
        out.write("                                            </div>\r\n");
        out.write("\r\n");
        out.write("                                           <div class=\"payment-content ship_cod\">\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_import_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                           <div class=\"payment-content banking_system\">\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_import_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                           <div class=\"payment-content vnpay\">\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_import_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <p>&nbsp;</p>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"d-flex justify-content-between py-3 border-bottom\">Sub Total\r\n");
        out.write("                                    <span class=\"price-item\">");
        if (_jspx_meth_fmt_formatNumber_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("</span>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"d-flex justify-content-between py-3 border-bottom price-item\">Shopping Fee\r\n");
        out.write("                                    <input type=\"hidden\" name=\"freight\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.freight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\r\n");
        out.write("                                   <span class=\"price-item\">");
        if (_jspx_meth_fmt_formatNumber_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("</span>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"d-flex justify-content-between py-3 border-bottom\">Total Cost\r\n");
        out.write("                                    <h5 class=\"font-weight-bold price-item\">");
        if (_jspx_meth_fmt_formatNumber_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("</h5>\r\n");
        out.write("                                    <input type=\"hidden\" name=\"total_price\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.totalMoney+o.freight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\r\n");
        out.write("                                </li>\r\n");
        out.write("                            </ul>\r\n");
        out.write("                                \r\n");
        out.write("                            <div class=\"col-12\">\r\n");
        out.write("                                <div class=\"d-grid gap-2 d-md-flex justify-content-md-end\">\r\n");
        out.write("                                    <!--<a class=\"btn\" href=\"showcart\">Cancel order</a>-->\r\n");
        out.write("                                    <button disabled class=\"btn btn-outline-primary\" type=\"submit\">Finish</button>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                     </form>\r\n");
        out.write("                   ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.ship_gender}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_if_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!order.ship_gender}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr>\r\n");
          out.write("                                            <td class=\"align-middle\">\r\n");
          out.write("                                                <p class=\"mb-0 product-id-cart-contact\">\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                </p>\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td style=\"width: 10%\">\r\n");
          out.write("                                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"10%\" class=\"img-fluid rounded shadow-sm\">\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td class=\"align-middle\">\r\n");
          out.write("                                                <a href=\"product?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"text-decoration-none text-muted\"><p class=\"mb-0 product-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.briefInfor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p></a>\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td class=\"align-middle\">\r\n");
          out.write("                                                <span class=\"d-flex justify-content-center price-item\">\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                    </span  >\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                                <td class=\"align-middle\">\r\n");
          out.write("                                                    <p class=\"text-center mb-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td class=\"align-middle\">\r\n");
          out.write("                                                <p class=\"text-end mb-0 price-item\">\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                    </p>\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                            </tr>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_13, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_13);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_0.setType("currency");
    _jspx_th_fmt_formatNumber_0.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_c_if_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_formatNumber_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_14, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_14);
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.original_price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_1.setType("currency");
    _jspx_th_fmt_formatNumber_1.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_c_if_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_formatNumber_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_15, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
    _jspx_th_fmt_formatNumber_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price*i.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_2.setType("currency");
    _jspx_th_fmt_formatNumber_2.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
    if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_2);
    return false;
  }

  private boolean _jspx_meth_c_if_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_formatNumber_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_16, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_16);
    _jspx_th_fmt_formatNumber_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.original_price*i.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_3.setType("currency");
    _jspx_th_fmt_formatNumber_3.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_3 = _jspx_th_fmt_formatNumber_3.doStartTag();
    if (_jspx_th_fmt_formatNumber_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_3);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_3);
    return false;
  }

  private boolean _jspx_meth_c_if_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_17.setPageContext(_jspx_page_context);
    _jspx_th_c_if_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_if_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.payment=='Ship COD'||order.payment==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_17 = _jspx_th_c_if_17.doStartTag();
    if (_jspx_eval_c_if_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_if_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
    return false;
  }

  private boolean _jspx_meth_c_if_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_18.setPageContext(_jspx_page_context);
    _jspx_th_c_if_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_if_18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.payment=='BANK TRANSFER'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_18 = _jspx_th_c_if_18.doStartTag();
    if (_jspx_eval_c_if_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_if_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
    return false;
  }

  private boolean _jspx_meth_c_if_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_19.setPageContext(_jspx_page_context);
    _jspx_th_c_if_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_if_19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.payment=='VN PAY'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_19 = _jspx_th_c_if_19.doStartTag();
    if (_jspx_eval_c_if_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_if_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
    return false;
  }

  private boolean _jspx_meth_c_import_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_2 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_2.setPageContext(_jspx_page_context);
    _jspx_th_c_import_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_import_2.setUrl("payment_ShipCOD.jsp");
    int[] _jspx_push_body_count_c_import_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_2 = _jspx_th_c_import_2.doStartTag();
      if (_jspx_th_c_import_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_2.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_import_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_3 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_3.setPageContext(_jspx_page_context);
    _jspx_th_c_import_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_import_3.setUrl("payment_BankingSystem.jsp");
    int[] _jspx_push_body_count_c_import_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_3 = _jspx_th_c_import_3.doStartTag();
      if (_jspx_th_c_import_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_3.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_import_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_4 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_4.setPageContext(_jspx_page_context);
    _jspx_th_c_import_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_import_4.setUrl("payment_VNPAY.jsp");
    int[] _jspx_push_body_count_c_import_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_4 = _jspx_th_c_import_4.doStartTag();
      if (_jspx_th_c_import_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_4.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_4);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_fmt_formatNumber_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.totalMoney}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_4.setType("currency");
    _jspx_th_fmt_formatNumber_4.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_4 = _jspx_th_fmt_formatNumber_4.doStartTag();
    if (_jspx_th_fmt_formatNumber_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_4);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_4);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_5 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_fmt_formatNumber_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.freight}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_5.setType("currency");
    _jspx_th_fmt_formatNumber_5.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_5 = _jspx_th_fmt_formatNumber_5.doStartTag();
    if (_jspx_th_fmt_formatNumber_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_5);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_5);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_6 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_fmt_formatNumber_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.totalMoney}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_6.setType("currency");
    _jspx_th_fmt_formatNumber_6.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_6 = _jspx_th_fmt_formatNumber_6.doStartTag();
    if (_jspx_th_fmt_formatNumber_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_6);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_6);
    return false;
  }

  private boolean _jspx_meth_c_if_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_20.setPageContext(_jspx_page_context);
    _jspx_th_c_if_20.setParent(null);
    _jspx_th_c_if_20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status>0&&order.status<=2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_20 = _jspx_th_c_if_20.doStartTag();
    if (_jspx_eval_c_if_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n");
        out.write("                            <form id=\"checkout\" class=\"row g-3\" action=\"cartcompletion\" method=\"post\">\r\n");
        out.write("                                <input hidden value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.order_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" name=\"orderID\">\r\n");
        out.write("                                <div class=\"col-6\">\r\n");
        out.write("                                    <div class=\"input-group mb-3\">\r\n");
        out.write("                                        <span class=\"input-group-text\" id=\"basic-addon1\">Full name*</span>\r\n");
        out.write("                                        <input type=\"text\" class=\"form-control\" name=\"name\"\r\n");
        out.write("                                               value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.ship_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" aria-describedby=\"basic-addon1\" required>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"col-6\">\r\n");
        out.write("                                    <div class=\"input-group mb-3\">\r\n");
        out.write("                                        <span class=\"input-group-text\" id=\"basic-addon1\">Phone</span>\r\n");
        out.write("                                        <input type=\"tel\" class=\"form-control\" placeholder=\"+84\" name=\"phone\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.ship_mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\r\n");
        out.write("                                               aria-label=\"tel\" aria-describedby=\"basic-addon1\" required>\r\n");
        out.write("\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"col-8\">\r\n");
        out.write("                                    <div class=\"input-group mb-3\">\r\n");
        out.write("                                        <span class=\"input-group-text\" id=\"basic-addon1\">Email</span>\r\n");
        out.write("                                        <input type=\"mail\" class=\"form-control\" placeholder=\"email\" name=\"email\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.ship_email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\r\n");
        out.write("                                               aria-label=\"email\" aria-describedby=\"basic-addon1\" required>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"col-4\">\r\n");
        out.write("                                    <div class=\"input-group mb-3\">\r\n");
        out.write("                                        <span class=\"input-group-text\" id=\"basic-addon1\">City</span>\r\n");
        out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"city\" name=\"city\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.ship_city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\r\n");
        out.write("                                               aria-label=\"city\" aria-describedby=\"basic-addon1\" required>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"col-4\">\r\n");
        out.write("                                    <div class=\"input-group mb-3\">\r\n");
        out.write("                                        <span class=\"input-group-text\" id=\"basic-addon1\">Gender</span>\r\n");
        out.write("                                        <select name=\"gender\" id=\"inputState\" class=\"form-select\" required>\r\n");
        out.write("                                            <option selected disabled hidden>Choose...</option>\r\n");
        out.write("                                            <option value=\"1\"");
        if (_jspx_meth_c_if_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write(" >Male</option>\r\n");
        out.write("                                            <option  value=\"0\"");
        if (_jspx_meth_c_if_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write(">Female</option>\r\n");
        out.write("                                            </select>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                    <div class=\"col-8\">\r\n");
        out.write("                                        <div class=\"input-group mb-3\">\r\n");
        out.write("                                            <span class=\"input-group-text\" id=\"basic-addon1\">Address</span>\r\n");
        out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Address\"\r\n");
        out.write("                                                   name=\"address\"\r\n");
        out.write("                                                   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.ship_address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\r\n");
        out.write("                                            aria-label=\"address\" aria-describedby=\"basic-addon1\" required>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"mb-3\">\r\n");
        out.write("                                    <label for=\"note\" class=\"form-label\">Note</label>\r\n");
        out.write("                                    <textarea class=\"form-control\" id=\"note\" form=\"checkout\" name=\"note\" rows=\"3\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.note}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                    </textarea>\r\n");
        out.write("                                </div>        \r\n");
        out.write("                                <!--                            <div>\r\n");
        out.write("                                                                Already have an account? <a href=\"login\">Login</a><br />\r\n");
        out.write("                                                            </div>-->\r\n");
        out.write("\r\n");
        out.write("                        </div>\r\n");
        out.write("\r\n");
        out.write("                        <div class=\"p-3 bg-white rounded shadow-sm cart-contain\">\r\n");
        out.write("                            <table class=\"table table-hover\">\r\n");
        out.write("                                <thead>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <th >ID</th>\r\n");
        out.write("                                        <th colspan=\"2\">Product</th>\r\n");
        out.write("                                        <th class=\"text-center\">Price</th>\r\n");
        out.write("                                        <th class=\"text-center\">Quantity</th>\r\n");
        out.write("                                        <th class=\"text-end\">Sub total</th>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                </thead>\r\n");
        out.write("                                <tbody class=\"table-group-divider\">\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </tbody>\r\n");
        out.write("                            </table>\r\n");
        out.write("                            <ul class=\"list-unstyled mb-4\">\r\n");
        out.write("                                <li class=\"d-flex justify-content-between py-3 border-bottom\">\r\n");
        out.write("                                    <div class=\"payment-container col-12\">\r\n");
        out.write("                                        <div class=\"col-12\">\r\n");
        out.write("                                            Choose Payment Method\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                        <div class=\"col-12 bg-white rounded shadow-sm main-banking\">\r\n");
        out.write("                                            <div class=\"radio-toolbar\">\r\n");
        out.write("                                                <input type=\"radio\"\r\n");
        out.write("                                                       ");
        if (_jspx_meth_c_if_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                       \r\n");
        out.write("                                                       id=\"radioApple\" name=\"payment\" value=\"1\"  onclick=\"checkPayment(this.value)\">\r\n");
        out.write("                                                <label for=\"radioApple\">Ship COD</label>\r\n");
        out.write("\r\n");
        out.write("                                                <input type=\"radio\"\r\n");
        out.write("                                                       ");
        if (_jspx_meth_c_if_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                       id=\"radioBanana\" name=\"payment\"  value=\"2\" onclick=\"checkPayment(this.value)\">\r\n");
        out.write("                                                <label for=\"radioBanana\">Banking account</label>\r\n");
        out.write("\r\n");
        out.write("                                                <input type=\"radio\" \r\n");
        out.write("                                                         ");
        if (_jspx_meth_c_if_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                       id=\"radioOrange\" name=\"payment\" value=\"3\" onclick=\"checkPayment(this.value)\">\r\n");
        out.write("                                                <label for=\"radioOrange\">VNPAY QR</label> \r\n");
        out.write("                                            </div>\r\n");
        out.write("\r\n");
        out.write("                                           <div class=\"payment-content ship_cod\">\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_import_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                           <div class=\"payment-content banking_system\">\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_import_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                           <div class=\"payment-content vnpay\">\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_import_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <p>&nbsp;</p>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"d-flex justify-content-between py-3 border-bottom\">Sub Total\r\n");
        out.write("                                    <span class=\"price-item\">");
        if (_jspx_meth_fmt_formatNumber_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("</span>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"d-flex justify-content-between py-3 border-bottom\">Shopping Fee\r\n");
        out.write("                                    <input type=\"hidden\" name=\"freight\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.freight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\r\n");
        out.write("                                    <span class=\"price-item\">");
        if (_jspx_meth_fmt_formatNumber_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("</span>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"d-flex justify-content-between py-3 border-bottom\">Total Cost\r\n");
        out.write("                                    <h5 class=\"font-weight-bold price-item\">");
        if (_jspx_meth_fmt_formatNumber_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("</h5>\r\n");
        out.write("                                    <input type=\"hidden\" name=\"total_price\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.totalMoney+o.freight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\r\n");
        out.write("                                </li>\r\n");
        out.write("                            </ul>\r\n");
        out.write("                                \r\n");
        out.write("                            <div class=\"col-12\">\r\n");
        out.write("                                <div class=\"d-grid gap-2 d-md-flex justify-content-md-end\">\r\n");
        out.write("                                    <!--<a class=\"btn\" href=\"showcart\">Cancel order</a>-->\r\n");
        out.write("                                    <button class=\"btn btn-outline-primary\" type=\"submit\">Finish</button>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                     </form>\r\n");
        out.write("                   ");
        int evalDoAfterBody = _jspx_th_c_if_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
    return false;
  }

  private boolean _jspx_meth_c_if_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_21.setPageContext(_jspx_page_context);
    _jspx_th_c_if_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_if_21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.ship_gender}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_21 = _jspx_th_c_if_21.doStartTag();
    if (_jspx_eval_c_if_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
    return false;
  }

  private boolean _jspx_meth_c_if_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_22 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_22.setPageContext(_jspx_page_context);
    _jspx_th_c_if_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_if_22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!order.ship_gender}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_22 = _jspx_th_c_if_22.doStartTag();
    if (_jspx_eval_c_if_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr>\r\n");
          out.write("                                            <td class=\"align-middle\">\r\n");
          out.write("                                                <p class=\"mb-0 product-id-cart-contact\">\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                </p>\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td style=\"width: 10%\">\r\n");
          out.write("                                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"10%\" class=\"img-fluid rounded shadow-sm\">\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td class=\"align-middle\">\r\n");
          out.write("                                                <a href=\"product?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"text-decoration-none text-muted\"><p class=\"mb-0 product-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.briefInfor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p></a>\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td class=\"align-middle\">\r\n");
          out.write("                                                <span class=\"d-flex justify-content-center \">\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                                    </span  >\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                                <td class=\"align-middle\">\r\n");
          out.write("                                                    <p class=\"text-center mb-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td class=\"align-middle\">\r\n");
          out.write("                                                <p class=\"text-end mb-0 price-item\">\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                                    </p>\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                            </tr>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_23 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_23.setPageContext(_jspx_page_context);
    _jspx_th_c_if_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_23 = _jspx_th_c_if_23.doStartTag();
    if (_jspx_eval_c_if_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_formatNumber_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_23, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_23);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_23);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_23, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_7 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_23);
    _jspx_th_fmt_formatNumber_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_7.setType("currency");
    _jspx_th_fmt_formatNumber_7.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_7 = _jspx_th_fmt_formatNumber_7.doStartTag();
    if (_jspx_th_fmt_formatNumber_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_7);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_7);
    return false;
  }

  private boolean _jspx_meth_c_if_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_24 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_24.setPageContext(_jspx_page_context);
    _jspx_th_c_if_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_24 = _jspx_th_c_if_24.doStartTag();
    if (_jspx_eval_c_if_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_formatNumber_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_24, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_24);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_24);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_24, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_8 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_24);
    _jspx_th_fmt_formatNumber_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.original_price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_8.setType("currency");
    _jspx_th_fmt_formatNumber_8.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_8 = _jspx_th_fmt_formatNumber_8.doStartTag();
    if (_jspx_th_fmt_formatNumber_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_8);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_8);
    return false;
  }

  private boolean _jspx_meth_c_if_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_25 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_25.setPageContext(_jspx_page_context);
    _jspx_th_c_if_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_25 = _jspx_th_c_if_25.doStartTag();
    if (_jspx_eval_c_if_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_formatNumber_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_25, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_25);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_25);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_9 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_25);
    _jspx_th_fmt_formatNumber_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price*i.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_9.setType("currency");
    _jspx_th_fmt_formatNumber_9.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_9 = _jspx_th_fmt_formatNumber_9.doStartTag();
    if (_jspx_th_fmt_formatNumber_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_9);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_9);
    return false;
  }

  private boolean _jspx_meth_c_if_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_26 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_26.setPageContext(_jspx_page_context);
    _jspx_th_c_if_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_26 = _jspx_th_c_if_26.doStartTag();
    if (_jspx_eval_c_if_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_formatNumber_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_26, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_26);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_26);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_26, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_10 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_26);
    _jspx_th_fmt_formatNumber_10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.original_price*i.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_10.setType("currency");
    _jspx_th_fmt_formatNumber_10.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_10 = _jspx_th_fmt_formatNumber_10.doStartTag();
    if (_jspx_th_fmt_formatNumber_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_10);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_10);
    return false;
  }

  private boolean _jspx_meth_c_if_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_27 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_27.setPageContext(_jspx_page_context);
    _jspx_th_c_if_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_if_27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.payment=='Ship COD'||order.payment==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_27 = _jspx_th_c_if_27.doStartTag();
    if (_jspx_eval_c_if_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_if_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_27);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_27);
    return false;
  }

  private boolean _jspx_meth_c_if_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_28 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_28.setPageContext(_jspx_page_context);
    _jspx_th_c_if_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_if_28.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.payment=='BANK TRANSFER'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_28 = _jspx_th_c_if_28.doStartTag();
    if (_jspx_eval_c_if_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_if_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_28);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_28);
    return false;
  }

  private boolean _jspx_meth_c_if_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_29 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_29.setPageContext(_jspx_page_context);
    _jspx_th_c_if_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_if_29.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.payment=='VN PAY'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_29 = _jspx_th_c_if_29.doStartTag();
    if (_jspx_eval_c_if_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_if_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_29);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_29);
    return false;
  }

  private boolean _jspx_meth_c_import_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_5 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_5.setPageContext(_jspx_page_context);
    _jspx_th_c_import_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_import_5.setUrl("payment_ShipCOD.jsp");
    int[] _jspx_push_body_count_c_import_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_5 = _jspx_th_c_import_5.doStartTag();
      if (_jspx_th_c_import_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_5.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_import_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_6 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_6.setPageContext(_jspx_page_context);
    _jspx_th_c_import_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_import_6.setUrl("payment_BankingSystem.jsp");
    int[] _jspx_push_body_count_c_import_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_6 = _jspx_th_c_import_6.doStartTag();
      if (_jspx_th_c_import_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_6.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_import_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_7 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_7.setPageContext(_jspx_page_context);
    _jspx_th_c_import_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_import_7.setUrl("payment_VNPAY.jsp");
    int[] _jspx_push_body_count_c_import_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_7 = _jspx_th_c_import_7.doStartTag();
      if (_jspx_th_c_import_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_7.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_7);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_11 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_fmt_formatNumber_11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.totalMoney}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_11.setType("currency");
    _jspx_th_fmt_formatNumber_11.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_11 = _jspx_th_fmt_formatNumber_11.doStartTag();
    if (_jspx_th_fmt_formatNumber_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_11);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_11);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_12 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_fmt_formatNumber_12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.freight}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_12.setType("currency");
    _jspx_th_fmt_formatNumber_12.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_12 = _jspx_th_fmt_formatNumber_12.doStartTag();
    if (_jspx_th_fmt_formatNumber_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_12);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_12);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_13 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_fmt_formatNumber_13.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.totalMoney+o.freight}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_13.setType("currency");
    _jspx_th_fmt_formatNumber_13.setCurrencySymbol("đ");
    int _jspx_eval_fmt_formatNumber_13 = _jspx_th_fmt_formatNumber_13.doStartTag();
    if (_jspx_th_fmt_formatNumber_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_13);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_13);
    return false;
  }
}
