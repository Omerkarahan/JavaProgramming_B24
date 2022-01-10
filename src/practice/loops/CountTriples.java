package practice.loops;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;
        //WRITE YOUR CODE HERE


        int wordChar = str.length();
        int tChar = 3;
        int countTriples = 0;

        for (int n = 0; n <= wordChar - tChar; n++) {
            if (str.charAt(n) == str.charAt(n+1) && str.charAt(n) == str.charAt(n+2)){
                countTriples++;
            }

        }
        System.out.println(countTriples);
    }
}