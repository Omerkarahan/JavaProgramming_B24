package Java_Interview_Coding_Task.Java_Task_1;

import java.util.Arrays;

public class q2_sameLetter {
    /**
    (STRING)Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true 
same("abc",  "abb"); -> false:

     */
    public static boolean SameLetters(String word1, String word2){
        boolean result=false;
        String[] arr1=word1.split("");
        String[] arr2=word2.split("");

        System.out.println("Arr1 :"+Arrays.toString(arr1));
        Arrays.sort(arr1);

        System.out.println("Arr2 :"+Arrays.toString(arr2));
        Arrays.sort(arr2);


        if (Arrays.equals(arr1,arr2)) {
            result=true;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(SameLetters("abc","bac"));
    }
}
