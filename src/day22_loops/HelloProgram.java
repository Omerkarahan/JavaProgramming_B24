package day22_loops;

import java.util.Scanner;

public class HelloProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /* ask for message

        hello -> hola

        bye -> okay bye and stops the conversation
         */
        boolean continueTalking = true;


        while (continueTalking){

            System.out.println("Enter your message");
            String msg = input.nextLine();

            if(msg.equals("hello")){
                System.out.println("hi");


            } else if(msg.equals("bye")){
                System.out.println("okay bye");
                continueTalking = false;
            }
        }

    }
}
