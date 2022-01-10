package practice.variables;

import java.util.Scanner;

public class PatientInformation {
    public static void main(String[] args) {

        String firstName, lastName, fullName, email, street, state, city, address, contact;
        int age, zipcode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber, personalPhoneNumber;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.next();
        scan.nextLine();
        System.out.println("Enter your last name");
        lastName = scan.next();
        scan.nextLine();


        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.next();
        scan.nextLine();

        System.out.println("Enter your city");
        city = scan.next();
        scan.nextLine();
        System.out.println("Enter your state");
        state = scan.next();
        scan.nextLine();
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = scan.hasNextBoolean();
        fullName = lastName + ", " + firstName;
        address = street + ", " + city + ", " + state + " " + zipcode;
        contact = "work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber;

        System.out.println("Patient personal information");

        System.out.println("Full name: " + fullName);
        System.out.println("Address: " +address);
        System.out.println("Contacts: work phone number - " +workPhoneNumber + ", personal phone number - " + personalPhoneNumber);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married?: " + isMarried);





    }
}
