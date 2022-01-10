package Java_Interview_Coding_Task.Java_Task_2;

public class q10_Array {
    /*
    Array -- Find Minimum: Write a method that can find the maximum number from an int Array.
     */
    public static void main(String[] args) {
        int[] nums = {6, 10, 25, 3, 8, 9, -1,200};
        int min = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("min = " + min);
    }
}
/*
In this example, We will print the number that is smaller than the numbers in the int Arrays.
I used the loop method to find the Min number. The for loop compares a number starting from the
first number in the arrays and assigns the Small number to Min.  Checks one by one until the last number.
I print this formula, it prints the smallest (Min) number in the Array.
 */