package office_hours.practice_08_18_2021;

import java.util.Scanner;

public class PersonalInformation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, how many people do you live with?");
        int liveWithNumber = input.nextInt();

        if(liveWithNumber <= 2 && liveWithNumber >= 0) {
            System.out.println("Live with less than 2 people");
        } else if(liveWithNumber >= 3 && liveWithNumber <= 6){
            System.out.println("Live with 3 - 6 people");
        } else if(liveWithNumber > 6){
            System.out.println("Live with more than 6 people");
        } else {
            System.out.println("Invalid number of people");
        }
        input.nextLine(); // catches the enter input

        System.out.println("Which city do you live in?");
        String cityName = input.nextLine();

        System.out.println("Do you live downtown?");
        String liveDowntown = input.next();

        if(liveDowntown.equalsIgnoreCase("yes")){
            System.out.println("Have you thought about moving to the suburbs?");
            String moveToSuburb = input.next();

            if(moveToSuburb.equalsIgnoreCase("yes")){
                System.out.println("do it, it's great");
            } else if(moveToSuburb.equalsIgnoreCase("no")){
                System.out.println("You should think about it");
            }

            System.out.println(moveToSuburb.equalsIgnoreCase("yes") ? "Do it, it's great" : "you should think about it");

        }
           input.nextLine();
        System.out.println("What is your favorite animal");
        String animal = input.nextLine();

        System.out.println("Wow " + animal + " is a cool animal");

        System.out.println("How many pets do you want?");
        int numberOfPets = input.nextInt();

        System.out.println("Interesting, do you want " + numberOfPets + " " +animal);



    }

}
