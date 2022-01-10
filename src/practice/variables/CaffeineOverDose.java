package practice.variables;

import java.util.Scanner;

public class CaffeineOverDose {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

        int numOfMilligrams, howManyDrinks ;

        System.out.println("Enter number of milligrams in drink:");

        numOfMilligrams = scan.nextInt();

         howManyDrinks = (10*1000 / numOfMilligrams ) ;

        System.out.println("It would take about " + howManyDrinks + " drinks for a lethal overdose.") ;






    }
}
