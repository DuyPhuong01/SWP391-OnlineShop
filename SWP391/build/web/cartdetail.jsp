<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html id="content">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cart details</title>
        <!--CSS-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css" />
        <link rel="stylesheet" href="css/stylecartdetails.css" />
        <!--font-awesome-->
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
        <!--Ajax-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    </head>

    <body>
        <c:set var="o" value="${requestScope.cart}" />
        <c:set var="tt" value="0" />
        <div class="header">
            <c:import url="navbar.jsp"></c:import>
            </div>
            <div class="container-lg mb-5" >
                <div class="row">
                    <div class="col-3">
                        <c:import url="sider.jsp"></c:import>
                    </div>
                    <div class="col-9" >
                        <div class="p-3 bg-white rounded shadow-sm mb-3">
                            <div class="text-center">
                                <h3 class="pb-3 text-uppercase font-weight-bold">My Cart</h3>
                            </div>
                            <!-- Shopping cart table -->
                            <table class="table table-hover">
                                <thead>
                                    <tr class="text-center">
                                        
                                        <th>ID</th>
                                        <th>Product</th>
                                        <th>Price</th>
                                        <th>Quantity</th>
                                        <th>Sub total</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody class="table-group-divider">
                                <c:forEach items="${o.items}" var="i">
                                    
                                    <tr style="height: 100px" id="items">
                                        <td class="align-middle">
                                            <p class="mb-0 product-id-cart-contact">
                                                 ${i.product.product_id}
                                            </p>
                                        </td>
                                        <td class="align-middle" style="width: 30%">
                                            <div class="row">
                                                <div class="col-5 my-auto">
                                                    <img src="${i.product.thumbnail}" alt="" class="img-fluid rounded" style="cursor: pointer"/>
                                                </div>
                                                    <a href="product?id=${i.product.product_id}" class="text-decoration-none text-muted col" style="align-self: center">
                                                    <b class="product-title">${i.product.briefInfor}</b>
                                                </a>
                                            </div>
                                        </td>
                                        <td class="align-middle" id="price-items">
                                            <c:if test="${i.product.sale_price != 0}"> <input type="hidden" id="price" value="${i.product.sale_price}"/> </c:if>
                                            <c:if test="${i.product.sale_price == 0}"> <input type="hidden" id="price" value="${i.product.original_price}"/> </c:if>
                                            <b class="d-flex justify-content-center" >
                                                <c:if test="${i.product.sale_price != 0}"><fmt:formatNumber value="${i.product.sale_price}" type="currency" currencySymbol="đ" maxFractionDigits="0"/></c:if>
                                                <c:if test="${i.product.sale_price == 0}"><fmt:formatNumber value="${i.product.original_price}" type="currency" currencySymbol="đ" maxFractionDigits="0"/></c:if>
                                            </b>
                                        </td>
                                        <td class="align-middle">
                                            <div class="d-flex justify-content-center">
                                                <div class="change-item">
                                                    <a class="btn btn-outline-success" id="down" onclick="Down(this,'${i.product.product_id}')"
                                                       >-</a>
                                                <b id="quantity" class="quantity">${i.quantity}</b>
                                                <a class="btn btn-outline-success" id="up"
                                                       onclick="Up(this,'${i.product.product_id}',${i.product.unit_in_stock})"
                                                       
                                                      >+</a>
                                                    <div class="addmore-item">
                                                        <span id="error" style="color: red">
                                                            You got maximum product
                                                        </span>
                                                        
                                                    </div>  
                                                </div>
                                            </div>
                                        </td>
                                        <!--format number of price-->
                                        <td class="align-middle" >
                                            
                                            <b class="d-flex justify-content-center"  style="color: red;">
                                                <c:if test="${i.product.sale_price != 0}"><fmt:formatNumber value="${i.product.sale_price*i.quantity}" type="currency" currencySymbol="đ" maxFractionDigits="0"/></c:if>
                                                <c:if test="${i.product.sale_price == 0}"><fmt:formatNumber value="${i.product.original_price*i.quantity}" type="currency" currencySymbol="đ" maxFractionDigits="0"/></c:if>
                                            </b> 
                                        </td>
                                        <td class="align-middle">
                                           
                                        <button id="delete" type="button" onclick="Delete(this,${i.product.product_id})" class="btn btn-danger">Delete</button>
                                        </td>
                                    </tr>
                                </c:forEach>
                                <!--</div>-->
                            </tbody>
                        </table>
                        <!-- End -->
                        <section class="home-sp">
                            <div class="page-trang table">
                                <a href="#"></a>
                                <a href="#"></a>
                            </div>
                        </section>

                    </div>
                    <div class="p-3 bg-white rounded shadow-sm">
                        <div class="text-center">
                            <h3 class="pb-3 text-uppercase font-weight-bold">Cart detail</h3>
                        </div>
                        <div class="p-4">
                            <ul class="list-unstyled mb-4">
                                <li class="d-flex justify-content-between py-3 border-bottom"><b class="text-muted" >Sub total</b>
                                    <h5 class="font-weight-bold" id="subtotal-final" style="color: red;"><fmt:formatNumber value="${o.totalMoney}" type="currency" currencySymbol="đ" maxFractionDigits="0"/></h5>
                                </li>
                                <li class="d-flex justify-content-between py-3 border-bottom"><b class="text-muted">Shipping fee</b><b>Free ship</b></li>
                                <li class="d-flex justify-content-between py-3 border-bottom"><b class="text-muted">Total</b>
                                    <h5 class="font-weight-bold" id="total-final" style="color: red;"><fmt:formatNumber value="${o.totalMoney}" type="currency" currencySymbol="đ" maxFractionDigits="0"/></h5>
                                </li>
                            </ul>
                            <div class="d-flex justify-content-end">
                                    <!--Disable order now function when cart empty-->
                                <a href="productslist" class="btn">Click to continue shopping</a>
                                   <c:if test="${requestScope.cart.items.size()!=0}">
                                        <a href="checkout" class="btn btn-outline-primary ms-3">Order Now</a>
                                   </c:if>
                                   <c:if test="${requestScope.cart.items.size()==0}">
                                        <button class="btn btn-outline-primary ms-3" disabled>Order Now</button>
                                   </c:if>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <script src="js/script.js"></script>
        
    <script src="https://unpkg.com/@popperjs/core@2"></script>
    <script>
        const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]')
        const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl))
    </script>
    <script>
     function UpdateSubTotal(e,quantity){
         var total=0;
         var dollarUSLocale = Intl.NumberFormat('en-US');
         var fprice=e.childNodes[5];
         var fsub=e.childNodes[11];
         var price=fprice.getElementsByTagName('input')[0].getAttribute('value');
         var subtotal=fsub.childNodes[1];
         subtotal.innerHTML=dollarUSLocale.format(price*quantity) +" đ";
            upDateTotal();
     }
     
      // update total after add/remove item
 function upDateTotal(){
     var total=0;
        for (var i = 0; i < document.querySelectorAll("#items").length; i++) {
                var row=document.querySelectorAll("#items")[i]
                    subprice=row.getElementsByTagName('input')[0].getAttribute('value');//sub price
                    subquantity=row.getElementsByClassName('quantity')[0].innerHTML; // sub quantity
                total=total+subprice*subquantity;
        }
        var dollarUSLocale = Intl.NumberFormat('en-US');
        var total_final=document.getElementById("total-final");
        var subtotal_final=document.getElementById("subtotal-final");
        subtotal_final.innerHTML=dollarUSLocale.format(total)+" đ";
        total_final.innerHTML=dollarUSLocale.format(total)+" đ";
     }
 
        // Cart details script
