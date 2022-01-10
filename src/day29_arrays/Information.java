package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Information {
    /*
    student array String

    id -> 0
    first name -> 1
    last name -> 2
    batch number -> 3

    make an array both ways
    2 arrays
            -> information right away
            -> declaring the size and then assigning
     */
    public static void main(String[] args) {

        String [] studentOne = { "001", "James", "Bond", "7"};

        String [] studentTwo = new String[4];

        studentTwo[0] = "002";
        studentTwo[1] = "Mr";
        studentTwo[2] = "Smith";
        studentTwo[3] = "24";

        System.out.println(Arrays.toString(studentOne));
        System.out.println(Arrays.toString(studentTwo));

        Scanner input = new Scanner(System.in);

        String [] studentThree = new String[4];
        System.out.println("Enter your id");
        studentThree[0] = input.next();
        System.out.println("Enter your first name");
        studentThree[1] = input.next();
        System.out.println("Enter your last name");
        studentThree[2] = input.next();
        System.out.println("Enter your batch number");
        studentThree[3] = input.next();

        System.out.println(Arrays.toString(studentThree));

    }

}
