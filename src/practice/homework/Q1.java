package practice.homework;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        /*
        ex: AAABBCDD
         */

        Scanner input = new Scanner(System.in);
        String word = input.next();

        int count = 0;

        for ( int i = 0; i < word.length(); i++ ){
            for ( int j = 0; j < word.length(); j++){


            if ( word.charAt(j) == word.charAt(i)) {
                count++;

            }
            }

            System.out.println(count);



       }









        }
    }

