package day29_arrays;

import java.util.Arrays;

public class NumberArrays {
    public static void main(String[] args) {

        int []  ages = { 10 ,14, 21, 80, 50, 70, 30, 40, 10,  };

        System.out.println(ages.length);
        System.out.println(Arrays.toString(ages));


        // the below lines are the same thing
        System.out.println(ages[7]);
        System.out.println(ages[ages.length-2]);

        double [] scores = {20.5, 40.5, 40.50, 19.9, 100.0, 50 };
        System.out.println(ages.length);
        System.out.println(Arrays.toString(scores));

        System.out.println(scores[0] + scores[1]);

    }
}
