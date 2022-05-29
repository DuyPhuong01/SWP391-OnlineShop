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
            <ul class="navbar-nav mb-2 mb-lg-0">
                <li class="nav-item dropdown me-2">
                    <c:if test="${sessionScope.account==null}">
                    <li class="nav-item">
                        <a href="#divOne" class="nav-link">Login</a>
                    </li>
                </c:if>
                <c:if test="${sessionScope.account!=null}">
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
                </c:if>
                </li>
                <li class="nav-item ms-3">
                    <a class="btn btn-outline-primary" href="showcart">My Carts</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<c:import url="login.jsp"></c:import>
<script>
    function doLogin() {
        includeHTML("userslist.html", "#popup");
        console.log('test');
    };
    function includeHTML(var source, var destination) {
        var z, i, elmnt, file, xhttp;
        /*loop through a collection of all HTML elements:*/
        z = document.querySelectorAll(destination);
        for (i = 0; i < z.length; i++) {
            elmnt = z[i];
            /*search for elements with a certain atrribute:*/
            file = source;
            if (file) {
                /*make an HTTP request using the attribute value as the file name:*/
                xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (this.readyState == 4) {
                        if (this.status == 200) {
                            elmnt.innerHTML = this.responseText;
                        }
                        if (this.status == 404) {
                            elmnt.innerHTML = "Page not found.";
                        }
                        /*remove the attribute, and call this function once more:*/
//                        elmnt.removeAttribute("include-html");
                        includeHTML(source, destination);
                    }
                }
                xhttp.open("GET", file, true);
                xhttp.send();
                /*exit the function:*/
                return;
            }
        }
    }
    ;
</script>