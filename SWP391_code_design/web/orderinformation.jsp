<%-- 
    Document   : myorders
    Created on : May 18, 2022, 3:04:59 PM
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
                <title>Order Information</title>
                <!-- CSS -->
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
                <link rel="stylesheet" href="css/style.css">
                <!-- JavaScript Bundle with Popper -->
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
            </head>

            <body>
                <div class="header">
                    <c:import url="navbar.jsp"></c:import>
                </div>
                <div class="row container">
                    <!-- sider -->
                    <div class="col-3">
                        <div class="sider">
                            <c:import url="sider.jsp"></c:import>
                        </div>
                    </div>
                    <!-- content -->
                    <div class="col-9">
                        <!-- order information -->
                        <div class="content order-information-container">
                            <div class="row">
                                <div class="col-6">
                                    <div class="card">
                                        <div class="card-body">
                                            <h5 class="card-title">Order Information</h5>
                                            <table>
                                                <tr>
                                                    <td>ID:</td>
                                                    <td></td>
                                                </tr>
                                                <tr>
                                                    <td>Order Date:</td>
                                                    <td></td>
                                                </tr>
                                                <tr>
                                                    <td>Total Cost:</td>
                                                    <td></td>
                                                </tr>
                                                <tr>
                                                    <td>Status:</td>
                                                    <td></td>
                                                </tr>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="card">
                                        <div class="card-body">
                                            <h5 class="card-title">Receiver Information</h5>
                                            <table>
                                                <tr>
                                                    <td>Fullname:</td>
                                                    <td></td>
                                                </tr>
                                                <tr>
                                                    <td>Gender:</td>
                                                    <td></td>
                                                </tr>
                                                <tr>
                                                    <td>Email:</td>
                                                    <td></td>
                                                </tr>
                                                <tr>
                                                    <td>Mobile:</td>
                                                    <td></td>
                                                </tr>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- order details -->
                        <div class="content order-details">
                            <table class="table">
                                <tbody>
                                    <tr>
                                        <td><img src="images/product-image.jpg" alt=""></td>
                                        <td>
                                            <h5>Product Name</h5>
                                            <h6 class="card-subtitle mb-2 text-muted">Category</h6>
                                            <p>123.000</p>
                                        </td>
                                        <td>
                                            <p>1</p>
                                        </td>
                                        <td>
                                            <p>123.000</p>
                                        </td>
                                        <td>
                                            <button type="button" class="btn btn-outline-primary">Rebuy</button>
                                            <button type="button" class="btn btn-outline-primary">Feedbacks</button>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><img src="images/product-image.jpg" alt=""></td>
                                        <td>
                                            <h5>Product Name</h5>
                                            <h6 class="card-subtitle mb-2 text-muted">Category</h6>
                                            <p>123.000</p>
                                        </td>
                                        <td>
                                            <p>1</p>
                                        </td>
                                        <td>
                                            <p>123.000</p>
                                        </td>
                                        <td>
                                            <button type="button" class="btn btn-outline-primary">Rebuy</button>
                                            <button type="button" class="btn btn-outline-primary">Feedbacks</button>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                            <div>
                                <button type="button" class="btn btn-outline-danger">Cancel</button>
                                <button type="button" class="btn btn-outline-primary">Update</button>
                            </div>
                        </div>
                    </div>
                </div>
            </body>
            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>

            </html>