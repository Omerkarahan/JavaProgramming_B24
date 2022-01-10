package Java_Interview_Coding_Task.Java_Task_4;

import java.util.Arrays;

public class Q1_Array {
    /**
     * 1. Array -- Concat two arrays:
     * Write a return method that can concate two arrays.
     */

    public static void main(String[] args) {




      System.out.println(Arrays.toString(mergeTwoArray()));
    }


    // I am going to use public Static Method name is mergeTwoArray
    public static int[] mergeTwoArray() {

        // I need to declare two array
        int[] arr1 = {1, 5, 4, 8};
        int[] arr2 = {9, 8, 2, 5};

        // I created  a new int array which length will be the sum of the arr1 and arr2 lengths
        int[] merged = new int[arr1.length + arr2.length];

        int index = 0;// I declared and initialized an integer variable for the index of the merged array.

        // Now I am going to use, ForLoop through the merged array
        for (int i = 0; i < merged.length; i++) {

            //if the index of the merged array is less than the length of the first array then
                    if( i<arr1.length){
                        merged[i]= arr1[i]; // Assign the value from the first array to the merged array

                    }else{ // otherwise:  if the index of the merged array is greater than the length of the first array
                        merged[i]=arr2[index]; // Assign the value  from the second array to merged array
                        index++; //Increment the index variable, which is the index of the merged array.
                    }
        }
        return merged; // return the merged array
    }
}
