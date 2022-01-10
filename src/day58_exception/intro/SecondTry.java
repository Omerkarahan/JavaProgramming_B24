package day58_exception.intro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        try{
            System.out.println("Enter a number");
            int num = input.nextInt();

            System.out.println("Enter another number");
            int num2 = input.nextInt();

            System.out.println(num/num2);

        } catch (InputMismatchException e){
            System.out.println("We wanted a number");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }
}
