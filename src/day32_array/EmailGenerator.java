package day32_array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EmailGenerator {
    /*

    ask the user to enter last name
           -> all lowercase
    ask the user to enter  first name
            -> first letter uppercase, the reset lowercase
                -> first three letter of the first name

    ask the user to enter their favorite number
             -> the number 8 last name length

    last name + . + first name + number + .gmail.com

    store the emails into an array
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("How many emails do you want to generate?");
        int size = input.nextInt();

        String [] emails = new String[size];

        for(int i = 0; i < emails.length; i++){

            System.out.println("Please enter your last name");
            String lastName = input.next().toLowerCase();

            System.out.println("Please enter your first name");
            String firstName = input.next().toLowerCase();
            firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1, 3);

            System.out.println("Please enter your favorite number");
            int favNum = input.nextInt() * lastName.length();

            emails[i] = lastName + "." + firstName + favNum + "@gmail.com";
        }
        System.out.println(Arrays.toString(emails));

    }
}
