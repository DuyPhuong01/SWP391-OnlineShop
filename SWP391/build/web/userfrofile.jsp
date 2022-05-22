<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="utf-8" />
            <meta name="viewport" content="width=device-width, initial-scale=1" />
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" />
            <link href="css/style.css" rel="stylesheet">
            <link rel="stylesheet" href="css/userfrofile.css">
            <title>User Profile</title>
        </head>

        <body>
            <div class="header">
                <!-- navbar -->
                <c:import url="navbar.jsp"></c:import>
                <!-- end navbar -->
            </div>
            <div class="container-lg">
                <div class="row">
                    <div class="col-3">
                        <div class="ratio" style="--bs-aspect-ratio: 20%"></div>
                        <div class="row d-flex justify-content-center">
                            <img class="avatar" src="images/270105127_358685858926273_6618429533065317218_n.png" />
                            <h2>User name</h2>
                        </div>
                    </div>

                    <div class="content col-9">
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item">
                                <div class="card">
                                    <div class="card-body">
                                        Details
                                        <button type="button" class="btn btn-outline-primary">Edit</button>
                                    </div>
                                </div>
                            </li>
                            <li class="list-group-item">
                                <div class="row">
                                    <div class="col">
                                        <div class="row">
                                            <div class="col-4">
                                                <div class="shadow-sm p-2 mb-3 bg-body rounded">
                                                    Details
                                                </div>
                                            </div>
                                            <div class="col">
                                                <button type="button" class="btn btn-outline-primary">Edit</button>
                                            </div>
                                        </div>
                                        <div class="row">
                                            Something in here ...............<br /> Something in here ...............<br /> Something in here ...............
                                        </div>
                                    </div>
                                    <div class="col">
                                        <div class="row">
                                            <div class="col-4">
                                                <div class="shadow-sm p-2 mb-3 bg-body rounded">
                                                    Details
                                                </div>
                                            </div>
                                            <div class="col">
                                                <button type="button" class="btn btn-outline-primary">
                        Edit
                      </button>
                                            </div>
                                        </div>
                                        <div class="row">
                                            Something in here ...............<br /> Something in here ...............<br /> Something in here ...............
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="list-group-item">
                                <div class="ratio" style="--bs-aspect-ratio: 10%"></div>
                                <div class="row">
                                    <div class="col">
                                        <div class="shadow p-3 mb-5 bg-body rounded">Details</div>
                                    </div>
                                    <div class="col">
                                        <button type="button" class="btn btn-outline-primary">
                    Edit
                  </button>
                                    </div>
                                </div>
                            </li>
                            <li class="list-group-item">
                                <div class="row">
                                    <div class="col">
                                        <div class="row">
                                            <div class="col-4">
                                                <div class="shadow-sm p-2 mb-3 bg-body rounded">
                                                    Details
                                                </div>
                                            </div>
                                            <div class="col">
                                                <button type="button" class="btn btn-outline-primary">
                        Edit
                      </button>
                                            </div>
                                        </div>
                                        <div class="row">
                                            Something in here ...............<br /> Something in here ...............<br /> Something in here ...............
                                        </div>
                                    </div>
                                    <div class="col">
                                        <div class="row">
                                            <div class="col-4">
                                                <div class="shadow-sm p-2 mb-3 bg-body rounded">
                                                    Details
                                                </div>
                                            </div>
                                            <div class="col">
                                                <button type="button" class="btn btn-outline-primary">
                        Edit
                      </button>
                                            </div>
                                        </div>
                                        <div class="row">
                                            Something in here ...............<br /> Something in here ...............<br /> Something in here ...............
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>
        </body>

        </html>