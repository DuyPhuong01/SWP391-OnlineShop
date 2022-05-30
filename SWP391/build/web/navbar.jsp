<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="home">Logo</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-between" id="navbarSupportedContent">
            <ul class="navbar-nav mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="productslist">Products</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="blogslist">Blogs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="feedbackslist">Feedbacks</a>
                </li>
            </ul>
            <form class="d-flex" action="productslist" role="search">
                <input class="form-control me-2" name="search" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-primary" type="submit">Search</button>
            </form>
            <c:if test="${sessionScope.account == null}">
                <ul class="navbar-nav mb-2 mb-lg-0" style="padding-top: 5px;">

                    <li class="nav-item dropdown me-2">
                        <a class="btn btn-outline-primary" href="#divOne" class="first-button">Login</a>
                        <c:import url="login.jsp"></c:import>
                        </li>

                        <li class="nav-item align-items-center">
                            <form action="showcart" method="GET">
                                <button type="submit" class="btn btn-primary position-relative">
                                    <i class='bx bx-cart-alt align-items-center'></i>
                                    <span class="position-absolute top-0 start-100 translate-middle badge rounded-pill" style="background-color: #807d7d; color: #ffffff;">
                                        4
                                        <span class="visually-hidden">Product in cart</span>
                                    </span>
                                </button>
                            </form>

                        </li>
                        <li><a class="dropdown-item" href="changepassword">Change password</a></li>
                        <li><a class="dropdown-item" href="logout">Log out</a></li>
                    </ul>
            </c:if>
            <c:if test="${sessionScope.account != null }">  
                <ul class="navbar-nav mb-2 mb-lg-0" style="padding-top: 5px;">
                    <img src="images/account-images/acc.png" class="img-thumbnail" style="width: 50px;height: 50px; border-radius: 50%;">
                    <li class="nav-item dropdown me-2">
                        <div class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">My Account</div>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="userprofile">Profile</a></li>
                            <li><a class="dropdown-item" href="myorders">My Orders</a></li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="changepassword">Change password</a></li>
                            <li><a class="dropdown-item" href="logout">Log out</a></li>
                        </ul>
                    </li>

                    <li class="nav-item align-items-center">
                        <form action="showcart" method="GET">
                            <button type="submit" class="btn btn-primary position-relative">
                                <i class='bx bx-cart-alt align-items-center'></i>
                                <span class="position-absolute top-0 start-100 translate-middle badge rounded-pill" style="background-color: #807d7d; color: #ffffff;">
                                    4
                                    <span class="visually-hidden">Product in cart</span>
                                </span>
                            </button>
                        </form>
                    </li>
                </ul>
            </c:if>
        </div>
    </div>
</nav>
