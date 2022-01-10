package day13_if_statements;

import java.util.Scanner;

public class OxygenLevel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //int oxygenLevel = 80;
        System.out.println("What is the oxygen level");
        int oxygenLevel = input.nextInt();
        String message = "";

        if(oxygenLevel >= 90){
            message = "Your tank is full";
        } else if (oxygenLevel >= 80) {

            message = "Still okay";
        }else if ( oxygenLevel >= 70){
            message = "Don't go to far";
        } else if (oxygenLevel >= 60) {

            message ="Start to head back";
        }else if(oxygenLevel >=50){
            message = "be careful now you are at 50%";
        }else {
           message = "Below 50%";
        }

        // needs ranges of values to work
//        if(oxygenLevel >= 50 && oxygenLevel < 60){
//            message = "Be careful now you are at 50%";
//        }else if(oxygenLevel >= 60){
//            message = "Start to head back";
//        }
        System.out.println(message);
    }
}
