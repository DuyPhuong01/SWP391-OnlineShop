<%@page import="java.util.List"%>
<%@page import="model.Slider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <!-- ===== Boxicons CSS ===== -->
        <link href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css" rel="stylesheet">
        <!--font-awesome-->
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
    </head>

    <body>
        <div class="header">
            <c:import url="navbar.jsp"></c:import>
            </div>
            <div class="container-lg">
                <div id="carouselExampleCaptions" class="carousel slide mb-3" data-bs-ride="true">
                    <div class="carousel-indicators">
                    <%
                        int index = 0;
                    %>
                    <c:forEach var="slider" items="${requestScope.slidersList}">
                        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="<%= index%>" aria-current="true" aria-label="Slide <%= index + 1%>"></button>
                        <%
                            index++;
                        %>
                    </c:forEach>
                </div>
                <div class="carousel-inner rounded">
                    <c:forEach var="slider" items="${requestScope.slidersList}">
                        <div class="carousel-item">
                            <a href="${slider.url}"><img src="${slider.imagePath}" class="d-block w-100" alt="${slider.title}"></a>
                            <div class="carousel-caption d-none d-md-block">
                                <h5>${slider.title}</h5>
                                <p>Some representative placeholder content for the first slide.</p>
                            </div>
                        </div>
                    </c:forEach>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
            <div class="row">
                <div class="col-3">
                    <c:import url="sider.jsp"></c:import>
                    </div>
                    <div class="col-9">
                        <div class="p-3 bg-white rounded shadow-sm">
                            <div class="hot-post row mb-3">
                                <div class="text-center">
                                    <h3 class="pb-3 text-uppercase font-weight-bold">Hot posts</h3>
                                </div>
                            <c:forEach var="post" items="${requestScope.hotPostsList}">
                                <div class="col-4 mb-3">
                                    <div class="card post">
                                        <div class="post-thumbnail">
                                            <img src="${post.thumbnail}" class="card-img-top" alt="${post.title}">
                                        </div>
                                        <div class="card-body">
                                            <h5 class="card-title">${post.title}</h5>
                                            <p class="card-text">${post.post_details}</p>
                                            <a href="post?id=${post.post_id}" class="btn btn-outline-primary">View</a>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                            <div class="d-flex justify-content-end">
                                <a href="blogslist">View all Blogs</a>
                            </div>
                        </div>
                        <div class="feature-item row mb-3">
                            <div class="text-center">
                                <h3 class="pb-3 text-uppercase font-weight-bold">Feature items</h3>
                            </div>
                            <c:forEach var="product" items="${requestScope.productsList}">
                                <div class="col-3 mb-3">
                                    <div class="card product-card">
                                        <a href="product?id=${product.product_id}">
                                            <img src="${product.thumbnail}" class="card-img-top">
                                        </a>
                                        <div class="card-body">
                                            <a href="product?id=${product.product_id}" data-bs-toggle="tooltip" title="${product.name}">
                                                <h6 class="card-title product-title">${product.name}</h6>
                                            </a>
                                            <h6 class="card-subtitle mb-2 text-muted">
                                                <c:if test="${product.sale_price != 0}">
                                                    <span class="text-decoration-line-through"><fmt:formatNumber value="${product.original_price}" type="currency" currencySymbol="đ" maxFractionDigits="0"/></span>
                                                    <span style="color: red;"> <fmt:formatNumber value="${product.sale_price}" type="currency" currencySymbol="đ" maxFractionDigits="0"/></span></c:if>
                                                <c:if test="${product.sale_price == 0}"><span><fmt:formatNumber value="${product.original_price}" type="currency" currencySymbol="đ" maxFractionDigits="0"/></span></c:if>
                                                </h6>
                                                <p class="brief-infor">${product.briefInfor}</p>
                                            <a href="product?id=${product.product_id}" type="button" class="btn btn-outline-primary">Details</a>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                            <div class="d-flex justify-content-end">
                                <a href="productslist">View all Products</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <c:import url="footer.jsp"></c:import>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <script src="js/carousel.js"></script>

    <script src="https://unpkg.com/@popperjs/core@2"></script>
    <script>
        const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]')
        const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl))
    </script>

</html>