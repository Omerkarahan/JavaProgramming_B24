package day19_string;

import java.util.Scanner;

public class FixNameChaining {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");

        String firstName = input.nextLine().trim().toLowerCase();
        System.out.println("What is your last name?");
        String lastName = input.nextLine().trim().toLowerCase();



        String fixedFirstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        String fixedLastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.println(fixedFirstName + " " + fixedLastName);



    }
}
