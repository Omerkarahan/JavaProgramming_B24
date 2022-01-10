package day35_methods;

import java.util.Scanner;

public class CountingNumbers {

    /*
        Ver 1: Define a method that will count numbers from 0 to 5
        print the numbers in one line

        Ver 2: Define another method that will count numbers from 0 to a given number (parameter)
     */

    public static void main(String[] args) {
        countNumbersFrom0To5();
        countNumbersFrom0ToN(10); // int n = 10
        countNumbersFrom0ToN(8);  // int n = 8
        countNumbersFrom0ToN(4);  // int n = 4

    }

    public static void countNumbersFrom0To5() {

        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
        public static void countNumbersFrom0ToN(int n){

            for (int i = 0; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }


