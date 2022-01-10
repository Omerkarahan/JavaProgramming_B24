package day19_string;

public class SubstringExample {

    public static void main(String[] args) {

        /*
        substring allows you to take part of The String based on the given index number when u give one number, that is tahs starting of your substring and keeps all the characters until the end
         */
        //          01234....
        String s = "javascript";

        System.out.println(s.substring(1));
        System.out.println(s.substring(2));
        System.out.println(s.substring(4));

        System.out.println(s.substring(0, 4));
        System.out.println(s.substring(4));

        System.out.println(s.substring(2, 6));



    }

}
