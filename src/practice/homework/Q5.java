package practice.homework;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();
        String reverseWord="";

        for ( int i = word.length() - 1; i >=0; i--){
            reverseWord += word.charAt(i);
        }
        System.out.println(reverseWord);
    }
}
