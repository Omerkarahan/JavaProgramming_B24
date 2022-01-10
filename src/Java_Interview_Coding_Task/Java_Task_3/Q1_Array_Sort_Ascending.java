package Java_Interview_Coding_Task.Java_Task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_Array_Sort_Ascending {
    /**
     * -- Sort Ascending-- artan siralama
     * Write a return method that can sort an int array in Ascending order
     * without using the sort
     * method of the Arrays class
     * Ex:
     * int[] arr = {10, 9, 8, 7};
     * arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */
// if we want to sort number w/o sort method in array we can use nested for loop method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //  I prefer the Scanner method for made more dynamic this example.

        System.out.println("How many element do you want?");
        int size = input.nextInt(); //size of the array

        int[] arr = new int[size]; // this formula for declaring the array name. In this formula for use connected with 'size' too.
        int[] arrSort = new int[size]; // it will work for print at last.

        int temp = 0; // I will use temporary variable in swapping.

        System.out.println("Enter "+size + " Elements");// I concatenate inside at println
        for (int i = 0; i < size; i++) {// loop for to get array elements
        arr[i] = input.nextInt();//get the array elements and store to array
            arrSort[i] = arr[i]; // assigned to arrSort for printing purpose
        }
        for (int i = 0; i < size; i++) { // it is work to take one element

            for (int j = i + 1; j < size; j++) { // compare the element that have been taken in size[i]

                if (arr[i] > arr[j]) { // grether than
                    // this is for to swap if element compared is greater than other element
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Input : " + Arrays.toString(arrSort));
        System.out.println("Output: " + Arrays.toString(arr));
    }
}