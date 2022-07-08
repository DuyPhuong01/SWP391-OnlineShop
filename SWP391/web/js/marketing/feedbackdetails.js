function showFeedback(id) {
    $.ajax({
        url: 'editfeedback',
        type: 'post',
        data: {
            id: id,
            action: "showfeedback"
        },
        success: function (repsonse) {
            d.style = "";
            document.querySelector('#form-product-image input[type="file"]').value = null;
            var node = document.createElement("div");

        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {

        }
    });
}
function hideFeedback(id) {
    $.ajax({
        url: 'editfeedback',
        type: 'post',
        data: {
            id: id,
            action: "hidefeedback"
        },
        success: function (repsonse) {
            d.style = "";
            document.querySelector('#form-product-image input[type="file"]').value = null;
            var node = document.createElement("div");

        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {

        }
    });
}