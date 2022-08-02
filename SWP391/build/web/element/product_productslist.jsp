<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value = "vi_VN"/>

<c:forEach var="product" items="${requestScope.productsList}">
    <div class="col-3 mb-3">
        <div class="card product-card h-100">

            <a href="product?id=${product.product_id}" class="position-relative product-image">
                <img src="${product.thumbnail}" class="card-img-top">
                <c:if test="${product.unit_in_stock == 0}">
                    <div class="position-absolute" style="top: 50%; left: 50%; transform: translate(-50%, -50%);">
                        <span class="btn btn-light">SOLD OUT</span>
                    </div>
                </c:if>
            </a>
            <div class="card-body position-relative pb-5">
                <a href="product?id=${product.product_id}" title="${product.name}">
                    <h6 class="card-title product-title">${product.name}</h6>
                </a>
                <h6 class="card-subtitle mb-2 text-muted">
                    <c:if test="${product.sale_price != 0}">
                        <span class="text-decoration-line-through"><fmt:formatNumber value="${product.original_price}" type="currency"/></span>
                        <br/>
                        <span style="color: red;" class="fs-4"> <fmt:formatNumber value="${product.sale_price}" type="currency"/></span></c:if>
                    <c:if test="${product.sale_price == 0}"><span class="fs-4"><fmt:formatNumber value="${product.original_price}" type="currency"/></span></c:if>
                    </h6>
                    <p class="brief-infor">${product.briefInfor}</p>
                <div class="position-absolute w-100 px-2" style=" left: 0rem; bottom: 1rem;">
                    <div class="d-flex justify-content-between">
                        <a href="feedback?id=${i.product_id}" class="btn btn-outline-primary">Feedback</a>
                        <c:if test="${product.unit_in_stock != 0}">
                            <a href="buy?id=${product.product_id}&quantity=1" type="button" class="btn btn-outline-primary">Buy</a>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
    </div>
</c:forEach>
