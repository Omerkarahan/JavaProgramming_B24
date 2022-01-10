package day33_multidimensional_array;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] nums = { 1, 55, 100, 200};
        System.out.println(Arrays.binarySearch(nums, 55));
        System.out.println(Arrays.binarySearch(nums, 200));
        System.out.println(Arrays.binarySearch(nums, 300));
        System.out.println(Arrays.binarySearch(nums, 0));
        System.out.println(Arrays.binarySearch(nums, 60));

        // pos where it should be + 1 and always negative

        int [] not = {49, 30, 2, 1, 60, 23};

        System.out.println(Arrays.binarySearch(not, 30)); // -5
        System.out.println(Arrays.binarySearch(not, 49)); // -5

        Arrays.sort(not);

        System.out.println(Arrays.binarySearch(not, 30));  // 3

        System.out.println();

        int [] third = { -5, -5, -5,  -3, -2, 10, 20};

        int indexOfNeg = Arrays.binarySearch(third, -5);
        System.out.println(indexOfNeg);


    }
}
