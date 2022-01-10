package day21_loops;

public class Numbers {

    public static void main(String[] args) {
        // go from 1 -100 and print only even numbers

        int number = 0;

        while (number++ <= 100){
            if(number % 2 == 0){
                System.out.print(" " + number);
            }
        }

        System.out.println();

        int number2 = 0;

        while (number2++ < 100) {
            if (number2 % 2 != 0) {
                System.out.print(" " + number2);
            }


        }



        }
}
