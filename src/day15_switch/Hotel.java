package day15_switch;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Java hotel");
        System.out.println("How many people in your party");

        int numberOfPeople = input.nextInt();
        System.out.println("How many days will you stay");
        int numberOfDays = input.nextInt();

        double price = 0;
        String roomType = " ";
        boolean validPartySize = true;
        String peopleMsg = " people ";


        switch (numberOfPeople){

            case 1:
                roomType = "Single room";
                price = numberOfDays * 100;
                peopleMsg = " person ";
                break;
            case 2:
                roomType = "Double room";
                price = numberOfDays * 125;
                break;
            case 3:
            case 4:
                roomType = "Large room";
                price = numberOfDays * numberOfPeople * 150;
                break;
                // When the value is 3 or 4 it runs the same code above
            case 5:
            case 6:
                roomType = "Suite";
                price = 5000;
                break;
            // When the value is 5 or 6 it runs the same code above
            default:
                System.out.println("Party size is too big");
                validPartySize = false;



        }
        if(validPartySize){


        System.out.println("Okay great , for " + numberOfPeople + peopleMsg + " staying for " + numberOfDays + "days " +  "your total price is: " + price + "for a" + roomType) ;}


    }
}
