function getColorCode() {
    var makeColorCode = '0123456789ABCDEF';
    var code = '#';
    for (var count = 0; count < 6; count++) {
        code = code + makeColorCode[Math.floor(Math.random() * 16)];
    }
    return code;
}
function getColorArray(number){
    var arr ="";
    for (var i = 0; i < number; i++) {
        arr += getColorCode()+";";
    }
    arr = arr.substring(0, arr.length - 1);
    return arr;
}

function createChart(type,label=[], data=[], color=[]){
    const ctx = document.getElementById('myChart').getContext('2d');
    const myChart = new Chart(ctx, {
    type: type,
    data: {
        labels: label,
        datasets: [{
                label: 'New Customers',
                data: data,
                backgroundColor: color,
                borderWidth: 1
            }]
    },
    options: {
        legend: {
            display: false,
            position: 'left'
        },
        title: {
            display: true,
            text: 'Trend of new customers by day',
            position: 'top',
            fontSize: 16,
            padding: 20
        },
        scales: {
            yAxes: [{
                    ticks: {
                        min: 0
                    }
                }]
        },
        options: {
            responsive: true
        }
    }
});
}

function checkFirstDateInput(item){

    var second = document.getElementById('end-date');
    
    var startDate = new Date(item.value);
    var endDate = new Date(second.value);
    if(startDate.getTime() > endDate.getTime()){
        item.value = second.value;
        document.getElementById('mess').innerHTML = 'Start date can not be greater than end date';
        document.getElementById('mess').style.visibility = 'visible';
    }
}

function checkEndDateInput(item){

    var first = document.getElementById('start-date');
    
    var now = new Date();
    var startDate = new Date(first.value);
    var endDate = new Date(item.value);
    if(startDate.getTime() > endDate.getTime()){
        item.value = first.value;
        document.getElementById('mess').innerHTML = 'End date can not be less than start date';
        document.getElementById('mess').style.visibility = 'visible';
    }
;
    var today = "";
    var year = now.getFullYear();
    today += year+"-";
    var month = now.getMonth()+1;
    if(month <10){
        today += "0"+month+"-";
    } else {
        today += month+"-";
    }
    var date = now.getDate();
    if(date < 10){
        today += "0"+date;
    } else {
        today += date;
    }

    if(endDate.getTime() > now.getTime()){
        document.getElementById('mess').innerHTML = 'End date can not greater than now';
        document.getElementById('mess').style.visibility = 'visible';
        item.value = today;
    }
}




