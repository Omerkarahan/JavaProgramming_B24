package Java_Interview_Coding_Task.Java_Task_2;

import java.util.Scanner;

public class q7_String {
    /*
    String -- Password Validation Task 1: Write a return method that can verify if a password is valid or not.
Requirements:
 1. Password MUST be at least have 6 characters and should not contain space.
 2. Password should at least contain one upper case letter
 3. Password should at least contain one lowercase letter
 4. Password should at least contain one special characters
 5. Password should at least contain a digit if all requirements above are met, the method returns true, otherwise returns false

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = input.next();

        System.out.println(validPassword(password));
    }

    public static boolean validPassword(String str) {
        int countChar = 0;
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countNumbers = 0;
        int countSpecialChar = 0;


        for (int i = 0; i < str.length(); i++) {
            if (str.length() >= 6 && !str.contains(" ")) {
                countChar++;
            }
            if (Character.isUpperCase(str.charAt(i))) {
                countUpperCase++;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                countLowerCase++;
            }
            if (Character.isDigit(str.charAt(i))) {
                countNumbers++;
            }
            if (Character.isLetterOrDigit(str.charAt(i))) {
                countSpecialChar++;
            }


        }
        if (countChar > 0 && countUpperCase >= 1 && countLowerCase >= 1 && countSpecialChar >= 1 && countNumbers >= 1) {
            return true;
        } else {
            return false;
        }

    }
}




