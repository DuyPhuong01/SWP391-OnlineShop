var images = document.querySelectorAll('.rei_banner_body>div');
        var slider_btn = document.querySelectorAll('.rei_banner_bottombtns span');
        var i = 0;

        banner();

        function banner() {
            for (var index = 0; index < images.length; index++) {
                images[index].style = 'transform: translateX(-' + (100 * i) + '%); transition: 1s;'
                slider_btn[index].classList = '';
            }
            slider_btn[i].classList = 'banner-highlight';
            setTimeout(banner, 6000);
            i++;
            if (i == images.length)
                i = 0;
        }

        function getBanner(id) {
            i = id - 1;
            for (var index = 0; index < images.length; index++) {
                slider_btn[index].classList = '';
                images[index].style = 'transform: translateX(-' + (100 * i) + '%); transition: 1s;'
            }
            slider_btn[i].classList = 'banner-highlight';
        }