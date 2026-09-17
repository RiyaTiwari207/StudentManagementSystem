public class Student {

    private int studentId;
    private String name;
    private String course;
    private int semester;

    public Student(int studentId, String name, String course, int semester) {

        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.semester = semester;
    }

    public int getStudentId() {
        return studentId;
    }

    public void displayStudent() {

        System.out.println("----------------------------");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
        System.out.println("Semester   : " + semester);
    }

    public void updateStudent(String name, String course, int semester) {

        this.name = name;
        this.course = course;
        this.semester = semester;
    }
}