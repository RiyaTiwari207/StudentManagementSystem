class StudentTask extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Student Task: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

class CourseTask extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Course Task: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        StudentTask studentTask = new StudentTask();
        CourseTask courseTask = new CourseTask();

        System.out.println("Starting threads...");

        studentTask.start();
        courseTask.start();
    }
}