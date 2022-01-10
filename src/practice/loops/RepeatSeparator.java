package practice.loops;

import java.util.Scanner;

public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String newWord = word;
        for ( int i = 1; i < count; i++){

            newWord += separator + word;
        }
        System.out.print(newWord);
    }
}
