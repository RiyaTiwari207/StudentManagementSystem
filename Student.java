public class Student extends Person implements StudentOperations {

    private int studentId;
    private String course;
    private int semester;

    // Constructor
    public Student(int studentId, String name, String course, int semester) {

        super(name);

        this.studentId = studentId;
        this.course = course;
        this.semester = semester;
    }

    // Getter
    public int getStudentId() {
        return studentId;
    }

    // Display student details
    @Override
    public void displayDetails() {

        System.out.println("----------------------------");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
        System.out.println("Semester   : " + semester);
    }

    // This method is kept for the existing Main.java
    public void displayStudent() {
        displayDetails();
    }

    // Method Overloading - 1
    public void updateStudent(String name, String course, int semester) {

        this.name = name;
        this.course = course;
        this.semester = semester;
    }

    // Method Overloading - 2
    public void updateStudent(String name, String course) {

        this.name = name;
        this.course = course;
    }
}