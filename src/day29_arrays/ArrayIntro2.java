package day29_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] prices = new double[5];
        System.out.println(Arrays.toString(prices));

        prices[0] = 25.99;
        System.out.println(Arrays.toString(prices));

            prices[1] = 30.5;
            prices[2] = 50.2;
            prices[3] = 90.5;
            prices[4] = 100.5;
        System.out.println(Arrays.toString(prices));

        //reassigning index 2 of the array to 2000.5
        prices[2] = 2000.5;
        System.out.println(Arrays.toString(prices));

        // this creates a new array with size 2 and the prices reference point that new one
        prices = new double[2];
        System.out.println(Arrays.toString(prices));

        String s = "java";
        s = "saturday";




    }
}