function Down(e,productID){
   
    $.ajax({
    "type": "GET",
    // generate the request url from the query.
    // escape the query string to avoid errors caused by special characters 
    "url": "/swp/process",
    "data": {
              num : -1
              ,id:productID
            },
            
    "success": function(data) {
        var row=document.getElementById("content");
//        row.innerHTML="";
//        row.innerHTML=data
        console.log("normal  successful");

    },
    "error": function(errorData) {
        console.log("lookup ajax error")
        console.log(errorData)
    }
});
 var fe=e.parentElement;
  var parent=e.parentElement.parentElement.parentElement.parentElement; //get tr
    var quantity=fe.childNodes[3];
    var error=fe.childNodes[7];
    error.style='display:none';
    var old_quantity=quantity.innerHTML;
    if(quantity.innerHTML=='1'){
       
        parent.remove();
    }else{
    quantity.innerHTML=old_quantity-'1';
    UpdateSubTotal(parent,quantity.innerHTML);
    }
}
function Up(e,productID,max){
        

    $.ajax({
    "type": "GET",
    // generate the request url from the query.
    // escape the query string to avoid errors caused by special characters 
    "url": "/swp/process",
    "data": {
              num : 1
              ,id:productID
            },
            
    "success": function(data) {
        var row=document.getElementById("content");
//        row.innerHTML=data;

    },
    "error": function(errorData) {
        console.log("lookup ajax error")
        console.log(errorData)
    }
});
       
     var parent=e.parentElement.parentElement.parentElement.parentElement; //get tr
     var fe=e.parentElement;
    var quantity=fe.childNodes[3];
    var error=fe.childNodes[7];
    var old_quantity=quantity.innerHTML;
    console.log()
    if(old_quantity>=max){
        error.style='display:block';
    }else{
        quantity.innerHTML=old_quantity-'-1';
    }
     UpdateSubTotal(parent,quantity.innerHTML);
 
}
function Delete(e,productID){
  
   parent=e.parentElement.parentElement;
     console.log(parent);
     parent.remove();
     upDateTotal();
    $.ajax({
    "type": "post",
    // generate the request url from the query.
    // escape the query string to avoid errors caused by special characters 
    "url": "/swp/process",
    "data": {
              id:productID
            },
            
    "success": function(data) {
//        var row=document.getElementById("content");
//        row.innerHTML=data;

    },
    "error": function(errorData) {
        console.log("lookup ajax error")
        console.log(errorData)
    }
});
}
    </script>
</html>