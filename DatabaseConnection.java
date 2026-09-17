import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    static String url = "jdbc:mysql://localhost:3306/student_management";
    static String username = "root";
    static String password = "";

    public static Connection connect() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully!");
        } catch (Exception e) {
            System.out.println("Database connection failed!");
            System.out.println(e.getMessage());
        }

        return connection;
    }

    public static void main(String[] args) {
        connect();
    }
}