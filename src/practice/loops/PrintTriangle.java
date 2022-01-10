package practice.loops;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for ( int i = 1; i <= n; i++){
            for(  int a = 1; a <= i; a++){
                System.out.print("*");


            }
            System.out.println();
        }

    }
}
