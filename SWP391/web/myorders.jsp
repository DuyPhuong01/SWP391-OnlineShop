<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>My Orders</title>
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
            <div class="container-lg">
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
                            <table class="orders-list table">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Order Date</th>
                                        <th>Product</th>
                                        <th>Total cost</th>
                                        <th>Status</th>
                                    </tr>
                                </thead>
                                <tbody class="table-group-divider">
                                    <tr>
                                        <td><span>1</span>
                                            <div><a href="orderinformation.jsp">details</a></div>
                                        </td>
                                        <td>01/01/2022</td>
                                        <td>Product name</td>
                                        <td>123.000</td>
                                        <td>delivered</td>
                                    </tr>
                                    <tr>
                                        <td><span>2</span>
                                            <div><a href="orderinformation.jsp">details</a></div>
                                        </td>
                                        <td>01/01/2022</td>
                                        <td>Product name</td>
                                        <td>123.000</td>
                                        <td>delivered</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

        </html>