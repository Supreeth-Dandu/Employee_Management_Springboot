# Employee_Management_Springboot

Simple Spring Boot backend for managing employees with a clean controller/service/repository structure.

## What it does
- Create, read, update, and delete employee records
- Uses an in-memory H2 database (data resets on restart)

## Run locally
From the `backen` folder:
```
.\mvnw.cmd spring-boot:run
```
Backend runs on `http://localhost:8080`.

## API endpoints
- `GET /api/employees`
- `POST /api/employees`
- `PUT /api/employees`
- `DELETE /api/employees/{id}`

## Example POST body
```
{
  "name": "Alice",
  "email": "alice@example.com",
  "jobTitle": "Engineer"
}
```

## H2 Console
Enabled at `http://localhost:8080/h2-console`  
JDBC URL: `jdbc:h2:mem:testdb`
