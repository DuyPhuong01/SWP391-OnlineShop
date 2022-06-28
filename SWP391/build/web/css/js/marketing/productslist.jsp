<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!Doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" />
        <title>Marketing - Products List</title>
        <link rel="stylesheet" href="../css/style.css">
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>

    </head>

    <body>
        <div class="d-flex my-5">
            <c:import url="/marketing/sidebar.jsp"></c:import>
                <!--side bar-->
                <div class="container-lg">
                    <div class="p-3 bg-white rounded shadow-sm">
                        <div class="top-head">
                            <div class="input-group w-25">
                                <span class="input-group-text" id="basic-addon1">Sort by</span>
                                <select class="form-control" name="orderOption" id="order-by" onchange="searchProductByChangeOrderOption()" aria-describedby="basic-addon1">
                                    <option value="newest" ${requestScope.orderOption eq "newest"?"selected":""}/> Newest 
                                <option value="oldest" ${requestScope.orderOption eq "oldest"?"selected":""}/> Oldest 
                                <option value="lowestPrice" ${requestScope.orderOption eq "lowestPrice"?"selected":""}/> Lowest Price 
                                <option value="highestPrice" ${requestScope.orderOption eq "highestPrice"?"selected":""}/> Highest Price 
                            </select>
                        </div>
                    </div>
                    <div>
                        <hr>
                    </div>
                    <div>
                        <table class="table table-hover">
                            <thead class="sticky-0 bg-white">
                                <tr>
                                    <th>Id</th>
                                    <th>Thumbnail</th>
                                    <th>Title</th>
                                    <th>List Price</th>
                                    <th>Sale Price</th>
                                    <th>Category</th>
                                    <th>Quantity</th>
                                    <th>Status</th>
                                    <th></th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${requestScope.productListByPage}" var="i">
                                    <tr>
                                        <td class="align-middle">${i.product_id}</td>
                                        <td style="width: 10%;">
                                            <a href="product?id=${i.product_id}" class="product-thumbnail">
                                                <img src="../${i.thumbnail}" class="card-img-top w-100 rounded" alt="..." id="product-thumbnail" onmouseover="zoomIn(this);" onmouseout="zoomOut(this);">
                                            </a>
                                        </td>
                                        <td style="width: 20%">
                                            <a href="product?id=${i.product_id}" data-bs-toggle="tooltip" title="${i.name}">
                                                <h6 class="card-title product-title font-weight-bold">${i.name}</h6>
                                            </a>
                                        </td>
                                        <td>
                                            <fmt:formatNumber value="${i.original_price}" type="currency" currencySymbol="đ" maxFractionDigits="0" />
                                        </td>
                                        <td>
                                            <fmt:formatNumber value="${i.sale_price}" type="currency" currencySymbol="đ" maxFractionDigits="0" />
                                        </td>
                                        <td>
                                            <a href="productlist?category=${i.subCategory.category.category_id}">${i.subCategory.category.category_name}</a>
                                            <span> ,</span>
                                            <a href="productlist?category=${i.subCategory.id}">${i.subCategory.name}</a>
                                        </td>
                                        <td>${i.unit_in_stock}</td>
                                        <td>${i.status}</td>
                                        <td class="align-middle">
                                            <div class="form-check form-switch">
                                                <input class="featured-btn form-check-input" style="cursor: pointer" data-product-id="${i.product_id}" type="checkbox" role="switch" id="flexSwitchCheckDefault" <c:if test="${i.featured}">checked</c:if>/>
                                                    <label class="form-check-label" for="flexSwitchCheckDefault"></label>
                                                </div>
                                            </td>
                                            <td class="align-middle">
                                                <a href="product?id=${i.product_id}"><i class="fa-solid fa-pen-to-square"></i></a>
                                            </td>
                                        </tr>
                                </c:forEach>
                            </tbody>
                        </table>

                    </div>
                    <div class="paging">
                        <nav aria-label="Page navigation">
                            <ul class="pagination justify-content-center">
                                <li class="page-item disabled">
                                    <a class="page-link">Previous</a>
                                </li>
                                <li class="page-item"><a class="page-link" href="#">1</a></li>
                                <li class="page-item"><a class="page-link" href="#">2</a></li>
                                <li class="page-item"><a class="page-link" href="#">3</a></li>
                                <li class="page-item">
                                    <a class="page-link" href="#">Next</a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>

    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://unpkg.com/@popperjs/core@2"></script>
    <script>
        const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]');
        const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl));
    </script>
    <script>
        document.querySelectorAll('.featured-btn').forEach(b => {
            b.addEventListener('change', function () {
                var id = b.getAttribute('data-product-id');
                if (b.checked) {
                    if (confirm('Do you want to show product with id = ' + id + '?')) {
                        $.ajax({
                            url: 'editproduct',
                            type: 'post',
                            data: {
                                action: 'activate',
                                product_id: id
                            },
                            success: function (response) {
                                b.checked = true;
                                console.log(response);
                            },
                            error: function (XMLHttpRequest, textStatus, errorThrown) {
                                b.checked = false;
                            }
                        });
                    } else {
                        b.checked = false;
                    }
                } else {
                    if (confirm('Do you want to hide product with id = ' + id + '?')) {
                        $.ajax({
                            url: 'editproduct',
                            type: 'post',
                            data: {
                                action: 'disactivate',
                                product_id: id
                            },
                            success: function (response) {
                                b.checked = false;
                                console.log(response);
                            },
                            error: function (XMLHttpRequest, textStatus, errorThrown) {
                                b.checked = true;
                            }
                        });
                    } else {
                        b.checked = true;
                    }
                }
            });
        })
    </script>

</html>