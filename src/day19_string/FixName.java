package day19_string;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class FixName {
    /*
    Ask the user to enter tehir first name
    ask the user to enter their last name
    make sure the name is properly formattinf
        each first letter of both names is capital and rest are lower case


     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");

        String firstName = input.next();
        System.out.println("What is your last name?");
        String lastName = input.next();

        String firstNameFirstLetter = firstName.substring(0,1);
        String lastNameFirstLetter = lastName.substring(0,1);

        firstNameFirstLetter = firstNameFirstLetter.toUpperCase();
        lastNameFirstLetter = lastNameFirstLetter.toUpperCase();

        String remainingFirstName = firstName.substring(1);
        String remainingLastName = lastName.substring(1);

        remainingFirstName = remainingFirstName.toLowerCase();
        remainingLastName = remainingLastName.toLowerCase();
        System.out.println(firstNameFirstLetter + remainingFirstName + " " + lastNameFirstLetter+ remainingLastName);




    }
}
