
    var a = document.getElementById('test').value;
    var items = a.split(";");
            for (var i = 0; i < items.length; i++) {
        console.log(parseInt(items[i]));
    }
