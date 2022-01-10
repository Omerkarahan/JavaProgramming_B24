package Java_Interview_Coding_Task.Java_Task_2;

import java.util.Arrays;

public class q6_String {
    /**
     * String -- Sort Letters and Numbers from alphanumeric String: Given alphanumeric String, we need
     * to split the string into substrings of consecutive letters or numbers, sort the individual string
     * and append them back together
     * Ex:
     * Input: "DC501GCCCA098911"
     * OutPut: "CD015ACCCG011899"
     */
    public static void main(String[] args) {
        String word = "DC501GCCCA098911";
        String temp = "";

        for (int i = 0; i < word.length(); i++) {
            temp += "" + word.charAt(i);

            if (Character.isAlphabetic(word.charAt(i)) && i < word.length() - 1) {
                if (Character.isDigit(word.charAt(i + 1))) {
                    temp += ",";
                }
            }
            if (Character.isDigit(word.charAt(i)) && i < word.length() - 1) {
                if (Character.isAlphabetic(word.charAt(i + 1))) {
                    temp += ",";

                }
            }
        }
        String output = "";
        String[] strs = temp.split(",");
        System.out.println(Arrays.toString(strs));

        for (String each : strs) {
            output += sort(each);

        }
        System.out.println(output);
    }

    public static String sort(String str) {
        char[] characters = str.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }
}
