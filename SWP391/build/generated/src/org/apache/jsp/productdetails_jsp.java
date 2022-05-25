package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <!DOCTYPE html>\r\n");
      out.write("        <html>\r\n");
      out.write("\r\n");
      out.write("        <head>\r\n");
      out.write("            <meta charset=\"UTF-8\">\r\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("            <title>Product Details</title>\r\n");
      out.write("            <!-- CSS -->\r\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/productdetail.css\">\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("            <div class=\"header\">\r\n");
      out.write("                <!-- navbar -->\r\n");
      out.write("                ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <!-- end navbar -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-3\">\r\n");
      out.write("                        <div class=\"sider\">\r\n");
      out.write("                            <!-- sider -->\r\n");
      out.write("                            ");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <!-- end sider -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-9\">\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <div class=\"row product-details-container\">\r\n");
      out.write("                                <div class=\"col-12 images-product\">\r\n");
      out.write("                                    <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-bs-ride=\"true\">\r\n");
      out.write("                                        <div class=\"carousel-indicators\">\r\n");
      out.write("                                            <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n");
      out.write("                                            <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("                                            <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"carousel-inner\">\r\n");
      out.write("                                            <div class=\"carousel-item active\">\r\n");
      out.write("                                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"carousel-item\">\r\n");
      out.write("                                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"carousel-item\">\r\n");
      out.write("                                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\r\n");
      out.write("                              <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                              <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                                        <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\r\n");
      out.write("                              <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                              <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12\">\r\n");
      out.write("                                    <div class=\"card body-content_product\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <form name=\"f\" action=\"\" method=\"pót\">\r\n");
      out.write("                                                \r\n");
      out.write("                                           \r\n");
      out.write("                                            <h3 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("                                            <div class=\"box box1\">\r\n");
      out.write("                                                <div class=\"box1-category\">\r\n");
      out.write("                                                     <h6 class=\"card-subtitle mb-2 text-muted\">Category: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.category_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6>\r\n");
      out.write("                                               </div>\r\n");
      out.write("                                              \r\n");
      out.write("                                                \r\n");
      out.write("                                            </div>\r\n");
      out.write("                                               <div class=\"box box2\">\r\n");
      out.write("                                                    <div class=\"box2-e1\">\r\n");
      out.write("                                                          <h4 class=\"card-subtitle mb-2\"><span class=\"text-decoration-line-through\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.original_price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                                         </span> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.sale_price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("                                                      </div>\r\n");
      out.write("                                                   \r\n");
      out.write("                                              </div>\r\n");
      out.write("                                                     \r\n");
      out.write("                                              <div class=\"box box3 col-12\">\r\n");
      out.write("                                                  <div class=\"box3-e1 col-3\">\r\n");
      out.write("                                                     <h6 class=\"card-subtitle text-muted\">Số lượng sản phẩm</h6>\r\n");
      out.write("                                                  </div>\r\n");
      out.write("                                                  <div class=\"box3-e2 col-8\">\r\n");
      out.write("                                                      <div class=\"box3-e2-1\">\r\n");
      out.write("                                                          <input type=\"button\" value=\"-\" />\r\n");
      out.write("                                                          <input type=\"number\" name=\"num\" value=\"1\" />\r\n");
      out.write("                                                          <input type=\"button\" value=\"+\" />\r\n");
      out.write("                                                          <h6 style=\"margin-left: 10px; margin-top: 4px;\" class=\"card-subtitle text-muted\">Sản phẩm có sẵn:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.unit_in_stock}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6>\r\n");
      out.write("                                                      </div>\r\n");
      out.write("                                                  </div>\r\n");
      out.write("                                              </div>\r\n");
      out.write("                                                      <div class=\"box box4\">\r\n");
      out.write("                                                          <div class=\"box4-e1\">\r\n");
      out.write("                                                              <button type=\"button\" onclick=\" buy(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")\" class=\"btn btn-outline-primary\">Add to Cart</button>\r\n");
      out.write("                                                          </div>\r\n");
      out.write("                                                      </div>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </body>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"js/form.js\"></script>\r\n");
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
}
