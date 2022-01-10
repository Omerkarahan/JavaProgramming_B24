package practice.loops;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------

        String name ="";
        String respond= "";
        String list = "";

      do {
          System.out.println("Please enter guest name:");
          name = input.next();
          System.out.println("Do you want to enter new guest name:");
          respond = input.next();
          list += name;
           if (respond.equalsIgnoreCase("yes")){
                list += ", ";
           }


      } while ( respond.equalsIgnoreCase("yes"));


        System.out.println("Guest's list: " + list );

    }
}
