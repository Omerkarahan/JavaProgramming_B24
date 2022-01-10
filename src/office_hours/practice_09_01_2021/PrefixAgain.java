package office_hours.practice_09_01_2021;



import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {

       Scanner scan = new Scanner (System.in);

        String str = scan.next(); // abXYabc
        int n = scan.nextInt(); // 2

        String prefix = str.substring(0,n); //ab
        String remaining = str.substring(n); //XYadc

        System.out.println(remaining.contains(prefix));

    }
}
