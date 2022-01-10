package day23_loops;

import java.util.Scanner;

public class GuessNumber {
    /*

    there is a number predefined
    1-100

    we want the user to guess

    80
    -> 50
       50 is too small

       -> 90
         90 is too big
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secretnumber = 80;
        int userGuess;
        int attempts = 0;

        do {
            System.out.println("Guess a number");
            userGuess = input.nextInt();
            attempts++;
            // this if statement checks for valid inputs of number from 1 to 100

            if(userGuess > 0 && userGuess <= 100){

                // this if statement tell the user how close the guess is to the number
                // this is repeated action

                if (userGuess == secretnumber) {
                    System.out.println("Good guess ! The number was: " + secretnumber);

                } else if (userGuess < secretnumber) {
                    System.out.println(userGuess + " is too Small");

                } else if (userGuess > secretnumber) {
                    System.out.println(userGuess + " is too big");
                }
            }else {
                System.out.println("Invalid number, needs to be between 1-100");
            }



        }while (userGuess != secretnumber); // keep running the above code ( keep running the loop until the guess number is the same as the secret number

        // different if statement that gives some feedback based on the guesses / attempts

        if(attempts <= 2){
            System.out.println("really good guess");
        }else if(attempts <= 4){
            System.out.println("still good guess");
        } else{
            System.out.println("alot of guess but you got it");
        }

    }
}
