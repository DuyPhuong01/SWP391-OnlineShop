function submitFormDefault() {
    document.getElementById('submit-frm').submit();
}
function submitFormWithNewOrderOption(item) {
    document.getElementById('orderOption').value = item.value;
    document.getElementById('submit-frm').submit();
}
function submitFormWithNewPage(page) {
    document.getElementById('pageNumber').value = page;
    document.getElementById('submit-frm').submit();
}
function showSale() {
        document.getElementById('sale-list').style.height = "100%";
        document.getElementById('more-sale-container').style.display="none";
        document.getElementById('no-orders').style.height ="1160px";

}
function checkEndDateInput(item) {


    var now = new Date();
    var endDate = new Date(item.value);

    var today = "";
    var year = now.getFullYear();
    today += year + "-";
    var month = now.getMonth() + 1;
    if (month < 10) {
        today += "0" + month + "-";
    } else {
        today += month + "-";
    }
    var date = now.getDate();
    if (date < 10) {
        today += "0" + date;
    } else {
        today += date;
    }

    if (endDate.getTime() > now.getTime()) {
        alert("End date can not greater than now");
        item.value = today;
    }
}