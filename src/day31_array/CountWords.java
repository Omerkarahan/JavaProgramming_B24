package day31_array;

import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {

        String s = "Java is fun";
        String [] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        String s2 = "Java is fun, super fun!";
        System.out.println(Arrays.toString(s2.split(" ")));

        String cats = "bengal cat tabby cat persian cat no cat here";

        String [] arr = cats.split(" cat ");

        System.out.println(Arrays.toString(arr));


    }
}
