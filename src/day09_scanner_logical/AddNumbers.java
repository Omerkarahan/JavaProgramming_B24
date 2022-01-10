package day09_scanner_logical;

import java.util.Scanner;

public class AddNumbers {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three number");
        int one = keyboard.nextInt();
        int two = keyboard.nextInt();
        int three = keyboard.nextInt();
        System.out.println(one + two + three);

        String msg = one + " + " + two + " + " + three + " =";

        System.out.println(msg + (one + two + three));

    }
}
