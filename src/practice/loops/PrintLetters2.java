package practice.loops;

import java.util.Scanner;

public class PrintLetters2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        for ( char first = start; first <= end; first++){
            System.out.print(first);

        }


    }
}
