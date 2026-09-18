public class ArrayDemo {

    public static void main(String[] args) {

        // 1-D Array
        int[] marks = {80, 75, 90, 85};

        System.out.println("1-D Array:");

        for (int mark : marks) {
            System.out.println(mark);
        }

        // 2-D Array
        int[][] studentMarks = {
                {80, 75, 90},
                {70, 85, 88}
        };

        System.out.println("\n2-D Array:");

        for (int i = 0; i < studentMarks.length; i++) {

            for (int j = 0; j < studentMarks[i].length; j++) {

                System.out.print(studentMarks[i][j] + " ");
            }

            System.out.println();
        }

        // Jagged Array
        int[][] jaggedArray = {
                {80, 75},
                {90, 85, 88},
                {70}
        };

        System.out.println("\nJagged Array:");

        for (int i = 0; i < jaggedArray.length; i++) {

            for (int j = 0; j < jaggedArray[i].length; j++) {

                System.out.print(jaggedArray[i][j] + " ");
            }

            System.out.println();
        }
    }
}
