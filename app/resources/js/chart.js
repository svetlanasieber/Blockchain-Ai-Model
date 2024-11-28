document.addEventListener('DOMContentLoaded', function() {
    const ctx = document.getElementById('activityChart').getContext('2d');

   
    const activityData = {
        labels: ['Monday', 'Вторник', 'Сряда', 'Четвъртък', 'Петък', 'Събота', 'Неделя'],
        datasets: [{
            label: 'Активност на потребителите',
            data: [65, 59, 80, 81, 56, 55, 40], // Примерни данни - тук можеш да сложиш реални данни от бекенда
            backgroundColor: 'rgba(75, 192, 192, 0.2)',
            borderColor: 'rgba(75, 192, 192, 1)',
            borderWidth: 1
        }]
    };

    // Опции за графиката
    const config = {
        type: 'bar', // Може да бъде 'line', 'bar', 'pie', и т.н.
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

    // Създаване на графиката
    const activityChart = new Chart(ctx, config);
});
