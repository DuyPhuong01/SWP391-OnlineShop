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
                        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
                    </div>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img src="images/bg.jpg" class="d-block w-100" alt="...">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>First slide title</h5>
                                <p>Some representative placeholder content for the first slide.</p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="images/bg.jpg" class="d-block w-100" alt="...">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Second slide title</h5>
                                <p>Some representative placeholder content for the second slide.</p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="images/bg.jpg" class="d-block w-100" alt="...">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Third slide title</h5>
                                <p>Some representative placeholder content for the third slide.</p>
                            </div>
                        </div>
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
        </body>

        </html>