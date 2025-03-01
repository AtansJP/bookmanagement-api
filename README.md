# Book Management API

## Overview

The **Book Management API** is a RESTful API built using **Java** and **Spring Boot**. It allows users to manage a collection of books by performing CRUD (Create, Read, Update, Delete) operations. The API also includes features like filtering, exception handling, and unit testing to ensure robustness and reliability.

---

## Features

- **CRUD Operations**: Create, read, update, and delete books.
- **Filtering**: Filter books by specific criteria using custom query methods.
- **Exception Handling**: Gracefully handles errors and returns meaningful responses.
- **Unit Testing**: Includes unit tests for the service layer to ensure functionality.
- **Database Integration**: Uses **MySQL** for data persistence.

---

## Setup

### Prerequisites

Before running the project, ensure you have the following installed:

- **Java Development Kit (JDK) 21** or higher.
- **MySQL** (or any compatible database).
- **Maven** (for building the project).
- **Git** (for cloning the repository).

### Steps to Run the Project

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/AtansJP/bookmanagement-api.git

 Navigate to the Project Directory:
     cd bookmanagement-api
    
 Set Up the MySQL Database:
     Create a new database in MySQL:
      CREATE DATABASE bookmanagement;

  Update the application.properties file with your database credentials:

      properties
      spring.datasource.url=jdbc:mysql://localhost:3306/bookmanagement
      spring.datasource.username=root
      spring.datasource.password=yourpassword
      spring.jpa.hibernate.ddl-auto=update
  
  Restore the Database 
      A database dump file (dump_file.sql) is included in the database/ directory. To restore the database, run:
      mysql -u root -p bookmanagement < database/dump_file.sql
  
  Run the Application:
   ./mvnw spring-boot:run

  Access the API:
      The API will be available at http://localhost:8080.
  
## API Documentation

  Endpoints

  Books
     Get All Books:
         GET /api/books
         Returns a list of all books
     
     Get a Book by ID
          GET /api/books/{id}
          Returns details of a specific book. 
      
      Create a New Book:
          
          POST /api/books
          
          Request Body
          json

          {
        "title": "1984",
        "author": "George Orwell",
        "isbn": "978-0451524935",
        "price": 10.24,
        "publicationDate": "2024-01-01T00:00:00Z"
      }
  Update a Book:
      
      PUT /api/books/{id}
      
      Request Body
        json
            {
        "title": "1984",
        "author": "George Orwell",
        "isbn": "978-0451524935",
        "price": 12.99,
        "publicationDate": "2024-01-01T00:00:00Z"
      }
   
  Delete a Book:
      DELETE /api/books/{id}
      Deletes a specific book.
   
## Database
   The project uses MySQL for data persistence. A database dump file (dump_file.sql)is included 
   in the database/directory. This file contains the schema and sample data for the bookmanagement database
   Restoring the Database:
      Create the Database
      
      sql
      CREATE DATABASE bookmanagement;
    
   Restore the Database:
        bash
      mysql -u root -p bookmanagement < database/dump_file.sql
    
  Verify the Database:
        Check that the bookstable and sample data have been created
    
  Testing
       The project includes unit tests for the service layer. To run the tests, use the following command:
       bash
       ./mvnw test
       This will execute all the unit tests in the project.
    
## Contributing
      Contributions are welcome! If you'd like to contribute, please follow these steps:
      Fork the repository
      Create a new branch for your feature or bug fix.
      Commit your changes.
      Push your branch and open a Pull Request.
      
## Acknowledgments
      Built with Spring Boot and MySQL.
      Inspired by the need for a simple and efficient book management system.

## Contact
  For questions or feedback, feel free to reach out:

      GitHub: AtansJP

      Email: atansjp2@gmail.com