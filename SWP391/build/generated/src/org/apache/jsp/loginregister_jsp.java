package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Online Shopping</title>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylelogin.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unicons.iconscout.com/release/v4.0.0/css/line.css\" />\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <a href=\"#divOne\"><button type=\"button\">Login Form</button></a>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"overlay-login\" id=\"divOne\">\r\n");
      out.write("            <div class=\"wrapper-login\">\r\n");
      out.write("                <a class=\"close\" href=\"#\">&times;</a>\r\n");
      out.write("                <div class=\"title-text-login\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <div class=\"title signup\">Signup Form</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-container\">\r\n");
      out.write("                    <div class=\"slide-controls\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        <label for=\"login\" class=\"slide login\">Login</label>\r\n");
      out.write("                        <label for=\"signup\" class=\"slide signup\">Signup</label>\r\n");
      out.write("                        <div class=\"slider-tab\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-inner\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                <div class=\"input-box\">\r\n");
      out.write("                                    <input name=\"user\" type=\"text\" spellcheck=\"false\" required />\r\n");
      out.write("                                    <label for=\"\">Email</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-box\">\r\n");
      out.write("                                    <input class=\"p-input\" name=\"pass\" type=\"password\" spellcheck=\"false\" required />\r\n");
      out.write("                                    <label for=\"\">Password</label>\r\n");
      out.write("                                    <i class=\"uil uil-eye-slash toggle\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"pass-link\">\r\n");
      out.write("                                    <input name=\"remember\" type=\"checkbox\" class=\"form-check-input\" id=\"checkBoxRemember\"/>\r\n");
      out.write("                                    <label class=\"form-check-label\" for=\"checkBoxRemember\">Remember me</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"field btn\">\r\n");
      out.write("                                    <div class=\"btn-layer\"></div>\r\n");
      out.write("                                    <input type=\"submit\" value=\"Login\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"signup-link\">\r\n");
      out.write("                                    Not a member? <a href=\"\">Signup now</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <form action=\"register\" class=\"signup\" >\r\n");
      out.write("                                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.signmess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"input-box\">\r\n");
      out.write("                                    <input name=\"fullname\" type=\"text\" spellcheck=\"false\" required />\r\n");
      out.write("                                    <label for=\"\">Fullname</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div style=\"margin-bottom: 10px;\">\r\n");
      out.write("                                    Gender \r\n");
      out.write("                                    <input type=\"radio\" name=\"gender\" value=\"0\">Male\r\n");
      out.write("                                    <input type=\"radio\" name=\"gender\" value=\"1\">Female\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-box\">\r\n");
      out.write("                                    <input name=\"address\" type=\"text\" spellcheck=\"false\" required />\r\n");
      out.write("                                    <label for=\"\">Address</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-box\">\r\n");
      out.write("                                    <input name=\"user\" type=\"text\" spellcheck=\"false\" required />\r\n");
      out.write("                                    <label for=\"\">Email</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-box\">\r\n");
      out.write("                                    <input class=\"p-input1\" name=\"pass\" type=\"password\" spellcheck=\"false\" required />\r\n");
      out.write("                                    <label for=\"\">Password</label>\r\n");
      out.write("                                    <i class=\"uil uil-eye-slash toggle1\"></i>\r\n");
      out.write("                                </div>           \r\n");
      out.write("                                <div class=\"input-box\">\r\n");
      out.write("                                    <input class=\"p-input2\" name=\"repass\" type=\"password\" spellcheck=\"false\" required />\r\n");
      out.write("                                    <label for=\"\">Confirm password</label>\r\n");
      out.write("                                    <i class=\"uil uil-eye-slash toggle2\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"field btn\">\r\n");
      out.write("                                    <div class=\"btn-layer\"></div>\r\n");
      out.write("                                    <input type=\"submit\" value=\"Signup\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            const loginText = document.querySelector(\".title-text .login\");\r\n");
      out.write("            const loginUserData = document.querySelector('.login input[name=\"user\"]');\r\n");
      out.write("            const loginPassData = document.querySelector('.login input[name=\"pass\"]');\r\n");
      out.write("            const signupUserData = document.querySelector('.signup input[name=\"user\"]');\r\n");
      out.write("            const signupPassData = document.querySelector('.signup input[name=\"pass\"]');\r\n");
      out.write("            const signupRePassData = document.querySelector('.signup input[name=\"repass\"]');\r\n");
      out.write("            const loginForm = document.querySelector(\"form.login\");\r\n");
      out.write("            const loginBtn = document.querySelector(\"label.login\");\r\n");
      out.write("            const signupBtn = document.querySelector(\"label.signup\");\r\n");
      out.write("            const closeBtn = document.querySelector(\"a.close\");\r\n");
      out.write("            const signupLink = document.querySelector(\"form .signup-link a\");\r\n");
      out.write("            closeBtn.onclick = () => {\r\n");
      out.write("                \r\n");
      out.write("            };\r\n");
      out.write("            signupBtn.onclick = () => {\r\n");
      out.write("                loginUserData.value = '';\r\n");
      out.write("                loginPassData.value = '';\r\n");
      out.write("                document.getElementById(\"checkBoxRemember\").checked = false;\r\n");
      out.write("                loginForm.style.marginLeft = \"-50%\";\r\n");
      out.write("                loginText.style.marginLeft = \"-50%\";\r\n");
      out.write("            };\r\n");
      out.write("            loginBtn.onclick = () => {\r\n");
      out.write("                signupUserData.value = '';\r\n");
      out.write("                signupPassData.value = '';\r\n");
      out.write("                signupRePassData.value = '';\r\n");
      out.write("                loginForm.style.marginLeft = \"0%\";\r\n");
      out.write("                loginText.style.marginLeft = \"0%\";\r\n");
      out.write("            };\r\n");
      out.write("            signupLink.onclick = () => {\r\n");
      out.write("                signupBtn.click();\r\n");
      out.write("                return false;\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            const toggle = document.querySelector(\".toggle\"),\r\n");
      out.write("                    input = document.querySelector(\".p-input\");\r\n");
      out.write("            const toggle1 = document.querySelector(\".toggle1\"),\r\n");
      out.write("                    input1 = document.querySelector(\".p-input1\");\r\n");
      out.write("            const toggle2 = document.querySelector(\".toggle2\"),\r\n");
      out.write("                    input2 = document.querySelector(\".p-input2\");\r\n");
      out.write("\r\n");
      out.write("            toggle.addEventListener(\"click\", () => {\r\n");
      out.write("                if (input.type === \"password\") {\r\n");
      out.write("                    input.type = \"text\";\r\n");
      out.write("                    toggle.classList.replace(\"uil-eye-slash\", \"uil-eye\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    toggle.classList.replace(\"uil-eye\", \"uil-eye-slash\");\r\n");
      out.write("                    input.type = \"password\";\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            toggle1.addEventListener(\"click\", () => {\r\n");
      out.write("                if (input1.type === \"password\") {\r\n");
      out.write("                    input1.type = \"text\";\r\n");
      out.write("                    toggle1.classList.replace(\"uil-eye-slash\", \"uil-eye\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    toggle1.classList.replace(\"uil-eye\", \"uil-eye-slash\");\r\n");
      out.write("                    input1.type = \"password\";\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            toggle2.addEventListener(\"click\", () => {\r\n");
      out.write("                if (input2.type === \"password\") {\r\n");
      out.write("                    input2.type = \"text\";\r\n");
      out.write("                    toggle2.classList.replace(\"uil-eye-slash\", \"uil-eye\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    toggle2.classList.replace(\"uil-eye\", \"uil-eye-slash\");\r\n");
      out.write("                    input2.type = \"password\";\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.signmess == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
<<<<<<< HEAD
        out.write("\r\n");
        out.write("                        <div class=\"title login\">Login Form</div>\r\n");
=======
        out.write("\n");
        out.write("                        <div class=\"title login\">Login Form</div>\n");
>>>>>>> phuongnldhe150657
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.signmess != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
<<<<<<< HEAD
        out.write("\r\n");
        out.write("                        <div class=\"title login\" style=\"margin-left: -50%;\">Login Form</div>\r\n");
=======
        out.write("\n");
        out.write("                        <div class=\"title login\" style=\"margin-left: -50%;\">Login Form</div>\n");
>>>>>>> phuongnldhe150657
        out.write("                    ");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.signmess == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
<<<<<<< HEAD
        out.write("\r\n");
        out.write("                            <input type=\"radio\" name=\"slide\" id=\"login\" checked />\r\n");
        out.write("                            <input type=\"radio\" name=\"slide\" id=\"signup\" />\r\n");
=======
        out.write("\n");
        out.write("                            <input type=\"radio\" name=\"slide\" id=\"login\" checked />\n");
        out.write("                            <input type=\"radio\" name=\"slide\" id=\"signup\" />\n");
>>>>>>> phuongnldhe150657
        out.write("                        ");
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.signmess != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
<<<<<<< HEAD
        out.write("\r\n");
        out.write("                            <input type=\"radio\" name=\"slide\" id=\"login\"  />\r\n");
        out.write("                            <input type=\"radio\" name=\"slide\" id=\"signup\" checked/>\r\n");
=======
        out.write("\n");
        out.write("                            <input type=\"radio\" name=\"slide\" id=\"login\"  />\n");
        out.write("                            <input type=\"radio\" name=\"slide\" id=\"signup\" checked/>\n");
>>>>>>> phuongnldhe150657
        out.write("                        ");
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

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.signmess == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
<<<<<<< HEAD
        out.write("\r\n");
        out.write("                            <form action=\"login\" class=\"login\" method=\"post\">\r\n");
=======
        out.write("\n");
        out.write("                            <form action=\"login\" class=\"login\" method=\"post\">\n");
>>>>>>> phuongnldhe150657
        out.write("                            ");
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

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.signmess != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
<<<<<<< HEAD
        out.write("\r\n");
        out.write("                                <form action=\"login\" class=\"login\" method=\"post\" style=\"margin-left: -50%;\">   \r\n");
=======
        out.write("\n");
        out.write("                                <form action=\"login\" class=\"login\" method=\"post\" style=\"margin-left: -50%;\">   \n");
>>>>>>> phuongnldhe150657
        out.write("                                ");
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
}
