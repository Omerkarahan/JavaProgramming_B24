package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDays {

    /*

            Create a method that will return a Arraylist with all the days
                Monday, Tuesday, .....Sunday

                overload the method so it accepts the int number - which day of the week they want String

                input : 1
                output : Monday

     */

    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println(getDays(1));
        System.out.println(getDays(7));

        ArrayList<String> days = getDays();
        System.out.println(days.containsAll(Arrays.asList("Monday", "Friday", "Sunday")));

        /*
        if you wanted this same checking for 1 element at a time :
        days.contains("Monday") && days.contains("Friday") && days.contains"Sunday")
         */
        System.out.println(days.containsAll(Arrays.asList("Monday", "April", "Sunday")));
    }

      public static ArrayList<String>  getDays(){

          String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

          ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));

          return daysInList;
      }
    public static String getDays( int day) {


        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));
    return  daysInList.get(day -1);
    }
}
