package day19_string;

import com.sun.xml.internal.ws.message.jaxb.JAXBMessage;

import java.util.Locale;
import java.util.Scanner;

public class Initials {

    /*
    Ask the user to enter their first name
    ask the user to enter their last name
    Then print the initials
    James Bond ->  JB

         Bonus: give the initials as Uppercase


     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");

        String firstName = input.next();


        System.out.println("Enter your last name");
        String lastName = input.next();



        String initials = "" + firstName.charAt(0) + lastName.charAt(0);
        System.out.println(initials.toUpperCase());

    }




}
