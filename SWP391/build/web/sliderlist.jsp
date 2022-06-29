<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Post_List</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--CSS-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css"/>
        <link rel="stylesheet" href="css/post_list.css"/>
        <link rel="stylesheet" href="css/sliderlist.css"/>
          <!--font-awesome-->
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <script src="js/slider_list.js"> </script>
        <div class="header">
            <c:import url="navbar.jsp"></c:import>
        </div>
         <!--Ajax-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <div class="row container main-page">
            <div class="row col-3">
                <c:import url="marketing_sider.jsp"></c:import>
            </div>
            <!--content--> 
            <div class="col-9 main-form">
                <form id="post_list" action="searchpostlist" method="get">               
                        <!-- header  -->
                     
                           <div class="filter-container">
                       
<!--                         
                                        
 
                       <!-- NavBar  -->
                       <input hidden value="-1" name="feature" id="feature_input">
                       <div data-v-75520c46="" class="product-list-main" >
                           <div data-v-dff31658="" data-v-75520c46="" class="shopee-fixed-top-card">
                               <div data-v-dff31658="" class="fixed-container" style="top: 56px; z-index: 1000;">
                                   <div data-v-75520c46="" data-v-dff31658="" class="portal-panel">
                                       <div data-v-75520c46="" class="tabs shopee-tabs shopee-tabs-line shopee-tabs-normal shopee-tabs-top"
                                           data-v-dff31658="">
                                           <div class="shopee-tabs__nav">
                                               <div class=" tab-container shopee-tabs__nav-warp">
                                                   <div id="list_category" class="   shopee-tabs__nav-tabs col-3" style="transform: translateX(0px);">
                                                       <div class="shopee-tabs__nav-tab active" value="-1"  onclick="CheckFeature(this)" style="white-space: normal;">
                                                           <div data-v-75520c46="" class="tabs__tab ">All of Slider

                                                           </div>
                                                       </div>
                                                       <div class="shopee-tabs__nav-tab"  value="1" style="white-space: normal;" onclick="CheckFeature(this)">
                                                           <div data-v-75520c46="" class="tabs__tab"> Showing
                                                           </div>
                                                       </div>
                                                   
                                                       <div class="shopee-tabs__nav-tab" value="0" style="white-space: normal;" onclick="CheckFeature(this)">
                                                           <div data-v-75520c46="" class="tabs__tab">Hidden
                                                               <span class="tab-badge">

                                                               </span>
                                                           </div>
                                                       </div>
                                                   </div>
                                                   <!--search box-->
                                                   <div class=" search-all search-container col-4">
                                                       <div class="col-1"></div>
                                                     <div class=" search-item input-group rounded col-7">
                                                         
                                                         <input type="search" class="form-control rounded " oninput="SubmitForm(1)"
                                                                id="search" placeholder="Search" aria-label="Search" aria-describedby="search-addon" />
                                                         <select name="option_search" id="option_search" onchange="SubmitForm(1)">
                                                                    <option value="1">
                                                                            Title
                                                                    </option>
                                                                    <option value="2">
                                                                            Backlinks
                                                                    </option>
                                                                </select>
