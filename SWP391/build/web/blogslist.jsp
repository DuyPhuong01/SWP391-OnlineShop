<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!Doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Blogs List</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/poststyle.css">
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
                        <div class="p-3 h-100 bg-white rounded shadow-sm position-relative">
                            <div class="p-2 bg-light rounded d-flex justify-content-between mb-3">
                                <div class="input-group w-25">
                                    <span class="input-group-text" id="basic-addon1">Sort by</span>
                                    <select class="form-control" name="orderOption" id="order-by" onchange="searchProductByChangeOrderOption()"  aria-describedby="basic-addon1">
                                        <option value="newest" ${requestScope.orderOption eq "newest"?"selected":""}/> Newest
                                    <option value="oldest" ${requestScope.orderOption eq "oldest"?"selected":""}/> Oldest
                                </select>
                            </div>
                            <nav aria-label="Page navigation example">
                                <ul class="pagination justify-content-center mb-0">
                                    <li class="page-item disabled">
                                        <a class="page-link">Previous</a>
                                    </li>
                                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                                    <li class="page-item">
                                        <a class="page-link" href="#">Next</a>
                                    </li>
                                </ul>
                            </nav>
                        </div>

                        <div class="row">
                            <c:forEach var="post" items="${requestScope.postsList}">
                                <div class="col-6 mb-3">
                                    <div class="card post">
                                        <a class="post-thumbnail" href="post?id=${post.post_id}">
                                            <img src="${post.thumbnail}" class="card-img-top" alt="...">
                                        </a>
                                        <div class="card-body">
                                            <h5 class="card-title mb-2">${post.title}</h5>
                                            <h6 class="card-subtitle text-muted">${post.sub_title}</h6>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <div class="position-absolute bottom-0 start-0 end-0">
                            <nav aria-label="Page navigation example">
                                <ul class="pagination justify-content-center">
                                    <li class="page-item disabled">
                                        <a class="page-link">Previous</a>
                                    </li>
                                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                                    <li class="page-item">
                                        <a class="page-link" href="#">Next</a>
                                    </li>
                                </ul>
                            </nav>
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