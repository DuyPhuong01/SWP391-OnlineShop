<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!Doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Marketing - Product Details</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="../css/style.css">
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>

    </head>
    <body>
        <c:set var="product" value="${requestScope.product}"></c:set>
            <div class="d-flex my-5">
            <c:import url="/marketing/sidebar.jsp"></c:import>
                <div class="container-lg">
                    <div class="p-3 bg-white rounded shadow-sm">
                        <div class="product_details">
                            <div class="d-flex justify-content-between sticky-0 bg-white pt-3 border-bottom border-2 mb-3 pb-1">
                                <div>
                                    <div class="input-group">
                                        <span class="input-group-text" id="basic-addon1">Updated Date</span>
                                        <input type="text" class="form-control" placeholder="Updated Date" aria-label="Updated Date" aria-describedby="basic-addon1" value="${product.updated_date}" disabled>
                                </div>
                            </div>
                            <div>
                                <div class="form-check form-switch form-switch-md">
                                    <input class="featured-btn form-check-input" style="cursor: pointer" data-product-id="${product.product_id}" type="checkbox" role="switch" id="flexSwitchCheckDefault" <c:if test="${product.featured}">checked</c:if>/>
                                        <label class="form-check-label" for="flexSwitchCheckDefault"></label>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-6 mb-3">
                                    <h3 class="mt-3">Thumbnail</h3>
                                    <div class="images-hover images-viewer">
                                        <img src="../${product.thumbnail}" alt="" aria-label="thumbnail">
                                    <div class="p-1 px-3 mask bg-white rounded-pill shadow-sm">
                                        <a class="me-2 cursor-pointer" aria-label="View"><i class="fa-solid fa-eye"></i></a>
                                        <label>
                                            <form id="form-thumbnail" enctype="multipart/form-data">
                                                <i class="fa-solid fa-upload link"></i>
                                                <input type="file" accept=".jpg, .jpeg, .png" name="thumbnail" onchange="uploadThumbnail(event)" hidden>
                                                <input type="text" name="action" value="changeThumbnail" hidden>
                                                <input type="text" name="product_id" value="${product.product_id}" hidden>
                                            </form>
                                        </label>
                                    </div>
                                </div>
                                <h3 class="mt-5">Product Images</h3>
                                <div id="product-images" class="row">
                                    <c:forEach var="image" items="${product.images}">
                                        <div class="col-4 mb-2">
                                            <div class="images-hover images-viewer">
                                                <img src="../${image.path}" alt="">
                                                <div class="p-1 px-3 mask bg-white rounded-pill shadow-sm">
                                                    <a class="me-2 cursor-pointer" aria-label="View"><i class="fa-solid fa-eye"></i></a>
                                                    <a href="#"><i class="fa-solid fa-trash"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                                    <div class="col-4 mb-2">
                                        <label class="w-100 h-100">
                                            <div class="border border-primary border-2 h-100 rounded d-flex" style="cursor: pointer"><i class="fa-solid fa-plus mx-auto my-auto text-primary"></i></div>
                                            <form id="form-product-image h-100">
                                                <input type="file" accept=".jpg, .jpeg, .png" id="images" onchange="uploadProductImage(event)" hidden>
                                            </form>
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="col-6">
                                <h3 class="mt-3">Product Information</h3>
                                <div class="row">
                                    <div class="col-12">
                                        <div class="input-group mb-3">
                                            <span class="input-group-text" id="basic-addon1">Name</span>
                                            <input type="text" class="form-control" placeholder="Name" aria-label="Name" aria-describedby="basic-addon1" value="${product.name}">
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group mb-3">
                                            <span class="input-group-text" id="basic-addon1">Model</span>
                                            <input type="text" class="form-control" placeholder="Name" aria-label="Name" aria-describedby="basic-addon1" value="${product.model}">
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group mb-3">
                                            <span class="input-group-text" id="basic-addon1">Unit in Stock</span>
                                            <input type="number" class="form-control" min="0" placeholder="Unit in Stock" aria-label="Unit in Stock" aria-describedby="basic-addon1" value="${product.unit_in_stock}">
                                        </div>
                                    </div>
                                    <div class="mb-3">
                                        <label for="disabledSelect" class="form-label">Category</label>
                                        <select id="disabledSelect" class="form-select">
                                            <option> Technology</option>
                                        </select>
                                    </div>
                                    <div class="input-group mb-3">
                                        <span class="input-group-text" id="basic-addon1">Original Price</span>
                                        <input type="number" class="form-control" placeholder="Original Price" aria-label="Original Price" aria-describedby="basic-addon1" id="original_price">
                                        <script>
                                            document.getElementById('original_price').value = <fmt:formatNumber type = "number" groupingUsed = "false" value = "${product.original_price}" />;
                                        </script>
                                    </div>
                                    <div class="input-group mb-3">
                                        <span class="input-group-text" id="basic-addon1">Sale Price</span>
                                        <input type="number" class="form-control" placeholder="Sale Price" aria-label="Sale Price" aria-describedby="basic-addon1" id="sale_price">
                                        <script>
                                            document.getElementById('sale_price').value = <fmt:formatNumber type = "number" groupingUsed = "false" value = "${product.sale_price}" />;
                                        </script>
                                    </div>
                                    <div class="input-group mb-3">
                                        <span class="input-group-text">Brief Information</span>
                                        <textarea class="form-control" aria-label="With textarea">${product.briefInfor}</textarea>
                                    </div>
                                    <div class="input-group mb-3">
                                        <span class="input-group-text">Product Details</span>
                                        <textarea class="form-control" aria-label="With textarea">${product.product_details}</textarea>
                                    </div>
                                    <div class="col-12">
                                        <div class="input-group mb-3">
                                            <span class="input-group-text" id="basic-addon1">Status</span>
                                            <input type="text" class="form-control" placeholder="Status" aria-label="Status" aria-describedby="basic-addon1" value="${product.status}">
                                        </div>
                                    </div>
                                    <div class="col-12 d-flex justify-content-end">
                                        <button class="btn btn-outline-primary" disabled>Save Changes</button>
                                    </div>
                                </div>
                                <h3 class="mt-5">Product Specification</h3>
                                <c:if test="${requestScope.isExit}"><c:import url="../file/product_details/product_${product.product_id}.html" charEncoding="UTF-8"></c:import></c:if>
                                <div class="border border-primary border-2 w-100 rounded d-flex cursor-pointer mb-3" style="height: 50px"><i class="fa-solid fa-plus mx-auto my-auto text-primary"></i></div>
                                <div class="d-flex justify-content-end">
                                    <button class="btn btn-outline-primary" disabled>Save Changes</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div
        <div>
            <div id="modal-thumbnail" class="modal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h6 class="modal-title">Use this image as thumbnail?</h6>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <span class="message"></span>
                            <img src="" alt="" id="thumbnail-image-load">
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal" aria-label="Close">Close</button>
                            <button type="button" class="btn btn-primary"  aria-label="Confirm">Save changes</button>
                        </div>
                    </div>
                </div>
            </div>
            <div id="modal-product-image" class="modal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h6 class="modal-title">Add this images?</h6>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <img src="" alt="" id="product-image-load">
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal" aria-label="Close">Close</button>
                            <button type="button" class="btn btn-primary"  aria-label="Confirm">Save changes</button>
                        </div>
                    </div>
                </div>
            </div>
            <div id="modal-viewimage" class="modal modal-xl">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <img src="" alt="" id="image-load">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script>
            function uploadThumbnail(event) {
                var selectedFile = event.target.files[0];
                var reader = new FileReader();

                var imgtag = document.getElementById("thumbnail-image-load");
                imgtag.title = selectedFile.name;

                reader.onload = function (event) {
                    imgtag.src = event.target.result;
                };

                reader.readAsDataURL(selectedFile);
                document.getElementById("modal-thumbnail").style = "display: block";
            }
            function uploadProductImage(event) {
                var selectedFile = event.target.files[0];
                var reader = new FileReader();

                var imgtag = document.getElementById("product-image-load");
                imgtag.title = selectedFile.name;

                reader.onload = function (event) {
                    imgtag.src = event.target.result;
                };

                reader.readAsDataURL(selectedFile);
                document.getElementById("modal-product-image").style = "display: block";
            }
        </script>
        <script>
            document.querySelectorAll('.images-viewer').forEach(d => {
                var image = d.querySelector('img');
                d.querySelector('a[aria-label="View"]').addEventListener('click', function () {
                    document.querySelector('#modal-viewimage img').setAttribute("src", image.getAttribute("src"));
                    document.getElementById('modal-viewimage').style = "display: block";

                });
            });
        </script>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://unpkg.com/@popperjs/core@2"></script>
    <script>
            const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]');
            const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl));
    </script>
    <script src="../js/activeproductchange.js"></script>
    <script src="../js/textarea_auto_resize.js"></script>
    <script>
            document.querySelectorAll('.modal#modal-thumbnail').forEach(d => {
                d.querySelectorAll('button[aria-label="Close"]').forEach(b => {
                    b.addEventListener("click", function () {
                        d.style = "";
                        document.querySelector('#form-thumbnail input[type="file"]').value = null;
                    });
                });
            });
            document.querySelectorAll('.modal#modal-thumbnail').forEach(d => {
                d.querySelector('button[aria-label="Confirm"]').addEventListener("click", function () {
                    var form = document.getElementById('form-thumbnail');
                    var data = new FormData(form);
                    $.ajax({
                        url: 'editproduct',
                        type: 'post',
                        data: data,
                        contentType: false,
                        processData: false,
                        success: function (response) {
                            d.style = "";
                            document.querySelector('#form-thumbnail input[type="file"]').value = null;
                            document.querySelector('img[aria-label="thumbnail"]').setAttribute('src', "../"+response);
                        },
                        error: function (XMLHttpRequest, textStatus, errorThrown) {
                            d.querySelector('span.message').innerHTML = "Upload Fails";
                        }
                    });
                });
            });
    </script>
    <script>
        document.querySelectorAll('.modal#modal-product-image').forEach(d => {
            d.querySelectorAll('button[aria-label="Close"]').forEach(b => {
                b.addEventListener("click", function () {
                    d.style = "";
                    document.querySelector('#form-product-image input[type="file"]').value = null;
                });
            });
            d.querySelector('button[aria-label="Confirm"]').addEventListener("click", function () {
                var form = $('#form-product-image');
                $.ajax({
                    url: 'editproduct',
                    type: 'post',
                    data: form.serialize(),
                    enctype: 'multipart/form-data',
                    success: function (response) {

                    },
                    error: function (XMLHttpRequest, textStatus, errorThrown) {

                    }
                });
            });
        });
    </script>
    <script>
        document.querySelectorAll('.modal#modal-viewimage').forEach(d => {
            d.querySelectorAll('button[aria-label="Close"]').forEach(b => {
                b.addEventListener("click", function () {
                    d.style = "";
                });
            });
        });

    </script>
</html>