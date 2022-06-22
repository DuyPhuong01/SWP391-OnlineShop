<%@page import="dal.AccountDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="post" value="${requestScope.post}"></c:set>
<c:set var="author" value="${requestScope.author}"></c:set>
<!Doctype html>
<html lang="en">
        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Blog Details</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
            <link rel="stylesheet" href="css/style.css">
            <!-- ===== Boxicons CSS ===== -->
            <link href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css" rel="stylesheet">
            <!--font-awesome-->
            <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
        </head>

        <body>
            <div class="header">
            <c:import url="navbar.jsp"></c:import>
            </div>
            <div class="container-lg">
                <div class="row">
                    <div class="col-9">
                        <div class="py-3 px-5 h-100 bg-white rounded shadow-sm">
                            <h3>${post.title}</h3>
                        <div class="border-bottom border-top text-muted px-3 py-2 d-flex justify-content-between opacity-75">
                            <fmt:formatDate value="${post.publication_date}" pattern="HH:mm dd/MM/yyyy"/>
                            <div><span>${author.full_name}</span></div>
                        </div>
                        <div class="border-start border-dark mt-3 ps-3">
                            ${post.sub_title}
                        </div>
                        <div class="mt-3">
                            ${post.post_details}
                        </div>
                    </div>
                </div>
                <div class="col-3">
                    <c:import url="blogsider.jsp"></c:import>
                    </div>
                </div>
            </div>
        <c:import url="footer.jsp"></c:import>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</html>