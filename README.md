# Hospital Appointment and Patient Management System

Microservices mini project using Spring Boot, Maven, MySQL and REST APIs.

## Services
- Patient Service: 8081, database `patient_db`
- Doctor Service: 8082, database `doctor_db`
- Appointment Service: 8083, database `appointment_db`

## Required concepts
- Database per Service
- Data Isolation
- RESTful API Design
- API Versioning using `/api/v1`

## MySQL
Run:
CREATE DATABASE patient_db;
CREATE DATABASE doctor_db;
CREATE DATABASE appointment_db;

Change `spring.datasource.username` and `spring.datasource.password` in each service if needed.

## Run in VS Code
Open the root folder in VS Code. Make sure Java 17+ and Maven are installed.
Open each service terminal and run:
mvn spring-boot:run

## Test
POST http://localhost:8081/api/v1/patients
{
  "name":"Afreena",
  "age":22,
  "gender":"Female",
  "phone":"9876543210"
}

POST http://localhost:8082/api/v1/doctors
{
  "name":"Dr. Kumar",
  "specialization":"Cardiologist",
  "phone":"9876543211"
}

POST http://localhost:8083/api/v1/appointments
{
  "patientId":1,
  "doctorId":1,
  "appointmentDate":"2026-10-10",
  "status":"BOOKED"
}
