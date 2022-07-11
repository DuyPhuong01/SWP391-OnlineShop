<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<aside class="left-side">
    <section class="sidebar">
        <div class="user-panel flex">
            <div class="pull-left image">
                <img src="../images/account-images/anh-dai-dien-nguoi-giau-mat-voi-background-580x580.jpg" style="width: 45px; height: 45px;">
            </div>
            <div class="pull-left info">
                Hello, ${sessionScope.account.username}
            </div>
        </div>
<!--        <form class="sidebar-form">
            <div class="flex sidebar-form-container">
                <input type="text" placeholder="search"/>
                <button><i class="fas fa-search"></i></button>
                
            </div>
        </form>-->
        <ul class="sidebar-menu">
            <li>
                <a href="admin">
                    <i class="fa fa-dashboard"></i>
                    <span>Dashboard</span>
                </a>
            </li>
            <li>
                <a href="#">
                    <i class="fas fa-shopping-cart"></i>
                    <span>Orders List</span>
                </a>
            </li>
            <li>
                <a href="userslist">
                    <i class="fa-solid fa-address-book"></i>
                    <span>User list</span>
                </a>
            </li>
            <li>
                <a href="/swp/logout">
                    <i class="fas fa-sign-out"></i>
                    <span>Sign out</span>
                </a>
            </li>
        </ul>
    </section>
</aside>
