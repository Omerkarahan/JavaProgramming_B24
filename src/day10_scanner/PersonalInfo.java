package day10_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PersonalInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        byte age = input.nextByte();

        System.out.println("Enter your favorite number");
        long favoriteNum = input.nextLong();

        System.out.println("Are you a student : true or false");
        boolean isStudent = input.hasNextBoolean();

        System.out.println("This is your personal info:");
        System.out.println("age: " + age);
        System.out.println("Fovorite number: "  + favoriteNum);
        System.out.println("Are you a student: " + isStudent);


    }
}
