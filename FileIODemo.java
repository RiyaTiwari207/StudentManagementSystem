import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo {

    public static void main(String[] args) {

        String fileName = "student_records.txt";

        // Writing data into file
        try {

            FileWriter writer = new FileWriter(fileName);

            writer.write("Student Management System\n");
            writer.write("Student ID: 101\n");
            writer.write("Name: Riya\n");
            writer.write("Course: B.Tech\n");
            writer.write("Semester: 3\n");

            writer.close();

            System.out.println("Student data written to file.");

        } catch (IOException e) {

            System.out.println("Error while writing file.");
        }

        // Reading data from file
        try {

            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("\nData from file:");

            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error while reading file.");
        }
    }
}