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
                        <div class="col-md-6" style="margin-bottom: 20px;">
                            <div class="general-statistics">Total Post</div>
                        </div>
                        <div class="col-md-6" style="margin-bottom: 20px;">
                            <div class="general-statistics">Total Product</div>
                        </div>
                        <div class="col-md-6">
                            <div class="general-statistics">Total Customer</div>
                        </div>
                        <div class="col-md-6">
                            <div class="general-statistics">Total Feedbacks</div>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="trends-of-new-customer">
                                Trends of new Customer
                            </div>
                        </div>
                    </div>
                </section>
            </aside>
        </div>
        
            <input type="hidden" value="${requestScope.a}" id="test"/>
    </body>
    <script src="js/marketingchart.js">
        
    </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</html>