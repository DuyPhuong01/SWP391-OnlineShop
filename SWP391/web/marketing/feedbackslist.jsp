<%@page import="dal.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!Doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" />
        <title>Marketing - Feedbacks List</title>
        <link rel="stylesheet" href="../css/style.css">
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>

    </head>

    <body>
        <div class="d-flex">
            <c:import url="/marketing/sidebar.jsp"></c:import>
                <!--side bar-->
                <div class="container-lg my-5">
                    <div class="p-3 bg-white rounded shadow-sm">
                        <div class="top-head">
                            <form id="feedbackSearchForm" action="feedbackslist" method="post">
                                <input type="number" id="page" name="page" value="${requestScope.pageNumber}" hidden>
                            <div class="mb-3 d-flex justify-content-between">
                                <div>
                                    <a class="btn btn-outline-primary cursor-pointer" onclick="openFilterOverlay()">Choose Filter</a>
                                </div>
                                <div>
                                    <div id="modal-filer" class="modal modal-xl">
                                        <div class="modal-dialog">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="btn-close" onclick="closeModalFilter()"></button>
                                                </div>
                                                <div class="modal-body pb-5">
                                                    <div class="row">
                                                        <div class="col-6">
                                                            <h3>Status</h3>
                                                            <div>
                                                                <label>
                                                                    <input class="me-2" type="radio" name="status" value="-1">All
                                                                </label>
                                                            </div>
                                                            <div>
                                                                <label>
                                                                    <input class="me-2" type="radio" name="status" value="1">Showed
                                                                </label>
                                                            </div>
                                                            <div>
                                                                <label>
                                                                    <input class="me-2" type="radio" name="status" value="0">Hidden
                                                                </label>
                                                            </div>
                                                        </div>
                                                        <div class="col-6">
                                                            <h3>Rated Star</h3>
                                                            <div>
                                                                <label>
                                                                    <input class="me-2" type="checkbox" name="rated_star" value="0" onclick="clearCheckboxRatedStar()">All
                                                                </label>
                                                            </div>
                                                            <div>
                                                                <label>
                                                                    <input class="me-2" type="checkbox" name="rated_star" value="1" onclick="clearCheckboxRatedStarAll()">1
                                                                </label>
                                                            </div>
                                                            <div>
                                                                <label>
                                                                    <input class="me-2" type="checkbox" name="rated_star" value="2" onclick="clearCheckboxRatedStarAll()">2
                                                                </label>
                                                            </div>
                                                            <div>
                                                                <label>
                                                                    <input class="me-2" type="checkbox" name="rated_star" value="3" onclick="clearCheckboxRatedStarAll()">3
                                                                </label>
                                                            </div>
                                                            <div>
                                                                <label>
                                                                    <input class="me-2" type="checkbox" name="rated_star" value="4" onclick="clearCheckboxRatedStarAll()">4
                                                                </label>
                                                            </div>
                                                            <div>
                                                                <label>
                                                                    <input class="me-2" type="checkbox" name="rated_star" value="5" onclick="clearCheckboxRatedStarAll()">5
                                                                </label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div>
                                                        <h3>Feedbacks Type</h3>
                                                        <div>
                                                            <label>
                                                                <input class="me-2" type="radio" name="type" value="1" onclick="hideProductOption(event)">General Feedbacks
                                                            </label>
                                                        </div>
                                                        <div>
                                                            <label>
                                                                <input class="me-2" type="radio" name="type" value="2" onclick="showProductOption(event)">Product Feedbacks
                                                            </label>
                                                        </div>
                                                        <div id="sub-product-select" class="ms-5" style="opacity: 0;">
                                                            <div>
                                                                <label>
                                                                    <input class="me-2" type="radio" name="typeProduct" value="0" onclick="hideProductList(event)">All Products
                                                                </label>
                                                            </div>
                                                            <div>
                                                                <label>
                                                                    <input class="me-2" type="radio" name="typeProduct" value="1" onclick="showProductList(event)">Custom Products
                                                                </label>
                                                                <div id="product-list" class="ms-5" style="opacity: 0;">
                                                                    
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div>
                                    <div id="modal-search" class="modal">
                                        <div class="modal-dialog">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <h6 class="modal-title">Search Feedback</h6>
                                                    <button type="button" class="btn-close" onclick="closeModalSearch()"></button>
                                                </div>
                                                <div class="modal-body">
                                                    <input class="form-control" type="text" name="key" value="${requestScope.searchKey}">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div>
                                    <input class="btn btn-primary" type="submit" value="Filter">
                                </div>
                            </div>
                            <div>
                                <span class="me-3" id="basic-addon1">Sort by</span>
                                <label>
                                    <input type="radio" class="btn-check" name="orderby" value="feedback_id asc" ${requestScope.choosen_orderby eq "product_id asc"?"checked":""}>
                                    <div class="btn btn-outline-primary">
                                        <i class="fa-solid fa-arrow-down-1-9"></i>
                                        <span>ID</span>
                                    </div>
                                </label>
                                <label>
                                    <input type="radio" class="btn-check" name="orderby" value="feedback_id desc" ${requestScope.choosen_orderby eq "product_id desc"?"checked":""}>
                                    <div class="btn btn-outline-primary">
                                        <i class="fa-solid fa-arrow-down-9-1"></i>
                                        <span>ID</span>
                                    </div>
                                </label>
                                <label>
                                    <input type="radio" class="btn-check" name="orderby" value="full_name asc" ${requestScope.choosen_orderby eq "name asc"?"checked":""}>
                                    <div class="btn btn-outline-primary">
                                        <i class="fa-solid fa-arrow-down-a-z"></i>
                                        <span>Fullname</span>
                                    </div>
                                </label>
                                <label>
                                    <input type="radio" class="btn-check" name="orderby" value="full_name desc" ${requestScope.choosen_orderby eq "name desc"?"checked":""}>
                                    <div class="btn btn-outline-primary">
                                        <i class="fa-solid fa-arrow-down-z-a"></i>
                                        <span>Fullname</span>
                                    </div>
                                </label>
                                <label>
                                    <input type="radio" class="btn-check" name="orderby" value="email asc"  ${requestScope.choosen_orderby eq "original_price asc"?"checked":""}>
                                    <div class="btn btn-outline-primary">
                                        <i class="fa-solid fa-arrow-down-a-z"></i>
                                        <span>Email</span>
                                    </div>
                                </label>
                                <label>
                                    <input type="radio" class="btn-check" name="orderby" value="email desc" ${requestScope.choosen_orderby eq "original_price desc"?"checked":""}>
                                    <div class="btn btn-outline-primary">
                                        <i class="fa-solid fa-arrow-down-z-a"></i>
                                        <span>Email</span>
                                    </div>
                                </label>
                                <label>
                                    <input type="radio" class="btn-check" name="orderby" value="star asc"  ${requestScope.choosen_orderby eq "sale_price asc"?"checked":""}>
                                    <div class="btn btn-outline-primary">
                                        <i class="fa-solid fa-arrow-down-short-wide"></i>
                                        <span>Rated star</span>
                                    </div>
                                </label>
                                <label>
                                    <input type="radio" class="btn-check" name="orderby" value="star desc"  ${requestScope.choosen_orderby eq "sale_price desc"?"checked":""}>
                                    <div class="btn btn-outline-primary">
                                        <i class="fa-solid fa-arrow-down-wide-short"></i>
                                        <span>Rated star</span>
                                    </div>
                                </label>
                            </div>
                        </form>
                    </div>
                    <div>
                        <hr>
                    </div>
                    <div>
                        <table class="table table-hover">
                            <thead class="sticky-0 bg-white">
                                <tr>
                                    <th>Id</th>
                                    <th>Fullname</th>
                                    <th>Product Name</th>
                                    <th>Rated Star</th>
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
                                <li class="page-item<c:if test="${requestScope.pageNumber <= 1}"> disabled"</c:if> <c:if test="${requestScope.pageNumber > 1}"> cursor-pointer" onclick="nextProductPage(${requestScope.pageNumber - 1});"</c:if>>
                                    <a class="page-link">Previous</a>
                                    </li>
                                        <li class="page-item"><span class="page-link">${requestScope.pageNumber}</span></li>
                                <li class="page-item<c:if test="${requestScope.pageNumber >= requestScope.numberPage}"> disabled"</c:if> <c:if test="${requestScope.pageNumber < requestScope.numberPage}"> cursor-pointer" onclick="nextProductPage(${requestScope.pageNumber + 1});"</c:if>>
                                    <a class="page-link">Next</a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
        <script>
            function nextProductPage(pageNumber) {
                document.getElementById('page').value = pageNumber;
                document.getElementById('productSearchForm').submit();
            }
        </script>
        <div class="fixed-end-bottom">
            <a class="cursor-pointer" onclick="openModalSearch()" data-bs-toggle="tooltip" data-bs-placement="left" title="Search">
                <div class="px-3 py-2 bg-white rounded-pill shadow-sm">
                    <i class="fa-solid fa-magnifying-glass"></i>
                </div>
            </a>
        </div>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://unpkg.com/@popperjs/core@2"></script>
    <script>
                const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]');
                const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl));
    </script>
    <script src="../js/marketing/feedbackslist.js"></script>
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