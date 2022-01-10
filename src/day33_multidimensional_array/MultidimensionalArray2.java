package day33_multidimensional_array;

import java.util.Arrays;

public class MultidimensionalArray2 {
    public static void main(String[] args) {

        int [][] arr = {

                {10, 20, 30, 40}, // index 0
                {100, 200, 300, 400}, // index 1
                {1000, 2000} // index 2
        };

        System.out.println(arr.length); // this is the length for the whole 2d array

        System.out.println(arr[0].length); // this is the length of the first single array
        System.out.println(Arrays.toString(arr[0]));

        System.out.println(arr[2].length); // this is the length of the last single array
        System.out.println(Arrays.toString(arr[2]));

        System.out.println("First array: " + arr[0][0]); // read the first number from the first single array
        System.out.println("Second array: " + arr[1][0]); // read the first number from the second single array
        System.out.println("Third array: " + arr[2][0]);  // read the first number from the third single array
    }
}
