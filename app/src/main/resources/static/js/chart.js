document.addEventListener('DOMContentLoaded', function() {
    const ctx = document.getElementById('activityChart').getContext('2d');

 
    const activityData = {
        labels: ['', '', '', '', '', '', ''],
        datasets: [{
            label: '',
            data: [65, 59, 80, 81, 56, 55, 40], 
            backgroundColor: 'rgba(75, 192, 192, 0.2)',
            borderColor: 'rgba(75, 192, 192, 1)',
            borderWidth: 1
        }]
    };


    const config = {
        type: 'bar', 
        data: activityData,
        options: {
            responsive: true,
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    };

   
    const activityChart = new Chart(ctx, config);
});
