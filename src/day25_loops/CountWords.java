package day25_loops;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = input.nextLine().trim();

        /*
        String str = input.nextLine();
        str = str.trim();

         */

        int numberOfSpaces = 0;

        for(int i = 0; i < str.length(); i++){ //i <= str.length() - 1;

            if(str.charAt(i) == ' '){
                numberOfSpaces++;

            }

        }

        System.out.println("Number of words: " + (numberOfSpaces + 1));


        // this is without loop:
        int originalLength = str.length();
        int newLength = str.replace(" ", "").length();
        System.out.println("Number of words: " + (originalLength - newLength + 1));

    }
}
