# Freelance Platform API

## Overview
The **Freelance Platform API** is a backend system built using **Spring Boot** and **PostgreSQL**. It provides a hierarchical user management system where different types of users (e.g., general users and freelancers) inherit from a common base. The API supports authentication, user management, and freelancer specialization features.

## Features
- **User Hierarchy Management**
  - `BaseUser`: Contains common attributes like `id`, `name`, `email`, and `password`.
  - `User`: Extends `BaseUser` with application-specific fields like `address` and `phone number`.
  - `Freelancer`: Extends `User` with a `specialization` field (e.g., "Web Development", "Graphic Design").
- **Authentication & Authorization**
  - JWT-based authentication for secure access.
  - Role-based access control for different user types.
- **Database Management**
  - Uses **PostgreSQL** with the **joined inheritance strategy** to store user data efficiently.
- **CRUD Operations**
  - Create, Read, Update, and Delete operations for users and freelancers.
- **RESTful API**
  - Follows best practices in API design with proper HTTP status codes and request validation.

## Project Structure
```
freelance-platform-api/
│-- src/
│   ├── main/
│   │   ├── java/com/freelance/platform/
│   │   │   ├── config/            # Security and application configurations
│   │   │   ├── controllers/       # API controllers handling HTTP requests
│   │   │   ├── models/            # Entity classes representing the database structure
│   │   │   ├── repositories/      # Interfaces for database operations
│   │   │   ├── services/          # Business logic layer
│   │   ├── resources/
│   │   │   ├── application.properties  # Database and server configurations
│-- pom.xml (Maven dependencies)
│-- README.md
```

## Installation & Setup
### Prerequisites
Ensure you have the following installed:
- **JDK 17+**
- **PostgreSQL 16+**
- **Maven or Gradle**

### Database Setup
1. Install PostgreSQL and create a database:
   ```sql
   CREATE DATABASE freelance_platform;
   ```
2. Update `application.properties` with database credentials.
3. Run the application, and the database schema will be created automatically.

### Running the Application
To start the Spring Boot application:
```sh
mvn spring-boot:run
```
Or using Gradle:
```sh
./gradlew bootRun
```

## API Endpoints
### User Management
- `POST /createUser` - Create a new user
- `POST /createFreelancer` - Create a new freelancer
- `GET /allUsers` - Get all users
- `GET /allFreelancers` - Get all freelancers

## Error Handling
- Returns **400** for bad requests
- Returns **401** for unauthorized access
- Returns **404** for resource not found
- Returns **500** for internal server errors

## Deployment
- Can be containerized using **Docker**
- Configured for cloud deployment (AWS/Azure)

## Contributing
Contributions are welcome! Feel free to submit a pull request.

## License
This project is licensed under the MIT License.

---
For more details, refer to the documentation or contact the project maintainers.

