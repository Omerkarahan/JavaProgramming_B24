package practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int [] newNum;

        if (size >= 2){
            newNum = new int[] { num[0], num[1]};
        } else {
            newNum = new int[] { num [0] };
        }
        System.out.println(Arrays.toString(newNum));

    }
}
