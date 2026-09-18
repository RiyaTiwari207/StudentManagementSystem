public class ExceptionDemo {

    // throws keyword
    static void checkStudentId(int id) throws Exception {

        if (id <= 0) {
            throw new Exception("Student ID must be greater than zero.");
        }

        System.out.println("Valid Student ID: " + id);
    }

    public static void main(String[] args) {

        try {

            checkStudentId(101);

            int number = 10 / 2;
            System.out.println("Result: " + number);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}