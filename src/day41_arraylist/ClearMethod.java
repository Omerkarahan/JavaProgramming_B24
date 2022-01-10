package day41_arraylist;

import java.util.ArrayList;

public class ClearMethod {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);
        System.out.println(nums);

        nums.clear();  // makes an empty arraylist

        System.out.println(nums);

        System.out.println(nums.isEmpty());
    }
}
