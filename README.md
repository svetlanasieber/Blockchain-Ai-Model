# Blockchain Voting and User Activity Prediction Project

## Overview

This project was developed as part of the Spring Advanced course at SoftUni, aiming to create an innovative web application that uses blockchain technology to enable user voting and predict user activity. It combines several core functionalities, including data visualization, blockchain integration, and user management, to deliver a secure and informative platform. The project was built using modern technologies such as Spring Boot, Spring Data, and Spring Security, with additional features like email verification, REST API integration, and scheduled tasks.

## Core Features

1. **User Registration and Email Verification**
   - Users can register and receive an email with a confirmation link, ensuring their identity is verified before interacting with the platform.
   - The registration uses a confirmation token, which is generated securely and sent via email using Spring Mail.

2. **Activity Prediction Module**
   - The application includes a prediction model that forecasts user activity based on various parameters such as the day of the week and time of day.
   - Visual representations of user activity are provided using charts to enhance user experience and understanding.

3. **Blockchain Integration for Voting**
   - A blockchain module was implemented to handle voting securely, ensuring the integrity and immutability of the data.
   - This module was designed to provide transparency and build user trust in the voting process.

4. **Admin Dashboard**
   - Admins have access to a specialized dashboard that allows them to manage users, view prediction statistics, and analyze overall activity trends.
   - Functionality includes viewing and deleting user activity predictions, along with managing user roles.

5. **REST API and Microservice Integration**
   - The project was designed to include a separate service consumed by the main application via a REST API, implementing GET, POST, and DELETE endpoints.
   - This microservice architecture increases modularity and scalability, allowing further extensions to the project.

## Technologies Used

- **Spring Framework**: The core framework used to implement backend logic, manage dependencies, and structure the application using best practices.
- **Spring Security**: To manage user authentication and roles, ensuring different levels of access for admins and regular users.
- **Spring Data JPA & MySQL**: Used for data persistence, allowing easy integration with relational databases and simplifying data access.
- **JavaScript & Chart.js**: Used to create responsive data visualizations that represent user activity in an intuitive manner.
- **Thymeleaf**: Employed for server-side rendering and dynamic views.
- **Bootstrap & Custom CSS**: Ensured the application has a clean, modern UI with responsiveness across devices.

## Challenges Faced

- **Managing Security Requirements**: A key focus was on implementing a secure system. We avoided hardcoding passwords by using environment variables, which was crucial for safe deployment, particularly when hosting the project in public repositories like GitHub.
- **Blockchain Implementation**: Integrating blockchain concepts, while novel and beneficial for voting security, required additional learning and experimentation.
- **Maintaining Clean Code and Structure**: Ensuring adherence to SOLID principles and keeping controllers "thin" required careful attention to architectural decisions, particularly when adding new features.

## Innovations and Extra Features

- **AI Activity Prediction**: One of the innovative aspects was integrating a prediction model for user activity, which utilized statistical techniques to forecast peak usage times.
- **Microservices**: We extended the application using a microservice for activity-related data, which communicates with the main project via REST API.
- **Email Confirmation with Secure Token**: To enhance user verification, we added a secure email confirmation mechanism using unique tokens to prevent unauthorized access.

## Future Enhancements

- **AI Model Integration for Deeper Insights**: Expanding the prediction capabilities by integrating more advanced machine learning models to provide deeper insights into user behavior.
- **Frontend Enhancement**: Consider using modern JavaScript frameworks like React or Angular to enhance the responsiveness and user experience.
- **Cloud Deployment**: Deploying the application in a cloud environment like AWS or Azure, adding cloud-specific services such as managed databases or load balancers.

## Conclusion

This project was a great learning experience, combining various technologies into a cohesive application with real-world relevance. By integrating blockchain for security, REST APIs for scalability, and prediction models for insights, we achieved a complex but effective solution. The main takeaway was the importance of modular design, security best practices, and an iterative approach to development, which will undoubtedly be valuable in future projects.
