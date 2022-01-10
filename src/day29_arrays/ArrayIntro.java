package day29_arrays;

import java.util.Arrays;
import java.util.Locale;

public class ArrayIntro {
    public static void main(String[] args) {

        String city1 = "San Fransisco";
        String city2 = "Moscow";
        String city3 = "Madison";
        String city4 = "Tokyo";
        String city5 = "Baghdad";

        // this is the array to hold multiple data

        // defining a String array with city information

        String [] cities = { "San Fransisco", "Moscow", "Madison", "Tokyo", "Baghdad",  };
        //                       0               1         2          3          4
        // how do read each individual city / element

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        // How do we know the number of cities / number of elements

        System.out.println(cities.length);

        //how can be print the whole array at one time

        System.out.println(cities); // this does not give us the values

        System.out.println(Arrays.toString(cities));  // this doesn't give us the values

    }
}
