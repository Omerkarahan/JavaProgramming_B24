package my_utilities;

import java.util.Locale;

public class StringUtil {

    /*
    Reverse method

    it will accept the String parameter and return the reverse version of the String
     */

    public static String reverse(String original){

        String reverse = "";

        for(int i = original.length() - 1; i >= 0; i--){
            reverse += original.charAt(i);
        }

        return reverse;

    }

    /*
        Method will accept the String and return a String in proper format

        First character as uppercase and the rest as lowercase
     */

    public static String fixCaseFormat(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
    /*
    this method will count how many times is in the given String returns the counter value
     */
    public static int frequencyOfLetter(String word, char letter){

        int counter = 0;

        for (int i = 0; i < word.length(); i++){

            if(word.charAt(i) == letter){
                counter++;
            }

        }

        return counter;

    }

    public static String getDuplicateCharacters(String str){ // java

        String allDuplicate = "";

        for (int i = 0; i < str.length(); i++){

            if(!allDuplicate.contains("" + str.charAt(i))){

            int count = frequencyOfLetter(str, str.charAt(i));

            if(count > 1) {
                allDuplicate += str.charAt(i);
            }
            }
        }
        return allDuplicate;

    }

}
