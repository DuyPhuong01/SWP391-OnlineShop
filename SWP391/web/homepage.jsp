<%@page import="java.util.List"%>
<%@page import="model.Slider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <!--font-awesome-->
            <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
        </head>

        <body>
            <div class="header">
                <c:import url="navbar.jsp"></c:import>
            </div>
            <div class="container-lg">
                <div id="carouselExampleCaptions" class="carousel slide mb-3" data-bs-ride="false">
                    <div class="carousel-indicators">
                        <%
                            int index = 0;
                        %>
                        <c:forEach var="slider" items="${requestScope.sliderslist}">
                            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="<%= index %>" aria-current="true" aria-label="Slide <%= index+1 %>"></button>
                            <%
                                index++;
                            %>
                        </c:forEach>
                    </div>
                    <div class="carousel-inner">
                    <c:forEach var="slider" items="${requestScope.sliderslist}">
                        <div class="carousel-item">
                            <a href="${slider.url}"><img src="images/${slider.imagePath}" class="d-block w-100 rounded" alt="..."></a>
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
                <div class="row mb-3">
                    <div class="col-3">
                        <div class="sider">
                            <!-- sider -->
                            <c:import url="sider.jsp"></c:import>
                            <!-- end sider -->
                        </div>
                    </div>
                    <div class="col-9">
                        <div class="content">
                            <div class="hot-post row mb-3">
                                <a href="#">
                                    <h2>Hot posts</h2>
                                </a>
                                <c:forEach begin="0" end="3">
                                    <div class="col-3">
                                        <div class="card">
                                            <img src="images/270105127_358685858926273_6618429533065317218_n.png" class="card-img-top" alt="...">
                                            <div class="card-body">
                                                <h5 class="card-title">Post title</h5>
                                                <p class="card-text">Post brief-info</p>
                                                <a href="#" class="btn btn-outline-primary">Go somewhere</a>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                            <div class="feature-item row">
                                <a href="productslist">
                                    <h2>Feature items</h2>
                                </a>
                                <c:forEach begin="0" end="3">
                                    <div class="col-3 mb-3">
                                        <div class="card">
                                            <img src="images/270105127_358685858926273_6618429533065317218_n.png" class="card-img-top">
                                            <div class="card-body">
                                                <h5 class="card-title">${requestScope.firstProduct.title}</h5>
                                                <h6 class="card-subtitle mb-2 text-muted"><span class="text-decoration-line-through">${requestScope.firstProduct.original_price}</span> 123.000</h6>
                                                <p class="card-text">Product description</p>
                                                <a href="product?product_id=${requestScope.firstProduct.product_id}" type="button" class="btn btn-outline-primary">Details</a>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="footer">
                <c:import url="footer.jsp"></c:import>
            </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
            <script src="js/carousel.js"></script>
        </body>

        </html>