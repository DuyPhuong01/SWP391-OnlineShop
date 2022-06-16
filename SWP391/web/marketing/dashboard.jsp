<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" />
        <title>Marketing dashboard</title>
        <link rel="stylesheet" href="../css/style.css">
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
    </head>

    <body>
            <div class="d-flex my-5">
            <c:import url="/marketing/sidebar.jsp"></c:import>
            <div class="container-lg">
                <div class="ratio" style="--bs-aspect-ratio: 5%"></div>
                <header>
                    <h1>Statistics</h1>
                </header>
                <div class="row">
                    <div class="col">
                        <div class="shadow-sm p-3 mb-5 bg-body rounded"><a href="marketingpostslist.html">Post</a><br>
                            <div class="ratio" style="--bs-aspect-ratio: 15%"></div>
                        </div>
                        <div class="shadow-sm p-3 mb-5 bg-body rounded"><a href="post.html">Customer</a><br>
                            <div class="ratio" style="--bs-aspect-ratio: 15%"></div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="shadow-sm p-3 mb-5 bg-body rounded"><a href="marketingpostslist.html">Products</a><br>
                            <div class="ratio" style="--bs-aspect-ratio: 15%"></div>
                        </div>
                        <div class="shadow-sm p-3 mb-5 bg-body rounded"><a href="marketingpostslist.html">Feedback</a><br>
                            <div class="ratio" style="--bs-aspect-ratio: 15%"></div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <div class="row">
                            <div class="col-8">Trend of new Customers from</div>
                            <div class="col-4">
                                <div class="shadow-sm p-3 mb-5 bg-body rounded">
                                    (Date time)
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <div class="shadow-sm p-3 mb-5 bg-body rounded">Data<br>
                                    <div class="ratio" style="--bs-aspect-ratio: 15%"></div>
                                </div>
                            </div>
                            <div class="col">
                                <div class="shadow-sm p-3 mb-5 bg-body rounded">Data<br>
                                    <div class="ratio" style="--bs-aspect-ratio: 15%"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="row">
                            <div class="col-2">To</div>
                            <div class="col-4">
                                <div class="shadow-sm p-3 mb-5 bg-body rounded">
                                    (Date time)
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <div class="shadow-sm p-3 mb-5 bg-body rounded">Data<br>
                                    <div class="ratio" style="--bs-aspect-ratio: 15%"></div>
                                </div>
                            </div>
                            <div class="col">
                                <div class="shadow-sm p-3 mb-5 bg-body rounded">Data<br>
                                    <div class="ratio" style="--bs-aspect-ratio: 15%"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>
    
    <script src="https://unpkg.com/@popperjs/core@2"></script>
    <script>
        const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]')
        const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl))
    </script>
</html>