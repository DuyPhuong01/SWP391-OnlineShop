<%@page import="java.util.List"%>
<%@page import="model.Slider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value = "vi_VN"/>
<!doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Online shopping system</title>

        <!--bootstrap-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/stylehomepage.css">
        <link rel="stylesheet" href="css/slider.css">
        <link rel="stylesheet" href="css/poststyle.css">
        <link rel="stylesheet" href="css/product.css">
        <link rel="stylesheet" href="css/carousel.css">
        <!-- ===== Boxicons CSS ===== -->
        <link href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css" rel="stylesheet">
        <!--font-awesome-->
        <link rel="stylesheet" href="lib/font-awesome-6-pro/css/all.min.css">
    </head>

    <body>
        <div class="header">
            <c:import url="navbar.jsp"></c:import>
            </div>
            <div class="container-lg">
                <!-- slider -->
                <div class="rei_banner_container slider mb-3">
                    <div class="rei_banner_body">
                    <c:forEach var="slider" items="${requestScope.slidersList}">
                        <div>
                            <a href="${slider.url}">
                                <div class="slider-image">
                                    <img src="${slider.imagePath}">
                                </div>
                            </a>
                            <div class="slider-title">
                                <h4>${slider.title}</h4>
                            </div>
                        </div>
                    </c:forEach>
                </div>
                <div class="rei_banner_bottombtns">
                    <div>
                    <%
                        int i = 1;
                    %>
                    <c:forEach var="slider" items="${requestScope.slidersList}">
                        <span onclick="getBanner(<%= i%>)"></span>
                        <%
                            i++;
                        %>
                    </c:forEach>
                    </div>
                </div>
            </div>

            <div class="row mb-3">
                <div class="col-3">
                    <c:import url="sider.jsp"></c:import>
                    </div>
                    <div class="col-9">
                        <div class="p-3 bg-white rounded shadow-sm">
                            <div class="feature-item row mb-3">
                                <div class="text-center">
                                    <h3 class="pb-3 text-uppercase font-weight-bold">Feature items</h3>
                                </div>
                            <c:import url="element/product_productslist.jsp"></c:import>
                            <div class="d-flex justify-content-end">
                                <a href="productslist">View all Products</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="p-3 bg-white rounded shadow-sm">
                <div class="hot-post row mb-3">
                    <div class="text-center">
                        <h3 class="pb-3 text-uppercase font-weight-bold">Hot posts</h3>
                    </div>
                    <c:forEach var="post" items="${requestScope.hotPostsList}">
                        <div class="col-4 mb-3">
                            <div class="card post">
                                <a class="post-thumbnail" href="post?id=${post.post_id}">
                                    <img src="${post.thumbnail}" class="card-img-top" alt="...">
                                </a>
                                <div class="card-body">
                                    <h6 class="card-title mb-3">${post.title}</h6>
                                </div>
                                <div class="mx-2 mb-2 text-muted opacity-75 d-flex justify-content-end">
                                    <fmt:formatDate value="${post.publication_date}" pattern="HH:mm dd/MM/yyyy"/>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <div class="d-flex justify-content-end">
                        <a href="blogslist">View all Blogs</a>
                    </div>
                </div>
            </div>
        </div>
        <c:import url="footer.jsp"></c:import>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <script src="js/carousel.js"></script>
</html>