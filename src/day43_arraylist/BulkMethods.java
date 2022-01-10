package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);

        nums.addAll(Arrays.asList(3, 5, 1, 2, 5));

        ArrayList<Integer> other = new ArrayList(Arrays.asList(10 , 20));

//        nums.add( other.get(0) );
//        nums.add( other.get(1) );

        // 5 , 3, 5, 1, 2, 5

        nums.addAll(0, other);

        System.out.println(nums);
        System.out.println(other);

        // these 2 lines only removes the first 5
//        Integer five = 5;
//        nums.remove(five); // we can not give just 5 here, because it would think we want to remove index 5 not number 5

        nums.removeAll(Arrays.asList(5, 10)); // this line removes all the 5 s in arrayList and removes all the 10's

        System.out.println(nums);

        // what hapens if you try to remove an element that is not in your ArrayList
        System.out.println(nums.removeAll(Arrays.asList(30)));
    }
}
