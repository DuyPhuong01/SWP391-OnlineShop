/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function searchProduct(){
    var key = document.getElementById('productSeachKey').value;
    var category = document.getElementsByClassName('form-check-input');
    var action = "productslist?key=";
    action += key;
    for (var i = 0; i < category.length; i++) {
        if (category[i].checked) {

            action += "&category=" + category[i].value;
        }
    }
    window.location.replace(action);
}
