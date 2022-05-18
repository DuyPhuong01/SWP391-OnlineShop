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
                <title>Sale Dashboard</title>
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
                                <div class="sale-selection-container">
                                    <select class="form-select" aria-label="Default select example">
                                        <option selected>Select Sale</option>
                                        <option value="1">Sale 1</option>
                                        <option value="2">Sale 2</option>
                                        <option value="2">Sale 3</option>
                                        <option value="2">Sale 4</option>
                                    </select>
                                </div>
                                <input type="date" class="form-control">
                            </div>
                        </div>
                        <div class="col-9">
                            <div class="row content dashboard">
                                <div class="col-6">
                                    <div class="card">
                                        <div class="card-body">
                                            <h3 class="card-title">Total Orders</h3>
                                            <h5 class="card-subtitle mb-2 text-muted">123</h5>
                                            <p class="card-text">Average: </p>
                                            <table class="table">
                                                <thead>
                                                    <tr>
                                                        <th>Date</th>
                                                        <th>Total Orders</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <td>01/01/2022</td>
                                                        <td>2</td>
                                                    </tr>
                                                    <tr>
                                                        <td>01/01/2022</td>
                                                        <td>2</td>
                                                    </tr>
                                                </tbody>
                                            </table>

                                        </div>
                                    </div>
                                    <div class="card">
                                        <div class="card-body">
                                            <h3 class="card-title">Best Seller</h3>
                                            <table class="table">
                                                <thead>
                                                    <tr>
                                                        <th>Name</th>
                                                        <th>Total Order</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <td>ProductName</td>
                                                        <td>12</td>
                                                    </tr>
                                                    <tr>
                                                        <td>ProductName</td>
                                                        <td>12</td>
                                                    </tr>
                                                    <tr>
                                                        <td>ProductName</td>
                                                        <td>12</td>
                                                    </tr>
                                                    <tr>
                                                        <td>ProductName</td>
                                                        <td>12</td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="card">
                                        <div class="card-body">
                                            <h3 class="card-title">Revenues</h3>
                                            <h5 class="card-subtitle mb-2 text-muted">321.000</h5>
                                            <p class="card-text">Average: </p>
                                            <table class="table">
                                                <thead>
                                                    <tr>
                                                        <th>Date</th>
                                                        <th>Revenues</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <td>01/01/2022</td>
                                                        <td>12.000</td>
                                                    </tr>
                                                    <tr>
                                                        <td>01/01/2022</td>
                                                        <td>12.000</td>
                                                    </tr>
                                                    <tr>
                                                        <td>01/01/2022</td>
                                                        <td>12.000</td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                    <div class="card">
                                        <div class="card-body">
                                            <h3 class="card-title">Best Orders</h3>
                                            <table class="table">
                                                <thead>
                                                    <tr>
                                                        <th>SaleName</th>
                                                        <th>Total Price</th>
                                                        <th>Order Date</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <td>SaleName</td>
                                                        <td>12.000</td>
                                                        <td>01/01/2022</td>
                                                    </tr>
                                                    <tr>
                                                        <td>SaleName</td>
                                                        <td>12.000</td>
                                                        <td>01/01/2022</td>
                                                    </tr>
                                                    <tr>
                                                        <td>SaleName</td>
                                                        <td>12.000</td>
                                                        <td>01/01/2022</td>
                                                    </tr>
                                                </tbody>
                                            </table>
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