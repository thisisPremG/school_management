# 🎓 Student Management REST API

A simple REST API built with **Java Spring Boot** and **MySQL** to manage students.

---

## 🛠️ Tech Stack
- Java 21
- Spring Boot 4.0.3
- Spring Data JPA
- MySQL
- Maven

---

## ⚙️ Setup & Run

### 1. Clone the project
```bash
git clone https://github.com/YourUsername/student-management.git
cd student-management
```

### 2. Create MySQL Database
```sql
CREATE DATABASE studentDb;
```

### 3. Configure `application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentDb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Run the app
```bash
mvn spring-boot:run
```
App runs on `http://localhost:8080`

---

## 📡 API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| POST | `/students` | Create new student |
| PUT | `/students/{id}` | Update student |
| DELETE | `/students/{id}` | Delete student |

---

## 📥 Sample Request

### Create a Student
```json
POST /students
{
  "name": "John Doe",
  "email": "john@example.com",
  "major": "Computer Science"
}
```

### Response
```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john@example.com",
  "major": "Computer Science"
}
```

---

## 📁 Project Structure
```
src/main/java/school/
├── SchoolApplication.java
├── student.java
├── studentRepo.java
├── studentService.java
└── studentController.java
```

---

## 👨‍💻 Author
**Prem Kumar**
