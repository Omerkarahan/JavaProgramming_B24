package day36_methods;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class DaysInAWeek {
    /*
    make a method that will accept a number

    I want to see which day of the week it is

    1 - Monday
    2 _ tue


    6 _ sat
    7 - sun

     */

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(2));

        String day = getDayOfWeek(1);
        System.out.println(day.charAt(0));

        String day2 = getDayOfWeek(10);
        System.out.println(day2.equals("NOT A VALID DAY"));

        if (getDayOfWeek(6).equals("Saturday") || getDayOfWeek(6).equals("Sunday")){
            System.out.println("Its the weekend");
        }

    }

    public static String getDayOfWeek(int number){
        String day = "";

        switch (number){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "NOT A VALID DAY";

        }

        return  day;



    }
}
