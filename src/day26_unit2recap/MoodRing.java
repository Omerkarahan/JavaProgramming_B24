package day26_unit2recap;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class MoodRing {

    /*
    Mood Ring [Switch]

You have a mood ring and need to know what mood you are in based on the color. The color will also provide a max budget value that is suggested for shopping

    data:

        pink:
            mood: happy
            budget: 200
        blue:
            mood: relaxed
            budget: 150
        orange:
            mood: nervous
            budget: 50
        red:
            mood: angry
            budget: 0
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the mood ring color?");

        // Manual way calling each method on the String and reassigning each time
//        String color = input.next();
//        color = color.trim();
//        color = color.toLowerCase();
        //Method chaining: call the methods right after method

        String color = input.next()
                            .trim()
                            .toLowerCase();

        String mood = "";
        double budget= 0.0;

        switch (color){
            case "pink":
                mood = "happy";
                budget = 200.0;
                break;
            case "blue":
                mood = "relaxed";
                budget = 150.0;
                break;
            case "orange":
                mood = "nervous";
                budget = 100.0;
                break;
            case "red":
                mood = "angry";
                budget = 0.0;
        }

        System.out.println("Your color was: " + color);
        System.out.println("Which means you are " + mood);
        System.out.println("Your mode means you can spend $" + budget);



    }
}
