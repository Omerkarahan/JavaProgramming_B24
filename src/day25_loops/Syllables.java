package day25_loops;

public class Syllables {

    public static void main(String[] args) {

        String s = "ja-va-script";

        /*

        s.charAt(0)
        s.charAt(1)
        s.charAt(2)
        s.charAt(3)
        s.charAt(4)
         */

        int count = 0;

        for ( int i = 0; i < s.length(); i++){
           if(s.charAt(i) == '-'){
               count++;
           }
        }

        System.out.println(count + 1);
    }
}
