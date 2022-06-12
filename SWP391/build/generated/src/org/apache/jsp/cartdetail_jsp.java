package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cartdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.release();
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
      out.write("<html id=\"content\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Cart details</title>\r\n");
      out.write("        <!--CSS-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylecartdetails.css\" />\r\n");
      out.write("        <!--font-awesome-->\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/3c84cb624f.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!--Ajax-->\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("  <!--set default 100000 ship fee-->\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container-lg mb-5\" >\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-3\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-9\" >\r\n");
      out.write("                        <div class=\"p-3 bg-white rounded shadow-sm mb-3\">\r\n");
      out.write("                            <div class=\"text-center\">\r\n");
      out.write("                                <h3 class=\"pb-3 text-uppercase font-weight-bold\">My Cart</h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Shopping cart table -->\r\n");
      out.write("                            <table class=\"table table-hover\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr class=\"text-center\">\r\n");
      out.write("                                        \r\n");
      out.write("                                        <th>ID</th>\r\n");
      out.write("                                        <th>Product</th>\r\n");
      out.write("                                        <th>Price</th>\r\n");
      out.write("                                        <th>Quantity</th>\r\n");
      out.write("                                        <th>Sub total</th>\r\n");
      out.write("                                        <th></th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody class=\"table-group-divider\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                <!--</div>-->\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                        <!-- End -->\r\n");
      out.write("                        <section class=\"home-sp\">\r\n");
      out.write("                             <div class=\"_1uP-hs freeship-item\">\r\n");
      out.write("        <svg height=\"12\" viewBox=\"0 0 20 12\" width=\"20\" class=\"shopee-svg-icon _140gEP icon-free-shipping\">\r\n");
      out.write("\r\n");
      out.write("            <g fill=\"none\" fill-rule=\"evenodd\" transform=\"\">\r\n");
      out.write("\r\n");
      out.write("                <rect fill=\"#00bfa5\" fill-rule=\"evenodd\" height=\"9\" rx=\"1\" width=\"12\" x=\"4\">\r\n");
      out.write("                </rect>\r\n");
      out.write("                <rect height=\"8\" rx=\"1\" stroke=\"#00bfa5\" width=\"11\" x=\"4.5\" y=\".5\">\r\n");
      out.write("                </rect>\r\n");
      out.write("                <rect fill=\"#00bfa5\" fill-rule=\"evenodd\" height=\"7\" rx=\"1\" width=\"7\" x=\"13\" y=\"2\">\r\n");
      out.write("                </rect>\r\n");
      out.write("                <rect height=\"6\" rx=\"1\" stroke=\"#00bfa5\" width=\"6\" x=\"13.5\" y=\"2.5\">\r\n");
      out.write("                </rect>\r\n");
      out.write("                <circle cx=\"8\" cy=\"10\" fill=\"#00bfa5\" r=\"2\">\r\n");
      out.write("                </circle>\r\n");
      out.write("                <circle cx=\"15\" cy=\"10\" fill=\"#00bfa5\" r=\"2\">\r\n");
      out.write("                </circle>\r\n");
      out.write("                <path\r\n");
      out.write("                    d=\"m6.7082481 6.7999878h-.7082481v-4.2275391h2.8488017v.5976563h-2.1405536v1.2978515h1.9603297v.5800782h-1.9603297zm2.6762505 0v-3.1904297h.6544972v.4892578h.0505892c.0980164-.3134765.4774351-.5419922.9264138-.5419922.0980165 0 .2276512.0087891.3003731.0263672v.6210938c-.053751-.0175782-.2624312-.038086-.3762568-.038086-.5122152 0-.8758247.3017578-.8758247.75v1.8837891zm3.608988-2.7158203c-.5027297 0-.8536919.328125-.8916338.8261719h1.7390022c-.0158092-.5009766-.3446386-.8261719-.8473684-.8261719zm.8442065 1.8544922h.6544972c-.1549293.571289-.7050863.9228515-1.49238.9228515-.9864885 0-1.5903965-.6269531-1.5903965-1.6464843 0-1.0195313.6165553-1.6669922 1.5872347-1.6669922.9580321 0 1.5366455.6064453 1.5366455 1.6083984v.2197266h-2.4314412v.0351562c.0221328.5595703.373095.9140625.9169284.9140625.4110369 0 .6924391-.1376953.8189119-.3867187zm2.6224996-1.8544922c-.5027297 0-.853692.328125-.8916339.8261719h1.7390022c-.0158091-.5009766-.3446386-.8261719-.8473683-.8261719zm.8442064 1.8544922h.6544972c-.1549293.571289-.7050863.9228515-1.49238.9228515-.9864885 0-1.5903965-.6269531-1.5903965-1.6464843 0-1.0195313.6165553-1.6669922 1.5872347-1.6669922.9580321 0 1.5366455.6064453 1.5366455 1.6083984v.2197266h-2.4314412v.0351562c.0221328.5595703.373095.9140625.9169284.9140625.4110369 0 .6924391-.1376953.8189119-.3867187z\"\r\n");
      out.write("                    fill=\"#fff\">\r\n");
      out.write("                </path>\r\n");
      out.write("                <path d=\"m .5 8.5h3.5v1h-3.5z\" fill=\"#00bfa5\">\r\n");
      out.write("                </path>\r\n");
      out.write("                <path d=\"m0 10.15674h3.5v1h-3.5z\" fill=\"#00bfa5\">\r\n");
      out.write("                </path>\r\n");
      out.write("                <circle cx=\"8\" cy=\"10\" fill=\"#047565\" r=\"1\">\r\n");
      out.write("                </circle>\r\n");
      out.write("                <circle cx=\"15\" cy=\"10\" fill=\"#047565\" r=\"1\">\r\n");
      out.write("                </circle>\r\n");
      out.write("            </g>\r\n");
      out.write("        </svg>\r\n");
      out.write("\r\n");
      out.write("        <span class=\"_1UxmZa\">\r\n");
      out.write("           Buy orders over 1.000.000đ to get free shipping\r\n");
      out.write("        </span>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("                        </section>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"p-3 bg-white rounded shadow-sm\">\r\n");
      out.write("                        <div class=\"text-center\">\r\n");
      out.write("                            <h3 class=\"pb-3 text-uppercase font-weight-bold\">Cart detail</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"p-4\">\r\n");
      out.write("                            <ul class=\"list-unstyled mb-4\">\r\n");
      out.write("                                <li class=\"d-flex justify-content-between py-3 border-bottom\"><b class=\"text-muted\" >Sub total</b>\r\n");
      out.write("                                    <h5 class=\"font-weight-bold\" id=\"subtotal-final\" style=\"color: red;\">");
      if (_jspx_meth_fmt_formatNumber_4(_jspx_page_context))
        return;
      out.write("</h5>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"d-flex justify-content-between py-3 border-bottom\">\r\n");
      out.write("                                    <b class=\"text-muted\">Shipping fee</b>\r\n");
      out.write("                                        \r\n");
      out.write("                                            <b class=\"ship-item\">Free ship</b>\r\n");
      out.write("                                       \r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                <input hidden value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${freight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"freight\"  class=\"freight\">\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"d-flex justify-content-between py-3 border-bottom\"><b class=\"text-muted\">Total</b>\r\n");
      out.write("                                    <h5 class=\"font-weight-bold\" id=\"total-final\" style=\"color: red;\">");
      if (_jspx_meth_fmt_formatNumber_5(_jspx_page_context))
        return;
      out.write("</h5>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <div class=\"d-flex justify-content-end\">\r\n");
      out.write("                                    <!--Disable order now function when cart empty-->\r\n");
      out.write("                                <a href=\"productslist\" class=\"btn\">Click to continue shopping</a>\r\n");
      out.write("                                   ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                   ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"js/script.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("    <script src=\"https://unpkg.com/@popperjs/core@2\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle=\"tooltip\"]')\r\n");
      out.write("        const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl))\r\n");
      out.write("    </script>\r\n");
      out.write("    <script>\r\n");
      out.write("     function UpdateSubTotal(e,quantity){\r\n");
      out.write("         var total=0;\r\n");
      out.write("         var dollarUSLocale = Intl.NumberFormat('en-US');\r\n");
      out.write("         var fprice=e.childNodes[5];\r\n");
      out.write("         var fsub=e.childNodes[11];\r\n");
      out.write("         var price=fprice.getElementsByTagName('input')[0].getAttribute('value');\r\n");
      out.write("         var subtotal=fsub.childNodes[1];\r\n");
      out.write("         subtotal.innerHTML=dollarUSLocale.format(price*quantity) +\" đ\";\r\n");
      out.write("            upDateTotal();\r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write("      // update total after add/remove item\r\n");
      out.write(" function upDateTotal(){\r\n");
      out.write("     var total=0;\r\n");
      out.write("     var freight=100000;\r\n");
      out.write("        for (var i = 0; i < document.querySelectorAll(\"#items\").length; i++) {\r\n");
      out.write("                var row=document.querySelectorAll(\"#items\")[i]\r\n");
      out.write("                    subprice=row.getElementsByTagName('input')[0].getAttribute('value');//sub price\r\n");
      out.write("                    subquantity=row.getElementsByClassName('quantity')[0].innerHTML; // sub quantity\r\n");
      out.write("                total=total+subprice*subquantity;\r\n");
      out.write("        }\r\n");
      out.write("        var dollarUSLocale = Intl.NumberFormat('en-US');\r\n");
      out.write("         var freight=document.getElementsByClassName(\"ship-item\");\r\n");
      out.write("        var total_final=document.getElementById(\"total-final\");\r\n");
      out.write("        var subtotal_final=document.getElementById(\"subtotal-final\");\r\n");
      out.write("        \r\n");
      out.write("        if(subtotal_final>=1000000) {//order than 1000.000 --> free ship\r\n");
      out.write("        subtotal_final.innerHTML=dollarUSLocale.format(total)+\" đ\";\r\n");
      out.write("        total_final.innerHTML=dollarUSLocale.format(total)+\" đ\";\r\n");
      out.write("         freigh\r\n");
      out.write("          }\r\n");
      out.write("        else{\r\n");
      out.write("            subtotal_final.innerHTML=dollarUSLocale.format(total)+\" đ\";\r\n");
      out.write("          total_final.innerHTML=dollarUSLocale.format(total-freight)+\" đ\";\r\n");
      out.write("        }\r\n");
      out.write(" }\r\n");
      out.write("        // Cart details script\r\n");
      out.write("function Down(e,productID){\r\n");
      out.write("   \r\n");
      out.write("    $.ajax({\r\n");
      out.write("    \"type\": \"GET\",\r\n");
      out.write("    // generate the request url from the query.\r\n");
      out.write("    // escape the query string to avoid errors caused by special characters \r\n");
      out.write("    \"url\": \"/swp/process\",\r\n");
      out.write("    \"data\": {\r\n");
      out.write("              num : -1\r\n");
      out.write("              ,id:productID\r\n");
      out.write("            },\r\n");
      out.write("            \r\n");
      out.write("    \"success\": function(data) {\r\n");
      out.write("        var row=document.getElementById(\"content\");\r\n");
      out.write("//        row.innerHTML=\"\";\r\n");
      out.write("//        row.innerHTML=data\r\n");
      out.write("        console.log(\"normal  successful\");\r\n");
      out.write("\r\n");
      out.write("    },\r\n");
      out.write("    \"error\": function(errorData) {\r\n");
      out.write("        console.log(\"lookup ajax error\")\r\n");
      out.write("        console.log(errorData)\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write(" var fe=e.parentElement;\r\n");
      out.write("  var parent=e.parentElement.parentElement.parentElement.parentElement; //get tr\r\n");
      out.write("    var quantity=fe.childNodes[3];\r\n");
      out.write("    var error=fe.childNodes[7];\r\n");
      out.write("    error.style='display:none';\r\n");
      out.write("    var old_quantity=quantity.innerHTML;\r\n");
      out.write("    if(quantity.innerHTML=='1'){\r\n");
      out.write("        parent.remove();\r\n");
      out.write("        upDateTotal();\r\n");
      out.write("    }else{\r\n");
      out.write("    quantity.innerHTML=old_quantity-'1';\r\n");
      out.write("    UpdateSubTotal(parent,quantity.innerHTML);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("function Up(e,productID,max){\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    $.ajax({\r\n");
      out.write("    \"type\": \"GET\",\r\n");
      out.write("    // generate the request url from the query.\r\n");
      out.write("    // escape the query string to avoid errors caused by special characters \r\n");
      out.write("    \"url\": \"/swp/process\",\r\n");
      out.write("    \"data\": {\r\n");
      out.write("              num : 1\r\n");
      out.write("              ,id:productID\r\n");
      out.write("            },\r\n");
      out.write("            \r\n");
      out.write("    \"success\": function(data) {\r\n");
      out.write("        var row=document.getElementById(\"content\");\r\n");
      out.write("//        row.innerHTML=data;\r\n");
      out.write("\r\n");
      out.write("    },\r\n");
      out.write("    \"error\": function(errorData) {\r\n");
      out.write("        console.log(\"lookup ajax error\")\r\n");
      out.write("        console.log(errorData)\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("       \r\n");
      out.write("     var parent=e.parentElement.parentElement.parentElement.parentElement; //get tr\r\n");
      out.write("     var fe=e.parentElement;\r\n");
      out.write("    var quantity=fe.childNodes[3];\r\n");
      out.write("    var error=fe.childNodes[7];\r\n");
      out.write("    var old_quantity=quantity.innerHTML;\r\n");
      out.write("    console.log()\r\n");
      out.write("    if(old_quantity>=max){\r\n");
      out.write("        error.style='display:block';\r\n");
      out.write("    }else{\r\n");
      out.write("        quantity.innerHTML=old_quantity-'-1';\r\n");
      out.write("    }\r\n");
      out.write("     UpdateSubTotal(parent,quantity.innerHTML);\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("function Delete(e,productID){\r\n");
      out.write("  \r\n");
      out.write("   parent=e.parentElement.parentElement;\r\n");
      out.write("     parent.remove();\r\n");
      out.write("     upDateTotal();\r\n");
      out.write("    $.ajax({\r\n");
      out.write("    \"type\": \"post\",\r\n");
      out.write("    // generate the request url from the query.\r\n");
      out.write("    // escape the query string to avoid errors caused by special characters \r\n");
      out.write("    \"url\": \"/swp/process\",\r\n");
      out.write("    \"data\": {\r\n");
      out.write("              id:productID\r\n");
      out.write("            },\r\n");
      out.write("            \r\n");
      out.write("    \"success\": function(data) {\r\n");
      out.write("//        var row=document.getElementById(\"content\");\r\n");
      out.write("//        row.innerHTML=data;\r\n");
      out.write("\r\n");
      out.write("    },\r\n");
      out.write("    \"error\": function(errorData) {\r\n");
      out.write("        console.log(\"lookup ajax error\")\r\n");
      out.write("        console.log(errorData)\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("}\r\n");
      out.write("    </script>\r\n");
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
    _jspx_th_c_set_1.setVar("freight");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${100000}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    \r\n");
          out.write("                                    <tr style=\"height: 100px\" id=\"items\">\r\n");
          out.write("                                        <td class=\"align-middle\">\r\n");
          out.write("                                            <p class=\"mb-0 product-id-cart-contact\">\r\n");
          out.write("                                                 ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                            </p>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td class=\"align-middle\" style=\"width: 30%\">\r\n");
          out.write("                                            <div class=\"row\">\r\n");
          out.write("                                                <div class=\"col-5 my-auto\">\r\n");
          out.write("                                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" class=\"img-fluid rounded\" style=\"cursor: pointer\"/>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                    <a href=\"product?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"text-decoration-none text-muted col\" style=\"align-self: center\">\r\n");
          out.write("                                                    <b class=\"product-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.briefInfor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>\r\n");
          out.write("                                                </a>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td class=\"align-middle\" id=\"price-items\">\r\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                            <b class=\"d-flex justify-content-center\" >\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                            </b>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td class=\"align-middle\">\r\n");
          out.write("                                            <div class=\"d-flex justify-content-center\">\r\n");
          out.write("                                                <div class=\"change-item\">\r\n");
          out.write("                                                    <a class=\"btn btn-outline-success\" id=\"down\" onclick=\"Down(this,'");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\"\r\n");
          out.write("                                                       >-</a>\r\n");
          out.write("                                                <b id=\"quantity\" class=\"quantity\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>\r\n");
          out.write("                                                <a class=\"btn btn-outline-success\" id=\"up\"\r\n");
          out.write("                                                       onclick=\"Up(this,'");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('\'');
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.unit_in_stock}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\"\r\n");
          out.write("                                                       \r\n");
          out.write("                                                      >+</a>\r\n");
          out.write("                                                    <div class=\"addmore-item\">\r\n");
          out.write("                                                        <span id=\"error\" style=\"color: red\">\r\n");
          out.write("                                                            You got maximum product\r\n");
          out.write("                                                        </span>\r\n");
          out.write("                                                        \r\n");
          out.write("                                                    </div>  \r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <!--format number of price-->\r\n");
          out.write("                                        <td class=\"align-middle\" >\r\n");
          out.write("                                            \r\n");
          out.write("                                            <b class=\"d-flex justify-content-center\"  style=\"color: red;\">\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                            </b> \r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td class=\"align-middle\">\r\n");
          out.write("                                           \r\n");
          out.write("                                        <button id=\"delete\" type=\"button\" onclick=\"Delete(this,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\" class=\"btn btn-danger\">Delete</button>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" <input type=\"hidden\" id=\"price\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" <input type=\"hidden\" id=\"price\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.original_price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
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

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_0.setType("currency");
    _jspx_th_fmt_formatNumber_0.setCurrencySymbol("đ");
    _jspx_th_fmt_formatNumber_0.setMaxFractionDigits(0);
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_0);
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_formatNumber_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
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

  private boolean _jspx_meth_fmt_formatNumber_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.original_price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_1.setType("currency");
    _jspx_th_fmt_formatNumber_1.setCurrencySymbol("đ");
    _jspx_th_fmt_formatNumber_1.setMaxFractionDigits(0);
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_formatNumber_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
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

  private boolean _jspx_meth_fmt_formatNumber_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_fmt_formatNumber_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price*i.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_2.setType("currency");
    _jspx_th_fmt_formatNumber_2.setCurrencySymbol("đ");
    _jspx_th_fmt_formatNumber_2.setMaxFractionDigits(0);
    int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
    if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_2);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.sale_price == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_formatNumber_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
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

  private boolean _jspx_meth_fmt_formatNumber_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_fmt_formatNumber_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.original_price*i.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_3.setType("currency");
    _jspx_th_fmt_formatNumber_3.setCurrencySymbol("đ");
    _jspx_th_fmt_formatNumber_3.setMaxFractionDigits(0);
    int _jspx_eval_fmt_formatNumber_3 = _jspx_th_fmt_formatNumber_3.doStartTag();
    if (_jspx_th_fmt_formatNumber_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_3);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_3);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_4.setParent(null);
    _jspx_th_fmt_formatNumber_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.totalMoney}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_4.setType("currency");
    _jspx_th_fmt_formatNumber_4.setCurrencySymbol("đ");
    _jspx_th_fmt_formatNumber_4.setMaxFractionDigits(0);
    int _jspx_eval_fmt_formatNumber_4 = _jspx_th_fmt_formatNumber_4.doStartTag();
    if (_jspx_th_fmt_formatNumber_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_4);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_4);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.totalMoney<1000000}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <b class=\"ship-item\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${freight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("đ</b>\r\n");
        out.write("                                        ");
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

  private boolean _jspx_meth_fmt_formatNumber_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_5 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_5.setParent(null);
    _jspx_th_fmt_formatNumber_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.totalMoney-freight}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_5.setType("currency");
    _jspx_th_fmt_formatNumber_5.setCurrencySymbol("đ");
    _jspx_th_fmt_formatNumber_5.setMaxFractionDigits(0);
    int _jspx_eval_fmt_formatNumber_5 = _jspx_th_fmt_formatNumber_5.doStartTag();
    if (_jspx_th_fmt_formatNumber_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_5);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_5);
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
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cart.items.size()!=0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <a href=\"checkout\" class=\"btn btn-outline-primary ms-3\">Order Now</a>\r\n");
        out.write("                                   ");
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
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cart.items.size()==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <button class=\"btn btn-outline-primary ms-3\" disabled>Order Now</button>\r\n");
        out.write("                                   ");
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
}
