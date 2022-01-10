package day16_switch;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a day number");
        int day = input.nextInt();



        String dayInWords = "";

        switch (day){

            case 1: dayInWords = "Monday"; break;
            case 2: dayInWords = "Tuesday"; break;
            case 3: dayInWords = "Wednesday"; break;
            case 4: dayInWords = "Thursday"; break;
            case 5: dayInWords = "Friday"; break;
            case 6: dayInWords = "Saturday"; break;
            case 7: dayInWords = "Sunday"; break;
            default: dayInWords = "Invalid day number. Needs to be between 1-7";


        }
        System.out.println(day);
        System.out.println(dayInWords);

    }
}
