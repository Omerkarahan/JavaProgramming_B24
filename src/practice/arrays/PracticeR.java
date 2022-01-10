package practice.arrays;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeR {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO Type your code below:

        for (int i = 1; i <= nums.length; i++) {
            if (nums[i]!= 5){
                System.out.println(false);
            }
            else if ( nums[i-1] ==5){
                if (nums[i] == 5){
                    System.out.println(true);
                }

            }
        }

    }
}

















