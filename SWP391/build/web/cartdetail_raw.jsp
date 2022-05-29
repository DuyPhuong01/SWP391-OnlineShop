<%-- 
    Document   : cartdetail
    Created on : May 25, 2022, 2:28:15 AM
    Author     : win
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cart details</title>
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.rtl.min.css" integrity="sha384-dc2NSrAXbAkjrdm9IYrX10fQq9SDG6Vjz7nQVKdKcJl3pC+k37e7qJR5MVSCS+wR" crossorigin="anonymous">

    <!-- ===== CSS ===== -->
    <link rel="stylesheet" href="css/stylecartdetails.css" />
    </head>
   <body>
       <c:set var="o" value="${requestScope.cart}" />
       <c:set var="tt" value="0" />
    <div class="shopping-cart">
        <div class="px-4 px-lg-0">

            <div class="pb-5">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12 p-5 bg-white rounded shadow-sm mb-5">

                            <!-- Shopping cart table -->
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th scope="col" class="border-0 bg-lightt">
                                                <div class="p-2 px-3 text-uppercase">ID</div>
                                            </th>
                                            <th scope="col" class="border-0 bg-lightt">
                                                <div class="p-2 px-3 text-uppercase">Sản Phẩm</div>
                                            </th>
                                            <th scope="col" class="border-0 bg-lightt">
                                                <div class="py-2 text-uppercase">Đơn Giá</div>
                                            </th>
                                            <th scope="col" class="border-0 bg-lightt">
                                                <div class="py-2 text-uppercase">Số Lượng</div>
                                            </th>
                                            <th scope="col" class="border-0 bg-lightt">
                                                <div class="py-2 text-uppercase">Xóa</div>
                                            </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${o.items}" var="i">
                                        <tr>
                                            
                                            <th scope="row">
                                                <div class="p-2">
                                                    <div class="ml-3 d-inline-block align-middle">
                                                        <h5 class="mb-0"> ${i.product.product_id}</a></h5><span class="text-muted font-weight-normal font-italic"></span>
                                                    </div>
                                                </div>
                                            </th>
                                            <th scope="row">
                                                <div class="p-2">
                                                    <img src="${i.product.images.get(0).path}" alt="" width="70" class="img-fluid rounded shadow-sm">
                                                    <div class="ml-3 d-inline-block align-middle title-item">
                                                        <h5 class="mb-0"> <a href="detail?pid=${i.product.product_id}" style="text-decoration: none;font-size: 17px;"
                                                                             class="text-dark d-inline-block title-item-a">${i.product.title}</a></h5><span class="text-muted font-weight-normal font-italic"></span>
                                                    </div>
                                                </div>
                                            </th>
                                            <td class="align-middle" style="font-size: 14px;">
                                                    <strong>
                                                        <fmt:formatNumber value="${i.product.sale_price} " type="currency" currencySymbol="đ" />
                                                    </strong>
                                            </td>
                                            <td class="align-middle">
                                                <a href="process?num=-1&id=${i.product.product_id}"><button class="btnSub">-</button></a> 
                                                <strong>${i.quantity}</strong>
                                                <a href="process?num=1&id=${i.product.product_id}"><button class="btnAdd">+</button>
                                                </a>
                                            </td>
                                            <td class="align-middle"><a href="#" class="text-dark">
                                                    <form action="process" method="post">
                                                        <input type="hidden" name="id" value="${i.product.product_id}"/>
                                                        <button type="submit" class="btn btn-danger">Xóa khỏi giỏ</button>
                                                    </form>
                                                </a>
                                            </td>
                                        </tr> 
                                    </c:forEach>

                                </tbody>
                            </table>
                        </div>
                        <!-- End -->
                        <section class="home-sp">
                            <div class="page-trang table">
                                <a href="#"></a>
                                <a href="#"></a>
                            </div>
                        </section>
                        
                    </div>
                </div>

                <div class="row py-5 p-4 bg-white rounded shadow-sm">
                    <div class="col-lg-3">

                    </div>
                    <div class="col-lg-6">
                                <div class="bg-lightt rounded-pill px-4 py-3 text-uppercase font-weight-bold">Thành tiền</div>
                                <div class="p-4">
                                    <ul class="list-unstyled mb-4">
                                                <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Tổng tiền hàng</strong><strong>
                                            
                                            </strong>
                                            <h5 class="font-weight-bold"><fmt:formatNumber value="${o.totalMoney} " type="currency" currencySymbol="đ" /></h5></li>
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Phí vận chuyển</strong><strong>Free ship</strong></li>
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">VAT</strong><strong></strong></li>
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Tổng thanh toán</strong>
                                         <h5 class="font-weight-bold"><fmt:formatNumber value="${o.totalMoney} " type="currency" currencySymbol="đ" />
                                        </li>
                                    </ul>
                                        <a href="checkout"  class="btn btn-dark rounded-pill py-2 btn-block">Thanh toán</a>
                                        <a href="productslist" class="btn btn-layer rounded-pill py-2 btn-block">Tiếp tục mua hàng</a>
                                </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
    <script src="js/script.js"></script>
</body>
</html>
