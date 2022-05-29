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
                            <div class="row product-list-container">
                            <c:forEach items="${requestScope.productListByPage}" var="product">
                                <div class="col-3 mb-3">
                                    <div class="card product-card">
                                        <a href="product?id=${product.product_id}">
                                            <img src="${product.images.get(0).path}" class="card-img-top" alt="...">
                                        </a>
                                        <div class="card-body">
                                            <a href="product?id=${product.product_id}"  data-bs-toggle="tooltip" title="${product.title}">
                                                <h6 class="card-title product-title font-weight-bold">${product.title}</h6>
                                            </a>
                                            <h6 class="card-subtitle mb-2 text-muted">
                                                <c:if test="${product.sale_price != 0}">
                                                    <span class="text-decoration-line-through"><fmt:formatNumber value="${product.original_price}" type="currency" currencySymbol="đ" maxFractionDigits="0"/></span>
                                                    <span style="color: red;"> <fmt:formatNumber value="${product.sale_price}" type="currency" currencySymbol="đ" maxFractionDigits="0"/></span>
                                                </c:if>
                                                <c:if test="${product.sale_price == 0}"><span><fmt:formatNumber value="${product.original_price}" type="currency" currencySymbol="đ" maxFractionDigits="0"/></span></c:if>
                                            </h6>
                                            <p class="card-text brief-infor">${product.product_details}</p>
                                            <form action="buy" method="post">
                                                <input type="text" name="id" value="${product.product_id}" hidden="true">
                                                <input type="number" name="quantity" value="1" hidden="true">
                                                <div class="d-flex justify-content-between">
                                                    <a href="feedbeck?id=${product.product_id}" type="button" class="btn btn-outline-primary">Feedback</a>
                                                    <button type="submit" class="btn btn-outline-primary">Buy</button>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <!--pagination-->
                        <nav aria-label="Page navigation example" class="paging">
                            <ul class="pagination justify-content-center">
                                <li class="page-item <c:if test="${requestScope.pageNumber==1}">disabled</c:if>">
                                    <a class="page-link" href="productslist?page=${requestScope.pageNumber-1}" aria-label="Previous">
                                        <span aria-hidden="true">Previous</span>
                                    </a>
                                </li>
                                <c:if test="${requestScope.pageNumber!=1}">
                                    <li class="page-item"><a class="page-link" href="productslist?page=${requestScope.pageNumber-1}">${requestScope.pageNumber-1}</a></li>
                                </c:if>
                                <li class="page-item"><a class="page-link" href="productslist?page=${requestScope.pageNumber}">${requestScope.pageNumber}</a></li>
                                <li class="page-item"><a class="page-link" href="productslist?page=${requestScope.pageNumber+1}">${requestScope.pageNumber+1}</a></li>
                                <li class="page-item">
                                    <a class="page-link" href="productslist?page=${requestScope.pageNumber+1}" aria-label="Next">
                                        <span aria-hidden="true">Next</span>
                                    </a>
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

    <script src="https://unpkg.com/@popperjs/core@2"></script>
    <script>
        const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]')
        const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl))
    </script>
</html>