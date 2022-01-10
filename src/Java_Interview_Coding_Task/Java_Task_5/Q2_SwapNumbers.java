package Java_Interview_Coding_Task.Java_Task_5;

public class Q2_SwapNumbers {
    /**
     * Swap two variable' values without using a third variable
     */

    public static void main(String[] args) {

        /**
         if you want to swap variable basic concept of addition and subscription come into the play. Let see how we do it. */
        /** Let's take two variables. And Let see how into addition and subscription come in to play*/

        int x = 10;
        int y = 20;

        System.out.print("x = " + x);
        System.out.print("    y = " + y);

        /** First step We are storing  X plus Y in the variable X */

        x = x + y; // x= 10+20 ==> So X now hold ==> 30
        /** Second step We are storing  X minus Y Which means 30- 20 X */

        y = x - y; // x=30-20 ==> So Y has ==>10

        /** And as the final step we store X minus in X that is 30 minus 10*/

        x = x - y; // x=30-10 ==> So X has ==>20
        System.out.print("  ......After swap without using a third variable..... ");
        System.out.print("   x = " + x);
        System.out.print("   y = " + y);


    }


}
