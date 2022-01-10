package day15_switch;

import java.util.Scanner;

public class AgeGroup {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Age?");

        int age = input.nextInt();

        if (age >= 0 && age <= 120) {

            // valid age

            if (age <= 1) {
                System.out.println("infant");
            } else if (age <= 5) {  // else if(age>= 2 && <= 5)
                System.out.println("Toddler");
            } else if (age <= 9) {  // else if(age>= 6 && <= 9)
                System.out.println("Kid");

            } else if (age <= 12) {  // else if(age>= 10 && <= 12)
                System.out.println("Pre Teen");


            } else if (age <= 17) {  // else if(age>= 13 && <= 17)
                System.out.println("Teenager");
            } else if (age <= 20) {   // else if(age>= 18 && <= 20)
                System.out.println("Young Adult");
            } else if (age <= 35) {  // else if(age>= 21 && <= 35)
                System.out.println("Adult");
            } else if (age <= 55) {  // else if(age>= 36 && <= 55)
                System.out.println("Middle Aged Adult");
            } else {  // else if(age>= 56 && <= 120) or else if( age >= 56)
                System.out.println("Senior Citizen");
            }


        } else {
            System.out.println("Invalid age");

        }

    }
}