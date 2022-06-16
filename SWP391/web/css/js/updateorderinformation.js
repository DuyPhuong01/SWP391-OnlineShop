function update() {
    var form = document.getElementById('frm');
    form.action = "showcart";
    form.method = "post";
    form.submit();
}
function cancel() {
    var form = document.getElementById('frm');
    form.action = "updateorder";
    form.method = "post";
    form.submit();
}