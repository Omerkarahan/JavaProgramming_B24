package Java_Interview_Coding_Task.Java_Task_5;

public class Q3_Numbers {
    /**
     * Numbers -- Divisible by 3, 5, 15
     * Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
     * if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
     * if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
     * if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
     */

    public static void main(String[] args) {
        divisible();
    }


    public static void divisible() {

           System.out.println("Divisible By 15");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {

            }
            System.out.print(  i + " - ");
        }
        System.out.println("\nDivisible By 3");
        for (int i = 0; i <= 100; i++) {

            if (i % 3 == 0 && i%15 !=0) {

                System.out.print(i + " - ");
            }
        }
        System.out.println("\nDivisible By 5");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i%15 !=0) {

            }

            System.out.print(i + " - ");
        }


    }
}



