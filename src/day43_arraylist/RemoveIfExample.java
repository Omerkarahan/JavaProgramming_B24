package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 2, 5, 2, 5, 6, 2, 6, 2, 3, 5));

        nums.removeIf(n -> n % 2 == 1 );
        System.out.println(nums);
    }
}
