package day21_loops;

public class Loops {

    public static void main(String[] args) {

//        System.out.println("Hello world");
//        System.out.println("Hello world");
//        System.out.println("Hello world");
//        System.out.println("Hello world");
//
//        while(true){
//            System.out.println("Hello world");
//        }
            int number = 1;
            while (number <= 100){
                System.out.println("Hello world" + number);
                number++;
            }

        System.out.println();

        int number2 = 1;
        while (number2 <= 100){
            System.out.println("Hello universe" + ++number2);}

        System.out.println();

        int number3 = 1;
        while (number3++ <= 100) {
            System.out.println("Hello Galaxy");
        }

        System.out.println(number3);

        // 99 <= 100 -> true -> ran the code
        // 100 <= 100 -> true > ran the code
        // 101 <= 100 -> false -> loop stops
        // 102


    }
}
