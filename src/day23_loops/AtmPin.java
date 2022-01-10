package day23_loops;

import java.util.Scanner;

public class AtmPin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int validPin = 1234;
        int userPin;
        int attempts = 0;

        do{
            System.out.println("Enter your pin");
            userPin = input.nextInt();
            attempts++;


        }while (attempts < 3 && userPin != validPin);

        if(userPin == validPin) {

            System.out.println("Welcome, you are logged in");
        } else {
            System.out.println("Locked out, too many attempts");
        }
    }
}
