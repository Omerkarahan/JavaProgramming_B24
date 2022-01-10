package Java_Interview_Coding_Task.Java_Task_8;

import java.util.Arrays;

public class Q2_SortingInDescending {
    /**
     * Arraylist
     * Write a method that can sort the ArrayList in descending order without using the sort method
     */

    public static void main(String[] args) {


        System.out.print(Arrays.toString(Descending()));
    }


    public static int[] Descending() {
        int num[] = {45, 20, 10, 5, 1};
        int temp = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {

                if (num[i] < num[j]) {

                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }

        }
        return num;
    }
}















