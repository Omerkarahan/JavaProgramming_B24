package practice.statements;

import java.util.Scanner;

public class VideoGamesCoupons {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = input.nextInt();
        if(coupons >= 3) {
        int candies = coupons / 10;
        int gumballs = (coupons % 10) / 3;
        System.out.println("Number of Candies: " + candies);
        System.out.println("Number of gumballs: " + gumballs);

        } else{
            System.out.println("Not enough coupons");
        }


    }
}
