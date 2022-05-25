<%@page import="dal.ProductDAO"%>
<%@page import="dal.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    CategoryDAO category_dao = new CategoryDAO();
    ProductDAO product_dao = new ProductDAO();
%>
<div class="search-container">
    <h5>Search Product  </h5>
    <input class="form-control" type="text" name="sider-search" placeholder="Search" aria-label="default input example" name="key" id="productSeachKey" value="${requestScope.key}">
</div>
<div class="categories-list-container">
    <h5>Categories</h5>
    <div class="form-check">
        <c:set var="productCategoryList" value="<%= category_dao.getProductCategory()%>"/>
        <c:set var="checked" value="${requestScope.checked}"/>

        <c:forEach begin="0" end="${productCategoryList.size()-1}" var="i">
            <div>
                <label class="form-check-label">
                    <input class="form-check-input" type="checkbox" value="${product_category.category_id}">${product_category.category_name}
                </label>
            </div>
            </c:forEach>
        </div>
    </div>
    <div class="lastest-product-container row">
        <h5>Lastest products</h5>
        <c:forEach var="product" items="<%= product_dao.getNewestActiveProducts(6) %>">
            <div class="lastest-product col-4 mb-3">
                <div class="card">
                    <a href="product?id=${product.product_id}">
                        <img src="${product.images.get(0).path}" class="card-img-top" alt="${product.images.get(0).description}">
                    </a>
                </div>
        </c:forEach>
    </div>
</div>
<div>
        <button class="btn btn-primary" onclick="searchProduct()">Search</button>

</div>
<div class="lastest-product-container row">
    <h5>Latest Product</h5>
    <c:forEach var="product" items="<%= product_dao.getLastActiveProducts(6)%>">
        <div class="lastest-product col-4 mb-3">
            <div class="card">
                <a href="product?id=${product.product_id}">
                    <img src="${product.images.get(0).path}" class="card-img-top" alt="${product.images.get(0).description}">
                </a>
            </div>
        </div>
    </c:forEach>
</div>
<div class="static-contact-container col-12 row">
    <p>phone: +0123456789</p>
</div>