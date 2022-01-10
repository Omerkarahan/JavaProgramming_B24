package day19_string;

public class EachCharacter {

    public static void main(String[] args) {

        String java = "java";
        //             01234
        //charAt() gives a char based on the number you give


        System.out.println(java.charAt(0));
        System.out.println(java.charAt(1));
        System.out.println(java.charAt(2));
        System.out.println(java.charAt(3));

       // System.out.println(java.charAt(100));
        // If u use a index number that does nort exist in your String will say out of range

        char firstLetter = java.charAt(0);

        System.out.println(java.charAt(0) + java.charAt(1) + java.charAt(2) + java.charAt(3));
        // Above will add the ascii values of the char and print it. char + char

        System.out.println("" + java.charAt(0) + java.charAt(1) + java.charAt(2) + java.charAt(3));
        //by adding the empty space we can do conatenation and the character values, not addition. String + char

    }
}
