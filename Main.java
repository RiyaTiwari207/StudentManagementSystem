import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

        do {
            try {
                System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Search Student");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        addStudent();
                        break;

                    case 2:
                        viewStudents();
                        break;

                    case 3:
                        searchStudent();
                        break;

                    case 4:
                        updateStudent();
                        break;

                    case 5:
                        deleteStudent();
                        break;

                    case 6:
                        System.out.println("Thank you for using the system!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (Exception e) {

                System.out.println("Invalid input! Please enter numbers only.");
                sc.nextLine();
            }

        } while (choice != 6);
    }

    static void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Semester: ");
        int semester = sc.nextInt();

        Student student = new Student(id, name, course, semester);
        students.add(student);

        // Save student in MySQL database
        try {
            Connection connection = DatabaseConnection.connect();

            String query = "INSERT INTO students VALUES (?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, course);
            statement.setInt(4, semester);

            statement.executeUpdate();

            System.out.println("Student saved in database!");

            connection.close();

        } catch (Exception e) {
            System.out.println("Student could not be saved in database.");
            System.out.println(e.getMessage());
        }

        System.out.println("Student added successfully!");
    }

    static void viewStudents() {

    try {
        Connection connection = DatabaseConnection.connect();

        String query = "SELECT * FROM students";

        PreparedStatement statement = connection.prepareStatement(query);

        var result = statement.executeQuery();

        System.out.println("\n----- STUDENT DETAILS -----");

        while (result.next()) {

            System.out.println("----------------------------");
            System.out.println("Student ID : " + result.getInt("student_id"));
            System.out.println("Name       : " + result.getString("name"));
            System.out.println("Course     : " + result.getString("course"));
            System.out.println("Semester   : " + result.getInt("semester"));
        }

        connection.close();

    } catch (Exception e) {

        System.out.println("Unable to fetch students.");
        System.out.println(e.getMessage());
    }
}


   static void searchStudent() {

    System.out.print("Enter Student ID to search: ");
    int id = sc.nextInt();

    try {
        Connection connection = DatabaseConnection.connect();

        String query = "SELECT * FROM students WHERE student_id = ?";

        PreparedStatement statement = connection.prepareStatement(query);

        statement.setInt(1, id);

        var result = statement.executeQuery();

        if (result.next()) {

            System.out.println("\n----- STUDENT FOUND -----");
            System.out.println("----------------------------");
            System.out.println("Student ID : " + result.getInt("student_id"));
            System.out.println("Name       : " + result.getString("name"));
            System.out.println("Course     : " + result.getString("course"));
            System.out.println("Semester   : " + result.getInt("semester"));

        } else {

            System.out.println("Student not found.");
        }

        connection.close();

    } catch (Exception e) {

        System.out.println("Unable to search student.");
        System.out.println(e.getMessage());
    }
}

  static void updateStudent() {

    System.out.print("Enter Student ID to update: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter New Name: ");
    String name = sc.nextLine();

    System.out.print("Enter New Course: ");
    String course = sc.nextLine();

    System.out.print("Enter New Semester: ");
    int semester = sc.nextInt();

    try {
        Connection connection = DatabaseConnection.connect();

        String query = "UPDATE students SET name = ?, course = ?, semester = ? WHERE student_id = ?";

        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1, name);
        statement.setString(2, course);
        statement.setInt(3, semester);
        statement.setInt(4, id);

        int rows = statement.executeUpdate();

        if (rows > 0) {
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found.");
        }

        connection.close();

    } catch (Exception e) {
        System.out.println("Unable to update student.");
        System.out.println(e.getMessage());
    }
}
  static void deleteStudent() {

    System.out.print("Enter Student ID to delete: ");
    int id = sc.nextInt();

    try {
        Connection connection = DatabaseConnection.connect();

        String query = "DELETE FROM students WHERE student_id = ?";

        PreparedStatement statement = connection.prepareStatement(query);

        statement.setInt(1, id);

        int rows = statement.executeUpdate();

        if (rows > 0) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }

        connection.close();

    } catch (Exception e) {
        System.out.println("Unable to delete student.");
        System.out.println(e.getMessage());
    }
}
}