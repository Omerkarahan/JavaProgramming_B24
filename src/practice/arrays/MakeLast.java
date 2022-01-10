package practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MakeLast {
    /*
    input: 4 5 6

output: [0, 0, 0, 0, 0, 6]
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int [] newNums = new int[nums.length * 2];

         newNums [newNums.length - 1] =  nums [nums.length - 1];

        System.out.println(Arrays.toString(newNums));












    }
}