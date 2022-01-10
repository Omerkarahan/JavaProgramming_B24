package day10_scanner;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();



        boolean isDivisibleBy2 = num % 2 == 0;
        boolean isDivisibleBy3 = num %  3 ==0;
        boolean isDivisibleBy5 = num % 5 ==0;

        System.out.println(num + " is  divisible by 2:" + isDivisibleBy2);
        System.out.println(num + " is divisible by 3:" + isDivisibleBy3);
        System.out.println(num + " is divisible by 5:" + isDivisibleBy5);






    }
}
