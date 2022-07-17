package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userfrofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("        <!--<link href=\"css/style.css\" rel=\"stylesheet\">-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/userfrofile.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylelogin.css\" />\r\n");
      out.write("\r\n");
      out.write("        <title>User Profile</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            .wrapper-login {\r\n");
      out.write("                margin: 30px auto;\r\n");
      out.write("            }\r\n");
      out.write("            .py-5{\r\n");
      out.write("                padding-top: 3px!important;\r\n");
      out.write("            }\r\n");
      out.write("            .rounded-box {\r\n");
      out.write("                width: 150px;\r\n");
      out.write("                height: 150px;\r\n");
      out.write("                display: block;\r\n");
      out.write("                margin: 0 auto;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .outer {\r\n");
      out.write("                width: 100% !important;\r\n");
      out.write("                height: 100% !important;\r\n");
      out.write("                max-width: 150px !important; /* any size */\r\n");
      out.write("                max-height: 150px !important; /* any size */\r\n");
      out.write("                margin: auto;\r\n");
      out.write("                background-color: #6eafd4;\r\n");
      out.write("                border-radius: 100%;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .inner {\r\n");
      out.write("                background-color: #999;\r\n");
      out.write("                width: 50px;\r\n");
      out.write("                height: 50px;\r\n");
      out.write("                border-radius: 100%;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                bottom: 0;\r\n");
      out.write("                right: 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .inner:hover {\r\n");
      out.write("                background-color: #5555ff;\r\n");
      out.write("            }\r\n");
      out.write("            .inputfile {\r\n");
      out.write("                opacity: 0;\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                z-index: 1;\r\n");
      out.write("                width: 50px;\r\n");
      out.write("                height: 50px;\r\n");
      out.write("            }\r\n");
      out.write("            .inputfile + label {\r\n");
      out.write("                font-size: 1.25rem;\r\n");
      out.write("                text-overflow: ellipsis;\r\n");
      out.write("                white-space: nowrap;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("                width: 50px;\r\n");
      out.write("                height: 50px;\r\n");
      out.write("                pointer-events: none;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                line-height: 50px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            .inputfile + label svg {\r\n");
      out.write("                fill: #fff;\r\n");
      out.write("            }\r\n");
      out.write("            #imgInp,#change-photo {\r\n");
      out.write("                opacity: 0;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                z-index: -1;\r\n");
      out.write("            }\r\n");
      out.write("            .avatar{\r\n");
      out.write("                width:150px;\r\n");
      out.write("                height:150px;\r\n");
      out.write("                border-radius:50%;\r\n");
      out.write("                overflow:hidden;\r\n");
      out.write("            }\r\n");
      out.write("            .rounded-circle img{\r\n");
      out.write("                width:100%;\r\n");
      out.write("                height:100%;\r\n");
      out.write("                object-fit: cover;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <script>\r\n");
      out.write("            var ids = [];\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            function submitForm()\r\n");
      out.write("            {\r\n");
      out.write("                document.getElementById('frmImgUpdate').submit();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function hideControlsbyClassName(name)\r\n");
      out.write("            {\r\n");
      out.write("                var controls = document.getElementsByClassName(name);\r\n");
      out.write("                for (var i = 0; i < controls.length; i++)\r\n");
      out.write("                {\r\n");
      out.write("                    controls[i].style.display = 'none';\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            function showControlsbyClassName(name)\r\n");
      out.write("            {\r\n");
      out.write("                var controls = document.getElementsByClassName(name);\r\n");
      out.write("                for (var i = 0; i < controls.length; i++)\r\n");
      out.write("                {\r\n");
      out.write("                    controls[i].style.display = 'inline';\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            function hideEditModeControls()\r\n");
      out.write("            {\r\n");
      out.write("                for (var i = 0; i < ids.length; i++)\r\n");
      out.write("                {\r\n");
      out.write("                    hideControlsbyClassName('editmode' + ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(");\r\n");
      out.write("                    hideControlsbyClassName('editmode' + ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getActive()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            function hideViewModeControls()\r\n");
      out.write("            {\r\n");
      out.write("                for (var i = 0; i < ids.length; i++)\r\n");
      out.write("                {\r\n");
      out.write("                    hideControlsbyClassName('viewmode' + ids[i]);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            function showEditModeControls(id)\r\n");
      out.write("            {\r\n");
      out.write("                for (var i = 0; i < ids.length; i++)\r\n");
      out.write("                {\r\n");
      out.write("                    showControlsbyClassName('editmode' + ids[i]);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            function showViewModeControls()\r\n");
      out.write("            {\r\n");
      out.write("                for (var i = 0; i < ids.length; i++)\r\n");
      out.write("                {\r\n");
      out.write("                    showControlsbyClassName('viewmode' + ids[i]);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function Edit_onclick(id)\r\n");
      out.write("            {\r\n");
      out.write("                hideControlsbyClassName('viewmode' + id);\r\n");
      out.write("                showControlsbyClassName('editmode' + id);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function Cancel_onclick(id, name, gender, phone, city, county, address)\r\n");
      out.write("            {\r\n");
      out.write("                hideControlsbyClassName('editmode' + id);\r\n");
      out.write("                showControlsbyClassName('viewmode' + id);\r\n");
      out.write("                document.getElementById('edit_name' + id).value = name;\r\n");
      out.write("                document.getElementById('edit_phone' + id).value = phone;\r\n");
      out.write("                document.getElementById('edit_city' + id).value = city;\r\n");
      out.write("                document.getElementById('edit_county' + id).value = county;\r\n");
      out.write("                document.getElementById('edit_address' + id).value = address;\r\n");
      out.write("                document.getElementById('edit_gender' + id).checked = gender;\r\n");
      out.write("                var options = document.getElementById('edit_did' + id).getElementsByTagName('option');\r\n");
      out.write("                for (var i = 0; i < options.length; i++)\r\n");
      out.write("                {\r\n");
      out.write("                    if (options[i].value == did)\r\n");
      out.write("                    {\r\n");
      out.write("                        document.getElementById('edit_did' + id).selectedIndex = i;\r\n");
      out.write("                        break;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"overlay-login\" id=\"divThree\">\r\n");
      out.write("            <div class=\"wrapper-login\" style=\"max-width: 1000px; max-height: 620px; font-size:10px\" >\r\n");
      out.write("                <div class=\"container rounded bg-white mt-5 mb-5\">\r\n");
      out.write("                    <a class=\"close\" href=\"#a\" id=\"close\" onclick=\"Cancel_onclick(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getFull_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\'');
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.isGender()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCountry()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("                            Cancel_onclick(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getActive()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getFull_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\'');
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.isGender()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCountry()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\">\r\n");
      out.write("                        &times;\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-3 border-right\">\r\n");
      out.write("                            <div class=\"d-flex flex-column align-items-center text-center p-3 py-5\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"rounded-box\">\r\n");
      out.write("                                    <div class=\"outer\">\r\n");
      out.write("                                        <div style=\"position: absolute;\">\r\n");
      out.write("                                            <input class=\"btn btn-primary profile-button viewmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getActive()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"button\" value=\"Edit\" style=\"width: auto;\"  onclick=\"Edit_onclick(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getActive()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(");\"/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <img class=\"rounded-circle avatar\" id=\"blah\" alt=\"your image\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getImage_url()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                        <form action=\"updateacc\" id=\"frmImgUpdate\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                            <div class=\"inner editmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getActive()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                                <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                                <input type=\"hidden\" name=\"type\" value=\"1\"/>\r\n");
      out.write("                                                <input accept=\"image/*\" type=\"file\" name=\"file\" id=\"imgInp\">\r\n");
      out.write("                                                <label for=\"imgInp\" style=\"cursor: pointer;\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"17\" viewBox=\"0 0 20 17\"><path d=\"M10 0l-5.2 4.9h3.3v5.1h3.8v-5.1h3.3l-5.2-4.9zm9.3 11.5l-3.2-2.1h-2l3.4 2.6h-3.5c-.1 0-.2.1-.2.1l-.8 2.3h-6l-.8-2.2c-.1-.1-.1-.2-.2-.2h-3.6l3.4-2.6h-2l-3.2 2.1c-.4.3-.7 1-.6 1.5l.6 3.1c.1.5.7.9 1.2.9h16.3c.6 0 1.1-.4 1.3-.9l.6-3.1c.1-.5-.2-1.2-.7-1.5z\"></path></svg></label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <span class=\"font-weight-bold\">\r\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getFull_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <span class=\"text-black-50\">\r\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                </span>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"mt-5 text-center editmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getActive()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                    <input class=\"btn btn-primary profile-button editmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getActive()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"submit\" onclick=\"submitForm();\" value=\"Save\" style=\"width: auto;\"/>\r\n");
      out.write("                                    <input id=\"cancel-btn\" class=\"btn btn-primary profile-button editmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getActive()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"button\" value=\"Cancel\" style=\"width: auto;\"\r\n");
      out.write("                                           onclick=\"Cancel_onclick(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getActive()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getFull_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\'');
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.isGender()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCountry()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <span>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-9 border-right\">\r\n");
      out.write("                            <form action=\"updateacc\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"type\" value=\"0\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                <div class=\"p-3 py-5\">\r\n");
      out.write("                                    <div class=\"d-flex justify-content-between align-items-center mb-3\">\r\n");
      out.write("                                        <h4 class=\"text-right\">Profile Settings</h4>                                    \r\n");
      out.write("                                        <input class=\"btn btn-primary profile-button viewmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"button\" value=\"Edit\" style=\"width: auto;\"  onclick=\"Edit_onclick(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(");\"/>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"row mt-2\">\r\n");
      out.write("                                        <div class=\"col-md-6\">\r\n");
      out.write("                                            <label class=\"labels\">FullName</label><br>\r\n");
      out.write("                                            <span class=\"viewmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getFull_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                            <input id=\"edit_name");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"fname\" type=\"text\" class=\"form-control editmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getFull_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getFull_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-6\">\r\n");
      out.write("                                            Gender<br>\r\n");
      out.write("                                            <span class=\"viewmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.isGender()?\"Male\":\"Female\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                            <select name=\"gender\" class=\"editmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"margin-top: 5px;\">\r\n");
      out.write("                                                <option value=\"1\" ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" >Male</option>\r\n");
      out.write("                                                <option value=\"0\" ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write(">Female</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"row mt-3\">\r\n");
      out.write("                                            <div class=\"col-md-12\">\r\n");
      out.write("                                                <label class=\"labels\">Mobile Number</label><br>\r\n");
      out.write("                                                <span class=\"viewmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                            <input id=\"edit_phone");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"phone\" type=\"text\" class=\"form-control editmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-6\">\r\n");
      out.write("                                            <label class=\"labels\">City</label><br>\r\n");
      out.write("                                            <span class=\"viewmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                            <input id=\"edit_city");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"city\" type=\"text\" class=\"form-control editmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></div>\r\n");
      out.write("                                        <div class=\"col-md-6\">\r\n");
      out.write("                                            <label class=\"labels\">Country</label><br>\r\n");
      out.write("                                            <span class=\"viewmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCountry()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                            <input id=\"edit_country");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"country\" type=\"text\" class=\"form-control editmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCountry()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCountry()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></div>\r\n");
      out.write("                                        <div class=\"col-md-12\">\r\n");
      out.write("                                            <label class=\"labels\">Address </label><br>\r\n");
      out.write("                                            <span class=\"viewmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                            <input id=\"edit_address");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"address\" type=\"text\" class=\"form-control editmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"mt-5 text-center\">\r\n");
      out.write("                                        <input class=\"btn btn-primary profile-button editmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"submit\" value=\"Save\" style=\"width: auto;\"/>\r\n");
      out.write("                                        <input class=\"btn btn-primary profile-button editmode");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"button\" value=\"Cancel\" style=\"width: auto;\"\r\n");
      out.write("                                               onclick=\"Cancel_onclick(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getFull_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\'');
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.isGender()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCountry()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\"/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            const cancelBtn = document.querySelector(\"#cancel-btn\");\r\n");
      out.write("            \r\n");
      out.write("            imgInp.onchange = evt => {\r\n");
      out.write("                const [file] = imgInp.files\r\n");
      out.write("                if (file) {\r\n");
      out.write("                    blah.src = URL.createObjectURL(file)\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("//            cancelBtn.onclick = evt => {\r\n");
      out.write("//                const  [file] = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getImage_url()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'\r\n");
      out.write("//                if(file) {\r\n");
      out.write("//                    \r\n");
      out.write("//                }\r\n");
      out.write("//            }\r\n");
      out.write("            cancelBtn.addEventListener(\"click\", function () {\r\n");
      out.write("                blah.src = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getImage_url()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            hideEditModeControls();\r\n");
      out.write("            Cancel_onclick(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getFull_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\'');
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.isGender()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCountry()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("            Cancel_onclick(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getActive()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getFull_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\'');
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.isGender()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getCountry()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("        </script>\r\n");
      out.write("        <!--<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js\" integrity=\"sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk\" crossorigin=\"anonymous\"></script>-->\r\n");
      out.write("        <!--<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js\" integrity=\"sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy\" crossorigin=\"anonymous\"></script>-->\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.students}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("s");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            ids.push(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getUser_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(");\r\n");
          out.write("            ");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.isGender()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.isGender()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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
