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
            <link href="css/stylehomepage.css" rel="stylesheet" />
            <!--font-awesome-->
            <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
        </head>

        <body>
            <div class="header">
                <c:import url="navbar.jsp"></c:import>
            </div>
            <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="..." class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="..." class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="..." class="d-block w-100" alt="...">
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
            </div>

            <div class="container main-content">
                <div class="row">
                    <div class="col-md-3">
                        <div class="left-sidebar">
                            <div class="flex flex-column">
                                <h2>Latest post</h2>
                                <div class="latest-post">

                                </div>
                                <div class="latest-post">

                                </div>
                                <div class="latest-post">

                                </div>
                                <div class="latest-post">

                                </div>
                                <div class="static-link">
                                    static contact/link
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-9 padding-right">
                        <h2>Hot posts</h2>
                        <div class="hot-post row">
                            <div class="col-md-3">
                                <div class="hot-post-container">
                                    <div>
                                        <img src="images/270105127_358685858926273_6618429533065317218_n.png" style="width: 100%; height: 100%;">
                                    </div>
                                    <div>
                                        <a href="product?product_id=${requestScope.firstProduct.product_id}">${requestScope.firstProduct.title}</a>
                                    </div>
                                    <div>
                                        ${requestScope.firstProduct.original_price}
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="hot-post-container">
                                    post#2
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="hot-post-container">
                                    post#3
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="hot-post-container">
                                    post#4
                                </div>
                            </div>
                        </div>
                        <div class="feature-item row">
                            <h2><a href="productslist.jsp">Feature items</a></h2>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                        </div>
                        <div class="feature-item row">
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                        </div>
                        <div class="feature-item row">
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                        </div>
                        <div class="feature-item row">
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                            <div class="item col-md-3">
                                <div class="item-container">
                                    item #1
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="footer">
                Footer
            </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
        </body>

        </html>