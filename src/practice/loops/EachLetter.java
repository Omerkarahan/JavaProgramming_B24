package practice.loops;

import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below


        for ( int n = 0; n < word.length(); n++){
            String eachWord = word.substring(n,n+1);
         word.indexOf(n);
            System.out.println(eachWord);
        }


    }
}