package Java_Interview_Coding_Task.Java_Task_4;

public class Q3_DivideWOOperator {
    /**
     *
     *v/Numbers -- Divide without / operator:
     * Write a method that can divide two numbers without using division operator.     */

    public static void main(String[] args) {
        System.out.println(divide(25,5));
    }

public static int divide (int num1, int num2){
        int counter =0;
        while (num1>=num2){
            num1-=num2;
            counter++;
        }
return counter;
}




}


