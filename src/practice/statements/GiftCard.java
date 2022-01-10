package practice.statements;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);


        String item = "";
        item = input.nextLine();
        int blanket = 60;
        int charger = 25;
        int hat     = 25;
        int headphones = 30;
        int laptop   = 200;
        int pants    = 50;
        int pillow = 40;
        int smartphone = 1000;
        int socks = 5;
        int usbCable = 10;

        switch (item) {
            case "Blanket":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100 - blanket) + "$");
                break;
            case "Charger":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100 - charger) + "$");
                break;
            case "Hat":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100 - hat) + "$");
                break;
            case "Headphones":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100 - headphones) + "$");
                break;
            case "Laptop":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Pants":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100 - pants) + "$");
                break;
            case "Pillow":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100 - pillow) + "$");
                break;
            case "Smartphone":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Socks":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100 - socks) + "$");
                break;
            case "USB cable":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100 - usbCable) + "$");
                break;

            default:
                System.out.println("Invalid item!");
        }

    }
}
