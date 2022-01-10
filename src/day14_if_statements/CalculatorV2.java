package day14_if_statements;

import java.util.Scanner;

public class CalculatorV2 {

    public static void main(String[] args) {

        /*
        ask the user to enter 2 numbers

        operator - String
        @

        / -> 2nd num = 0

         */

        Scanner inpit = new Scanner(System.in);
        System.out.println("Enter number one");
        double numberOne = inpit.nextDouble();

        System.out.println("Enter the operator\n\t+ - * / %");
        String operator = inpit.next();

        System.out.println("Enter number two");
        double numberTwo = inpit.nextDouble();



        boolean isValidOperator = operator.equals("+")  || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%");

        double result = 0;

        if(isValidOperator){

            if(operator.equals("+")){
                result = numberOne + numberTwo;
            } else if(operator.equals("-")){
                result = numberOne - numberTwo;
            } else if(operator.equals("*")){
                result= numberOne * numberTwo;
            } else if(operator.equals("/")  && numberTwo != 0){
                result = numberOne / numberTwo;
            } else if(operator.equals("%")){
                result = numberOne % numberTwo;
            }
        } else {
            System.out.println(operator + "is not a valid number");
        }

        if(isValidOperator){
            System.out.println(numberOne + " " + operator + " " + numberTwo + " =" + result);
        }



    }
}
