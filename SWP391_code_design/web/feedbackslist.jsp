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
                <title>Feedbacks List</title>
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
                    <div class="row container">
                        <div class="col-3">
                            <div class="sider">
                                <c:import url="feedbackslistsider.jsp"></c:import>
                            </div>
                        </div>
                        <div class="col-9">
                            <div class="content">
                                <table class="orders-list table">
                                    <thead>
                                        <tr>
                                            <th>Fullname</th>
                                            <th>Product Name</th>
                                            <th>rated star</th>
                                            <th>Status</th>
                                        </tr>
                                    </thead>
                                    <tbody class="table-group-divider">
                                        <tr>
                                            <td>abcdefgh</td>
                                            <td>abcdefgh</td>
                                            <td>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                            </td>
                                            <td>
                                                <select class="form-select" aria-label="Default select example">
                                                    <option selected>On</option>
                                                    <option>Off</option>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>abcdefgh</td>
                                            <td>abcdefgh</td>
                                            <td>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                            </td>
                                            <td>
                                                <select class="form-select" aria-label="Default select example">
                                                    <option selected>On</option>
                                                    <option>Off</option>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>abcdefgh</td>
                                            <td>abcdefgh</td>
                                            <td>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                            </td>
                                            <td>
                                                <select class="form-select" aria-label="Default select example">
                                                    <option selected>On</option>
                                                    <option>Off</option>
                                                </select>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </body>
            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>

            </html>