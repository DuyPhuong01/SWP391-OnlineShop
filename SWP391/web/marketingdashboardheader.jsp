

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header class="header">
    <a class="logo">
        Marketing
    </a>
    <nav class="navbar">
        <a class="navbar-btn sidebar-toggle">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </a>
        <div class="navbar-right">
            <ul class="nav navbar-nav flex-row">
                <li class="dropdown"><i class="fa-solid fa-envelope"></i></li>
                    <c:if test="${sessionScope.account != null}">
                    <li class="dropdown">
                        <!--<i class="fa-solid fa-user"></i>-->
                        <span><a href="logout">Logout</a></span>
                    </li>
                </c:if>
            </ul>
        </div>
    </nav>
</header>