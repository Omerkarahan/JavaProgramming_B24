package day25_loops;

import java.util.Scanner;

public class CountCharacters {

    /*

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int upper = 0;
        int lower = 0;
        int number = 0;

        System.out.println("Please enter a string");
        String str = input.next();

        for(int i = 0; i < str.length(); i++){

            char eachChar = str.charAt(i);

            if(eachChar >= 'A' && eachChar <= 'Z'){
                upper++;
            } else if(eachChar >= 'a' && eachChar <= 'z'){
                lower++;

            } else if(eachChar >= '0' && eachChar <= '9'){
                number++;
            }

        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Number: " + number);

    }
}
