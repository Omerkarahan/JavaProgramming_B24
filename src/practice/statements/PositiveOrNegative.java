package practice.statements;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if(num > 0){
            System.out.println("positive");
        } if(num < 0){
            System.out.println("negative");

        } if( num == 0 ){
            System.out.println("zero");
        }
    }
}
