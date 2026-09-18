# Student Management System Project

Student Management System is a simple Java-based project developed using Java, JDBC and MySQL. It is designed to manage student records through a simple menu-based system.

## Features

Add Student

View Students

Search Student

Update Student

Delete Student

Exception Handling

Object-Oriented Programming concepts

Collection Framework

 Arrays

 File Input/Output

Multithreading

 MySQL Database Connectivity using JDBC

# Technologies Used

Java

JDBC

MySQL

XAMPP

VS Code

 MySQL Connector/J


## Project Structure

text

StudentManagementSystem/

Main.java

 Student.java

 Person.java

 StudentOperations.java

 OOPDemo.java

 CollectionDemo.java

 ArrayDemo.java

 ExceptionDemo.java

 FileIODemo.java

 ThreadDemo.java

 DatabaseConnection.java

 README.md

 lib/
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

4. Run Main.java.

5. Use the menu to add, view, search, update and delete students.

### Using Command Line

Open the terminal inside the project folder.

Compile the project:

javac -cp "lib/mysql-connector-j-26.7.0.jar" *.java

Run the project:

java -cp ".;lib/mysql-connector-j-26.7.0.jar" Main

Run the project on Linux/macOS:

java -cp ".:lib/mysql-connector-j-26.7.0.jar" Main

Demo Programs

The project also contains separate simple Java programs to demonstrate important Java concepts:

OOPDemo.java - OOP concepts

CollectionDemo.java - ArrayList, Vector and Stack

ArrayDemo.java - 1-D, 2-D and Jagged Arrays

ExceptionDemo.java - Exception handling

FileIODemo.java - File reading and writing

ThreadDemo.java - Multithreading

These demo programs can be run separately from the command line.

Example:

java -cp ".;lib/mysql-connector-j-26.7.0.jar" OOPDemo

## Student Information


**Name:** Riya kumari  

**Registration No.:** 25BAI11382

**Course:** B.Tech – CSE with Specialization in AI & ML
