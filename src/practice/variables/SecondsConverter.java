package practice.variables;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;

        System.out.println("Enter seconds:");

        inputSeconds = scan.nextInt();

        hours = inputSeconds / 3600;
        minutes = (inputSeconds - 3600 * hours) / 60;
        seconds =  inputSeconds % (3600 * hours + 60 * minutes);


        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " and seconds" );
    }
}
