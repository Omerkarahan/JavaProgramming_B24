package day11_if_statements;

public class IfExamples {

    public static void main(String[] args) {

        if(false) {
            System.out.println("Hello world");
            System.out.println(4);
            System.out.println(5);
        }
            if(false) {
                System.out.println("Hello world 2");

            }

            int score = 30;

            if(score > 60) {
                System.out.println("you passed");}

            if ( score<= 60) {
                System.out.println("you failed");}

            if(score > 60) {
                System.out.println("you passed");
            } else{
                System.out.println("you failed");
            }




    }
}
