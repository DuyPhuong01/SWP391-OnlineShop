package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Slider;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Online shopping system</title>\n");
      out.write("\n");
      out.write("        <!--bootstrap-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylehomepage.css\">\n");
      out.write("        <!-- ===== Boxicons CSS ===== -->\n");
      out.write("        <link href=\"https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css\" rel=\"stylesheet\"/>\n");
      out.write("        <!--font-awesome-->\n");
      out.write("        <script src=\"https://kit.fontawesome.com/3c84cb624f.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <style>\n");
      out.write("            .star-widget{\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .star-widget input{\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            .star-widget label{\n");
      out.write("                font-size: 40px;\n");
      out.write("                color: #ccc;\n");
      out.write("                padding: 10px;\n");
      out.write("                float: right;\n");
      out.write("                transition: all 0.2s ease;\n");
      out.write("            }\n");
      out.write("            input:not(:checked) ~ label:hover,\n");
      out.write("            input:not(:checked) ~ label:hover ~ label{\n");
      out.write("                color: #fd4;\n");
      out.write("            }\n");
      out.write("            input:checked ~ label{\n");
      out.write("                color: #fd4;\n");
      out.write("            }\n");
      out.write("            input#rate-5:checked ~ label{\n");
      out.write("                color: #fe7;\n");
      out.write("            }\n");
      out.write("            .form-label{\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-lg\">\n");
      out.write("                <div id=\"carouselExampleCaptions\" class=\"carousel slide mb-3\" data-bs-ride=\"false\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row mb-3\">\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        <div class=\"sider\">\n");
      out.write("                        ");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-9\">\n");
      out.write("\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <form action=\"feedback\" method=\"POST\">\n");
      out.write("                                <input type=\"hidden\" name=\"userId\" value=\"#\">\n");
      out.write("                                <input type=\"hidden\" name=\"productId\" value=\"#\">\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"exampleFormControlInput1\" class=\"form-label\">Full name</label>\n");
      out.write("                                    <input type=\"text\" name=\"name\" class=\"form-control\" id=\"exampleFormControlInput1\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label for=\"inputPassword4\" class=\"form-label\">Phone</label>\n");
      out.write("                                        <input type=\"text\" name=\"phone\"  placeholder=\"+84\" class=\"form-control\" id=\"inputPassword4\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label for=\"inputEmail4\" class=\"form-label\" style=\"margin-bottom: 16px;\">Gender</label>\n");
      out.write("                                        <div class=\"form-check form-check-inline\">\n");
      out.write("                                            <input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"inlineRadio1\" value=\"1\">\n");
      out.write("                                            <label class=\"form-check-label\" for=\"inlineRadio1\">Male</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-check form-check-inline\">\n");
      out.write("                                            <input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"inlineRadio2\" value=\"2\">\n");
      out.write("                                            <label class=\"form-check-label\" for=\"inlineRadio2\">Female</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div><br>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"exampleFormControlInput1\" class=\"form-label\">Email address</label>\n");
      out.write("                                    <input type=\"email\" name=\"email\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"name@example.com\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"exampleFormControlInput1\" class=\"form-label\">Vote</label>\n");
      out.write("                                    <div class=\"star-widget\">\n");
      out.write("                                        <input type=\"radio\" name=\"rate\" id=\"rate-1\" value=\"5\" >\n");
      out.write("                                        <label for=\"rate-1\" class=\"fas fa-star\"></label>\n");
      out.write("                                        <input type=\"radio\" name=\"rate\" id=\"rate-2\" value=\"4\">\n");
      out.write("                                        <label for=\"rate-2\" class=\"fas fa-star\"></label>\n");
      out.write("                                        <input type=\"radio\" name=\"rate\" id=\"rate-3\" value=\"3\">\n");
      out.write("                                        <label for=\"rate-3\" class=\"fas fa-star\"></label>\n");
      out.write("                                        <input type=\"radio\" name=\"rate\" id=\"rate-4\" value=\"2\">\n");
      out.write("                                        <label for=\"rate-4\" class=\"fas fa-star\"></label>\n");
      out.write("                                        <input type=\"radio\" name=\"rate\" id=\"rate-5\" value=\"1\" checked=\"\">\n");
      out.write("                                        <label for=\"rate-5\" class=\"fas fa-star\"></label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"formFileMultiple\" class=\"form-label\">Upload image</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"file\" name=\"file\" id=\"formFileMultiple\" multiple>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"exampleFormControlTextarea1\" class=\"form-label\">Feedback</label>\n");
      out.write("                                    <textarea class=\"form-control\" name=\"feedback\" id=\"exampleFormControlTextarea1\" rows=\"4\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"d-grid gap-2 col-6 mx-auto\">\n");
      out.write("                                    <button class=\"btn btn-primary\" type=\"submit\">Submit</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>  \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("            ");
      if (_jspx_meth_c_import_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/carousel.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            const btn = document.querySelector(\"button\");\n");
      out.write("            const post = document.querySelector(\".post\");\n");
      out.write("            const widget = document.querySelector(\".star-widget\");\n");
      out.write("            const editBtn = document.querySelector(\".edit\");\n");
      out.write("            btn.onclick = () => {\n");
      out.write("                widget.style.display = \"none\";\n");
      out.write("                post.style.display = \"block\";\n");
      out.write("                editBtn.onclick = () => {\n");
      out.write("                    widget.style.display = \"block\";\n");
      out.write("                    post.style.display = \"none\";\n");
      out.write("                };\n");
      out.write("                return false;\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_import_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_2 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_2.setPageContext(_jspx_page_context);
    _jspx_th_c_import_2.setParent(null);
    _jspx_th_c_import_2.setUrl("footer.jsp");
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
}
