package day41_arraylist;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);

        System.out.println(nums.contains(100));

        System.out.println(nums.contains(600));

        nums.remove(0);

        System.out.println(nums.contains(100));

    }
}
