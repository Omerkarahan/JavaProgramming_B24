package practice.String;

import java.util.Scanner;

public class ReversIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
//
//        if (word.length() == 5){
//            for ( int i = word.length()- 1; i >= 0; i --)
//                System.out.print(word.charAt(i));
//        } else if ( word.length() < 5){
//            System.out.println("Too short!");
//        } else {
//            System.out.println("Too long!");
//        }

        for (int i = 0; i < 2; i++){
            System.out.print(word.substring(0,word.length() / 2));
        }

    }
}
