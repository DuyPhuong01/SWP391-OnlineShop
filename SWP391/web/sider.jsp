<%@page import="dal.ProductDAO"%>
<%@page import="dal.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="css/stylesider.css" rel="stylesheet"/>
<div id="sider" class="h-100 bg-white p-3 rounded shadow-sm">
    <%
        CategoryDAO category_dao = new CategoryDAO();
        ProductDAO product_dao = new ProductDAO();
    %>
    <form method="post" action="productslist" id="productSearchForm">
        <div class="search-container mb-3">
            <input id="productSeachKey" class="form-control" type="text" placeholder="Search Product" aria-label="default input example" name="key" id="productSeachKey" value="${requestScope.key}">
        </div>
    <div class="categories-list-container">
        <div class="text-center">
            <h5 class="mb-0 font-weight-bold">Categories</h5>
        </div>
            <div class="form-check sider-form-check">
                <c:set var="productCategoryList" value="<%= category_dao.getProductCategory()%>" />
                <c:set var="checked" value="${requestScope.checked}" />

                <c:forEach begin="0" end="${productCategoryList.size()-1}" var="i">
                    <div class="category-panel">
                        <p class="category-container"> 
                            <a href="productslist?categoryId=${productCategoryList.get(i).category_id}" class="category-title">${productCategoryList.get(i).category_name}</a>
                            <a class="btn collapse-btn" data-bs-toggle="collapse" href="#multiCollapse${i}" role="button" aria-expanded="false" aria-controls="multiCollapse${i}" onclick="changeState(this);" <c:if test="${productCategoryList.get(i).category_id == requestScope.categoryIdParent.category_id}">id="category-active"</c:if>>+</a>
                        </p>
                        <div class="row">
                            <div class="col">
                                <div class="collapse multi-collapse" id="multiCollapse${i}">
                                    <ul class="sub-category-list">
                                        <c:forEach items="${productCategoryList.get(i).subCategoryList}" var="k">
                                            <li class="sub-category-item" <c:if test="${k.id == requestScope.subCategoryId.id}">id="sub-category-active"</c:if>>
                                                <a href="productslist?subCategoryId=${k.id}">${k.name}</a>

                                            </li>
                                        </c:forEach>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
    </div>
        <div class="hidden-input">
            <input type="hidden" value="<c:if test="${requestScope.pageNumber != null}">${requestScope.pageNumber}</c:if><c:if test="${requestScope.pageNumber == null}">1</c:if>" name="page" id="page"/>
            <input type="hidden" value="<c:if test="${requestScope.orderOption != null}">${requestScope.orderOption}</c:if><c:if test="${requestScope.orderOption == null}">newest</c:if>" name="orderOption" id="order-option"/>
            <c:if test="${requestScope.categoryId != null}"><input type="hidden" value="${requestScope.categoryId.category_id}" name="categoryId"></c:if>
            <c:if test="${requestScope.subCategoryId != null}"><input type="hidden" value="${requestScope.subCategoryId.id}" name="subCategoryId"></c:if>
            </div>
    <div class="submit-button mb-3">
        <!--<button class="btn btn-light w-100" type="subbmit">Search</button>-->
    </div>
</form>
    <div class="lastest-product-container row mb-3">
        <div class="p-2 text-center">
            <h5 class="mb-0 font-weight-bold">Latest Product</h5>
        </div>
        <c:forEach var="product" items="<%= product_dao.getLastActiveProducts(6)%>">
            <div class="lastest-product col-4 mb-3">
                <div class="card">
                    <a href="product?id=${product.product_id}" data-bs-toggle="tooltip" title="${product.name}">
                        <img src="${product.thumbnail}" class="card-img-top" alt="${product.images.get(0).description}">
                    </a>
                </div>
            </div>
        </c:forEach>
    </div>
    <div class="static-contact-container col-12 d-flex justify-content-center">
        <span class="bg-light rounded-pill py-1 px-2">phone: +0123456789</span>
    </div>
</div>
<script>
                                function changeState(item) {
                                    if (item.innerHTML === "+") {
                                        item.innerHTML = "-";
                                    } else {
                                        item.innerHTML = "+";
                                    }
                                }
</script>
