//function to get data
function getDateData() {
    result = "";
    var arr = document.getElementById('dates').value.split(";");
    for (var i = 0; i < arr.length; i++) {
        result += arr[i] + ";";
    }
    return result.substring(0, result.length - 1);
}
function getCustomerData() {
    result = "";
    var arr = document.getElementById('customers').value.split(";");
    for (var i = 0; i < arr.length; i++) {
        result += arr[i] + ";";
    }
    return result.substring(0, result.length - 1);
}
//convert data into array
var arr = getDateData().split(";");
var dataArr = getCustomerData().split(";");

//chart
var ctx = document.getElementById('myChart').getContext('2d');
var myChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: arr,
        datasets: [{
                label: 'New Customers',
                data: dataArr,
                backgroundColor: 'green',
//                backgroundColor: [
//                    'rgba(216, 27, 96, 0.6)',
//                    'rgba(3, 169, 244, 0.6)',
//                    'rgba(255, 152, 0, 0.6)',
//                    'rgba(29, 233, 182, 0.6)',
//                    'rgba(156, 39, 176, 0.6)',
//                    'rgba(84, 110, 122, 0.6)',
//                    'red'
//                ],
                borderWidth: 1
            }]
    },
    options: {
        legend: {
            display: false
        },
        title: {
            display: true,
            text: 'New customers by days',
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