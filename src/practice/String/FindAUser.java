package practice.String;

import java.util.Scanner;

public class FindAUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Enter full name:");
        String fullName = scan.nextLine();

        if (fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase("Alan Wake")){
            System.out.println("User Found!");
        } else {
            System.out.println("User not Found!");
        }


    }
}
