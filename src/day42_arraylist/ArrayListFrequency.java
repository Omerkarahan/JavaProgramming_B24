package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListFrequency {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 2, 5, 4, 5, 1, 5));

        // find out how many 5 elements are in your ArrayList

        System.out.println(Collections.frequency(nums, 5));


    }
}
