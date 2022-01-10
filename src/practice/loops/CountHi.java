package practice.loops;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        int wordChar = str.length();
        int tChar = 2;
        int countHi = 0;

        for ( int n = 0; n <= wordChar - tChar; n++){
            if ( str.substring(n,n + tChar).equals("hi")){
                countHi++;
            }

        }
        System.out.println(countHi);
    }
}
