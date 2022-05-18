<%-- 
    Document   : feedbackslist
    Created on : May 19, 2022, 12:47:35 AM
    Author     : Duy Phuong
--%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Register</title>
                <!-- CSS -->
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
                <link rel="stylesheet" href="css/style.css">
                <script src="https://kit.fontawesome.com/0e3f31cc48.js" crossorigin="anonymous"></script>
                <!-- JavaScript Bundle with Popper -->
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
            </head>

            <body>
                <div class="center container">
                    <div class="content">
                        <h3>Register, fill information</h3>
                        <form action="">
                            <div class="mb-3">
                                <label class="form-label">Fullname
                                    <input type="text" class="form-control">
                                </label>
                                <label class="form-label">Gender
                                    <select class="form-select" aria-label="Default select example">
                                        <option>Male</option>
                                        <option>Female</option>
                                        <option>Other</option>
                                    </select>
                                </label>
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Email
                                    <input type="email" class="form-control" placeholder="name@example.com">
                                </label>
                                <label class="form-label">Mobile
                                    <input type="tel" class="form-control" placeholder="+84 1234 5678">
                                </label>
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Address
                                    <input type="text" class="form-control">
                                </label>
                            </div>
                            <button type="submit" class="btn btn-primary mb-3">Verify</button>
                        </form>

                    </div>
                </div>
            </body>
            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>

            </html>