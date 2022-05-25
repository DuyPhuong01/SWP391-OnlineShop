<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Products List</title>
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
                <li class="nav-item">
                    <a class="nav-link" href="showcart">My Cart(${requestScope.size})</a>
                 </li>
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
                            <div class="row product-list-container">
                            <c:forEach items="${listP}" var="p">
                                    <div class="col-4 mb-3">
                                        <div class="card">
                                            <a href="product?id=${p.product_id}"><img src="${p.thumbnail}" class="card-img-top" alt="..."></a>
                                            <div class="card-body">
                                                <h5 class="card-title">${p.title}</h5>
                                                <h6 class="card-subtitle mb-2 text-muted"><span class="text-decoration-line-through">${p.original_price}</span>${p.sale_price}</h6>
                                                <p class="card-text">${p.product_details}</p>
                                                <button type="button" class="btn btn-outline-primary">Buy & Feedback</button>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

        </html>