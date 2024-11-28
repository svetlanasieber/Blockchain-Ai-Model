document.addEventListener('DOMContentLoaded', function() {
    const ctx = document.getElementById('activityChart').getContext('2d');

 
    const activityData = {
        labels: ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'],
        datasets: [{
            label: 'User Activity',
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


function fetchPredictions(filterDayOfWeek, sortBy) {
    $.ajax({
        url: '/admin/prediction-history',
        method: 'GET',
        data: {
            dayOfWeek: filterDayOfWeek
        },
        success: function(predictions) {
        
            if (sortBy) {
                predictions.sort((a, b) => {
                    if (sortBy === 'dayOfWeek') {
                        return a.dayOfWeek - b.dayOfWeek;
                    } else if (sortBy === 'hourOfDay') {
                        return a.hourOfDay - b.hourOfDay;
                    }
                    return 0;
                });
            }

            const tableBody = $('#predictionsTableBody');
            tableBody.empty(); 

          
            predictions.forEach(function(prediction) {
                const row = `<tr>
                    <td>${prediction.dayOfWeek}</td>
                    <td>${prediction.hourOfDay}</td>
                    <td>${prediction.predictionResult}</td>
                    <td>${prediction.timestamp}</td>
                </tr>`;
                tableBody.append(row);
            });
        },
        error: function() {
            alert('Error fetching predictions. Please try again.');
        }
    });
}


$(document).ready(function() {
    $('#filterButton').on('click', function() {
        const filterDayOfWeek = $('#filterDayOfWeek').val();
        fetchPredictions(filterDayOfWeek);
    });

    
    $('#sortDayButton').on('click', function() {
        fetchPredictions(null, 'dayOfWeek');
    });

  
    $('#sortHourButton').on('click', function() {
        fetchPredictions(null, 'hourOfDay');
    });

  
    fetchPredictions();
});
