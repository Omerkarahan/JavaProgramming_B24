package Java_Interview_Coding_Task.Java_Task_2;

public class q8_String {
    /*
    String -- sum of digits in a string: Write a method that can return the sum of the digits in a string.
     */

    public static void main(String[] args) {
        String word ="123456";
        int sum = 0;
        for(int i = 0; i < word.length()+1; i++){ // we use for loop method because we want to check each character start 0 to length of word + 1.
            sum += Integer.parseInt("" + i); // convert integer instead of string type
        }
        System.out.println("Sum of digit numbers: " + sum);
    }
}
