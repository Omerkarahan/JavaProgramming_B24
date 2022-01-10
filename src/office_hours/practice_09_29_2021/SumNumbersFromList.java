package office_hours.practice_09_29_2021;

import java.util.ArrayList;

public class SumNumbersFromList {
    /*
    String numbers to sum
Given an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList.
Ex:
Input:
“123”, “34”, “513” Output:
[ 6, 7, 9 ]
     */

    public static ArrayList<Integer> getSumOfString(ArrayList<String> list){

        ArrayList<Integer> numbers = new ArrayList<>();

        for ( String each : list){

            int sum = 0;

            for (int i = 0; i < each.length(); i++){
                sum += Integer.parseInt("" + each.charAt(i)); // or each.substring(i, i+1)
            }
            numbers.add(sum);
        }

        return numbers;
    }
    // challenge: extract the inner loop, make it a helper method
}
