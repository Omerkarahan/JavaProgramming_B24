package practice.loops;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below


        for ( int n = 0; n < word.length(); n ++){
           char current = word.charAt(n);
           if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u'){
               System.out.print(current);
           }
        }

    }
}
