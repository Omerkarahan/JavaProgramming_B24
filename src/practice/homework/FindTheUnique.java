package practice.homework;

import java.util.Scanner;

public class FindTheUnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String  unique = "";
        int count = 0;

        for ( int i = 0; i< word.length(); i++){
            for( int j = 0; j < word.length(); j++){

                if (word.charAt(i)== word.charAt(j)){

                } count++;
            }
            System.out.println(count);


        }
    }






}
