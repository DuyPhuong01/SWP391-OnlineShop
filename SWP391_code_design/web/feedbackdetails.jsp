<%-- 
    Document   : feedbackslist
    Created on : May 19, 2022, 12:47:35 AM
    Author     : Duy Phuong
--%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Feedback Details</title>
                <!-- CSS -->
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
                <link rel="stylesheet" href="css/style.css">
                <script src="https://kit.fontawesome.com/0e3f31cc48.js" crossorigin="anonymous"></script>
                <!-- JavaScript Bundle with Popper -->
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
            </head>

            <body>
                <div class="header">
                    <c:import url="navbar.jsp"></c:import>
                </div>
                <div style="display: flex">
                    <div class="sidebar">
                        <c:import url="sidebar.jsp"></c:import>
                    </div>
                    <div class="container">
                        <div class="content">
                            <h3>Feedback Details</h3>
                            <div class="row">
                                <div class="col-4">
                                    <div class="card">
                                        <img src="images/product-image.jpg" alt="">
                                        <div class="card-body">
                                            <h5 class="card-title">Product Name</h5>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-8">
                                    <div class="card">
                                        <div class="card-body">
                                            <p>Fullname: </p>
                                            <p>Email: </p>
                                            <p>Phone: </p>
                                            <div style="margin-bottom: 1rem;">
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                            </div>
                                            <p>Status: </p>
                                            <p>Feedback: </p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </body>
            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>

            </html>