package day10_scanner;

import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String item1, item2, item3, report = "";
        double price1, price2, price3, totalPrice = 0;

        System.out.println("Enter Item1 and its price:");
        item1 = input.nextLine();
        price1 = input.nextDouble();
        totalPrice += price1;
        report += "Item1: " + item1 + " Price: " + price1 + ", ";

        //Item1: Tomatoes Price : 5.5

        input.nextLine();

        System.out.println("Enter Item2 and its price:");
        item2 = input.nextLine();
        price2 = input.nextDouble();
        totalPrice += price2;
        report += "Item2: " + item2 + " Price: " + price2 + ", ";

        input.nextLine();

        System.out.println("Enter Item3 and its price:");
        item3 = input.nextLine();
        price3 = input.nextDouble();
        totalPrice += price3;
        report += "Item3: " + item3 + " Price: " + price3;

        System.out.println(report);
        System.out.println("Total price: " + totalPrice);




    }
}
