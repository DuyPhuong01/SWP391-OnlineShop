<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Online shopping system</title>

        <!--bootstrap-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link href="css/stylemarketingdashboard.css" rel="stylesheet"/>
        <!--font-awesome-->
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <jsp:directive.include file="marketingdashboardheader.jsp"/>
        <div class="wrapper-login">
            <jsp:directive.include file="marketingdashboardleftside.jsp"/>
            <aside class="right-side">
                <section class="content container">
                    <div class="row">
                        <div class="col-md-3">
                            <div class="general-statistics">
                                <span class="icon bg-green">
                                    <i class="far fa-clipboard"></i>
                                </span>
                                <div class="infor">

                                    <span>${requestScope.totalPosts}</span>Total Posts
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="general-statistics">
                                <span class="icon bg-red">
                                    <i class="fas fa-tshirt"></i>
                                </span>
                                <div class="infor">

                                    <span>${requestScope.totalProducts}</span>Total Products
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="general-statistics">
                                <span class="icon bg-yellow">
                                    <i class="fas fa-user"></i>
                                </span>
                                <div class="infor">

                                    <span>${requestScope.totalAccounts}</span>Total Customers
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="general-statistics">
                                <span class="icon bg-lightblue">
                                    <i class="far fa-comment"></i>
                                </span>
                                <div class="infor">

                                    <span>${requestScope.totalFeedbacks}</span>Total Feedbacks
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="bg-white">

                                <div class="trends-of-new-customer flex">
                                    <form class="flex" style="width: 100%;" action="marketingdashboard" method="get">

                                        <h2>Trends of new customers</h2>
                                        <div>
                                            <span><label for="start-date">From: </label></span>
                                            <input type="date" id="start-date" required name="startDate" value="${requestScope.startDate}"/>
                                        </div>
                                        <div>
                                            <span><label for="end-date">End: </label></span>
                                            <input type="date" id="end-date" required name="endDate" value="${requestScope.endDate}"/>
                                        </div>
                                        <div>
                                            <button><i class="fas fa-search"></i></button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div class="bg-white">
                                <div class="chart-wrapper" style="width: 60%; margin: 0 auto;">

                                    <canvas id="myChart" width="400" height="400"></canvas>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                </section>
            </aside>
        </div>

        <input type="hidden" value="${requestScope.dates}" id="dates"/>
        <input type="hidden" value="${requestScope.customers}" id="customers"/>
    </body>
    <script
        src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js">
    </script>
    <script src="js/marketingchart.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</html>