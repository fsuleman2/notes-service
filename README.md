# Notes Service

A modern, RESTful API for managing notes, built with Spring Boot, JPA, and PostgreSQL.

---

## ✨ Features

- **Create, Read, Update, Delete (CRUD) Notes**
- **Pagination** for listing notes
- **RESTful API** design
- **PostgreSQL** database integration
- **Spring Data JPA** for ORM
- **Custom API responses**
- **Error handling**
- **Ready for Docker & Cloud deployment**

---

## 📦 Tech Stack

- Java 17
- Spring Boot 3.5
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- Spring Boot DevTools
- Spring Boot Starter Test (JUnit)
- Redis (dependency included, not yet configured)

---

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Maven
- PostgreSQL (running on `localhost:5432` with user `postgres` and password `root123`)

### 1. Clone the repository
```sh
git clone <your-repo-url>
cd notes-service
```

### 2. Configure the Database
Edit `src/main/resources/application.properties` if you want to change DB credentials:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres?currentSchema=notes_schema
spring.datasource.username=
spring.datasource.password=
```

### 3. Build and Run
```sh
./mvnw spring-boot:run
```
Or on Windows:
```sh
mvnw.cmd spring-boot:run
```

The service will start on [http://localhost:9090](http://localhost:9090)

---

## 🛠️ API Endpoints

Base URL: `/api/v1/note`

| Method | Endpoint                         | Description            |
| ------ | -------------------------------- | ---------------------- |
| POST   | `/`                              | Create a new note      |
| GET    | `/{noteId}`                      | Get note by ID (path)  |
| GET    | `?noteId={noteId}`               | Get note by ID (query) |
| GET    | `/`                              | Get all notes          |
| GET    | `/page?pageNumber=1&pageSize=10` | Get paginated notes    |
| PUT    | `/{id}`                          | Update a note          |
| DELETE | `/{noteId}`                      | Delete a note          |

### Example Note Object
```json
{
  "title": "Sample Note",
  "content": "This is a note.",
  "addedDate": "2024-06-14T12:00:00.000+00:00",
  "live": true
}
```

---

## 🧪 Running Tests

```sh
./mvnw test
```

---

## 📄 License

This project is licensed under the Apache License 2.0.

---

## 🙏 Acknowledgements
- [Spring Boot](https://spring.io/projects/spring-boot)
- [PostgreSQL](https://www.postgresql.org/)
- [Lombok](https://projectlombok.org/)

---

> Made with ❤️ by Syed
