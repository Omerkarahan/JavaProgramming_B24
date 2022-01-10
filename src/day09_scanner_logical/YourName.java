package day09_scanner_logical;

import java.util.Scanner;

public class YourName {
    public static void main(String[] args) {

        /*
        ask the user their first name
        ask the user their last name
        print the full name
        use next() -> reads only a single word
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name:");
        String lastName = input.next();

        System.out.println("Your full name is: " + firstName + " " + lastName);
    }
}
