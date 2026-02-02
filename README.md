# Employee_Management_Springboot

Simple Spring Boot backend for managing employees with a clean controller/service/repository structure.

## What it does
- Create, read, update, and delete employee records
- Uses PostgreSQL (configured in `backen/src/main/resources/application.properties`)

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

## Database notes
This project is currently set up for PostgreSQL. 
