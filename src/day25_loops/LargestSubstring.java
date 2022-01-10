package day25_loops;

public class LargestSubstring {

    /*
    Given a string find the biggest substring of chars that match and print it.
   Ex: aaabbbcccccddddee
  output: cccc
     */
    public static void main(String[] args) {

        String str = "aaabbbcccccddddee";
        String other = ""; //
        String longSub = ""; // aaa
        for(int i = 0; i < str.length() - 1; i++) {

            other += str.charAt(i);

            if(str.charAt(i) != str.charAt(i + 1)){ // action is done here, when the char is not asme sa the char next to it

                if(other.length() > longSub.length()){
                    longSub = other;
                }

                other = "";
            }
        }
         //System.out.println(other);
        System.out.println(longSub);
    }
}
