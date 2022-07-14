

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header class="header">
    <a class="logo" href="/swp/home">
        Home
    </a>
    <nav class="navbar">
        <a class="navbar-btn sidebar-toggle">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </a>
        <div class="navbar-right">
            <ul class="nav navbar-nav flex-row">
                <li style="display: flex;
                    align-items: center;
                    margin-right: 10px;
                    margin-left: 10px;"><i class="fa-solid fa-envelope" style="display: flex; align-items: center;"></i></li>
                    <c:if test="${sessionScope.account != null}">
                    <li style="    margin-right: 10px;
                        margin-left: 10px;"><a class="dropdown-item" href="/swp/logout">Logout</a></li>
                    </c:if>
            </ul>
        </div>
    </nav>
</header>