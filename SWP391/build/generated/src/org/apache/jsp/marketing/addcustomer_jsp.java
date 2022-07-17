package org.apache.jsp.marketing;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Post_List</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <!--CSS-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/style.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/customerlist.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/addcustomer.css\"/>\n");
      out.write("          <!--font-awesome-->\n");
      out.write("        <script src=\"https://kit.fontawesome.com/3c84cb624f.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"d-flex\">\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <div class=\"container-lg\">\n");
      out.write("            <!--content--> \n");
      out.write("         <div class=\" form-container col-11 p-3 bg-white rounded my-5\">\n");
      out.write("                <div class=\"form-header\">\n");
      out.write("                    <h1>Customer Details:</h1>\n");
      out.write("                </div>\n");
      out.write("             <form class=\"row\" id=\"add-customer\" action=\"/marketing/addcustomer\" method=\"post\">\n");
      out.write("             <div class=\" form-body \">\n");
      out.write("                     \n");
      out.write("                 \n");
      out.write("    <div class=\" form-body_input col-7\">\n");
      out.write("            <div class=\"content-form row\">\n");
      out.write("                <div class=\"mb-3 col-11\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\">User Name</label>\n");
      out.write("                <input  required type=\"text\" class=\"form-control\" name=\"username\"\n");
      out.write("                        id=\"exampleFormControlInput1\" placeholder=\"UserName\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content-form row\">\n");
      out.write("                <div class=\"mb-3 col-11\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\">Full Name</label>\n");
      out.write("                <input  required type=\"text\" class=\"form-control\" name=\"fullname\"\n");
      out.write("                        id=\"exampleFormControlInput1\" placeholder=\"fullname\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content-form row \">\n");
      out.write("                <div class=\"mb-3 col-11\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\">Email</label>\n");
      out.write("                <input required type=\"text\" class=\"form-control\" name=\"email\" id=\"exampleFormControlInput1\" placeholder=\"Email\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content-form row\">\n");
      out.write("                <div class=\"mb-3 col-11\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\">Address</label>\n");
      out.write("                <input required type=\"text\" class=\"form-control\" name=\"address\" id=\"exampleFormControlInput1\" placeholder=\"Address\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content-form row city-item\">\n");
      out.write("                <div class=\" col-5 mb-3\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\">Country</label>\n");
      out.write("                <input required type=\"text\" class=\"form-control\" name=\"country\" id=\"exampleFormControlInput1\" placeholder=\"Country\">\n");
      out.write("              </div>\n");
      out.write("                <div class=\" col-1 mb-3 separate-city\">\n");
      out.write("                    <h4>-</h4>\n");
      out.write("              </div>\n");
      out.write("                <div class=\" col-5 mb-3\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\">City</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"city\" id=\"exampleFormControlInput1\" placeholder=\"City\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content-form row city-item gender-item\">\n");
      out.write("                <div class=\" col-5 mb-3\">\n");
      out.write("            <label for=\"gender\" class=\"form-label\">Gender</label>\n");
      out.write("            <select id=\"gender\"  class=\"form-select\" name=\"gender\" aria-label=\"Default select example\">\n");
      out.write("                <option value=\"1\">Male</option>\n");
      out.write("                <option value=\"0\">Female</option>\n");
      out.write("              </select>\n");
      out.write("              </div>\n");
      out.write("                <div class=\" col-1 mb-3 separate-city\">\n");
      out.write("              </div>\n");
      out.write("                <div class=\" col-5 mb-3\">\n");
      out.write("                <label for=\"feature\" class=\"form-label\">Status</label>\n");
      out.write("                <select  id=\"feature\" class=\"form-select\" name=\"featured\" aria-label=\"Default select example\">\n");
      out.write("                <option value=\"1\">Active</option>\n");
      out.write("                <option value=\"0\">De-active</option>\n");
      out.write("              </select>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"content-form row submit-item\">\n");
      out.write("                <div class=\" col-1 mb-3\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\" col-2 mb-3\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\" col-1 mb-3\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\">Cancel</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         </div>   \n");
      out.write("                 <div class=\"col-5 form-body-image\">\n");
      out.write("                 <div class=\"avatar-upload\">\n");
      out.write("                     <h5>Upload Avartar</h5>\n");
      out.write("                   <div class=\"avatar-edit\">\n");
      out.write("                       <input  type='file' name=\"avatar\" value=\"C:\\\\fakepath\\\\8acc.png\" id=\"imageUpload\" accept=\".png, .jpg, .jpeg\" onchange=\"ChangeAvt(this)\"/>\n");
      out.write("                       <label for=\"imageUpload\"></label>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"avatar-preview \">\n");
      out.write("                     <img class=\"profile-user-img img-responsive img-circle\" id=\"imagePreview\" src=\"../images/account-images/8acc.png\" alt=\"User profile picture\">\n");
      out.write("                   </div>\n");
      out.write("                    \n");
      out.write("                 </div>\n");
      out.write("                    \n");
      out.write("                 </div>\n");
      out.write("         </div>\n");
      out.write("             </form>\n");
      out.write("       </div>   \n");
      out.write("       </div>\n");
      out.write("    <script src=\"../js/customerlist.js\"> </script>\n");
      out.write("         <!--Ajax-->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("    </body>\n");
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
}
