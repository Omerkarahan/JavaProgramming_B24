package day29_arrays;


public class LoopArray {
    public static void main(String[] args) {

        int [] nums = { 1, 2, 3};

        // manual way to print all the elements
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        System.out.println();
        // loop through and print all the elements

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }




    }
}