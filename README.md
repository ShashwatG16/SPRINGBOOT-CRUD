# Employee Management System 🏢  
[![Tech Stack](https://img.shields.io/badge/Tech%20Stack-JavaScript%20%7C%20Java%20%7C%20ReactJS%20%7C%20Spring%20Boot%20%7C%20PostgreSQL%20%7C%20Bootstrap-blue)](#)  

The Employee Management System is a full-stack CRUD (Create, Read, Update, Delete) application for managing employee records. Built using **ReactJS** for the frontend, **Spring Boot** for the backend, and **PostgreSQL** for database management, the system offers secure access and a user-friendly interface for efficient data handling.

---

## ✨ Features  

- **Employee Management**  
  - Add, update, delete, and view employee records.  

- **Secure Authentication**  
  - Utilizes **Spring Security** for secure access control.  

- **Responsive Design**  
  - Built with **Bootstrap** to ensure seamless user experience across devices.  

- **Efficient Data Management**  
  - Data persistence with **JPA/Hibernate** and **PostgreSQL**.

---

## 🛠️ Tech Stack  

- **Frontend:** ReactJS, Bootstrap  
- **Backend:** Spring Boot (Spring Web, Spring Security)  
- **Database:** PostgreSQL  
- **ORM:** JPA/Hibernate  


## 🚀 Getting Started  

Follow the instructions below to set up and run the project locally.  

### Prerequisites  

- **Java JDK 11 or higher**  
- **Node.js (v14 or higher)**  
- **PostgreSQL**  
- **Maven**  

### Installation  

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/ShashwatG16/SPRINGBOOT-CRUD.git
   cd employee-management-system
2. **Configure your applicaiton. properties**  
   ```bash
    spring.datasource.url=jdbc:postgresql://localhost:5432/employee_db
    spring.datasource.username=your_postgres_username
    spring.datasource.password=your_postgres_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.security.enabled=true
    jwt.secret=your_jwt_secret_key

3. **Start the backend server**  
   ```bash
    mvn spring-boot:run
4. **Install dependencies and run frontend**
    ```bash
      npm i
     cd frontend
      npm run start
## 🤝 Contribution
Contributions are welcome!

- Fork the repository.
- Create a feature branch.
- Make changes and submit a pull request.

Crafted with ❤️ by Shashwat Kumar Gautam.

