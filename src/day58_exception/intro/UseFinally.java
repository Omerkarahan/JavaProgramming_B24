package day58_exception.intro;

import java.util.Scanner;

public class UseFinally {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String name = "";
        try {
           name = input.next();

           System.out.println("Pick a character index");
           System.out.println(name.charAt(input.nextInt()));
       } catch (StringIndexOutOfBoundsException e){
           System.out.println("That was an invalid character, try again");
            System.out.println(name.charAt(input.nextInt()));
       }
        finally {
            System.out.println("CLOSING STORE");
            input.close();
        }


    }
}
