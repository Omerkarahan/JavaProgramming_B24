package day33_multidimensional_array;

import java.util.Arrays;

public class RecapArraysClass {
    public static void main(String[] args) {

        int[] arr = {4, 1, -4, 60, -100, 30};
        int[] arr2 = {30, 60, -4, 1, -100, 4};

        System.out.println(Arrays.equals(arr, arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr, arr2)); // arr.equals(arr2)

    }
}
