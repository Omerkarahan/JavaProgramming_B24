package day31_array;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertName {

    public static void main(String[] args) {

        /*

        Ask the user to enter their first name
        Display each character as an array
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = input.next();

        // you could also store to a variable:
        char [] firstName = name.toCharArray();

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(firstName[0]);
        System.out.println(firstName[firstName.length - 1]);
        System.out.println(firstName[0] + " " + firstName[1]);

    }
}
