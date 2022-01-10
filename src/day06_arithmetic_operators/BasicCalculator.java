package day06_arithmetic_operators;

public class BasicCalculator {

    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 4;

        //approach 1 with variables

        double addResult = num1 + num2;
        double subResult = num1-num2;
        double multiResult = num1 * num2;
        double divResult = num1 /num2;
        double remainResult = num1 %num2;
        System.out.println(num1 + " + "+num2 + "= "+ addResult); //10+4
        System.out.println(num1 + " - "+num2 + "= "+ subResult);
        System.out.println(num1 + " * "+num2 + "= "+ multiResult);
        System.out.println(num1 + " / "+num2 + "= "+ divResult);
        System.out.println(num1 + " % "+num2 + "= "+ remainResult);

        // approach 2
        System.out.println("=========================");

        System.out.println(num1 + " + "+num2 + "= "+ (num1 + num2));
        System.out.println(num1 + " - "+num2 + "= "+ (num1 - num2));
        System.out.println(num1 + " * "+num2 + "= "+ (num1 *num2));
        System.out.println(num1 + " / "+num2 + "= "+ (num1/num2));
        System.out.println(num1 + " % "+num2 + "= "+ (num1 % num2));

        // concatenation

        System.out.println("java" +5+4);
        System.out.println("java" +(5+4));
        System.out.println(1 + 2+ "java"); //3java

        char a ='A';
        char b = 'B';
        System.out.println("" +a + b); //AB
        System.out.println(a+b); //131 addition
        System.out.println(a+b+""); //131 -> addition






    }
}
