package day25_loops;

public class Vowels {

    public static void main(String[] args) {

        String s = "java is great";

        int count = 0;
        String vowels = "aeiou";

        for( int i = 0; i < s.length(); i++){

          if(vowels.contains(s.substring(i, i+1))){ // "" +s.charAt(i)
              count++;


          }

        }

        System.out.println(count);
    }
}
