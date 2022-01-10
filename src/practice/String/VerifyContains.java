package practice.String;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE

        boolean  x = sentence.contains(word);
        System.out.println(x);



    }
}
