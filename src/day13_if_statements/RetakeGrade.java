package day13_if_statements;

import java.util.Scanner;

public class RetakeGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What retake number is this?");
        int attempt = input.nextInt();

        System.out.println("What is your grade after attempt " + attempt);
        double grade = input.nextDouble();

        double finalGrade = 0;

        if (attempt == 1) {
            finalGrade = grade - (grade * 0.1); //80 -> 80 * .1= 80 - => 72
        } else if (attempt == 2) {
            finalGrade = grade - (grade * 0.2);
        } else if (attempt == 3) {
            finalGrade = grade - (grade * 0.35);
        }
        System.out.println("After attempt " + attempt + " your final grade is " + finalGrade + "%");
    }
}
