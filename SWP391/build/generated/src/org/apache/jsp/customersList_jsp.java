package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customersList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_formatDate_value_type_nobody.release();
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title> Manager - Children Care </title>\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE10 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 10]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <!-- Meta -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"description\" content=\"#\">\n");
      out.write("        <meta name=\"keywords\" content=\"flat ui, admin Admin , Responsive, Landing, Bootstrap, App, Template, Mobile, iOS, Android, apple, creative app\">\n");
      out.write("        <meta name=\"author\" content=\"#\">\n");
      out.write("        <!-- Favicon icon -->\n");
      out.write("        <link rel=\"icon\" href=\"..\\frontend\\assert\\libAdmin\\assets\\images\\favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <!-- Google font-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,600\" rel=\"stylesheet\">\n");
      out.write("        <!-- Required Fremwork -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"..\\frontend\\assert\\libAdmin\\bower_components\\bootstrap\\css\\bootstrap.min.css\">\n");
      out.write("        <!-- themify-icons line icon -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"..\\frontend\\assert\\libAdmin\\assets\\icon\\themify-icons\\themify-icons.css\">\n");
      out.write("        <!-- ico font -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"..\\frontend\\assert\\libAdmin\\assets\\icon\\icofont\\css\\icofont.css\">\n");
      out.write("        <!-- feather Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"..\\frontend\\assert\\libAdmin\\assets\\icon\\feather\\css\\feather.css\">\n");
      out.write("        <!-- Data Table Css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"..\\frontend\\assert\\libAdmin\\bower_components\\datatables.net-bs4\\css\\dataTables.bootstrap4.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"..\\frontend\\assert\\libAdmin\\assets\\pages\\data-table\\css\\buttons.dataTables.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"..\\frontend\\assert\\libAdmin\\bower_components\\datatables.net-responsive-bs4\\css\\responsive.bootstrap4.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Select 2 css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"..\\frontend\\assert\\libAdmin\\bower_components\\select2\\css\\select2.min.css\">\n");
      out.write("        <!-- Multi Select css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"..\\frontend\\assert\\libAdmin\\bower_components\\bootstrap-multiselect\\css\\bootstrap-multiselect.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"..\\frontend\\assert\\libAdmin\\bower_components\\multiselect\\css\\multi-select.css\">\n");
      out.write("\n");
      out.write("        <!-- Style.css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"..\\frontend\\assert\\libAdmin\\assets\\css\\style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"..\\frontend\\assert\\libAdmin\\assets\\css\\jquery.mCustomScrollbar.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Pre-loader start -->\n");
      out.write("        <div class=\"theme-loader\">\n");
      out.write("            <div class=\"ball-scale\">\n");
      out.write("                <div class='contain'>\n");
      out.write("                    <div class=\"ring\">\n");
      out.write("                        <div class=\"frame\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ring\">\n");
      out.write("                        <div class=\"frame\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ring\">\n");
      out.write("                        <div class=\"frame\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ring\">\n");
      out.write("                        <div class=\"frame\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ring\">\n");
      out.write("                        <div class=\"frame\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ring\">\n");
      out.write("                        <div class=\"frame\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ring\">\n");
      out.write("                        <div class=\"frame\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ring\">\n");
      out.write("                        <div class=\"frame\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ring\">\n");
      out.write("                        <div class=\"frame\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ring\">\n");
      out.write("                        <div class=\"frame\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Pre-loader end -->\n");
      out.write("        <div id=\"pcoded\" class=\"pcoded\">\n");
      out.write("            <div class=\"pcoded-overlay-box\"></div>\n");
      out.write("            <div class=\"pcoded-container navbar-wrapper\">\n");
      out.write("\n");
      out.write("                <nav class=\"navbar header-navbar pcoded-header\">\n");
      out.write("                    <div class=\"navbar-wrapper\">\n");
      out.write("\n");
      out.write("                        <div class=\"navbar-logo\">\n");
      out.write("                            <a class=\"mobile-menu\" id=\"mobile-collapse\" href=\"#!\">\n");
      out.write("                                <i class=\"feather icon-menu\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"index-1.htm\">\n");
      out.write("                                <img class=\"img-fluid\" src=\"..\\frontend\\assert\\libAdmin\\assets\\images\\logo.png\" alt=\"Theme-Logo\">\n");
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"mobile-options\">\n");
      out.write("                                <i class=\"feather icon-more-horizontal\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"navbar-container container-fluid\">\n");
      out.write("                            <ul class=\"nav-left\">\n");
      out.write("                                <li class=\"header-search\">\n");
      out.write("                                    <div class=\"main-search morphsearch-search\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-addon search-close\"><i class=\"feather icon-x\"></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\">\n");
      out.write("                                            <span class=\"input-group-addon search-btn\"><i class=\"feather icon-search\"></i></span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#!\" onclick=\"javascript:toggleFullScreen()\">\n");
      out.write("                                        <i class=\"feather icon-maximize full-screen\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul class=\"nav-right\">\n");
      out.write("                                <li class=\"user-profile header-notification\">\n");
      out.write("                                    <div class=\"dropdown-primary dropdown\">\n");
      out.write("                                        <div class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                            <img src=\"\" class=\"img-radius\" alt=\"User-Profile-Image\">\n");
      out.write("                                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                            <i class=\"feather icon-chevron-down\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <ul class=\"show-notification profile-notification dropdown-menu\" data-dropdown-in=\"fadeIn\" data-dropdown-out=\"fadeOut\">\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"#!\">\n");
      out.write("                                                    <i class=\"feather icon-settings\"></i> Settings\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"user-profile.htm\">\n");
      out.write("                                                    <i class=\"feather icon-user\"></i> Profile\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"auth-normal-sign-in.htm\">\n");
      out.write("                                                    <i class=\"feather icon-log-out\"></i> Logout\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"pcoded-main-container\">\n");
      out.write("                    <div class=\"pcoded-wrapper\">\n");
      out.write("                        <nav class=\"pcoded-navbar\">\n");
      out.write("                            <div class=\"pcoded-inner-navbar main-menu\">\n");
      out.write("                                <div class=\"pcoded-navigatio-lavel\">Admin</div>\n");
      out.write("                                <ul class=\"pcoded-item pcoded-left-item\">\n");
      out.write("                                    <li class=\"\">\n");
      out.write("                                        <a href=\"navbar-light.htm\">\n");
      out.write("                                            <span class=\"pcoded-micon\"><i class=\"feather icon-menu\"></i></span>\n");
      out.write("                                            <span class=\"pcoded-mtext\">User List</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"pcoded-navigatio-lavel\">Manager</div>\n");
      out.write("                                <ul class=\"pcoded-item pcoded-left-item\">\n");
      out.write("\n");
      out.write("                                    <li class=\" \">\n");
      out.write("                                        <a href=\"animation.htm\">\n");
      out.write("                                            <span class=\"pcoded-micon\"><i class=\"feather icon-aperture rotate-refresh\"></i><b>A</b></span>\n");
      out.write("                                            <span class=\"pcoded-mtext\">Services List</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\" \">\n");
      out.write("                                        <a href=\"sticky.htm\">\n");
      out.write("                                            <span class=\"pcoded-micon\"><i class=\"feather icon-cpu\"></i></span>\n");
      out.write("                                            <span class=\"pcoded-mtext\">Posts List</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\" \">\n");
      out.write("                                        <a href=\"slideController\">\n");
      out.write("                                            <span class=\"pcoded-micon\"><i class=\"feather icon-aperture rotate-refresh\"></i></span>\n");
      out.write("                                            <span class=\"pcoded-mtext\">Sliders List</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <li class=\" \">\n");
      out.write("                                        <a href=\"sticky.htm\">\n");
      out.write("                                            <span class=\"pcoded-micon\"><i class=\"feather icon-aperture rotate-refresh\"></i></span>\n");
      out.write("                                            <span class=\"pcoded-mtext\">Customers List</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\" \">\n");
      out.write("                                        <a href=\"sticky.htm\">\n");
      out.write("                                            <span class=\"pcoded-micon\"><i class=\"feather icon-cpu\"></i></span>\n");
      out.write("                                            <span class=\"pcoded-mtext\">Feedbacks List</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"pcoded-navigatio-lavel\">Receptionist</div>\n");
      out.write("                                <ul class=\"pcoded-item pcoded-left-item\">\n");
      out.write("\n");
      out.write("                                    <li class=\" \">\n");
      out.write("                                        <a href=\"form-picker.htm\">\n");
      out.write("                                            <span class=\"pcoded-micon\"><i class=\"feather icon-edit-1\"></i></span>\n");
      out.write("                                            <span class=\"pcoded-mtext\">Reservations List</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"pcoded-navigatio-lavel\">Doctors</div>\n");
      out.write("                                <ul class=\"pcoded-item pcoded-left-item\">\n");
      out.write("                                    <li class=\"\">\n");
      out.write("                                        <a href=\"editable-table.htm\">\n");
      out.write("                                            <span class=\"pcoded-micon\"><i class=\"feather icon-edit\"></i></span>\n");
      out.write("                                            <span class=\"pcoded-mtext\">Medical Examination</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                        <div class=\"pcoded-content\">\n");
      out.write("                            <div class=\"pcoded-inner-content\">\n");
      out.write("                                <!-- Main-body start -->\n");
      out.write("                                <div class=\"main-body\">\n");
      out.write("                                    <div class=\"page-wrapper\">\n");
      out.write("                                        <!-- Page-header start -->\n");
      out.write("                                        <div class=\"page-header\">\n");
      out.write("                                            <div class=\"row align-items-end\">\n");
      out.write("                                                <div class=\"col-lg-8\">\n");
      out.write("                                                    <div class=\"page-header-title\">\n");
      out.write("                                                        <div class=\"d-inline\">\n");
      out.write("                                                            <h4>Customers List</h4>\n");
      out.write("                                                            <span>For manager</span>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-lg-4\">\n");
      out.write("                                                    <div class=\"page-header-breadcrumb\">\n");
      out.write("                                                        <ul class=\"breadcrumb-title\">\n");
      out.write("                                                            <li class=\"breadcrumb-item\">\n");
      out.write("                                                                <a href=\"#\"> <i class=\"feather icon-home\"></i> </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li class=\"breadcrumb-item\"><a href=\"#!\">Customers List</a>\n");
      out.write("                                                            </li>\n");
      out.write("\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- Page-header end -->\n");
      out.write("\n");
      out.write("                                        <div class=\"page-body\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-12\">\n");
      out.write("                                                    <!-- Individual Column Searching (Text Inputs) start -->\n");
      out.write("                                                    <div class=\"card\">\n");
      out.write("                                                        <div class=\"card-header\">\n");
      out.write("                                                            <h5>Filter Customers</h5>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <div class=\"card-block\">\n");
      out.write("                                                            <form action=\"customerslist\" method=\"post\">\n");
      out.write("                                                                <div class=\"row\">\n");
      out.write("                                                                    <div class=\"col-sm-12 col-xl-2 m-b-30\">\n");
      out.write("                                                                        <h4 class=\"sub-title\">Gender</h4>\n");
      out.write("                                                                        <select name=\"gender\" class=\"form-control\">\n");
      out.write("                                                                            <option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.gender eq \"both\")?\"selected=\\\"selected\\\"\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"both\">Choose gender</option>\n");
      out.write("                                                                            <option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.gender eq \"male\")?\"selected=\\\"selected\\\"\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"male\">Male</option>\n");
      out.write("                                                                            <option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.gender eq \"female\")?\"selected=\\\"selected\\\"\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"female\">Female</option>\n");
      out.write("                                                                        </select>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"col-sm-12 col-xl-2 m-b-30\">\n");
      out.write("                                                                        <h4 class=\"sub-title\">Status</h4>\n");
      out.write("                                                                        <select name=\"status\" class=\"form-control\">\n");
      out.write("                                                                            <option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.status eq \"both\")?\"selected=\\\"selected\\\"\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"both\">Choose status</option>\n");
      out.write("                                                                            <option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.status eq \"on\")?\"selected=\\\"selected\\\"\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"on\">On</option>\n");
      out.write("                                                                            <option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.status eq \"off\")?\"selected=\\\"selected\\\"\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"off\">Off</option>\n");
      out.write("                                                                        </select>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"col-sm-12 col-xl-2 m-b-30\">\n");
      out.write("                                                                        <h4 class=\"sub-title\">Submit</h4>\n");
      out.write("                                                                        <input type=\"submit\" class=\"btn btn-primary waves-effect waves-light\" value=\"Submit\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </form>\n");
      out.write("\n");
      out.write("                                                            <a href=\"addcustomer\" class=\"btn btn-primary\">Create New Customer</a>\n");
      out.write("                                                            <h4 class=\"sub-title\"></h4>\n");
      out.write("\n");
      out.write("                                                            <div class=\"dt-responsive table-responsive\">\n");
      out.write("                                                                <table id=\"footer-search\" class=\"table table-striped table-bordered nowrap\">\n");
      out.write("                                                                    <thead>\n");
      out.write("                                                                        <tr>\n");
      out.write("                                                                            <th>Full Name</th>\n");
      out.write("                                                                            <th>Photo</th>\n");
      out.write("                                                                            <th>Gender</th>\n");
      out.write("                                                                            <th>Dob</th>\n");
      out.write("                                                                            <th>Email</th>\n");
      out.write("                                                                            <th>Phone</th>\n");
      out.write("                                                                            <th>Address</th>\n");
      out.write("                                                                            <th>Status</th>\n");
      out.write("                                                                            <th></th>\n");
      out.write("                                                                        </tr>\n");
      out.write("                                                                    </thead>\n");
      out.write("                                                                    <tbody>\n");
      out.write("                                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                                    </tbody>\n");
      out.write("                                                                    <tfoot>\n");
      out.write("                                                                        <tr>\n");
      out.write("                                                                            <th>Full Name</th>\n");
      out.write("                                                                            <td></td>\n");
      out.write("                                                                            <td></td>\n");
      out.write("                                                                            <th>Dob</th>\n");
      out.write("                                                                            <th>Email</th>\n");
      out.write("                                                                            <th>Phone</th>\n");
      out.write("                                                                            <th>Address</th>\n");
      out.write("                                                                            <td></td>\n");
      out.write("                                                                            <td></td>\n");
      out.write("                                                                        </tr>\n");
      out.write("                                                                    </tfoot>\n");
      out.write("                                                                </table>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <!-- Individual Column Searching (Text Inputs) end -->\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"styleSelector\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Required Jquery -->\n");
      out.write("        <script type=\"text/javascript\" src=\"..\\frontend\\assert\\libAdmin\\bower_components\\jquery\\js\\jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"..\\frontend\\assert\\libAdmin\\bower_components\\jquery-ui\\js\\jquery-ui.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"..\\frontend\\assert\\libAdmin\\bower_components\\popper.js\\js\\popper.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"..\\frontend\\assert\\libAdmin\\bower_components\\bootstrap\\js\\bootstrap.min.js\"></script>\n");
      out.write("        <!-- jquery slimscroll js -->\n");
      out.write("        <script type=\"text/javascript\" src=\"..\\frontend\\assert\\libAdmin\\bower_components\\jquery-slimscroll\\js\\jquery.slimscroll.js\"></script>\n");
      out.write("        <!-- modernizr js -->\n");
      out.write("        <script type=\"text/javascript\" src=\"..\\frontend\\assert\\libAdmin\\bower_components\\modernizr\\js\\modernizr.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"..\\frontend\\assert\\libAdmin\\bower_components\\modernizr\\js\\css-scrollbars.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- data-table js -->\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\bower_components\\datatables.net\\js\\jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\bower_components\\datatables.net-buttons\\js\\dataTables.buttons.min.js\"></script>\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\assets\\pages\\data-table\\js\\jszip.min.js\"></script>\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\assets\\pages\\data-table\\js\\pdfmake.min.js\"></script>\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\assets\\pages\\data-table\\js\\vfs_fonts.js\"></script>\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\bower_components\\datatables.net-buttons\\js\\buttons.print.min.js\"></script>\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\bower_components\\datatables.net-buttons\\js\\buttons.html5.min.js\"></script>\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\bower_components\\datatables.net-bs4\\js\\dataTables.bootstrap4.min.js\"></script>\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\bower_components\\datatables.net-responsive\\js\\dataTables.responsive.min.js\"></script>\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\bower_components\\datatables.net-responsive-bs4\\js\\responsive.bootstrap4.min.js\"></script>\n");
      out.write("        <!-- i18next.min.js -->\n");
      out.write("        <script type=\"text/javascript\" src=\"..\\frontend\\assert\\libAdmin\\bower_components\\i18next\\js\\i18next.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"..\\frontend\\assert\\libAdmin\\bower_components\\i18next-xhr-backend\\js\\i18nextXHRBackend.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"..\\frontend\\assert\\libAdmin\\bower_components\\i18next-browser-languagedetector\\js\\i18nextBrowserLanguageDetector.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"..\\frontend\\assert\\libAdmin\\bower_components\\jquery-i18next\\js\\jquery-i18next.min.js\"></script>\n");
      out.write("        <!-- Custom js -->\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\assets\\pages\\data-table\\js\\data-table-custom.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\assets\\js\\pcoded.min.js\"></script>\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\assets\\js\\vartical-layout.min.js\"></script>\n");
      out.write("        <script src=\"..\\frontend\\assert\\libAdmin\\assets\\js\\jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"..\\frontend\\assert\\libAdmin\\assets\\js\\script.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Global site tag (gtag.js) - Google Analytics -->\n");
      out.write("        <script async=\"\" src=\"https://www.googletagmanager.com/gtag/js?id=UA-23581568-13\"></script>\n");
      out.write("        <script>\n");
      out.write("                                                                                        window.dataLayer = window.dataLayer || [];\n");
      out.write("                                                                                        function gtag() {\n");
      out.write("                                                                                            dataLayer.push(arguments);\n");
      out.write("                                                                                        }\n");
      out.write("                                                                                        gtag('js', new Date());\n");
      out.write("\n");
      out.write("                                                                                        gtag('config', 'UA-23581568-13');\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function deletePost(id)\n");
      out.write("            {\n");
      out.write("                var result = confirm(\"Are you sure?\");\n");
      out.write("                if (result)\n");
      out.write("                {\n");
      out.write("                    window.location.href = \"deletepost?id=\" + id;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listCustomer}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                            <tr>\n");
          out.write("                                                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                                                <td><img src=\"../");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 70px\"></td>\n");
          out.write("                                                                                <td>\n");
          out.write("                                                                                    ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                                                    ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                                                </td>\n");
          out.write("                                                                                <td>");
          if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                                                <td>\n");
          out.write("                                                                                    ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                                                    ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("    \n");
          out.write("                                                                                </td>\n");
          out.write("                                                                                <td><a href=\"customerdetails?email=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">View - </a> \n");
          out.write("                                                                                    <a href=\"editcustomer?email=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a> \n");
          out.write("                                                                                </td>\n");
          out.write("                                                                            </tr>\n");
          out.write("                                                                        ");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.gender eq true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Male");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.gender eq false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Female");
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

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_0.setType("date");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.dob}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.status eq true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('O');
        out.write('n');
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.status eq false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Off");
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
