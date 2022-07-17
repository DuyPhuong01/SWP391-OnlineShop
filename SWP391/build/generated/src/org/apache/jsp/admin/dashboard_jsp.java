package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/salenavbar.jsp");
    _jspx_dependants.add("/admin/sidebar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Online shopping system</title>\r\n");
      out.write("\r\n");
      out.write("        <!--bootstrap-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"css/stylesaleheadersider.css\" rel=\"stylesheet\"/>\r\n");
      out.write("        <link href=\"css/admin.css\" rel=\"stylesheet\"/>\r\n");
      out.write("        <!--font-awesome-->\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/3c84cb624f.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header class=\"header\">\r\n");
      out.write("    <a class=\"logo\">\r\n");
      out.write("        Sale\r\n");
      out.write("    </a>\r\n");
      out.write("    <nav class=\"navbar\">\r\n");
      out.write("        <a class=\"navbar-btn sidebar-toggle\">\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"navbar-right\">\r\n");
      out.write("            <ul class=\"nav navbar-nav flex-row\">\r\n");
      out.write("                <li style=\"display: flex;\r\n");
      out.write("                    align-items: center;\r\n");
      out.write("                    margin-right: 10px;\r\n");
      out.write("                    margin-left: 10px;\"><i class=\"fa-solid fa-envelope\" style=\"display: flex; align-items: center;\"></i></li>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("        <div class=\"wrapper-login\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<aside class=\"left-side\">\r\n");
      out.write("    <section class=\"sidebar\">\r\n");
      out.write("        <div class=\"user-panel flex\">\r\n");
      out.write("            <div class=\"pull-left image\">\r\n");
      out.write("                <img src=\"../images/account-images/anh-dai-dien-nguoi-giau-mat-voi-background-580x580.jpg\" style=\"width: 45px; height: 45px;\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"pull-left info\">\r\n");
      out.write("                Hello, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("<!--        <form class=\"sidebar-form\">\r\n");
      out.write("            <div class=\"flex sidebar-form-container\">\r\n");
      out.write("                <input type=\"text\" placeholder=\"search\"/>\r\n");
      out.write("                <button><i class=\"fas fa-search\"></i></button>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </form>-->\r\n");
      out.write("        <ul class=\"sidebar-menu\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-dashboard\"></i>\r\n");
      out.write("                    <span>Dashboard</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fas fa-shopping-cart\"></i>\r\n");
      out.write("                    <span>Orders List</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"/swp/logout\">\r\n");
      out.write("                    <i class=\"fas fa-sign-out\"></i>\r\n");
      out.write("                    <span>Sign out</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </section>\r\n");
      out.write("</aside>\r\n");
      out.write("\r\n");
      out.write("            <aside class=\"right-side\">\r\n");
      out.write("                <section class=\"content container\">\r\n");
      out.write("                    <div class=\"row\" style=\"margin-bottom: 20px;\">\r\n");
      out.write("                        <div class=\"col-md-6 row order-statistic-wrapper\">\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <div class=\"chart-wrapper\">                                \r\n");
      out.write("                                    <div class=\"select-time-wrapper\">\r\n");
      out.write("                                        <label for=\"order-time\">Time</label>\r\n");
      out.write("                                        <select onchange=\"newOrderStatistic(this);\" id=\"order-time\">\r\n");
      out.write("                                            <option value=\"1\">Last 7 days</option>\r\n");
      out.write("                                            <option value=\"2\">Last 1 month</option>\r\n");
      out.write("                                            <option value=\"3\">Last 3 months</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <canvas id=\"myChart\" width=\"400\" height=\"400\"></canvas>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <table class=\"table table-hover table-bordered\" id=\"order-table\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>Submitted order</th>\r\n");
      out.write("                                            <th>Success order</th>\r\n");
      out.write("                                            <th>Canceled order</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td id=\"submitted-order\"></td>\r\n");
      out.write("                                            <td id=\"success-order\"></td>\r\n");
      out.write("                                            <td id=\"cancel-order\"></td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\" id=\"revenue-wrapper\">\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <div class=\"flex\" style=\"    height: 40px;\r\n");
      out.write("                                     line-height: 40px;\">\r\n");
      out.write("                                    <span>Revenue</span>\r\n");
      out.write("                                    <div class=\"flex-1\"></div>\r\n");
      out.write("                                    <label>Time</label>\r\n");
      out.write("                                    <select onchange=\"newRevenueTime(this);\">\r\n");
      out.write("                                        <option value=\"1\">Last 7 days</option>\r\n");
      out.write("                                        <option value=\"2\">Last 1 month</option>\r\n");
      out.write("                                        <option value=\"3\">Last 3 months</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <table class=\"table table-hover table-bordered\" id=\"\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>Product category</th>\r\n");
      out.write("                                            <th>Revenue</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody id=\"revenue-body\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-4 feedback-wrapper\">\r\n");
      out.write("                            <div class=\"flex feedback-wrapper-header\">\r\n");
      out.write("                                <h3>Feedbacks</h3>\r\n");
      out.write("                                <div class=\"flex-1\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <span>Time</span>\r\n");
      out.write("                                    <select name=\"feedback\" onchange=\"newFeedbackTime(this);\">\r\n");
      out.write("                                        <option value=\"1\">Last 7 days</option>\r\n");
      out.write("                                        <option value=\"2\">Last 1 month</option>\r\n");
      out.write("                                        <option value=\"3\">Last 3 months</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <table>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-8 customer-wrapper\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"flex\">\r\n");
      out.write("                                    <h3>Customer</h3>\r\n");
      out.write("                                    <div class=\"flex-1\"></div>\r\n");
      out.write("                                    <div class=\"select-time-wrapper\">\r\n");
      out.write("                                        <label for=\"order-time\">Time</label>\r\n");
      out.write("                                        <select onchange=\"newCustomerTime(this);\" id=\"order-time\">\r\n");
      out.write("                                            <option value=\"1\">Last 7 days</option>\r\n");
      out.write("                                            <option value=\"2\">Last 1 month</option>\r\n");
      out.write("                                            <option value=\"3\">Last 3 months</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <div class=\"chart2-wrapper\">\r\n");
      out.write("                                        <canvas id=\"myChart2\" width=\"400\" height=\"400\"></canvas>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <div class=\"table-wrapper\">\r\n");
      out.write("\r\n");
      out.write("                                        <table class=\"table table-striped table-hover table-bordered\">\r\n");
      out.write("                                            <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th scope=\"col\">Date</th>\r\n");
      out.write("                                                    <th scope=\"col\">Newly Registered Customer</th>\r\n");
      out.write("                                                    <th scope=\"col\">Newly Bought Customer</th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("                                            <tbody id=\"customer-table-body\">\r\n");
      out.write("\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row order-count\">\r\n");
      out.write("                        <div class=\"sort-bar\">\r\n");
      out.write("                            <h3>Trends of order count</h3>\r\n");
      out.write("                            <div class=\"flex-1\"></div>\r\n");
      out.write("                            <div class=\"select-time-wrapper\">\r\n");
      out.write("                                <label for=\"order-time\">Time</label>\r\n");
      out.write("                                <select onchange=\"newOrderTime(this);\" id=\"order-time\">\r\n");
      out.write("                                    <option value=\"1\">Last 7 days</option>\r\n");
      out.write("                                    <option value=\"2\">Last 1 month</option>\r\n");
      out.write("                                    <option value=\"3\">Last 3 months</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\" style=\"    width: 90%;\r\n");
      out.write("                             margin-left: auto;\r\n");
      out.write("                             margin-right: auto;\">\r\n");
      out.write("                            <div class=\"col-md-7\">\r\n");
      out.write("                                <div class=\"chart3-wrapper\">\r\n");
      out.write("                                    <canvas id=\"myChart3\" width=\"400\" height=\"400\"></canvas>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-5\">\r\n");
      out.write("                                <div class=\"table-wrapper\">\r\n");
      out.write("\r\n");
      out.write("                                    <table class=\"table table-striped table-hover table-bordered\">\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th scope=\"col\">Date</th>\r\n");
      out.write("                                                <th scope=\"col\">Success Order</th>\r\n");
      out.write("                                                <th scope=\"col\">All Order</th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody id=\"order-table-body\">\r\n");
      out.write("\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("            </aside>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    <script\r\n");
      out.write("        src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"js/admin.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <li style=\"    margin-right: 10px;\r\n");
        out.write("                        margin-left: 10px;\"><a class=\"dropdown-item\" href=\"/swp/logout\">Logout</a></li>\r\n");
        out.write("                    ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cateList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            <tr>\r\n");
          out.write("                                                <td id=\"submitted-order\" class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.category_id == 0? \"bold\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.category_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td id=\"revenue-statistic\"></td>\r\n");
          out.write("                                            </tr>\r\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cateList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                        <th id=\"submitted-order\" class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.category_id == 0? \"bold\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.category_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                                        <td id=\"revenue-statistic\">\r\n");
          out.write("                                            <div class=\"progress\">\r\n");
          out.write("                                                <div class=\"progress-bar progress-bar-striped progress-bar-animated bg-danger\" role=\"progressbar\" aria-valuenow=\"5\" aria-valuemin=\"0\" aria-valuemax=\"5\" id=\"progress-bar\"></div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
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
}
