package practice.variables;



//public class EscapeSequences {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        String topic1 = scan.nextLine();
//        String topic2 = scan.nextLine();
//
//        //WRITE YOUR CODE BELOW THIS LINE:
//
//        System.out.println("I will learn \"" + topic1 + "\" and \"" + topic2 + "\" at CybertekSchool.");
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        int num1;
        int num2;
        int num3;
        int sum;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
         num1 = scan.nextInt();
         num2 = scan.nextInt();
         num3 = scan.nextInt();

        sum = num1 + num2 + num3;
        System.out.println("Sum of Numbers:ValueOfSum " + sum);





    }
}




