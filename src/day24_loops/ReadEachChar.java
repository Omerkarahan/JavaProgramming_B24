package day24_loops;

public class ReadEachChar {

    public static void main(String[] args) {

        String s = "java";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        System.out.println();

        for(int i = 0; i < s.length(); i++){ // i <= s.length() - 1
            System.out.println(s.charAt(i));

        }

    }
}
