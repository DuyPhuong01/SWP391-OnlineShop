<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <ul class="navbar-nav mb-2 mb-lg-0">
                        <li class="nav-item dropdown me-2">
                            <div class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">My Account</div>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="userprofile">Profile</a></li>
                                <li><a class="dropdown-item" href="myorders">My Orders</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item" href="changepassword">Change password</a></li>
                                <li><a class="dropdown-item" href="">Log out</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="btn btn-outline-primary" href="cartdetails">
                                My Carts
                                <span class="badge text-bg-secondary">4</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>