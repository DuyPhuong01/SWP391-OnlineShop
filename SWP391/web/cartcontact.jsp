<%-- 
    Document   : cartcontact
    Created on : May 25, 2022, 7:09:48 PM
    Author     : win
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart Contacts</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
            rel="stylesheet"
            />
    </head>
       <body>
             <c:set var="o" value="${requestScope.cart}" />
             <c:set var="tt" value="0" />
        <div class="container">
            <div class="row">
                <div class="col">
                    <h1>Cart contacts</h1>

                    <nav style="--bs-breadcrumb-divider: '>'" aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="cartdetail.html">Cart Details</a></li>
                            <li class="breadcrumb-item active" aria-current="page">
                                Cart Contacts
                            </li>
                        </ol>
                    </nav>
                    <div>
                        Shipment Details<br />
                        Do not have account? <a href="#">Register</a><br />
                    </div>
                    <form class="row g-3" id="checkout" action="checkout" method="post">
                        <div class="col-md-12">
                            <label for="inputEmail4" class="form-label">Name</label>
                            <input type="email" value="${requestScope.cus.full_name}" class="form-control" id="inputEmail4" />
                        </div>
                        <div class="col-md-6">
                            <label for="inputEmail4" class="form-label">Email</label>
                            <input type="${requestScope.cus.email}" class="form-control" id="inputEmail4" />
                        </div>
                        <div class="col-md-6">
                            <label for="inputPassword4" class="form-label"
                                   >Phone</label
                            >
                            <input type="password"  placeholder="0783332391" class="form-control" id="inputPassword4" />
                        </div>
                        <div class="col-12">
                            <label for="inputAddress" class="form-label">Address</label>
                            <input
                                type="text"
                                value="${requestScope.cus.address}"
                                class="form-control"
                                id="inputAddress"
                                placeholder="1234 Main St"
                                />
                        </div>
                        <div class="col-12">
                            <label for="inputAddress2" class="form-label">Address 2</label>
                            <input
                                type="text"
                                class="form-control"
                                id="inputAddress2"
                                placeholder="Apartment, studio, or floor"
                                />
                        </div>
                        <div class="col-md-6">
                            <label for="inputCity" class="form-label">City</label>
                            <input type="text" class="form-control" id="inputCity" />
                        </div>
                        <div class="col-md-4">
                            <label for="inputState" class="form-label">State</label>
                            <select id="inputState" class="form-select">
                                <option selected>Choose...</option>
                                <option>...</option>
                            </select>
                        </div>
                        <div class="col-md-2">
                            <label for="inputZip" class="form-label">Zip</label>
                            <input type="text" class="form-control" id="inputZip" />
                        </div>
                        <div class="col-12">
                            <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                                <button class="btn btn-primary me-md-2" type="button" onclick="window.location.href='showcart'">
                                    Back to cart
                                </button>
                                <button class="btn btn-primary" type="submit" onclick=""><a href="" style="color: #fff; text-decoration: none;">Order now</a></button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col">
                    <div class="ratio" style="--bs-aspect-ratio: 10%">
                        <div></div>
                    </div>

                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">
                            <div class="shadow-sm p-3 mb-5 bg-body rounded">List Items</div>

                            <div class="row">
                                <div class="col"></div>
                                <div class="col"></div>
                                <div class="col"></div>
                            </div>
                         <c:forEach items="${o.items}" var="i">
                            <div class="row">
                                <div class="col"><img src="${i.product.thumbnail}" alt="" width="70" class="img-fluid rounded shadow-sm"></div>
                                <div class="col">${i.product.title}</div>
                                <div class="col">${i.quantity}</div>
                                <div class="col d-flex justify-content-end">${i.quantity*i.price}</div>
                            </div>
                          </foreach>
                        </li>

                        <li class="list-group-item">
                            <div class="row">
                                <div class="col">Cash</div>
                                <div class="d-flex justify-content-end">${o.totalMoney}đ</div>
                            </div>
                            <div class="row">
                                <div class="col">Transport fee</div>
                                <div class="d-flex justify-content-end">20000đ</div>
                            </div>
                        </li>
                        <li class="list-group-item">
                            <div class="row">
                                <div class="col">Total</div>
                                <div class="d-flex justify-content-end">-20000đ</div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <script
            src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js"
            integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk"
            crossorigin="anonymous"
        ></script>
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
            integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
            crossorigin="anonymous"
        ></script>

    </body>
</html>
