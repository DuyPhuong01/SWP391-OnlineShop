var editor = CKEDITOR.replace('post-detail', {
    filebrowserBrowseUrl: '/ckfinder/ckfinder.html',
    filebrowserUploadUrl: '/ckfinder/core/connector/php/connector.php?command=QuickUpload&type=Files'
});

editor.config.width = '90%';
editor.config.height = 500;
editor.config.autoGrow_bottomSpace = 500;
editor.config.readOnly = true;

document.querySelector('#upload-thumbnail').addEventListener('click', function () {
    document.querySelector('#change-thumbnail-frm input[type="file"]').click();
});


document.querySelector('#preview-thumbnail').querySelector('button[aria-label="close"]').addEventListener('click', function () {
    document.querySelector('#change-thumbnail-frm input[type="file"]').value = null;
});
document.querySelector('#preview-thumbnail').querySelector('button[aria-label="save"]').addEventListener('click', function () {
    var form = document.getElementById('change-thumbnail-frm');
    var formData = new FormData(form);
    $.post({
        url: 'postdetails',
        data: formData,
        contentType: false,
        processData: false,
        success: function (response) {
            document.querySelector('#preview-thumbnail').querySelector('button[aria-label="close"]').click();
            document.querySelector('#change-thumbnail-frm input[type="file"]').value = null;
            document.querySelector('img[aria-label="thumbnail"]').setAttribute('src', "../" + response);
            document.querySelector('#thumbnail-view').setAttribute('src', "../" + response);
        }
    });
});


function updateThumbnail(event) {
    var file = event.target.files[0];

    var fileReader = new FileReader();

    fileReader.onload = function () {
        var url = fileReader.result;
        document.getElementById('preview-thumbnail-image').src = url;
    };

    fileReader.readAsDataURL(file);
    document.getElementById('abc').click();


}
function editPostInformation() {
    document.querySelectorAll('#frm [aria-label="changable-fields"]').forEach(input => {
        input.disabled = false;
    });
    document.querySelector('button[aria-label="save-post"]').style.display = "";
    document.querySelector('button[aria-label="cancel-edit"]').style.display = "";
    document.querySelector('button[aria-label="edit-post"]').style.display = "none";
    CKEDITOR.instances['post-detail'].setReadOnly(false);
}

function thumbnailHover() {
    var a = document.querySelector('.thumbnail-action');
    a.style.opacity = 1;
}
function thumbnailOut() {
    var a = document.querySelector('.thumbnail-action');
    a.style.opacity = 0;
}
function cancelEdit() {
    document.querySelectorAll('#frm [aria-label="changable-fields"]').forEach(input => {
        input.disabled = true;
    });
    document.querySelector('button[aria-label="save-post"]').style.display = "none";
    document.querySelector('button[aria-label="cancel-edit"]').style.display = "none";
    document.querySelector('button[aria-label="edit-post"]').style.display = "";
    CKEDITOR.instances['post-detail'].setReadOnly(true);
}