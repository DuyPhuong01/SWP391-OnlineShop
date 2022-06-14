<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<aside class="left-side">
    <section class="sidebar">
        <div class="user-panel flex">
            <div class="pull-left image">
                <img src="images/account-images/anh-dai-dien-nguoi-giau-mat-voi-background-580x580.jpg" style="width: 45px; height: 45px;">
            </div>
            <div class="pull-left info">
                Hello, ${sessionScope.account.username}
            </div>
        </div>
        <form class="sidebar-form">
            <div class="flex sidebar-form-container">
                <input type="text" placeholder="search"/>
                <button><i class="fas fa-search"></i></button>
                
            </div>
        </form>
        <ul class="sidebar-menu">
            <li>
                <a href="admindashboard.html">
                    <i class="fa fa-dashboard"></i>
                    <span>Dashboard</span>
                </a>
            </li>
            <li>
                <a href="admindashboard.html">
                    <i class="far fa-clipboard"></i>
                    <span>Post</span>
                </a>
            </li>
            <li>
                <a href="admindashboard.html">
                    <i class="far fa-image"></i>
                    <span>Slider</span>
                </a>
            </li>
            <li>
                <a href="admindashboard.html">
                    <i class="fas fa-tshirt"></i>
                    <span>Product</span>
                </a>
            </li>
            <li>
                <a href="admindashboard.html">
                    <i class="fas fa-user"></i>
                    <span>Customer</span>
                </a>
            </li>
            <li>
                <a href="admindashboard.html">
                    <i class="fas fa-comment"></i>
                    <span>Feedback</span>
                </a>
            </li>
        </ul>
    </section>
</aside>
