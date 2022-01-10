package day10_scanner;

import java.util.Scanner;

public class PlaceOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");
        String productName = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity ");
        int quantity = input.nextInt();

        // empty nextLine();
        input.nextLine();

        System.out.println("Enter your full name");
       String fullName = input.nextLine();

        System.out.println(fullName + ", your order for " + quantity + " " + productName + " has been placed. Your total  is " + "$" + (price * quantity));

    }

}
