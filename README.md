# Student Management System

A simple Student Management System developed using Java, JDBC and MySQL.

## Features

- Add Student
- View Students
- Search Student
- Update Student
- Delete Student
- Exception Handling
- MySQL Database Connectivity using JDBC

## Technologies Used

- Java
- JDBC
- MySQL
- XAMPP
- VS Code
- MySQL Connector/J

## Project Structure

StudentManagementSystem/

 Main.java
 Student.java
 DatabaseConnection.java
 lib
 mysql-connector-j-26.7.0.jar

## Database Setup

1. Install and start XAMPP.
2. Start Apache and MySQL from XAMPP Control Panel.
3. Open phpMyAdmin.
4. Create a database named:

student_management

5. Create the students table using:

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50),
    semester INT
);

## Configuration

The project uses the following MySQL connection:

Database: student_management
Host: localhost
Port: 3306
Username: root
Password: empty

If your MySQL configuration is different, update the values in `DatabaseConnection.java`.

## How to Run

### Using VS Code

1. Open the project folder in VS Code.
2. Make sure the MySQL Connector/J `.jar` file is inside the `lib` folder.
3. Start MySQL from XAMPP.
4. Run `Main.java`.
5. Use the menu to add, view, search, update and delete students.

### Using Command Line

Open the terminal inside the project folder.

Compile the project:

javac -cp "lib/mysql-connector-j-26.7.0.jar" *.java

Run the project:

java -cp ".;lib/mysql-connector-j-26.7.0.jar" Main

## Student Information

**Name:** Riya kumari  
**Registration No.:** 25BAI11382
**Course:** B.Tech – CSE with Specialization in AI & ML
