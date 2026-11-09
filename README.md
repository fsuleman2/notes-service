# Notes Service

A RESTful Notes Management API built with **Java 17, Spring Boot 3, Spring Data JPA, and PostgreSQL**. The application provides APIs to create, retrieve, update, delete, and paginate notes, following clean REST API design principles.

## ✨ Features

- **CRUD Operations:** Create, read, update, and delete notes.
- **Pagination:** Retrieve notes efficiently using configurable pagination.
- **RESTful API Design:** Versioned API endpoints.
- **PostgreSQL Integration:** Persistent relational database storage.
- **Spring Data JPA:** Database interaction and ORM.
- **Custom API Responses:** Consistent response structures.
- **Error Handling:** Application-level exception handling.
- **Unit Testing:** Test support using JUnit and Spring Boot Test.
- **Deployment Ready:** Suitable for containerization and cloud deployment with additional configuration.

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Java 17 | Programming language |
| Spring Boot 3.5 | Application framework |
| Spring Data JPA | Data persistence |
| PostgreSQL | Relational database |
| Maven | Dependency and build management |
| Lombok | Boilerplate code reduction |
| JUnit | Testing |
| Redis | Dependency included; integration not yet configured |

## 🏗️ Application Overview

The application exposes REST endpoints that allow clients to manage notes through HTTP requests.

**Request flow:**

```text
Client
  |
  v
REST Controller
  |
  v
Service Layer
  |
  v
Spring Data JPA Repository
  |
  v
PostgreSQL Database
```

## 🚀 Getting Started

### Prerequisites

Ensure you have the following installed:

- Java 17 or later
- Maven (or use the included Maven Wrapper)
- PostgreSQL

### 1. Clone the Repository

```bash
git clone https://github.com/fsuleman2/notes-service.git
cd notes-service
```

### 2. Configure the Database

Create a PostgreSQL database and configure the application properties.

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=${DB_URL:jdbc:postgresql://localhost:5432/postgres?currentSchema=notes_schema}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
``
