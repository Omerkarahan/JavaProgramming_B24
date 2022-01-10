package practice.String;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

       if ( word.indexOf("java") == 0){
           System.out.println(!exists);
       } else if (word.indexOf("java") == 1){
           System.out.println(!exists);
       } else {
           System.out.println(exists);
       }


    }
}
