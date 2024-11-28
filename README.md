# Blockchain Voting and User Activity Prediction Project

# This project is currently under development

## Overview

This project is currently under development, based on the requirements of the Spring Advanced course assignment, aiming to create an innovative web application that uses blockchain technology to enable user voting and predict user activity. It aims to combine several core functionalities, including data visualization, blockchain integration, and user management, to deliver a secure and informative platform. The project is being built using modern technologies such as Spring Boot, Spring Data, and Spring Security, with additional features like email verification, REST API integration, and scheduled tasks.

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


- **Blockchain Implementation**: Integrating blockchain concepts, while novel and beneficial for voting security, required additional learning and experimentation.
- **Maintaining Clean Code and Structure**: Ensuring adherence to SOLID principles and keeping controllers "thin" required careful attention to architectural decisions, particularly when adding new features.

## Innovations and Extra Features

- **AI Activity Prediction**: One of the innovative aspects is integrating a prediction model for user activity, which utilized statistical techniques to forecast peak usage times.
- **Microservices**:  extended the application using a microservice for activity-related data, which communicates with the main project via REST API.
- **Email Confirmation with Secure Token**: To enhance user verification, added a secure email confirmation mechanism using unique tokens to prevent unauthorized access.

## Future Enhancements

- **AI Model Integration for Deeper Insights**: Expanding the prediction capabilities by integrating more advanced machine learning models to provide deeper insights into user behavior.
- **Frontend Enhancement**: using modern JavaScript frameworks like React or Angular to enhance the responsiveness and user experience.
- **Cloud Deployment**: Deploying the application in a cloud environment like AWS or Azure, adding cloud-specific services such as managed databases or load balancers.

