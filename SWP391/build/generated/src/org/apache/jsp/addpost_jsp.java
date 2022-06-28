package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addpost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html lang=\"en\" dir=\"ltr\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("          <title>Post_List</title>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("        <!--CSS-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("        <!--CK finder-->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"ckeditor/ckeditor.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"ckfinder/ckfinder.js\"></script>\r\n");
      out.write("         <!--font-awesome-->\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/3c84cb624f.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"js/post_list.js\"> </script>\r\n");
      out.write("        <script src=\"css/post_list.css\"> </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("          <!--Ajax-->\r\n");
      out.write("          \r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("         <div class=\"row container main-page\">\r\n");
      out.write("            <div class=\"row col-3\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--content--> \r\n");
      out.write("      <div class=\"col-9 main-form\">\r\n");
      out.write("       <form id=\"post_list\" action=\"addpost\" method=\"post\" enctype=\"multipart/form-data\">               \r\n");
      out.write("                        <!-- header  -->\r\n");
      out.write("          <div data-v-b2f6143e=\"\" data-v-75520c46=\"\" id=\"product-filter-card\" class=\"product-filter-card\">\r\n");
      out.write("                            \r\n");
      out.write("              <div class=\"container list-input\">\r\n");
      out.write("                  <div class=\"list-input list-input__title\"> <h1>Create new post</h1></div>\r\n");
      out.write("                  \r\n");
      out.write("                  <div class=\"list-input list-input__title col-12\">\r\n");
      out.write("                      <div class=\"col-2 ceate-title\">\r\n");
      out.write("                          <h5>Title</h5>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"col-1 ceate-title\">\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-9 ceate-title\">\r\n");
      out.write("                          <input id=\"title-add\" name=\"title\" required type=\"text\" />\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"list-input list-input__title col-12\">\r\n");
      out.write("                      <div class=\"col-2 ceate-title\">\r\n");
      out.write("                          <h5>Author</h5>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"col-1 ceate-title\">\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-9 ceate-title\">\r\n");
      out.write("                          <input  readonly name=\"autitle-addthor\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"list-input list-input__title col-12\">\r\n");
      out.write("                      <div class=\"col-2 ceate-title\">\r\n");
      out.write("                          <h5>Category</h5>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"col-1 ceate-title\">\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-9 ceate-title category-content\" id=\"category-content\">\r\n");
      out.write("                          <select name=\"category\" id=\"category-select\"\r\n");
      out.write("                                  onchange=\"checkCategoryOption()\" required>\r\n");
      out.write("                              <option  selected disabled>Select</option>\r\n");
      out.write("                              ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                              <option value=\"0\" onclick=\"openCategoryForm()\" >Add More</option>\r\n");
      out.write("                          </select>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  <!--category form-->\r\n");
      out.write("                <div class=\"modal category-form\" id=\"category-form\" tabindex=\"-1\" >\r\n");
      out.write("                    <div class=\"modal-dialog\">\r\n");
      out.write("                  <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                      <h5 class=\"modal-title\">New Category</h5>\r\n");
      out.write("                  <button type=\"button\" id=\"addnew-form\" class=\"btn-close\"  onclick=\"closeCategoryForm()\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <form id=\"category-form_add\" action=\"addpostcategory\" method=\"post\">\r\n");
      out.write("                        <p>\r\n");
      out.write("                                    <div class=\"input-group mb-3\">\r\n");
      out.write("                                      <div class=\"input-group-prepend\">\r\n");
      out.write("                                        <span class=\"input-group-text\" id=\"inputGroup-sizing-default\">Name</span>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                        <input required oninput=\"CheckCategoryName(this)\"  type=\"text\" \r\n");
      out.write("                                             id=\"name\"   name=\"name\" \r\n");
      out.write("                                             class=\"form-control\" aria-label=\"Default\" aria-describedby=\"inputGroup-sizing-default\"\r\n");
      out.write("                                             >\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                <div class=\"category-error\" id=\"category-error\">\r\n");
      out.write("                                 <span  class=\"category-error_item\">This name have exist</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                    <div class=\"input-group mb-3\">\r\n");
      out.write("                                      <div class=\"input-group-prepend\">\r\n");
      out.write("                                        <span class=\"input-group-text\" id=\"inputGroup-sizing-default\">Description</span>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                        <input  id=\"description\" type=\"text\" name=\"description\" class=\"form-control\" aria-label=\"Default\" aria-describedby=\"inputGroup-sizing-default\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\" onclick=\"closeCategoryForm()\">Close</button>\r\n");
      out.write("                        <button type=\"button\" id=\"submit-category\" class=\"btn btn-primary\" onclick=\"SubmitCategoryForm()\">Submit</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("                  <!----------------------------->\r\n");
      out.write("<!--                  <form id=\"category-form_add\" action=\"addpostcategory\" method=\"post\">\r\n");
      out.write("                      <input type=\"text\" hidden name=\"name\" id=\"name-form\"/>\r\n");
      out.write("                      <input type=\"text\" hidden name=\"description\" id=\"description-form\" />\r\n");
      out.write("                  </form>-->\r\n");
      out.write("                  \r\n");
      out.write("                  <div class=\"list-input list-input__title col-12\">\r\n");
      out.write("                      <div class=\"col-2 ceate-title\">\r\n");
      out.write("                          <h5>Feature</h5>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"col-1 ceate-title\">\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-9 ceate-title\">\r\n");
      out.write("                          <select name=\"feature\" id=\"feature-select\" required>\r\n");
      out.write("                              <option  selected disabled>Select</option>\r\n");
      out.write("                              <option value=\"1\">Show</option>\r\n");
      out.write("                              <option value=\"0\">Hide</option>\r\n");
      out.write("                          </select>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"list-input list-input__title col-12 thumbnail-create\">\r\n");
      out.write("                      <div class=\"col-2 ceate-title\">\r\n");
      out.write("                          <h5>Upload Thumbnail</h5>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"col-1 ceate-title\">\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-9 ceate-title\">\r\n");
      out.write("                          <input required type=\"file\" id=\"imageFile\"\r\n");
      out.write("                                 onchange=\"chooseFile(this)\"\r\n");
      out.write("                                 name=\"thumbnail\" accept=\"image/gif, image/jpeg, image/png\"/>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"list-input list-input__title col-12 thumbnail-container\">\r\n");
      out.write("                          \r\n");
      out.write("                      <img src=\"\" alt=\"\" id=\"thumbnail-create\" >\r\n");
      out.write("                  </div>            \r\n");
      out.write("                  <div class=\"list-input list-input__title col-12 content-create__container\">\r\n");
      out.write("                      <div class=\"content-create__title\"><p>Post details<p><div>\r\n");
      out.write("                      <div  class=\"content-create__detail\">\r\n");
      out.write("                           <textarea id=\"ckeditorArea\" required></textarea>\r\n");
      out.write("                           <input id=\"content\" type=\"hidden\" name=\"content\"required />\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-primary\" onclick=\"saveData()\">Submit</button>\r\n");
      out.write("                            <!--<button type=\"submit\" class=\"btn btn-primary\">Submit</button>-->\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>            \r\n");
      out.write("                         \r\n");
      out.write("         </div> \r\n");
      out.write("        </form>      \r\n");
      out.write("       </div>\r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("<!--        <form id=\"formEditor\" method=\"post\" action=\"addlist\">\r\n");
      out.write("            <textarea id=\"ckeditorArea\"></textarea>\r\n");
      out.write("            <input id=\"content\" type=\"hidden\" name=\"content\" />\r\n");
      out.write("            <input type=\"button\" value=\"Save\" onclick=\"saveData()\"/>\r\n");
      out.write("        </form>-->\r\n");
      out.write("        \r\n");
      out.write("        <!--<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>-->\r\n");
      out.write("    </body>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var editor = CKEDITOR.replace('ckeditorArea'\r\n");
      out.write("        , \r\n");
      out.write("           {\r\n");
      out.write("                filebrowserBrowseUrl : 'ckfinder/ckfinder.html',\r\n");
      out.write("                filebrowserImageBrowseUrl : 'ckfinder/ckfinder.html?type=Images',\r\n");
      out.write("                filebrowserFlashBrowseUrl : 'ckfinder/ckfinder.html?type=Flash',\r\n");
      out.write("                filebrowserUploadUrl : 'ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Files',\r\n");
      out.write("                filebrowserImageUploadUrl : 'ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Images',\r\n");
      out.write("                filebrowserFlashUploadUrl : 'ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Flash'\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("//        var editor = CKEDITOR.replace('ckeditorArea');\r\n");
      out.write("//        CKFinder.setupCKEditor(editor, './ckfinder/');\r\n");
      out.write("               function validate(){\r\n");
      out.write("           var feature=$('#feature-select').children(\"option:selected\").val();\r\n");
      out.write("            var category=$('#category-select').children(\"option:selected\").val();\r\n");
      out.write("            var title=document.getElementById('title-add').value;\r\n");
      out.write("            var thumbnail=document.getElementById('imageFile').value;\r\n");
      out.write("            if(title==''){\r\n");
      out.write("                alert( \"Please provide your title!\" );\r\n");
      out.write("                $('#title-add').focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if(category=='Select'){\r\n");
      out.write("                 alert( \"Please provide your category!\" );\r\n");
      out.write("                 $('#category-select').children(\"option:selected\").focus();\r\n");
      out.write("                 return false;\r\n");
      out.write("            }\r\n");
      out.write("            if(feature==='Select'){\r\n");
      out.write("                alert( \"Please provide your feature!\" );\r\n");
      out.write("                $('#feature-select').children(\"option:selected\").focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if(thumbnail==''){\r\n");
      out.write("                alert( \"Please provide your thumbnail!\" );\r\n");
      out.write("                $('#imageFile').focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function saveData() {\r\n");
      out.write("            const post = editor.getData();\r\n");
      out.write("            if(validate()){\r\n");
      out.write("            var formValid=document.forms['post_list'].checkValidity();\r\n");
      out.write("            if(!formValid||post.trim('')==0){\r\n");
      out.write("                alert('You need fill post details');\r\n");
      out.write("            }else{\r\n");
      out.write("            document.querySelector('#content').value = post;\r\n");
      out.write("            document.querySelector('#post_list').submit();   \r\n");
      out.write("            }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.categories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("category");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
          out.write("                                  <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.category_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.category_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                              ");
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
}
