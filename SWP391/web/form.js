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


