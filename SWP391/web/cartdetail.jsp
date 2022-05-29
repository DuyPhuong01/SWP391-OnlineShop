<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cart details</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css" />
    </head>

    <body>
        <c:set var="o" value="${requestScope.cart}" />
        <c:set var="tt" value="0" />
        <div class="header">
            <c:import url="navbar.jsp"></c:import>
            </div>
            <div class="container-lg mb-5">
                <div class="row">
                    <div class="col-3">
                        <c:import url="sider.jsp"></c:import>
                    </div>
                    <div class="col-9">
                        <div class="p-3 bg-white rounded shadow-sm mb-3">
                            <div class="text-center">
                                <h3 class="pb-3 text-uppercase font-weight-bold">My Cart</h3>
                            </div>
                            <!-- Shopping cart table -->
                            <table class="table table-hover">
                                <thead>
                                    <tr class="text-center">
                                        <th>Product</th>
                                        <th>Price</th>
                                        <th>Quantity</th>
                                        <th>Total Cost</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody class="table-group-divider">
                                <c:forEach items="${o.items}" var="i">
                                    <tr>
                                        <td class="w-25">
                                            <img src="${i.product.images.get(0).path}" alt="" width="70" class="img-fluid rounded shadow-sm">
                                            <div class="text-center">
                                                <a href="product?id=${i.product.product_id}" class="text-decoration-none text-muted"><h5 class="product-title">${i.product.title}</h5></a>
                                            </div>
                                        </td>
                                        <td class="align-middle">
                                            <b class="d-flex justify-content-center">
                                                <c:if test="${i.product.sale_price != 0}"><fmt:formatNumber value="${i.product.sale_price}" type="currency" currencySymbol="đ"/></c:if>
                                                <c:if test="${i.product.sale_price == 0}"><fmt:formatNumber value="${i.product.original_price}" type="currency" currencySymbol="đ" /></c:if>
                                            </b>
                                        </td>
                                        <td class="align-middle">
                                            <div class="d-flex justify-content-center">
                                                <div>
                                                    <a class="btn btn-outline-success" href="process?num=-1&id=${i.product.product_id}">-</a>
                                                    <b>${i.quantity}</b>
                                                    <a class="btn btn-outline-success" href="process?num=1&id=${i.product.product_id}">+</a>
                                                </div>
                                            </div>
                                        </td>
                                        <td class="align-middle">
                                            <b class="d-flex justify-content-center">
                                                <c:if test="${i.product.sale_price != 0}"><fmt:formatNumber value="${i.product.sale_price*i.quantity}" type="currency" currencySymbol="đ"/></c:if>
                                                <c:if test="${i.product.sale_price == 0}"><fmt:formatNumber value="${i.product.original_price*i.quantity}" type="currency" currencySymbol="đ" /></c:if>
                                            </b>
                                        </td>
                                        <td class="align-middle">
                                            <form action="process" method="post" class="d-flex justify-content-center">
                                                <input type="hidden" name="id" value="${i.product.product_id}" />
                                                <button type="submit" class="btn btn-danger">Delete</button>
                                            </form>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                        <!-- End -->
                        <section class="home-sp">
                            <div class="page-trang table">
                                <a href="#"></a>
                                <a href="#"></a>
                            </div>
                        </section>

                    </div>
                    <div class="p-3 bg-white rounded shadow-sm">
                        <div class="text-center">
                            <h3 class="pb-3 text-uppercase font-weight-bold">Total Bill</h3>
                        </div>
                        <div class="p-4">
                            <ul class="list-unstyled mb-4">
                                <li class="d-flex justify-content-between py-3 border-bottom"><b class="text-muted">Sub Total</b>
                                    <h5 class="font-weight-bold"><fmt:formatNumber value="${o.totalMoney}" type="currency" currencySymbol="đ"/></h5>
                                </li>
                                <li class="d-flex justify-content-between py-3 border-bottom"><b class="text-muted">Shipping fee</b><b>Free ship</b></li>
                                <li class="d-flex justify-content-between py-3 border-bottom"><b class="text-muted">VAT</b><b></b></li>
                                <li class="d-flex justify-content-between py-3 border-bottom"><b class="text-muted">Total</b>
                                    <h5 class="font-weight-bold"><fmt:formatNumber value="${o.totalMoney}" type="currency" currencySymbol="đ"/></h5>
                                </li>
                            </ul>
                            <div class="d-flex justify-content-end">
                                <a href="productslist" class="btn">Click to continue Shopping</a>
                                <a href="checkout" class="btn btn-outline-primary ms-3">Mua hàng</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
        <script src="js/script.js"></script>
    </body>
</html>