package practice.statements;

import java.util.Scanner;

public class RealEstateCalculator {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots ;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your property type:");
        houseType = scan.nextLine();

        if(houseType.equals("Condo")){
            propertyPrice += 50000;
        } else if(houseType.equals("Townhouse")){
            propertyPrice += 75000;
        } else if(houseType.equals("Single Family Home")){
            propertyPrice += 95000;
        }

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice += numberOfBedrooms * 3000;


        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();

        if (backyard == true && houseType.equals("Townhouse")  || houseType.equals("Single Family Home")){
            propertyPrice += 5000;
        } else if (backyard == true && houseType.equals("Condo")){
            System.out.println("Backyard is not available for condo!");
        }
        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        if( garage == true ){
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if ( garageSpots >= 1 && garageSpots <= 10){
                propertyPrice += 20000 * garageSpots;
            } else {
                System.out.println("Pardon, it's not public parking!");
            }

        }
        System.out.println("How close is metro station");
        metroAccessibility = scan.nextFloat();
        if(metroAccessibility > 0.0 && metroAccessibility <= 1.0){
            propertyPrice += 10000;
        } else if(metroAccessibility > 1.0 && metroAccessibility <= 3.0){
            propertyPrice += 5000;
        }
        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();

        if(highwayAccessibility > 0.0 && highwayAccessibility <= 1.0){
            propertyPrice += 15000;

        } else if( highwayAccessibility > 1.0 && highwayAccessibility <= 5.0){
            propertyPrice += 8000;
        } else if ( highwayAccessibility > 5.0 && highwayAccessibility <= 20.0){
            propertyPrice += 4000;
        }
        System.out.println("What is the rating of nearest school?");
        schoolScore = scan.nextFloat();
         if(schoolScore >= 8.0 && schoolScore <= 10.0){
             propertyPrice += 45000;
         } else if(schoolScore >= 4.0 && schoolScore < 8.0){
             propertyPrice += 20000;
         } else {
             propertyPrice += 5000;
         }
        System.out.println("Does any of your family members smoke?");
         smoking = scan.nextBoolean();
         if( smoking == true){
             propertyPrice -= 5000;

         }
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice);










    }
}
