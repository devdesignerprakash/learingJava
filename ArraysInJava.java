import java.util.Arrays;

public class ArraysInJava {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] myNumbers = new int[5]; // defining an array with its length
        System.out.println("Default values in myNumbers array:" + Arrays.toString(myNumbers));

        // Accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Modifying an array element
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);

        // Length of the array
        System.out.println("Length of the array: " + numbers.length);

        // Iterating through the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        multiDimensionalArray();
    }

    // multidimensional array
    public static void multiDimensionalArray() {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Multidimensional Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
