package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write("\n");
      out.write("    \n");
      out.write("        <!doctype html>\n");
      out.write("        <html lang=\"en\">\n");
      out.write("\n");
      out.write("        <head>\n");
      out.write("            <meta charset=\"utf-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("            <title>Online shopping system</title>\n");
      out.write("\n");
      out.write("            <!--bootstrap-->\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("            <link href=\"css/stylehomepage.css\" rel=\"stylesheet\" />\n");
      out.write("            <!--font-awesome-->\n");
      out.write("            <script src=\"https://kit.fontawesome.com/3c84cb624f.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("            <div class=\"header\">\n");
      out.write("                ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"carouselExampleControls\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <img src=\"...\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"...\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"...\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleControls\" data-bs-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"visually-hidden\">Previous</span>\n");
      out.write("            </button>\n");
      out.write("                <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleControls\" data-bs-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"visually-hidden\">Next</span>\n");
      out.write("            </button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container main-content\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <div class=\"left-sidebar\">\n");
      out.write("                            <div class=\"flex flex-column\">\n");
      out.write("                                <h2>Latest post</h2>\n");
      out.write("                                <div class=\"latest-post\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"latest-post\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"latest-post\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"latest-post\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"static-link\">\n");
      out.write("                                    static contact/link\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-9 padding-right\">\n");
      out.write("                        <h2>Hot posts</h2>\n");
      out.write("                        <div class=\"hot-post row\">\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <div class=\"hot-post-container\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <img src=\"images/270105127_358685858926273_6618429533065317218_n.png\" style=\"width: 100%; height: 100%;\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <a href=\"product?product_id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.firstProduct.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.firstProduct.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.firstProduct.original_price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <div class=\"hot-post-container\">\n");
      out.write("                                    post#2\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <div class=\"hot-post-container\">\n");
      out.write("                                    post#3\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <div class=\"hot-post-container\">\n");
      out.write("                                    post#4\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"feature-item row\">\n");
      out.write("                            <h2><a href=\"productslist.jsp\">Feature items</a></h2>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"feature-item row\">\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"feature-item row\">\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"feature-item row\">\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item col-md-3\">\n");
      out.write("                                <div class=\"item-container\">\n");
      out.write("                                    item #1\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                Footer\n");
      out.write("            </div>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
      out.write("        </body>\n");
      out.write("\n");
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
}
