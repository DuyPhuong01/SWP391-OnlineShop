package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class postlist1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Post_List</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <!--CSS-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/post_list.css\"/>\n");
      out.write("          <!--font-awesome-->\n");
      out.write("        <script src=\"https://kit.fontawesome.com/3c84cb624f.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row container\">\n");
      out.write("            <div class=\"row col-3\">\n");
      out.write("                ");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("                   <!--content--> \n");
      out.write("            <div class=\"col-9\">\n");
      out.write("                                        <!-- header  -->\n");
      out.write("                       <div data-v-b2f6143e=\"\" data-v-75520c46=\"\" id=\"product-filter-card\" class=\"product-filter-card\">\n");
      out.write("                           <form data-v-b2f6143e=\"\" autocomplete=\"off\" class=\"shopee-form filter-form shopee-form--label-right\">\n");
      out.write("                               <div data-v-b2f6143e=\"\" class=\"filter-form-box\">\n");
      out.write("                                   <div data-v-b2f6143e=\"\" class=\"filter-col-left\">\n");
      out.write("                                       <div data-v-b2f6143e=\"\" class=\"product shopee-form-item\"><label\n");
      out.write("                                               class=\"shopee-form-item__label empty\">\n");
      out.write("                                               <!---->\n");
      out.write("                                           </label>\n");
      out.write("                                           <div class=\"shopee-form-item__control\">\n");
      out.write("                                               <div class=\"shopee-form-item__content\">\n");
      out.write("                                                   <div data-v-b2f6143e=\"\" class=\"shopee-input-group\"><span\n");
      out.write("                                                           class=\"shopee-input-group__prepend\" style=\"width: 152px;\">\n");
      out.write("                                                           <div data-v-b2f6143e=\"\" class=\"shopee-select\">\n");
      out.write("                                                               <div data-v-2449cb06=\"\" tabindex=\"0\"\n");
      out.write("                                                                   class=\"shopee-selector shopee-selector--normal\">\n");
      out.write("                                                                   <!---->\n");
      out.write("                                                                   <div data-v-2449cb06=\"\" class=\"shopee-selector__inner line-clamp--1\">Tên\n");
      out.write("                                                                       sản phẩm\n");
      out.write("\n");
      out.write("                                                                   </div>\n");
      out.write("                                                                   <div data-v-2449cb06=\"\" class=\"shopee-selector__suffix\">\n");
      out.write("                                                                       <!----> <i data-v-2449cb06=\"\"\n");
      out.write("                                                                           class=\"shopee-selector__suffix-icon shopee-icon\"><svg\n");
      out.write("                                                                               xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 16 16\">\n");
      out.write("                                                                               <path\n");
      out.write("                                                                                   d=\"M8,9.18933983 L4.03033009,5.21966991 C3.73743687,4.9267767 3.26256313,4.9267767 2.96966991,5.21966991 C2.6767767,5.51256313 2.6767767,5.98743687 2.96966991,6.28033009 L7.46966991,10.7803301 C7.76256313,11.0732233 8.23743687,11.0732233 8.53033009,10.7803301 L13.0303301,6.28033009 C13.3232233,5.98743687 13.3232233,5.51256313 13.0303301,5.21966991 C12.7374369,4.9267767 12.2625631,4.9267767 11.9696699,5.21966991 L8,9.18933983 Z\">\n");
      out.write("\n");
      out.write("                                                                               </path>\n");
      out.write("                                                                           </svg>\n");
      out.write("                                                                       </i>\n");
      out.write("                                                                   </div>\n");
      out.write("                                                               </div>\n");
      out.write("                                                               <div class=\"shopee-popper\" style=\"display: none;\">\n");
      out.write("                                                                   <!---->\n");
      out.write("                                                                   <div class=\"shopee-select__menu\"\n");
      out.write("                                                                       style=\"max-width: 440px; max-height: 218px;\">\n");
      out.write("                                                                       <div class=\"shopee-scrollbar\">\n");
      out.write("                                                                           <div class=\"shopee-scrollbar__wrapper\">\n");
      out.write("                                                                               <div data-v-2449cb06=\"\"\n");
      out.write("                                                                                   class=\"shopee-scrollbar__bar vertical\">\n");
      out.write("                                                                                   <div data-v-2449cb06=\"\" class=\"shopee-scrollbar__thumb\"\n");
      out.write("                                                                                       style=\"top: 0px; height: 0px;\">\n");
      out.write("                                                                                   </div>\n");
      out.write("                                                                               </div>\n");
      out.write("                                                                               <!---->\n");
      out.write("                                                                               <div class=\"shopee-scrollbar__content\"\n");
      out.write("                                                                                   style=\"position: relative;\">\n");
      out.write("                                                                                   <div class=\"shopee-select__options\">\n");
      out.write("                                                                                       <div data-v-b2f6143e=\"\"\n");
      out.write("                                                                                           class=\"shopee-option selected\">\n");
      out.write("                                                                                           Tên sản phẩm\n");
      out.write("                                                                                           <!---->\n");
      out.write("                                                                                       </div>\n");
      out.write("                                                                                       <div data-v-b2f6143e=\"\" class=\"shopee-option\">\n");
      out.write("                                                                                           SKU sản phẩm\n");
      out.write("                                                                                           <!---->\n");
      out.write("                                                                                       </div>\n");
      out.write("                                                                                       <div data-v-b2f6143e=\"\" class=\"shopee-option\">\n");
      out.write("                                                                                           SKU phân loại\n");
      out.write("                                                                                           <!---->\n");
      out.write("                                                                                       </div>\n");
      out.write("                                                                                       <div data-v-b2f6143e=\"\" class=\"shopee-option\">\n");
      out.write("                                                                                           Phân loại hàng\n");
      out.write("                                                                                           <!---->\n");
      out.write("                                                                                       </div>\n");
      out.write("                                                                                       <div data-v-b2f6143e=\"\" class=\"shopee-option\">\n");
      out.write("                                                                                           Mã sản phẩm\n");
      out.write("                                                                                           <!---->\n");
      out.write("                                                                                       </div>\n");
      out.write("                                                                                   </div>\n");
      out.write("                                                                                   <div class=\"resize-triggers\">\n");
      out.write("                                                                                       <div class=\"expand-trigger\">\n");
      out.write("                                                                                           <div style=\"width: 1px; height: 1px;\">\n");
      out.write("                                                                                           </div>\n");
      out.write("                                                                                       </div>\n");
      out.write("                                                                                       <div class=\"contract-trigger\">\n");
      out.write("\n");
      out.write("                                                                                       </div>\n");
      out.write("                                                                                   </div>\n");
      out.write("                                                                               </div>\n");
      out.write("                                                                           </div>\n");
      out.write("                                                                       </div>\n");
      out.write("                                                                   </div>\n");
      out.write("                                                                   <p class=\"shopee-select__filter-empty\" style=\"display: none;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                   </p>\n");
      out.write("                                                                   <!---->\n");
      out.write("                                                               </div>\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </span> <span class=\"shopee-input-group__append\">\n");
      out.write("                                                           <div data-v-87f4ef20=\"\" data-v-b2f6143e=\"\" class=\"hints-input\">\n");
      out.write("                                                               <div data-v-87f4ef20=\"\" class=\"input-wrapper\">\n");
      out.write("                                                                   <div data-v-87f4ef20=\"\" class=\"shopee-input original-input\">\n");
      out.write("                                                                       <div class=\"shopee-input__inner shopee-input__inner--normal\">\n");
      out.write("                                                                           <!----> <input type=\"text\"\n");
      out.write("                                                                               placeholder=\"Please input at least 2 character\"\n");
      out.write("                                                                               resize=\"vertical\" rows=\"2\" minrows=\"2\"\n");
      out.write("                                                                               restrictiontype=\"input\" max=\"Infinity\" min=\"-Infinity\"\n");
      out.write("                                                                               class=\"shopee-input__input\">\n");
      out.write("                                                                           <!---->\n");
      out.write("                                                                       </div>\n");
      out.write("\n");
      out.write("                                                                   </div>\n");
      out.write("                                                               </div>\n");
      out.write("                                                               <!---->\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </span>\n");
      out.write("                                                       <!---->\n");
      out.write("                                                   </div>\n");
      out.write("                                               </div>\n");
      out.write("                                               <!---->\n");
      out.write("                                               <!---->\n");
      out.write("                                           </div>\n");
      out.write("                                       </div>\n");
      out.write("                                       <div data-v-b2f6143e=\"\" class=\"stock shopee-form-item\"><label for=\"stock\"\n");
      out.write("                                               class=\"shopee-form-item__label empty\">\n");
      out.write("                                               <!---->\n");
      out.write("                                           </label>\n");
      out.write("                                           <div class=\"shopee-form-item__control\">\n");
      out.write("                                               <div class=\"shopee-form-item__content\"><span data-v-b2f6143e=\"\"\n");
      out.write("                                                       style=\"margin-right: 16px;\">Kho hàng\n");
      out.write("                                                   </span>\n");
      out.write("                                                   <div data-v-b2f6143e=\"\" class=\"shopee-form-item__content\">\n");
      out.write("                                                       <div data-v-b2f6143e=\"\"\n");
      out.write("                                                           class=\"shopee-input shopee-number-input shopee-number-input--normal shopee-number-input--no-suffix\">\n");
      out.write("                                                           <div class=\"shopee-input__inner shopee-input__inner--normal\">\n");
      out.write("                                                               <!----> <input type=\"text\" placeholder=\"Min\" resize=\"vertical\" rows=\"2\"\n");
      out.write("                                                                   minrows=\"2\" restrictiontype=\"value\" max=\"Infinity\" min=\"-Infinity\"\n");
      out.write("                                                                   class=\"shopee-input__input\">\n");
      out.write("                                                               <div class=\"shopee-input__suffix\">\n");
      out.write("\n");
      out.write("                                                                   <div class=\"shopee-number-input__controls\">\n");
      out.write("                                                                       <div class=\"shopee-number-input__control up\"><i\n");
      out.write("                                                                               class=\"shopee-icon\"><svg xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                                                                   viewBox=\"0 0 16 16\">\n");
      out.write("                                                                                   <path fill-rule=\"evenodd\"\n");
      out.write("                                                                                       d=\"M7.57253679,6.40074676 L5.1530248,8.66903925 C4.90120463,8.90512066 4.88844585,9.30064304 5.12452726,9.55246321 C5.24268191,9.67849483 5.40773242,9.75 5.58048801,9.75 L10.419512,9.75 C10.76469,9.75 11.044512,9.47017797 11.044512,9.125 C11.044512,8.95224442 10.9730068,8.7871939 10.8469752,8.66903925 L8.42746321,6.40074676 C8.18705183,6.17536109 7.81294817,6.17536109 7.57253679,6.40074676 Z\">\n");
      out.write("\n");
      out.write("                                                                                   </path>\n");
      out.write("                                                                               </svg>\n");
      out.write("                                                                           </i>\n");
      out.write("                                                                       </div>\n");
      out.write("                                                                       <div class=\"shopee-number-input__control down\"><i\n");
      out.write("                                                                               class=\"shopee-icon\"><svg xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                                                                   viewBox=\"0 0 16 16\">\n");
      out.write("                                                                                   <path fill-rule=\"evenodd\"\n");
      out.write("                                                                                       d=\"M7.57253679,9.34925324 L5.1530248,7.08096075 C4.90120463,6.84487934 4.88844585,6.44935696 5.12452726,6.19753679 C5.24268191,6.07150517 5.40773242,6 5.58048801,6 L10.419512,6 C10.76469,6 11.044512,6.27982203 11.044512,6.625 C11.044512,6.79775558 10.9730068,6.9628061 10.8469752,7.08096075 L8.42746321,9.34925324 C8.18705183,9.57463891 7.81294817,9.57463891 7.57253679,9.34925324 Z\">\n");
      out.write("                                                                                   </path>\n");
      out.write("                                                                               </svg>\n");
      out.write("                                                                           </i>\n");
      out.write("                                                                       </div>\n");
      out.write("                                                                   </div>\n");
      out.write("                                                                   <!---->\n");
      out.write("                                                               </div>\n");
      out.write("                                                           </div>\n");
      out.write("\n");
      out.write("                                                       </div> <span data-v-b2f6143e=\"\" class=\"interim-line\">\n");
      out.write("\n");
      out.write("                                                       </span>\n");
      out.write("                                                       <div data-v-b2f6143e=\"\"\n");
      out.write("                                                           class=\"shopee-input shopee-number-input shopee-number-input--normal shopee-number-input--no-suffix\">\n");
      out.write("                                                           <div class=\"shopee-input__inner shopee-input__inner--normal\">\n");
      out.write("                                                               <!----> <input type=\"text\" placeholder=\"Max\" resize=\"vertical\" rows=\"2\"\n");
      out.write("                                                                   minrows=\"2\" restrictiontype=\"value\" max=\"Infinity\" min=\"-Infinity\"\n");
      out.write("                                                                   class=\"shopee-input__input\">\n");
      out.write("                                                               <div class=\"shopee-input__suffix\">\n");
      out.write("\n");
      out.write("                                                                   <div class=\"shopee-number-input__controls\">\n");
      out.write("                                                                       <div class=\"shopee-number-input__control up\"><i\n");
      out.write("                                                                               class=\"shopee-icon\"><svg xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                                                                   viewBox=\"0 0 16 16\">\n");
      out.write("                                                                                   <path fill-rule=\"evenodd\"\n");
      out.write("                                                                                       d=\"M7.57253679,6.40074676 L5.1530248,8.66903925 C4.90120463,8.90512066 4.88844585,9.30064304 5.12452726,9.55246321 C5.24268191,9.67849483 5.40773242,9.75 5.58048801,9.75 L10.419512,9.75 C10.76469,9.75 11.044512,9.47017797 11.044512,9.125 C11.044512,8.95224442 10.9730068,8.7871939 10.8469752,8.66903925 L8.42746321,6.40074676 C8.18705183,6.17536109 7.81294817,6.17536109 7.57253679,6.40074676 Z\">\n");
      out.write("\n");
      out.write("                                                                                   </path>\n");
      out.write("                                                                               </svg>\n");
      out.write("                                                                           </i>\n");
      out.write("                                                                       </div>\n");
      out.write("                                                                       <div class=\"shopee-number-input__control down\"><i\n");
      out.write("                                                                               class=\"shopee-icon\"><svg xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                                                                   viewBox=\"0 0 16 16\">\n");
      out.write("                                                                                   <path fill-rule=\"evenodd\"\n");
      out.write("                                                                                       d=\"M7.57253679,9.34925324 L5.1530248,7.08096075 C4.90120463,6.84487934 4.88844585,6.44935696 5.12452726,6.19753679 C5.24268191,6.07150517 5.40773242,6 5.58048801,6 L10.419512,6 C10.76469,6 11.044512,6.27982203 11.044512,6.625 C11.044512,6.79775558 10.9730068,6.9628061 10.8469752,7.08096075 L8.42746321,9.34925324 C8.18705183,9.57463891 7.81294817,9.57463891 7.57253679,9.34925324 Z\">\n");
      out.write("\n");
      out.write("                                                                                   </path>\n");
      out.write("                                                                               </svg>\n");
      out.write("                                                                           </i>\n");
      out.write("                                                                       </div>\n");
      out.write("                                                                   </div>\n");
      out.write("\n");
      out.write("                                                               </div>\n");
      out.write("                                                           </div>\n");
      out.write("\n");
      out.write("                                                       </div>\n");
      out.write("                                                   </div>\n");
      out.write("                                               </div>\n");
      out.write("\n");
      out.write("                                           </div>\n");
      out.write("                                       </div>\n");
      out.write("                                   </div>\n");
      out.write("                                   <div data-v-b2f6143e=\"\" class=\"filter-col-right\">\n");
      out.write("                                       <div data-v-b2f6143e=\"\" class=\"shopee-form-item\"><label class=\"shopee-form-item__label\">\n");
      out.write("                                               <!----> Danh mục\n");
      out.write("                                           </label>\n");
      out.write("                                           <div class=\"shopee-form-item__control\">\n");
      out.write("                                               <div class=\"shopee-form-item__content\">\n");
      out.write("                                                   <div data-v-b2f6143e=\"\" class=\"category-input-wrapper\">\n");
      out.write("                                                       <div data-v-5bb79eae=\"\" data-v-d87484fc=\"\" data-v-b2f6143e=\"\"\n");
      out.write("                                                           class=\"popover-wrap attribute-text\" edit-text=\"Sửa\">\n");
      out.write("                                                           <div data-v-d87484fc=\"\" data-v-5bb79eae=\"\" class=\"category-input\">\n");
      out.write("                                                               <div data-v-d87484fc=\"\" data-v-5bb79eae=\"\"\n");
      out.write("                                                                   class=\"category-name hover-pointer has-btn\"><span data-v-d87484fc=\"\"\n");
      out.write("                                                                       data-v-5bb79eae=\"\" class=\"cat-selected-wrapper\"><span\n");
      out.write("                                                                           data-v-d87484fc=\"\" data-v-5bb79eae=\"\" class=\"placeholder\">Select\n");
      out.write("\n");
      out.write("                                                                       </span>\n");
      out.write("                                                                   </span>\n");
      out.write("                                                               </div> <button data-v-d87484fc=\"\" type=\"button\"\n");
      out.write("                                                                   class=\"edit-btn shopee-button shopee-button--link shopee-button--normal\"\n");
      out.write("                                                                   data-v-5bb79eae=\"\"><i class=\"shopee-icon\"><svg data-name=\"图层 1\"\n");
      out.write("                                                                           xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 1024 1024\">\n");
      out.write("                                                                           <path\n");
      out.write("                                                                               d=\"M988.1 316.06a127.07 127.07 0 0 0-37.5-90.5L798.4 73.36c-49.9-49.9-131.1-49.9-181.1 0l-91.8 91.8-.3.3-.3.3-470.2 470.4a63.47 63.47 0 0 0-18.8 45.2v242.7a64.06 64.06 0 0 0 64 64h242.8a63.47 63.47 0 0 0 45.2-18.8l470.6-470.6 92.1-92.1a127.07 127.07 0 0 0 37.5-90.5zm-842.9 320l402.7-402.7 242.8 242.7-402.8 402.8zm-45.3 288v-242.7l242.7 242.7zm805.5-562.7l-69.5 69.4-242.7-242.7 69.5-69.5a64.22 64.22 0 0 1 90.6 0l152.2 152.2a64.37 64.37 0 0 1-.1 90.6z\"\n");
      out.write("                                                                               data-name=\"Layer 1\">\n");
      out.write("\n");
      out.write("                                                                           </path>\n");
      out.write("                                                                       </svg>\n");
      out.write("                                                                   </i>\n");
      out.write("                                                               </button>\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("                                                   </div>\n");
      out.write("                                               </div>\n");
      out.write("\n");
      out.write("                                           </div>\n");
      out.write("                                       </div>\n");
      out.write("                                       <div data-v-b2f6143e=\"\" class=\"range-input shopee-form-item\"><label for=\"sold\"\n");
      out.write("                                               class=\"shopee-form-item__label\">\n");
      out.write("                                               <!----> Doanh số\n");
      out.write("                                           </label>\n");
      out.write("                                           <div class=\"shopee-form-item__control\">\n");
      out.write("                                               <div class=\"shopee-form-item__content\">\n");
      out.write("                                                   <div data-v-b2f6143e=\"\"\n");
      out.write("                                                       class=\"shopee-input shopee-number-input shopee-number-input--normal shopee-number-input--no-suffix\">\n");
      out.write("                                                       <div class=\"shopee-input__inner shopee-input__inner--normal\">\n");
      out.write("                                                           <!----> <input type=\"text\" placeholder=\"Min\" resize=\"vertical\" rows=\"2\"\n");
      out.write("                                                               minrows=\"2\" restrictiontype=\"value\" max=\"Infinity\" min=\"-Infinity\"\n");
      out.write("                                                               class=\"shopee-input__input\">\n");
      out.write("                                                           <div class=\"shopee-input__suffix\">\n");
      out.write("\n");
      out.write("                                                               <div class=\"shopee-number-input__controls\">\n");
      out.write("                                                                   <div class=\"shopee-number-input__control up\"><i class=\"shopee-icon\"><svg\n");
      out.write("                                                                               xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 16 16\">\n");
      out.write("                                                                               <path fill-rule=\"evenodd\"\n");
      out.write("                                                                                   d=\"M7.57253679,6.40074676 L5.1530248,8.66903925 C4.90120463,8.90512066 4.88844585,9.30064304 5.12452726,9.55246321 C5.24268191,9.67849483 5.40773242,9.75 5.58048801,9.75 L10.419512,9.75 C10.76469,9.75 11.044512,9.47017797 11.044512,9.125 C11.044512,8.95224442 10.9730068,8.7871939 10.8469752,8.66903925 L8.42746321,6.40074676 C8.18705183,6.17536109 7.81294817,6.17536109 7.57253679,6.40074676 Z\">\n");
      out.write("\n");
      out.write("                                                                               </path>\n");
      out.write("                                                                           </svg>\n");
      out.write("                                                                       </i>\n");
      out.write("                                                                   </div>\n");
      out.write("                                                                   <div class=\"shopee-number-input__control down\"><i\n");
      out.write("                                                                           class=\"shopee-icon\"><svg xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                                                               viewBox=\"0 0 16 16\">\n");
      out.write("                                                                               <path fill-rule=\"evenodd\"\n");
      out.write("                                                                                   d=\"M7.57253679,9.34925324 L5.1530248,7.08096075 C4.90120463,6.84487934 4.88844585,6.44935696 5.12452726,6.19753679 C5.24268191,6.07150517 5.40773242,6 5.58048801,6 L10.419512,6 C10.76469,6 11.044512,6.27982203 11.044512,6.625 C11.044512,6.79775558 10.9730068,6.9628061 10.8469752,7.08096075 L8.42746321,9.34925324 C8.18705183,9.57463891 7.81294817,9.57463891 7.57253679,9.34925324 Z\">\n");
      out.write("\n");
      out.write("                                                                               </path>\n");
      out.write("                                                                           </svg>\n");
      out.write("                                                                       </i>\n");
      out.write("                                                                   </div>\n");
      out.write("                                                               </div>\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("\n");
      out.write("                                                   </div> <span data-v-b2f6143e=\"\" class=\"connector\">\n");
      out.write("\n");
      out.write("                                                   </span>\n");
      out.write("                                                   <div data-v-b2f6143e=\"\"\n");
      out.write("                                                       class=\"shopee-input shopee-number-input shopee-number-input--normal shopee-number-input--no-suffix\">\n");
      out.write("                                                       <div class=\"shopee-input__inner shopee-input__inner--normal\">\n");
      out.write("                                                           <!----> <input type=\"text\" placeholder=\"Max\" resize=\"vertical\" rows=\"2\"\n");
      out.write("                                                               minrows=\"2\" restrictiontype=\"value\" max=\"Infinity\" min=\"-Infinity\"\n");
      out.write("                                                               class=\"shopee-input__input\">\n");
      out.write("                                                           <div class=\"shopee-input__suffix\">\n");
      out.write("\n");
      out.write("                                                               <div class=\"shopee-number-input__controls\">\n");
      out.write("                                                                   <div class=\"shopee-number-input__control up\"><i class=\"shopee-icon\"><svg\n");
      out.write("                                                                               xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 16 16\">\n");
      out.write("                                                                               <path fill-rule=\"evenodd\"\n");
      out.write("                                                                                   d=\"M7.57253679,6.40074676 L5.1530248,8.66903925 C4.90120463,8.90512066 4.88844585,9.30064304 5.12452726,9.55246321 C5.24268191,9.67849483 5.40773242,9.75 5.58048801,9.75 L10.419512,9.75 C10.76469,9.75 11.044512,9.47017797 11.044512,9.125 C11.044512,8.95224442 10.9730068,8.7871939 10.8469752,8.66903925 L8.42746321,6.40074676 C8.18705183,6.17536109 7.81294817,6.17536109 7.57253679,6.40074676 Z\">\n");
      out.write("\n");
      out.write("                                                                               </path>\n");
      out.write("                                                                           </svg>\n");
      out.write("                                                                       </i>\n");
      out.write("                                                                   </div>\n");
      out.write("                                                                   <div class=\"shopee-number-input__control down\"><i\n");
      out.write("                                                                           class=\"shopee-icon\"><svg xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                                                               viewBox=\"0 0 16 16\">\n");
      out.write("                                                                               <path fill-rule=\"evenodd\"\n");
      out.write("                                                                                   d=\"M7.57253679,9.34925324 L5.1530248,7.08096075 C4.90120463,6.84487934 4.88844585,6.44935696 5.12452726,6.19753679 C5.24268191,6.07150517 5.40773242,6 5.58048801,6 L10.419512,6 C10.76469,6 11.044512,6.27982203 11.044512,6.625 C11.044512,6.79775558 10.9730068,6.9628061 10.8469752,7.08096075 L8.42746321,9.34925324 C8.18705183,9.57463891 7.81294817,9.57463891 7.57253679,9.34925324 Z\">\n");
      out.write("\n");
      out.write("                                                                               </path>\n");
      out.write("                                                                           </svg>\n");
      out.write("                                                                       </i>\n");
      out.write("                                                                   </div>\n");
      out.write("                                                               </div>\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("\n");
      out.write("                                                   </div>\n");
      out.write("                                               </div>\n");
      out.write("\n");
      out.write("                                           </div>\n");
      out.write("                                       </div>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("                               <div data-v-b2f6143e=\"\" class=\"actions\"><button data-v-b2f6143e=\"\" type=\"button\"\n");
      out.write("                                       class=\"shopee-button shopee-button--primary shopee-button--normal\"><span>\n");
      out.write("                                           Tìm\n");
      out.write("\n");
      out.write("                                       </span>\n");
      out.write("                                   </button> <button data-v-b2f6143e=\"\" type=\"button\" class=\"shopee-button shopee-button--normal\"\n");
      out.write("                                       style=\"margin-left: 16px;\"><span>\n");
      out.write("                                           Nhập Lại\n");
      out.write("\n");
      out.write("                                       </span>\n");
      out.write("                                   </button>\n");
      out.write("                               </div>\n");
      out.write("                           </form>\n");
      out.write("                       </div>\n");
      out.write("\n");
      out.write("                       <!-- NavBar  -->\n");
      out.write("                       <div data-v-75520c46=\"\" class=\"product-list-main\">\n");
      out.write("                           <div data-v-dff31658=\"\" data-v-75520c46=\"\" class=\"shopee-fixed-top-card\">\n");
      out.write("                               <div data-v-dff31658=\"\" class=\"fixed-container\" style=\"top: 56px; z-index: 1000;\">\n");
      out.write("                                   <div data-v-75520c46=\"\" data-v-dff31658=\"\" class=\"portal-panel\">\n");
      out.write("                                       <div data-v-75520c46=\"\" class=\"tabs shopee-tabs shopee-tabs-line shopee-tabs-normal shopee-tabs-top\"\n");
      out.write("                                           data-v-dff31658=\"\">\n");
      out.write("                                           <div class=\"shopee-tabs__nav\">\n");
      out.write("                                               <div class=\"shopee-tabs__nav-warp\">\n");
      out.write("                                                   <div class=\"shopee-tabs__nav-tabs\" style=\"transform: translateX(0px);\">\n");
      out.write("                                                       <div class=\"shopee-tabs__nav-tab\" style=\"white-space: normal;\">\n");
      out.write("                                                           <div data-v-75520c46=\"\" class=\"tabs__tab\">Tất cả\n");
      out.write("\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"shopee-tabs__nav-tab\" style=\"white-space: normal;\">\n");
      out.write("                                                           <div data-v-75520c46=\"\" class=\"tabs__tab\">Đang hoạt động\n");
      out.write("\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"shopee-tabs__nav-tab active\" style=\"white-space: normal;\">\n");
      out.write("                                                           <div data-v-75520c46=\"\" class=\"tabs__tab\">Hết hàng\n");
      out.write("                                                               <span class=\"tab-badge\">0\n");
      out.write("\n");
      out.write("                                                               </span>\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"shopee-tabs__nav-tab\" style=\"white-space: normal;\">\n");
      out.write("                                                           <div data-v-75520c46=\"\" class=\"tabs__tab\">Chờ duyệt\n");
      out.write("                                                               <span class=\"tab-badge\">0\n");
      out.write("\n");
      out.write("                                                               </span>\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"shopee-tabs__nav-tab\" style=\"white-space: normal;\">\n");
      out.write("                                                           <div data-v-75520c46=\"\" class=\"tabs__tab\">Vi phạm\n");
      out.write("                                                               <span class=\"tab-badge\">5\n");
      out.write("\n");
      out.write("                                                               </span>\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"shopee-tabs__nav-tab\" style=\"white-space: normal;\">\n");
      out.write("                                                           <div data-v-75520c46=\"\" class=\"tabs__tab\">Đã ẩn\n");
      out.write("                                                               <span class=\"tab-badge\">1\n");
      out.write("\n");
      out.write("                                                               </span>\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("                                                   </div>\n");
      out.write("                                                   <div class=\"shopee-tabs__ink-bar\" style=\"width: 104px; transform: translateX(203px);\">\n");
      out.write("                                                   </div>\n");
      out.write("                                               </div>\n");
      out.write("                                           </div>\n");
      out.write("                                           <div class=\"shopee-tabs__content\">\n");
      out.write("                                               <div data-v-75520c46=\"\" class=\"shopee-tabs-tabpane\" style=\"display: none;\">\n");
      out.write("                                               </div>\n");
      out.write("                                               <div data-v-75520c46=\"\" class=\"shopee-tabs-tabpane\" style=\"display: none;\">\n");
      out.write("                                               </div>\n");
      out.write("                                               <div data-v-75520c46=\"\" class=\"shopee-tabs-tabpane\">\n");
      out.write("\n");
      out.write("                                               </div>\n");
      out.write("                                               <div data-v-75520c46=\"\" class=\"shopee-tabs-tabpane\" style=\"display: none;\">\n");
      out.write("                                               </div>\n");
      out.write("                                               <div data-v-75520c46=\"\" class=\"shopee-tabs-tabpane\" style=\"display: none;\">\n");
      out.write("                                               </div>\n");
      out.write("                                               <div data-v-75520c46=\"\" class=\"shopee-tabs-tabpane\" style=\"display: none;\">\n");
      out.write("                                               </div>\n");
      out.write("                                           </div>\n");
      out.write("                                       </div>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("                               <div data-v-dff31658=\"\" class=\"fixed-placeholder\" style=\"display: none; height: 54px;\">\n");
      out.write("                               </div>\n");
      out.write("                           </div>\n");
      out.write("                       </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("    </body>\n");
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
    _jspx_th_c_import_1.setUrl("marketing_sider.jsp");
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
