package practice.String;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

       boolean x = str.substring(n).contains(str.substring(0,n ));
        System.out.println(x);


    }
}
