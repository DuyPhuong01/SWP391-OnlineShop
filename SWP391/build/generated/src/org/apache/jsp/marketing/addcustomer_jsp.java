package org.apache.jsp.marketing;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Post_List</title>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("        <!--CSS-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/style.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/customerlist.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/addcustomer.css\"/>\r\n");
      out.write("          <!--font-awesome-->\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/3c84cb624f.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"d-flex\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <div class=\"container-lg\">\r\n");
      out.write("            <!--content--> \r\n");
      out.write("         <div class=\" form-container col-11 p-3 bg-white rounded my-5\">\r\n");
      out.write("                <div class=\"form-header\">\r\n");
      out.write("                    <h1>Customer Details:</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("             <form class=\"row\" id=\"add-customer\" \r\n");
      out.write("                   action=\"/swp/marketing/addcustomer\"\r\n");
      out.write("                   method=\"post\"\r\n");
      out.write("                   enctype=\"multipart/form-data\"\r\n");
      out.write("                   >\r\n");
      out.write("             <div class=\" form-body \">\r\n");
      out.write("                     \r\n");
      out.write("                 \r\n");
      out.write("    <div class=\" form-body_input col-7\" >\r\n");
      out.write("        <span class=\"mess\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("            <div class=\"content-form row\">\r\n");
      out.write("                <div class=\"mb-3 col-11\">\r\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\">User Name</label>\r\n");
      out.write("                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cus.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required type=\"text\" class=\"form-control\" name=\"username\"\r\n");
      out.write("                        id=\"exampleFormControlInput1\" placeholder=\"UserName\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("           <div class=\"content-form row city-item \">\r\n");
      out.write("                <div class=\" col-5 mb-3\">\r\n");
      out.write("            <label for=\"exampleFormControlInput1\" class=\"form-label\">Full Name</label>\r\n");
      out.write("            <input    value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cus.full_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  \r\n");
      out.write("                    required type=\"text\" class=\"form-control\" name=\"fullname\"\r\n");
      out.write("                        id=\"exampleFormControlInput1\" placeholder=\"Full Name\">\r\n");
      out.write("              </div>\r\n");
      out.write("                <div class=\" col-1 mb-3 separate-city\">\r\n");
      out.write("              </div>\r\n");
      out.write("                <div class=\" col-5 mb-3\">\r\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">Phone</label>\r\n");
      out.write("                    <input  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cus.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                    required type=\"text\" class=\"form-control\" name=\"phone\"\r\n");
      out.write("                        id=\"exampleFormControlInput1\" placeholder=\"Phone\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>    \r\n");
      out.write("        \r\n");
      out.write("            <div class=\"content-form row \">\r\n");
      out.write("                <div class=\"mb-3 col-11\">\r\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\">Email</label>\r\n");
      out.write("                <input required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cus.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                       type=\"text\" class=\"form-control\" name=\"email\" id=\"exampleFormControlInput1\" placeholder=\"Email\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"content-form row\">\r\n");
      out.write("                <div class=\"mb-3 col-11\">\r\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\">Address</label>\r\n");
      out.write("                <input required  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cus.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                       type=\"text\" class=\"form-control\" name=\"address\" id=\"exampleFormControlInput1\" placeholder=\"Address\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"content-form row city-item\">\r\n");
      out.write("                <div class=\" col-5 mb-3\">\r\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\">Country</label>\r\n");
      out.write("                <input required\r\n");
      out.write("                       value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cus.country}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                       type=\"text\" class=\"form-control\" name=\"country\" id=\"exampleFormControlInput1\" placeholder=\"Country\">\r\n");
      out.write("              </div>\r\n");
      out.write("                <div class=\" col-1 mb-3 separate-city\">\r\n");
      out.write("                    <h4>-</h4>\r\n");
      out.write("              </div>\r\n");
      out.write("                <div class=\" col-5 mb-3\">\r\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\">City</label>\r\n");
      out.write("                <input type=\"text\" required ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cus.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                       class=\"form-control\" name=\"city\" id=\"exampleFormControlInput1\" placeholder=\"City\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"content-form row city-item gender-item\">\r\n");
      out.write("                <div class=\" col-5 mb-3\">\r\n");
      out.write("            <label for=\"gender\" class=\"form-label\">Gender</label>\r\n");
      out.write("            <select id=\"gender\"  class=\"form-select\" name=\"gender\" aria-label=\"Default select example\">\r\n");
      out.write("                <option value=\"1\"");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        >Male</option>\r\n");
      out.write("                <option value=\"0\"\r\n");
      out.write("                 ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("       \r\n");
      out.write("                        >Female</option>\r\n");
      out.write("              </select>\r\n");
      out.write("              </div>\r\n");
      out.write("                <div class=\" col-1 mb-3 separate-city\">\r\n");
      out.write("              </div>\r\n");
      out.write("                <div class=\" col-5 mb-3\">\r\n");
      out.write("                <label for=\"feature\" class=\"form-label\">Status</label>\r\n");
      out.write("                <select  id=\"feature\" class=\"form-select\" name=\"featured\" aria-label=\"Default select example\">\r\n");
      out.write("                <option \r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    value=\"1\">Active</option>\r\n");
      out.write("                <option \r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    value=\"0\">De-active</option>\r\n");
      out.write("              </select>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("            <div class=\"content-form row submit-item\">\r\n");
      out.write("                <div class=\" col-1 mb-3\">\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\" col-2 mb-3\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success\">Submit</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\" col-1 mb-3\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\">Cancel</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>   \r\n");
      out.write("                 <div class=\"col-5 form-body-image\">\r\n");
      out.write("                 <div class=\"avatar-upload\">\r\n");
      out.write("                     <h5>Upload Avartar</h5>\r\n");
      out.write("                   <div class=\"avatar-edit\">\r\n");
      out.write("                       <input  type='file' name=\"imageUpload\"  value=\"C:\\\\fakepath\\\\8acc.png\"\r\n");
      out.write("                               id=\"imageUpload\"\r\n");
      out.write("                               accept=\"image/gif, image/jpeg, image/png\" \r\n");
      out.write("                               onchange=\"ChangeAvt(this)\"/>\r\n");
      out.write("                              \r\n");
      out.write("                       <label for=\"imageUpload\"></label>\r\n");
      out.write("                   </div>\r\n");
      out.write("                   <div class=\"avatar-preview \">\r\n");
      out.write("                     <img class=\"profile-user-img img-responsive img-circle\" id=\"imagePreview\" src=\"../images/account-images/acc.png\" alt=\"User profile picture\">\r\n");
      out.write("                   </div>\r\n");
      out.write("                    \r\n");
      out.write("                 </div>\r\n");
      out.write("                    \r\n");
      out.write("                 </div>\r\n");
      out.write("         </div>\r\n");
      out.write("             </form>\r\n");
      out.write("       </div>   \r\n");
      out.write("       </div>\r\n");
      out.write("    <script src=\"../js/customerlist.js\"> </script>\r\n");
      out.write("         <!--Ajax-->\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("/marketing/sidebar.jsp");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cus.gender}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!requestScope.cus.gender}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cus.feature}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!requestScope.cus.feature}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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
}
