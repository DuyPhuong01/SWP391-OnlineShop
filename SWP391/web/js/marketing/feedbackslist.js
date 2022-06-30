function clearCheckboxRatedStar() {
    document.querySelectorAll('input[name="rated_star"]').forEach(i => {
        i.checked = false;
    });
    document.querySelector('input[name="rated_star"]').checked = true;
}

function clearCheckboxRatedStarAll() {
    document.querySelector('input[name="rated_star"]').checked = false;
}

function showProductOption() {
    document.getElementById('sub-product-select').style = "opacity: 1";
}

function hideProductOption() {
    document.getElementById('sub-product-select').style = "opacity: 0";
}
function nextPage(page){
    document.querySelector('input[name="page"').value = page;
    document.getElementById('feedbackSearchForm').submit();
}

function showProductList() {
    document.getElementById('product-list').style = "opacity: 1";
    document.getElementById('input-productSearch').style = "opacity: 1";
    $.ajax({
        url: 'getproductslist',
        type: 'post',
        data: {
            key: document.querySelector('#input-productSearch input').value
        },
        success: function (response) {
            document.getElementById('product-list-container').innerHTML = response;
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            
        }
    });
}

function hideProductList() {
    document.getElementById('product-list').style = "opacity: 0";
    document.getElementById('input-productSearch').style = "opacity: 0";
}
var timer = setTimeout(doSearch, 1000);
function searchProduct(){
    clearTimeout(timer); 
    timer = setTimeout(doSearch, 1000);
}

function doSearch(){
     $.ajax({
        url: 'getproductslist',
        type: 'post',
        data: {
            key: document.querySelector('#input-productSearch input').value
        },
        success: function (response) {
            document.getElementById('product-list-container').innerHTML = response;
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            
        }
    });
} 