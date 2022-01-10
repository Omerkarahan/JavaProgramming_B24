package day24_loops;

public class MultiplicationTable {

    /*

    number

    number x 1
    number x 2
    number x 3

     */
    public static void main(String[] args) {

        int number = 4;
//        System.out.println(number * 1);
//        System.out.println(number * 2);

        for(int i= 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));

        }
    }
}
