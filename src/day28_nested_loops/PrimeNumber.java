package day28_nested_loops;

public class PrimeNumber {
    public static void main(String[] args) {
        // given a number, determine if the number is prime or not

        /*
        7/2
        7/3
        7/4
        7/5
        7/6

         */

        int number = 17;
        boolean isPrime = true;

        for(int i = 2; i < number; i++){

            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);

    }
}
