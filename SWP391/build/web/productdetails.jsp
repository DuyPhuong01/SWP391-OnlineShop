<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Product Details</title>
        <!-- CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <div class="header">
            <!-- navbar -->
            <c:import url="navbar.jsp"></c:import>
                <!-- end navbar -->
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-3">
                        <div class="sider">
                            <!-- sider -->
                        <c:import url="sider.jsp"></c:import>
                            <!-- end sider -->
                        </div>
                    </div>
                    <div class="col-9">
                        <div class="content">
                        <c:set var="prodct" value="${requestScope.product}"></c:set>
                            <div class="row product-details-container">
                                <div class="col-6">
                                    <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="true">
                                        <div class="carousel-indicators">
                                        <%
                                            int index = 0;
                                        %>
                                        <c:forEach var="product_image" items="${product.images}">
                                            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="<%= index%>" aria-current="true" aria-label="Slide <%= index + 1%>"></button>
                                            <%
                                                index++;
                                            %>
                                        </c:forEach>
                                    </div>
                                    <div class="carousel-inner">
                                        <c:forEach var="product_image" items="${product.images}">
                                            <div class="carousel-item">
                                                <img src="${product_image.path}" class="d-block w-100" alt="${product_image.description}">
                                            </div>
                                        </c:forEach>
                                    </div>
                                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                        <span class="visually-hidden">Previous</span>
                                    </button>
                                    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                        <span class="visually-hidden">Next</span>
                                    </button>
                                </div>
                            </div>
                            <div class="col-6">
                                <div class="card">
                                    <div class="card-body">
                                        <h3 class="card-title">${product.title}</h3>
                                        <h6 class="card-subtitle mb-2 text-muted">Category: ${product.category.category_name}</h6>
                                        <h4 class="card-subtitle mb-2"><span class="text-decoration-line-through">${product.original_price}</span> ${product.sale_price}</h4>
                                        <form action="addtocart">
                                            <input type="text" name="product_id" value="${product.product_id}" hidden="true">
                                            <div class="input-group mb-2">
                                                <label class="input-group-text" for="typeNumber">Quantity</label>
                                                <input type="number" id="typeNumber" name="quantity" class="form-control" value="1" min="1" />
                                            </div>
                                            <input class="btn btn-outline-primary" type="submit" value="Add to Cart">
                                        </form>
                                        <a href="addtocart?product_id="></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="card">
                            <div class="card-body">
                                <p class="card-text">${product.product_details}</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <script src="js/carousel.js"></script>

</html>