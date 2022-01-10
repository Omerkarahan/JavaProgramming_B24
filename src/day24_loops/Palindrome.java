package day24_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        /*
        String from user

        reverse the String

        I can use a loop to get indexes backwards

        I use those reverse index with charAt

          -> read chars backwards
          concat to another String

          5 > 4 > 3 > etc 0

          reverse String is equal to my original String

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();
        String reverse = "";

        for(int index = word.length() - 1; index >=0; index--){
            reverse += word.charAt(index);
           // System.out.println(word.charAt(index));
        }
        System.out.println(reverse);

        if(word.equals(reverse)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
