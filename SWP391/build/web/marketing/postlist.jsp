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
        <link rel="stylesheet" href="../css/style.css"/>
        <!--<link rel="stylesheet" href="../css/post_list.css"/>-->
        <!--font-awesome-->
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="d-flex">
            <c:import url="/marketing/sidebar.jsp"></c:import>
                <div class="container-lg my-5">
                    <!--content--> 
                    <div class="p-3 bg-white rounded shadow-sm">
                        <form id="post_list" action="searchpostlist" method="get">               
                            <!-- header  -->
                            <div data-v-b2f6143e="" data-v-75520c46="" id="product-filter-card" class="product-filter-card">

                                <div class="search-container">
                                    <div class="input-group">
                                        <input value="" id="search" name="search" type="text" class="form-control" placeholder="Search" aria-label="Search" aria-describedby="search-addon" />
                                        <button type="button" onclick="SubmitForm(1)" class="btn btn-outline-primary">search</button>
                                    </div>      
                                </div>
                                <div class="filter-container">
                                    <div class="text-center mt-3">
                                        <h3>Filter</h3>
                                    </div>
                                    <div class="d-flex justify-content-between">
                                        <div class="col-3 search-item">
                                            <label for="category">Category:</label>
                                            <select class="form-select form-select-sm" name="category" id="category" aria-label=".form-select-sm example" onchange="SubmitForm(1)">
                                                <option value="0" selected>All</option>  <!--default-->
                                            <c:forEach items="${requestScope.categories}" var="category">
                                                <option value="${category.category_id}" >${category.category_name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="col-3 search-item">
                                        <label for="author">Author:</label>
                                        <select class="form-select form-select-sm" name="author" id="author" aria-label=".form-select-sm example" onchange="SubmitForm(1)">
                                            <option value="0" >All</option>
                                            <c:forEach items="${requestScope.authors}" var="author">
                                                <option value="${author.user_id}">${author.username}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="col-3 search-item">
                                        <label for="category">Sort By:</label>
                                        <select class="form-select form-select-sm" id="sort" aria-label=".form-select-sm example" 
                                                name="sort" id="sort" onchange="SubmitForm(1)">
                                            <option value="0">All</option>
                                            <option value="1">Post</option>
                                            <option value="2">Author</option>
                                            <option value="3">Category</option>
                                        </select>
                                    </div>


                                </div>
                                <!-- NavBar  -->
                                <input hidden value="-1" name="feature" id="feature_input">

                                <div class="py-2 px-3 position-sticky top-0 bg-light my-3 rounded" style="z-index: 100;">
                                    <div class="d-flex justify-content-between">
                                        <div id="list_category" clsass="d-flex">
                                            <label class="me-3 cursor-pointer">
                                                <input type="radio" name="poststatus-radio" value="-1" onclick="CheckFeature(this)" checked hidden>
                                                <div>All of post</div>
                                            </label>
                                            <label class="me-3 cursor-pointer">
                                                <input type="radio" name="poststatus-radio" value="1" onclick="CheckFeature(this)" hidden>
                                                <div>Activating</div>
                                            </label>
                                            <label class="me-3 cursor-pointer">
                                                <input type="radio" name="poststatus-radio" value="0" onclick="CheckFeature(this)" hidden>
                                                <div>Hidden</div>
                                            </label>
                                        </div>
                                        <div class="add-post">
                                            <button type="button"  onclick="window.location.href = 'addpost'" class="btn btn-success">Add New Post  +</button>
                                        </div>
                                    </div>
                                </div>
                                <!--Content-->
                                <div id="content">
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>Title</th>
                                                <th>Author</th>
                                                <th>Status</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody id="listpost">
                                            <c:forEach items="${requestScope.posts}" var="p">
                                                <tr>
                                                    <td>${p.post_id}</td>
                                                    <td class="w-50">
                                                        <div class="row">
                                                            <div class="col-4 image-item">
                                                                <img src="${p.thumbnail}" />
                                                            </div>
                                                            <div class="col-8 title">
                                                                <p class="title-detail">
                                                                    ${p.title}
                                                                </p>
                                                            </div>
                                                        </div>
                                                    </td>
                                                    <td>${p.author}</td>
                                                    <td>
                                                        <select class="form-select form-select-sm" id="feature_item" style=" width: 65%; height: 40px;font-size: 13px;" onchange="ChangeFeature(${p.post_id}, $(this).children('option:selected').val())">
                                                            <option value="1" style="font-size: 13px;" <c:if test="${p.featured}">selected</c:if>>Show</option>
                                                            <option value="0" style="font-size: 13px;" <c:if test="${!p.featured}">selected</c:if>>Hide</option>
                                                            </select>
                                                        </td>
                                                        <td class="col-2 action-container">
                                                            <button type="button" class="edit-btn btn btn-secondary btn-sm ">
                                                                <i class="fa-solid fa-pen-to-square"></i>
                                                                Edit
                                                            </button>
                                                            <button type="button" class=" view-btn btn btn-primary btn-sm ">
                                                                <i class="fa-solid fa-eye"></i>View</button>
                                                        </td>
                                                    </tr>   
                                            </c:forEach>
                                        </tbody>
                                    </table>
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
                                                            </form>      
                                                            </div>
                                                            </div>
                                                            </body>
                                                            <script src="../js/post_list.js"></script>
                                                            <!--Ajax-->
                                                            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
                                                            </html>