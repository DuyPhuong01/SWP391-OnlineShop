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

        <!--font-awesome-->
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
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
                    <c:import url="sider.jsp"></c:import>
                    </div>
                    <!--product list-->
                    <div class="col-9">
                        <div class="p-3 bg-white rounded shadow-sm">
                            <div class="p-2 bg-light rounded d-flex justify-content-between">
                                <div class="input-group w-25 mb-3">
                                    <span class="input-group-text" id="basic-addon1">Sort by</span>
                                    <select class="form-control" name="orderOption" id="order-by" onchange="searchProductByChangeOrderOption()"  aria-describedby="basic-addon1">
                                        <option value="newest" ${requestScope.orderOption eq "newest"?"selected":""}/> Newest 
                                    <option value="oldest" ${requestScope.orderOption eq "oldest"?"selected":""}/> Oldest 
                                </select>
                                </div>
                                <!--pagination-->
                                <nav aria-label="Page navigation example">
                                    <ul class="pagination">
                                        <li class="page-item"><button class="page-link" <c:if test="${requestScope.pageNumber == 1}">disabled</c:if> onclick="nextProductPage(${requestScope.pageNumber - 1});"><i class="fa-solid fa-less-than"></i></button></li>
                                        <li class="page-item"><a class="page-link" href="#">${requestScope.pageNumber} / ${requestScope.numberPage}</a></li>
                                        <li class="page-item"><button class="page-link" <c:if test="${requestScope.pageNumber == requestScope.numberPage}">disabled</c:if> onclick="nextProductPage(${requestScope.pageNumber + 1});"><i class="fa-solid fa-greater-than"></i></button></li>
                                    </ul>
                                </nav>
                                <!--end pagination-->
                            </div>
                            <!--product list-->
                            <div class="row product-list-container">
                            <c:forEach items="${requestScope.productListByPage}" var="i">
                                <div class="col-3 product-container">
                                    <div class="card">
                                        <a href="product?id=${i.product_id}" class="product-thumbnail"><img src="${i.images.get(0).path}" class="card-img-top" alt="..."></a>
                                        <div class="card-body">
                                            <a href="product?id=${i.product_id}" data-bs-toggle="tooltip" title="${i.title}">
                                                <h6 class="card-title product-title font-weight-bold">${i.title}</h6>
                                            </a>
                                            <h6 class="card-subtitle mb-2 text-muted">
                                                <c:if test="${i.sale_price != 0}"><span class="text-decoration-line-through"><fmt:formatNumber value="${i.original_price}" type="currency" currencySymbol="đ"/></span> <span style="color: red;"> <fmt:formatNumber value="${i.sale_price}" type="currency" currencySymbol="đ"/></span></c:if>
                                                <c:if test="${i.sale_price == 0}"><span><fmt:formatNumber value="${i.original_price}" type="currency" currencySymbol="đ" /></span></c:if>
                                                </h6>
                                                <p class="card-text">${i.product_details}</p>
                                            <form action="buy" method="post">
                                                <input type="text" name="id" value="${i.product_id}" hidden="true">
                                                <input type="number" name="quantity" value="1" hidden="true">
                                                <button type="submit" class="btn btn-outline-primary">Buy</button>
                                                <a href="feedback?id=${i.product_id}" class="btn btn-outline-primary">Feedback</a>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <!--end product list-->
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

    <script src="https://unpkg.com/@popperjs/core@2"></script>
    <script>
        const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]')
        const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl))
    </script>
</html>