import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class CollectionDemo {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> students = new ArrayList<>();

        students.add("Riya");
        students.add("Aman");
        students.add("Priya");

        System.out.println("ArrayList:");
        for (String name : students) {
            System.out.println(name);
        }

        // Vector
        Vector<String> courses = new Vector<>();

        courses.add("B.Tech");
        courses.add("BCA");
        courses.add("MCA");

        System.out.println("\nVector:");

        for (String course : courses) {
            System.out.println(course);
        }

        // Stack
        Stack<String> operations = new Stack<>();

        operations.push("Add Student");
        operations.push("View Student");
        operations.push("Search Student");

        System.out.println("\nStack:");
        System.out.println("Latest Operation: " + operations.peek());

        operations.pop();

        System.out.println("After pop: " + operations.peek());
    }
}