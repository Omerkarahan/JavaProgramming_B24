package practice.loops;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int wordChar = word.length();
        int tChar = 4;
        int countJava = 0;

        for ( int n = 0; n <= wordChar - tChar; n++){
            if ( word.substring(n,n + tChar).equals("java")){
                countJava++;
            }

        }
        System.out.println(countJava);
    }
}
