package practice.statements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents:");
        int cents = input.nextInt();

        if ( 100 > cents && cents > 0 ) {
            int quarters, dimes, nickels, pennies, remaining;
            quarters = cents / 25;
            cents %= 25;
            dimes = cents / 10;
            cents %= 10;
            nickels = cents / 5;
            cents %= 5;
            pennies = cents;

            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies");
        } else {
            System.out.println("Invalid cents amount");
        }
   }
  }