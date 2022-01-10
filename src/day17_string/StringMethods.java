package day17_string;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String name = "james";
        System.out.println(name.equals("james"));
        System.out.println(name.equals("James"));

        System.out.println(name.equalsIgnoreCase("James")); // true

        System.out.println(name.equalsIgnoreCase("JaMes")); // true

        System.out.println(name.toUpperCase()); // JAMES

        System.out.println(name);

        String lastName = "bond";
        lastName = lastName.toUpperCase();
        System.out.println(lastName); // BOND

        System.out.println(lastName.toLowerCase()); // bond

        System.out.println(lastName);

        String word = "Monday ";
        int length =  word.length();
        System.out.println(length); // 7

        String word2 = "Monday";
        int length2 =  word2.length();
        System.out.println(length2); //6



    }
}
