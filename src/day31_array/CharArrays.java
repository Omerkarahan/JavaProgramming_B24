package day31_array;

import java.util.Arrays;

public class CharArrays {
    public static void main(String[] args) {

        char[] letters ={ 'j', 'a', 'v', 'a'};

        // how to covert a String to a char array

        String s = "java is fun";


        char [] java = s.toCharArray();

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));


    }
}
