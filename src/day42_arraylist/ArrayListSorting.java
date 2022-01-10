package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args) {


        // How did you sort arrays?
        // we used Arrays.sort()

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 50, 20, 50, 502, 150, -40, -10));

        Collections.sort(nums);

        System.out.println(nums);



    }
}
