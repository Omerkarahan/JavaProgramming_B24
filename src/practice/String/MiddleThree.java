package practice.String;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if (word.length() >= 5 && word.length() % 2 != 0){
            System.out.print( "" + word.charAt(word.length() / 2 - 1)+ word.charAt(word.length() / 2) + word.charAt(word.length() / 2 + 1));
        } else {
            System.out.println("invalid");
        }

    }
}
