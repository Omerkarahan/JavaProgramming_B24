package practice.statements;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);

        int grade = s.nextInt();

        //Write your code here:

        if (grade > 90){
            System.out.println("excellent");
        }
        if (grade > 70 && grade < 90){
            System.out.println("good");
        }
        if (grade > 60 && grade < 70){
            System.out.println("pass");
        }
        if (grade< 60){
            System.out.println("fail");
        }





    }
}
