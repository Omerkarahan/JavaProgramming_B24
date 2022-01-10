package day40_arraylist;

public class ParseVsValueOF {
    public static void main(String[] args) {

        String s = "30";
        System.out.println(s + 5);
       // System.out.println(s < 60);  don't work

        int seconds = Integer.parseInt(s); // converts the "30" String into the int value of 30

        System.out.println(seconds < 60);

        Integer num = Integer.valueOf(s); // converts the "30" String into the Integer wrapper class object that has a value of 30

        System.out.println(num < 60);

        String s2 = String.valueOf(seconds); // converts the int seconds of 30 to the String object
        System.out.println(s2);
        System.out.println(s2.charAt(0));
    }
}
