# Student Management System - JDBC

A Java-based **Student Management System** built using **JDBC and MySQL**.
The application performs CRUD operations on student records through a console-based menu.

## Features

* Add a new student
* View all students
* Search student by ID
* Update student marks
* Delete student
* Automatic ID generation
* MySQL database connectivity using JDBC
* Use of `PreparedStatement` for SQL queries

## Technologies Used

* Java
* JDBC
* MySQL
* Maven
* MySQL Connector/J

## Project Structure

* `Main.java` – Handles the console menu and user input
* `Student.java` – Represents student data
* `StudentService.java` – Handles student CRUD operations
* `DBConfig.java` – Handles database connection configuration

## CRUD Operations

### Add Student

Adds a new student to the database.

### View All Students

Retrieves and displays all student records.

### Search Student

Searches for a student using their ID.

### Update Student

Updates student information.

### Delete Student

Deletes a student record using their ID.

## JDBC Concepts Used

### DriverManager

Used to establish a connection between the Java application and MySQL database.

### Connection

Represents the connection between the Java application and the database.

### PreparedStatement

Used to execute parameterized SQL queries.

### ResultSet

Used to store and process data returned from `SELECT` queries.

### executeQuery()

Used for executing `SELECT` queries.

### executeUpdate()

Used for executing `INSERT`, `UPDATE`, and `DELETE` operations.

## Maven

Maven is used for **dependency management and project configuration**.

The project uses **MySQL Connector/J** as the JDBC driver.

Maven automatically downloads and manages the required dependencies.

## MySQL Connector/J

MySQL Connector/J is the JDBC driver that allows a Java application to communicate with a MySQL database.

## Database Configuration

Database connection details are managed separately in the `DBConfig` class.

The configuration contains:

* Database URL
* MySQL username
* MySQL password

> Do not upload your actual database password to GitHub.

## How to Run

1. Install Java and MySQL.
2. Configure the MySQL connection.
3. Make sure the MySQL server is running.
4. Build the Maven project.
5. Run `Main.java`.
6. Select the required operation from the menu.

## Learning Outcomes

Through this project, I learned:

* Java Database Connectivity (JDBC)
* MySQL database connectivity
* CRUD operations
* PreparedStatement
* ResultSet
* Connection and DriverManager
* Maven dependency management
* MySQL Connector/J
* SQL exception handling
* AUTO_INCREMENT
* Connecting Java applications with databases

## Author

**Kirana S Doddamani**

## License

This project is created for learning and educational purposes.
