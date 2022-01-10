package Java_Interview_Coding_Task.Java_Task_6;

import java.util.ArrayList;

public class Q2_PrimeNums {
    /**
     * -- Prime Number
     * Write a method that can check if a number is prime or not
     */

    public static void main(String[] args) {
        isPrimeNumber();
    }

    public static void isPrimeNumber() {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= 50; i++) {

            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        System.out.println("primeNumbers = " + primeNumbers);

    }
}


