<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Product Details</title>
            <!-- CSS -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
            <link rel="stylesheet" href="css/style.css">
        </head>

        <body>
            <div class="header">
                <!-- navbar -->
                <c:import url="navbar.jsp"></c:import>
                <!-- end navbar -->
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-3">
                        <div class="sider">
                            <!-- sider -->
                            <c:import url="sider.jsp"></c:import>
                            <!-- end sider -->
                        </div>
                    </div>
                    <div class="col-9">
                        <div class="content">
                            <div class="row product-details-container">
                                <div class="col-12">
                                    <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="true">
                                        <div class="carousel-indicators">
                                            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                                            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                                            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
                                        </div>
                                        <div class="carousel-inner">
                                            <div class="carousel-item active">
                                                <img src="images/270105127_358685858926273_6618429533065317218_n.png" class="d-block w-100" alt="...">
                                            </div>
                                            <div class="carousel-item">
                                                <img src="images/270105127_358685858926273_6618429533065317218_n.png" class="d-block w-100" alt="...">
                                            </div>
                                            <div class="carousel-item">
                                                <img src="images/270105127_358685858926273_6618429533065317218_n.png" class="d-block w-100" alt="...">
                                            </div>
                                        </div>
                                        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                              <span class="visually-hidden">Previous</span>
                            </button>
                                        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                              <span class="carousel-control-next-icon" aria-hidden="true"></span>
                              <span class="visually-hidden">Next</span>
                            </button>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="card">
                                        <div class="card-body">
                                            <h3 class="card-title">${requestScope.product.title}</h3>
                                            <h6 class="card-subtitle mb-2 text-muted">Category: ${requestScope.product.category_id}</h6>
                                            <h4 class="card-subtitle mb-2"><span class="text-decoration-line-through">${requestScope.product.original_price}</span> ${requestScope.product.sale_price}</h4>
                                            <p class="card-text">Product description</p>
                                            <button type="button" class="btn btn-outline-primary">Add to Cart</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

        </html>