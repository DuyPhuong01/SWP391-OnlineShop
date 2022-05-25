<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <link rel="stylesheet" href="css/styleproductlist.css">
        <link rel="stylesheet" href="css/stylefooter.css">

    </head>

    <body>
        <div class="header">
            <!-- navbar -->
            <c:import url="navbar.jsp"></c:import>
                <!-- end navbar -->
            </div>
            <div class="container-lg">
                <li style=" list-style-type: none;" class="nav-item">
                    <div cart-contain>
                        <svg style="height: 30px;width: 30px" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><!--! Font Awesome Pro 6.1.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2022 Fonticons, Inc. --><path d="M0 24C0 10.75 10.75 0 24 0H96C107.5 0 117.4 8.19 119.6 19.51L121.1 32H312V134.1L288.1 111C279.6 101.7 264.4 101.7 255 111C245.7 120.4 245.7 135.6 255 144.1L319 208.1C328.4 218.3 343.6 218.3 352.1 208.1L416.1 144.1C426.3 135.6 426.3 120.4 416.1 111C407.6 101.7 392.4 101.7 383 111L360 134.1V32H541.8C562.1 32 578.3 52.25 572.6 72.66L518.6 264.7C514.7 278.5 502.1 288 487.8 288H170.7L179.9 336H488C501.3 336 512 346.7 512 360C512 373.3 501.3 384 488 384H159.1C148.5 384 138.6 375.8 136.4 364.5L76.14 48H24C10.75 48 0 37.25 0 24V24zM224 464C224 490.5 202.5 512 176 512C149.5 512 128 490.5 128 464C128 437.5 149.5 416 176 416C202.5 416 224 437.5 224 464zM416 464C416 437.5 437.5 416 464 416C490.5 416 512 437.5 512 464C512 490.5 490.5 512 464 512C437.5 512 416 490.5 416 464z"/></svg>
                    </div>
                    <a class="nav-link" href="showcart">My Cart(${requestScope.size})</a>
                 </li>
                <div class="row">
                    <div class="col-3">
                        <div class="sider" style="height: 100%;">
                            <!-- sider -->
                        <c:import url="sider.jsp"></c:import>
                            <!-- end sider -->
                        </div>
                    </div>
                    <!--product list-->
                    <div class="col-9">
                        <div class="content">
                            <div class="row product-list-container">
                            <c:forEach items="${requestScope.productListByPage}" var="i">
                                <div class="col-3 product-container">
                                    <div class="card">
                                        <a href="product?id=${i.product_id}"><img src="${i.images.get(0).path}" class="card-img-top" alt="..."></a>
                                        <div class="card-body">
                                            <h5 class="card-title">${i.title}</h5>
                                            <h6 class="card-subtitle mb-2 text-muted">
                                                <c:if test="${i.sale_price != 0}"><span class="text-decoration-line-through"><fmt:formatNumber value="${i.original_price}" type="currency" currencySymbol="đ"/></span> <span style="color: red;"> <fmt:formatNumber value="${i.sale_price}" type="currency" currencySymbol="đ"/></span></c:if>
                                                <c:if test="${i.sale_price == 0}"><span><fmt:formatNumber value="${i.original_price}" type="currency" currencySymbol="đ" /></span></c:if>
                                                </h6>
                                                <p class="card-text">${i.product_details}</p>
                                            <button type="button" class="btn btn-outline-primary">Buy</button>
                                            <button type="button" class="btn btn-outline-primary">Feedback</button>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <!--pagination-->
                        <nav aria-label="Page navigation example" class="paging">
                            <ul class="pagination">
                                <li class="page-item">
                                    <a class="page-link" href="productslist?page=${requestScope.pageNumber-1}" aria-label="Previous">
                                        <span aria-hidden="true">&laquo;</span>
                                    </a>
                                </li>
                                <li class="page-item"><a class="page-link" href="productslist?page=${requestScope.pageNumber-1}">${requestScope.pageNumber-1}</a></li>
                                <li class="page-item"><a class="page-link" href="productslist?page=${requestScope.pageNumber}">${requestScope.pageNumber}</a></li>
                                <li class="page-item"><a class="page-link" href="productslist?page=${requestScope.pageNumber+1}">${requestScope.pageNumber+1}</a></li>
                                <li class="page-item">
                                    <a class="page-link" href="productslist?page=${requestScope.pageNumber+1}" aria-label="Next">
                                        <span aria-hidden="true">&raquo;</span>
                                    </a>
                                </li>
                                <li class="page-item">
                                </li>
                            </ul>
                        </nav>
                        <!--end pagination-->
                    </div>
                </div>
                <!--end product list-->
            </div>
        </div>
        <!--footer-->
        <div class="footer">
            <c:import url="footer.jsp"></c:import>
        </div>      
        <!--end footer-->
    </body>
    <script src="js/productssearchfunction.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</html>