package day07_unary_operators;

public class DecrementExamples {

    public static void main(String[] args) {

        int n = 20;
        int t = n;
        System.out.println("t: " + t);

        int j = --n;
                 // n =19
                  // int j = n -> 19
        System.out.println("j: " + j);
        System.out.println("n: " + n);

        System.out.println("n: " + --n);

        int u = n--;
        System.out.println("u: " +u);
        System.out.println("n: " + n);

        // int u = 18 first
        // n 17


    }
}
