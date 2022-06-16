/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function buy(id){
    var quantity=document.f.num.value;
    document.f.action="buy?id="+id+"&num="+quantity;
    document.f.submit();
}
function checkPayment(value){
    document.getElementById("payment").innerHTML="";//refresh content
    var content="";
    if(value=='1'){
        content='After receiving product,the customer will pay the order with the delivery staff';
    }else if(value=='2'){
        content="Customers pay in advance for orders through the account number below.\n\
       Sales staff will activate the order when receiving the money.\n\
       Bank account number:03253556201";
    }else{
        content="scan qr code to finish"
    }
        document.getElementById("payment").innerHTML=content;
}


