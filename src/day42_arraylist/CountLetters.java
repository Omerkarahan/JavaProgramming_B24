package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountLetters {





    public static String countEachLetter(String str){

        // How do we convert String to ArrayList

        /*
            We start with String str = AABCDD
            String [] arr = str.split(""); -> ["A", "A", "B", "C", "D", "D"] as String array
            Array.asList() -> this method accepts the arrays and converts those arrays to an ArrayList
            Arrays.asList(arr) -> ["A", "A", "B", "C", "D", "D"] as an ArrayList
            new ArrayList() -> when we put a collection type inside of the parenthesis it makes the ArrayList with those values
         */

        ArrayList<String> list = new ArrayList<>( Arrays.asList( str.split("") ) );

        String result = "";

        for (String each : list){

            if (!result.contains(each)) {
                int count = Collections.frequency(list, each);

                result += each + count;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        // input: AAAABBCCCDDDDDDEE

        // output: A4B2C3D6E2

        System.out.println(countEachLetter("AAAABBCCCDDDDDDEE"));
    }
}
