package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class postlist1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_import_url_nobody.release();
    _jspx_tagPool_c_forEach_end_begin.release();
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
      out.write("            <div class=\"col-9 main-form\">\n");
      out.write("                                        <!-- header  -->\n");
      out.write("                       <div data-v-b2f6143e=\"\" data-v-75520c46=\"\" id=\"product-filter-card\" class=\"product-filter-card\">\n");
      out.write("                            \n");
      out.write("                           <div class=\"search-container\">\n");
      out.write("                                  <div class=\"input-group\">\n");
      out.write("                                    <input type=\"search\" class=\"form-control rounded\" placeholder=\"Search\" aria-label=\"Search\" aria-describedby=\"search-addon\" />\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-outline-primary\">search</button>\n");
      out.write("                                  </div>      \n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"filter-container\">\n");
      out.write("                               <h1>Filter</h1>\n");
      out.write("                               <div class=\"search_list col-12\">\n");
      out.write("                                   <div class=\"col-5 search-item\">\n");
      out.write("                                       <label for=\"category\">Category:</label>\n");
      out.write("                                       <select class=\"form-select form-select-sm\" id=\"category\" aria-label=\".form-select-sm example\">\n");
      out.write("                                        <option selected>Open this select menu</option>\n");
      out.write("                                        <option value=\"1\">One</option>\n");
      out.write("                                        <option value=\"2\">Two</option>\n");
      out.write("                                        <option value=\"3\">Three</option>\n");
      out.write("                                      </select>\n");
      out.write("                                   </div>\n");
      out.write("                                   <div class=\"col-1\">\n");
      out.write("                                       \n");
      out.write("                                   </div>\n");
      out.write("                                   <div class=\"col-3 search-item\">\n");
      out.write("                                       <label for=\"sorting\">Sort By</label>\n");
      out.write("                                       <select class=\"form-select form-select-sm\" id=\"sorting\" aria-label=\".form-select-sm example\">\n");
      out.write("                                        <option selected>Open this select menu</option>\n");
      out.write("                                        <option value=\"1\">One</option>\n");
      out.write("                                        <option value=\"2\">Two</option>\n");
      out.write("                                        <option value=\"3\">Three</option>\n");
      out.write("                                      </select>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("                               <div class=\"search_list col-12\">\n");
      out.write("                                  <div class=\"col-5 search-item\">\n");
      out.write("                                       <label for=\"category\">Author:</label>\n");
      out.write("                                       <select class=\"form-select form-select-sm\" id=\"author\" aria-label=\".form-select-sm example\">\n");
      out.write("                                        <option selected>Open this select menu</option>\n");
      out.write("                                        <option value=\"1\">One</option>\n");
      out.write("                                        <option value=\"2\">Two</option>\n");
      out.write("                                        <option value=\"3\">Three</option>\n");
      out.write("                                      </select>\n");
      out.write("                                   </div>\n");
      out.write("                                  <div class=\"col-5 search-item\">\n");
      out.write("                                      \n");
      out.write("                                   </div>\n");
      out.write("                                 \n");
      out.write("                                  \n");
      out.write("                               </div>\n");
      out.write("                           </div>\n");
      out.write("                           \n");
      out.write("                       </div>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("\n");
      out.write("                       <!-- NavBar  -->\n");
      out.write("                       <div data-v-75520c46=\"\" class=\"product-list-main\">\n");
      out.write("                           <div data-v-dff31658=\"\" data-v-75520c46=\"\" class=\"shopee-fixed-top-card\">\n");
      out.write("                               <div data-v-dff31658=\"\" class=\"fixed-container\" style=\"top: 56px; z-index: 1000;\">\n");
      out.write("                                   <div data-v-75520c46=\"\" data-v-dff31658=\"\" class=\"portal-panel\">\n");
      out.write("                                       <div data-v-75520c46=\"\" class=\"tabs shopee-tabs shopee-tabs-line shopee-tabs-normal shopee-tabs-top\"\n");
      out.write("                                           data-v-dff31658=\"\">\n");
      out.write("                                           <div class=\"shopee-tabs__nav\">\n");
      out.write("                                               <div class=\" tab-container shopee-tabs__nav-warp\">\n");
      out.write("                                                   <div class=\"   shopee-tabs__nav-tabs col-8\" style=\"transform: translateX(0px);\">\n");
      out.write("                                                       <div class=\"shopee-tabs__nav-tab\" style=\"white-space: normal;\">\n");
      out.write("                                                           <div data-v-75520c46=\"\" class=\"tabs__tab\">All of post\n");
      out.write("\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"shopee-tabs__nav-tab\" style=\"white-space: normal;\">\n");
      out.write("                                                           <div data-v-75520c46=\"\" class=\"tabs__tab\">Activing\n");
      out.write("\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"shopee-tabs__nav-tab active\" style=\"white-space: normal;\">\n");
      out.write("                                                           <div data-v-75520c46=\"\" class=\"tabs__tab\">Pending\n");
      out.write("                                                               <span class=\"tab-badge\">0\n");
      out.write("\n");
      out.write("                                                               </span>\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"shopee-tabs__nav-tab\" style=\"white-space: normal;\">\n");
      out.write("                                                           <div data-v-75520c46=\"\" class=\"tabs__tab\">Hidden\n");
      out.write("                                                               <span class=\"tab-badge\">0\n");
      out.write("\n");
      out.write("                                                               </span>\n");
      out.write("                                                           </div>\n");
      out.write("                                                       </div>\n");
      out.write("                                                      \n");
      out.write("                                                   </div>\n");
      out.write("                                                   <div class=\"add-post col-3\">\n");
      out.write("                                                       <button type=\"button\" class=\"btn btn-success\">Add New Post   +</button>\n");
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
      out.write("                            <!--Content-->\n");
      out.write("                       <div data-v-75520c46=\"\" class=\"row main-content\">\n");
      out.write("                                 <!--header-->\n");
      out.write("                           <div class=\"row navbar-content\">\n");
      out.write("                               <div class=\"col-2\">ID</div>\n");
      out.write("                               <div class=\"col-4\">Title</div>\n");
      out.write("                               <div class=\"col-2\">Author</div>\n");
      out.write("                               <div class=\"col-2\">Status</div>\n");
      out.write("                               <div class=\"col-2\">Action </div>\n");
      out.write("                           </div>\n");
      out.write("                              <!--list-item-->\n");
      out.write("                            <div class=\"list-post_container \">\n");
      out.write("                                <!--a post-->\n");
      out.write("                                <ul class=\"list-post\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                           </div>\n");
      out.write("                              <!--//footer-->\n");
      out.write("                              <footer>\n");
      out.write("                                  \n");
      out.write("                              </footer>\n");
      out.write("                            \n");
      out.write("                       </div>\n");
      out.write("                      </div>\n");
      out.write("                         \n");
      out.write("            </div>\n");
      out.write("         </div>\n");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setBegin(1);
    _jspx_th_c_forEach_0.setEnd(5);
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li>\n");
          out.write("                                <div class=\"row item-detail\">\n");
          out.write("                                    <div class=\"col-1\">1</div>\n");
          out.write("                                    <div class=\"col-5 title-item\">\n");
          out.write("                                        <div class=\"col-4 image-item\">\n");
          out.write("                                            <img src=\"images/post-thumbnails/abc.jpg\" />\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"col-8 title\">\n");
          out.write("                                            <p class=\"title-detail\">\n");
          out.write("                                                Nằm giữa núi non hùng vĩ của , với khung cảnh làng quê bình dị, Aravinda Resort Ninh Bình hiện ra như một bông sen xanh duyên dáng, thanh tịnh, thuần khiết. Tất cả được thể hiện qua lối kiến trúc riêng biệt, phong cách ẩm thực trong lành và cách phục vụ ân cần mà khu nghỉ dưỡng mong muốn mang đến bạn.\n");
          out.write("                                            </p>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"col-2\">Klook Vietnam</div>\n");
          out.write("                                    <div class=\"col-2\">\n");
          out.write("                                        <select style=\" width: 65%; height: 40px;font-size: 13px;\">\n");
          out.write("                                            <option style=\"font-size: 13px;\">\n");
          out.write("                                                Show\n");
          out.write("                                            </option>\n");
          out.write("                                            <option style=\"font-size: 13px;\">\n");
          out.write("                                                Hide\n");
          out.write("                                            </option>\n");
          out.write("                                        </select>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"col-2 action-container\">\n");
          out.write("                                      <button type=\"button\" class=\"edit-btn btn btn-secondary btn-sm \">\n");
          out.write("                                          <i class=\"fa-solid fa-pen-to-square\"></i>\n");
          out.write("                                          Edit\n");
          out.write("                                      </button>\n");
          out.write("                                      <button type=\"button\" class=\" view-btn btn btn-primary btn-sm \">\n");
          out.write("                                          <i class=\"fa-solid fa-eye\"></i>View</button>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                    </li>   \n");
          out.write("                            ");
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
      _jspx_tagPool_c_forEach_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