<!--                                                        <span class="input-group-text border-0" id="search-addon">
                                                          <i class="fas fa-search"></i>
                                                        </span>-->
                                                   </div>
                                                   </div>
                                                   <div class="add-post col-3">
                                                       <div class="col-6"></div> 
                                                       <button type="button"  onclick="window.location.href='addslider'" class="btn btn-success">Add New   +</button>
                                                   </div>
                                                   <div class="shopee-tabs__ink-bar" style="width: 104px; transform: translateX(203px);">
                                                   </div>
                                               </div>
                                           </div>
                                           <div class="shopee-tabs__content">
                                               <div data-v-75520c46="" class="shopee-tabs-tabpane" style="display: none;">
                                               </div>
                                               <div data-v-75520c46="" class="shopee-tabs-tabpane" style="display: none;">
                                               </div>
                                               <div data-v-75520c46="" class="shopee-tabs-tabpane">

                                               </div>
                                               <div data-v-75520c46="" class="shopee-tabs-tabpane" style="display: none;">
                                               </div>
                                               <div data-v-75520c46="" class="shopee-tabs-tabpane" style="display: none;">
                                               </div>
                                               <div data-v-75520c46="" class="shopee-tabs-tabpane" style="display: none;">
                                               </div>
                                           </div>
                                       </div>
                                   </div>
                               </div>
                               <div data-v-dff31658="" class="fixed-placeholder" style="display: none; height: 54px;">
                               </div>
                           </div>
                            <!--Content-->
                            <div data-v-75520c46="" class="row main-content " id="content">
                                 <!--header-->
                           <div class="row navbar-content">
                               <div class="col-2">ID</div>
                               <div class="col-4">Title</div>
                               <div class="col-2">Backlink</div>
                               <div class="col-2">Status</div>
                               <div class="col-2">Action </div>
                           </div>
                              <!--list-item-->
                            <div class="list-post_container ">
                                <!--a post-->
                                <ul class="list-post" id="listpost">
                                <c:forEach items="${requestScope.sliders}" var="s">
                                    <li>
                                <div class="row item-detail">
                                    <div class="col-1">
                                        ${s.id}
                                    </div>
                                    <div class="col-5 title-item">
                                        <div class="col-4 image-item">
                                            <img src="
                                                 ${s.imagePath}
                                                 " />
                                        </div>
                                        <div class="col-8 title">
                                            <p class="title-detail">
                                               ${s.title}
                                            </p>
                                        </div>
                                    </div>
                                               <div class="col-2"><a href="${s.url}">${s.url}</a></div>
                                    <div class="col-2">
                                        <select id="feature_item" style=" width: 65%; height: 40px;font-size: 13px;" onchange="ChangeFeature(${s.id},$(this).children('option:selected').val())">
                                            <option value="1" style="font-size: 13px;"
                                                    <c:if test="${s.status==1}">selected</c:if>
                                                    >
                                                Show
                                            </option>
                                            <option value="0" style="font-size: 13px;" 
                                            <c:if test="${s.status==0}">selected</c:if>
                                                    >
                                                Hide
                                            </option>
                                        </select>
                                    </div>
                                    <div class="col-2 action-container">
                                      <button type="button" class="edit-btn btn btn-secondary btn-sm ">
                                          <i class="fa-solid fa-pen-to-square"></i>
                                          Edit
                                      </button>
<!--                                      <button type="button" class=" view-btn btn btn-primary btn-sm ">
                                          <i class="fa-solid fa-eye"></i>View</button>-->
                                    </div>
                                </div>
                                    </li>   
                            </c:forEach>
                                </ul>
                           </div>
                              <!--//footer-->
                              <footer>
                                  <div class="pagination">
                                                 <div class="content-paging content-paging-footer" name="page">
                                                     <div class="title-paging"> <span>Page ${requestScope.curpage} of ${requestScope.maxpage}<span></div>
                                                     <nav class="" aria-label="...">
                                                        <ul class="pagination">
                                                            <c:if test="${requestScope.curpage!=1}">
                                                                    <li class="page-item" >
                                                                       <a class="page-link" value="${requestScope.curpage-1}" onclick="Paging(${requestScope.curpage-1})" >Previous</a>
                                                                    </li>
                                                              </c:if>
                                                            <c:if test="${requestScope.curpage==1}">
                                                                    <li class="page-item disabled">
                                                                       <a class="page-link" value="${requestScope.curpage}" >Previous</a>
                                                                    </li>
                                                              </c:if>
                                                       
                                                                    <select class="select-paginate" id="paging" onchange="SubmitForm($('#paging').children('option:selected').val())">
                                                            <c:forEach begin="1" end="${requestScope.maxpage}" var="i">
                                                                <option value="${i}"
                                                                        <c:if test="${requestScope.curpage==i}">selected</c:if>
                                                                        >${i}</option>
                                                            </c:forEach>
                                                          </select>
                                                          <c:if test="${requestScope.curpage!=requestScope.maxpage}">
                                                            <li class="page-item">
                                                                <a class="page-link" onclick="Paging(${requestScope.curpage+1})" value="${requestScope.curpage+1}" >Next</a>
                                                            </li>
                                                          </c:if>
                                                          <c:if test="${requestScope.curpage==requestScope.maxpage}">
                                                            <li class="page-item disabled">
                                                                <a class="page-link" value="${requestScope.curpage}" >Next</a>
                                                            </li>
                                                          </c:if>
                                                        </ul>
                                                      </nav>
                                               </div>
                                  </div>
                              </footer>
                            
                       </div>
                      </div>
                         
            </div>
         </div>
        </form>      
       </div>
    </body>
</html>