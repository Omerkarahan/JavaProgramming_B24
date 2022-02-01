package interview;

import java.util.Arrays;

public class ReversePositionOfWords {

    public static String [] reverse(String str){
       String [] words = str.split(" ");
        int j = words.length-1;
        for (int i = words.length-1; i > 0; i-- ){
            String temp = words[i];
            words[i] = words[j-i];
            words[j-i] = temp;
        }
        return words;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse("Omer Karahan john")).trim());
    }
}
