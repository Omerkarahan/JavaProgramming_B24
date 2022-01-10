package day10_scanner;

import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your salary:");
        double salary = input.nextDouble();

        System.out.println("How many hours do you work a week");
        double weeklyHour = input.nextDouble();

        double hourlyRate = salary / (weeklyHour * 52);

        System.out.println("with a salary of " + salary + " Your hourly rate for " + weeklyHour + " hours a week is " + hourlyRate);










        }


    }

