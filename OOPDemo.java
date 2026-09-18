public class OOPDemo {

    // final variable
    static final String PROJECT_NAME = "Student Management System";

    // Static method
    static void showProjectName() {
        System.out.println("Project : " + PROJECT_NAME);
    }

    // Inner class
    class CollegeInfo {

        void showCollegeInfo() {
            System.out.println("This is a Student Management System project.");
        }
    }

    public static void main(String[] args) {

        showProjectName();

        // Creating Student object
        Student student = new Student(
                101,
                "Riya",
                "B.Tech",
                3
        );

        // instanceof
        if (student instanceof Person) {
            System.out.println("Student is a Person object.");
        }

        student.displayDetails();

        // Inner class object
        OOPDemo demo = new OOPDemo();

        CollegeInfo info = demo.new CollegeInfo();
        info.showCollegeInfo();

        // Anonymous class
        Runnable message = new Runnable() {

            @Override
            public void run() {
                System.out.println("Anonymous class is working.");
            }
        };

        message.run();
    }
}