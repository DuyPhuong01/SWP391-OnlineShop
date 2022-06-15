<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!Doctype html>
        <html lang="en">

        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Bootstrap demo</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
            <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap">
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css">
            <link rel="stylesheet" href="./asserts/css/base.css">
            <link rel="stylesheet" href="./asserts/css/post_list.css">
            <link rel="stylesheet" href="./asserts/css/product_list.css">

            <link rel="stylesheet" href="./asserts/fontawesome-free-6.0.0/css/all.min.css">
        </head>

        <body>
            <div class="container header-navbar">
                <div class="row " style="height: 50px; width: 100%; margin-bottom: 10px;">
                    <!-- navbar filter  -->
                    <nav class="navbar navbar-expand-lg  navbar-dark bg-dark header-navbar" style="width: 100%;">
                        <div class="container-fluid">
                            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
                            <div class="collapse navbar-collapse" id="navbarText">
                                <ul class="navbar-nav me-auto mb-2 mb-lg-0 col-md">
                                    <li class="nav-item">
                                        <a class="nav-link " aria-current="page" href="#">Home</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link " href="#">Post List</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">Customers List</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">Feedbacks List </a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link active" href=" # ">Product List</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
      </div>
    </div>
      <!--navbar horizon-->
      <div class="container navbar-horizon " style="height: 48x; ">
        <div class="row " style="height: 100%; ">
          <div class="col-md-2 ">
            
          </div>

            <div class="col-md-10 navbar-path ">
              <p>Home/Product list</p>
              <div class="col-md-9 ">

              </div>
              <div class="col-md-1 ">
                <div class="dropdown sidebar-item ">
                  <button style="width: 100%; " class="btn btn-secondary dropdown-toggle " type="button " id="dropdownMenu2 " data-bs-toggle="dropdown " aria-expanded="false ">
                    Sort by
                  </button>
                  <ul class=" sidebar-btn dropdown-menu " aria-labelledby="dropdownMenu2 " ">
                                            <li><button class="dropdown-item" type="button">Action</button></li>
                                            <li><button class="dropdown-item" type="button">Another action</button></li>
                                            <li><button class="dropdown-item" type="button">Something else here</button></li>
                                </ul>
                            </div>
                        </div>
                </div>

            </div>
            </div>
            <!--side bar-->
            <div class="container body_page nav" style="height: 1000px;">
                <div class="row col-md-2 sidebar">
                    <!-- List category -->
                    <div class="sidebar-content">
                        <p>Filter</p>
                    </div>
                    <div class="dropdown sidebar-item">
                        <button style="width: 100%;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenu2" data-bs-toggle="dropdown" aria-expanded="false">
            Category
          </button>
                        <ul class=" sidebar-btn dropdown-menu" aria-labelledby="dropdownMenu2" ">
            <li><button class="dropdown-item " type="button ">Action</button></li>
            <li><button class="dropdown-item " type="button ">Another action</button></li>
            <li><button class="dropdown-item " type="button ">Something else here</button></li>
          </ul>
        </div>

        <div class="dropdown sidebar-item ">
          <button style="width: 100%; " class="btn btn-secondary dropdown-toggle " type="button " id="dropdownMenu2 " data-bs-toggle="dropdown " aria-expanded="false ">
            Status
          </button>
          <ul class=" sidebar-btn dropdown-menu " aria-labelledby="dropdownMenu2 " ">
                            <li><button class="dropdown-item" type="button">Action</button></li>
                            <li><button class="dropdown-item" type="button">Another action</button></li>
                            <li><button class="dropdown-item" type="button">Something else here</button></li>
                        </ul>
                    </div>

                    <div class="search-item">
                        <div class="sidebar-item sidebar-item__search">
                            <div class="sidebar-item__search sidebar-item__search-content col-md-10">
                                <input type="text" style="width: 100%;" class="search-input" placeholder="Search">
                            </div>
                            <div class="sidebar-item__search sidebar-item__search-icon col-md-4">
                                <i class="fa-solid fa-magnifying-glass search-icon"></i>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- content  -->
                <div class="row col-md-10 content content-main-page ">
                    <div class="content-paging">
                        <div class="row product-list_info col-md-12">
                            <div class="col-md-1 product_id">
                                ID
                            </div>
                            <div class="col-md-2 product_thumbnail">
                                Thumbnail
                            </div>
                            <div class="col-md-4 product_title">
                                Titile
                            </div>
                            <div class="col-md-1 product_category">
                                Category
                            </div>
                            <div class="col-md-2 product_listprice">
                                List price
                            </div>
                            <div class="col-md-2 product_saleprice">
                                Sale price
                            </div>
                        </div>
                        <!-- <div class="paging col-md-2">
                <nav aria-label="...">
                    <ul class="pagination">
                      <li class="page-item disabled">
                        <a class="page-link" href="#" tabindex="-1">Previous</a>
                      </li>
                      <li class="page-item"><a class="page-link" href="#">1</a></li>
                      <li class="page-item active">
                        <a class="page-link" href="#">2 <span class="sr-only">(current)</span></a>
                      </li>
                      <li class="page-item"><a class="page-link" href="#">3</a></li>
                      <li class="page-item">
                        <a class="page-link" href="#">Next</a>
                      </li>
                    </ul>
                  </nav>
              </div> -->

                    </div>
                    <!-- A post -->
                    <div class="container container-content">
                        <ul class="list-content-item list-product-item">
                            <li>
                                <div class="col-md-1 product_id">
                                    ID
                                </div>
                                <div class="col-md-2 content-item_img">
                                    <div class="img-item">
                                        <img src="https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone11-select-2019-family?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022175704" alt="">
                                    </div>
                                </div>
                                <div class="col-md-4 product_title">
                                    Titile
                                </div>
                                <div class="col-md-1 product_category">
                                    Category
                                </div>
                                <div class="col-md-2 product_listprice">
                                    List price
                                </div>
                                <div class="col-md-2 product_saleprice">
                                    Sale price
                                </div>
                            </li>
                            <li>
                                <div class="col-md-1 product_id">
                                    ID
                                </div>
                                <div class="col-md-2 content-item_img">
                                    <div class="img-item">
                                        <img src="https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone11-select-2019-family?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022175704" alt="">
                                    </div>
                                </div>
                                <div class="col-md-4 product_title">
                                    Titile
                                </div>
                                <div class="col-md-1 product_category">
                                    Category
                                </div>
                                <div class="col-md-2 product_listprice">
                                    List price
                                </div>
                                <div class="col-md-2 product_saleprice">
                                    Sale price
                                </div>
                            </li>
                            <li>
                                <div class="col-md-1 product_id">
                                    ID
                                </div>
                                <div class="col-md-2 content-item_img">
                                    <div class="img-item">
                                        <img src="https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone11-select-2019-family?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022175704" alt="">
                                    </div>
                                </div>
                                <div class="col-md-4 product_title">
                                    Titile
                                </div>
                                <div class="col-md-1 product_category">
                                    Category
                                </div>
                                <div class="col-md-2 product_listprice">
                                    List price
                                </div>
                                <div class="col-md-2 product_saleprice">
                                    Sale price
                                </div>
                            </li>
                            <li>
                                <div class="col-md-1 product_id">
                                    ID
                                </div>
                                <div class="col-md-2 content-item_img">
                                    <div class="img-item">
                                        <img src="https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone11-select-2019-family?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022175704" alt="">
                                    </div>
                                </div>
                                <div class="col-md-4 product_title">
                                    Titile
                                </div>
                                <div class="col-md-1 product_category">
                                    Category
                                </div>
                                <div class="col-md-2 product_listprice">
                                    List price
                                </div>
                                <div class="col-md-2 product_saleprice">
                                    Sale price
                                </div>
                            </li>
                            <li>
                                <div class="col-md-1 product_id">
                                    ID
                                </div>
                                <div class="col-md-2 content-item_img">
                                    <div class="img-item">
                                        <img src="https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone11-select-2019-family?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022175704" alt="">
                                    </div>
                                </div>
                                <div class="col-md-4 product_title">
                                    Titile
                                </div>
                                <div class="col-md-1 product_category">
                                    Category
                                </div>
                                <div class="col-md-2 product_listprice">
                                    List price
                                </div>
                                <div class="col-md-2 product_saleprice">
                                    Sale price
                                </div>
                            </li>
                            <li>
                                <div class="col-md-1 product_id">
                                    ID
                                </div>
                                <div class="col-md-2 content-item_img">
                                    <div class="img-item">
                                        <img src="https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone11-select-2019-family?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022175704" alt="">
                                    </div>
                                </div>
                                <div class="col-md-4 product_title">
                                    Titile
                                </div>
                                <div class="col-md-1 product_category">
                                    Category
                                </div>
                                <div class="col-md-2 product_listprice">
                                    List price
                                </div>
                                <div class="col-md-2 product_saleprice">
                                    Sale price
                                </div>
                            </li>

                        </ul>
                        <!--footer-->
                        <div class="content-paging content-paging-footer">
                            <nav aria-label="...">
                                <ul class="pagination pagination--footer">
                                    <li class="page-item disabled">
                                        <a class="page-link" href="#" tabindex="-1">Previous</a>
                                    </li>
                                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                                    <li class="page-item active">
                                        <a class="page-link" href="#">2 <span class="sr-only">(current)</span></a>
                                    </li>
                                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                                    <li class="page-item">
                                        <a class="page-link" href="#">Next</a>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </div>


                </div>
            </div>

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
        </body>

        </html>