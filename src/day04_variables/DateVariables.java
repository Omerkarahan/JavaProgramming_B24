package day04_variables;

public class DateVariables {

    /* have 3 variables
        number format: month

        day

        year

        output:
            m/d/y

     */
    public static void main(String[] args) {
        int month, day, year; //declares 3 int variables
    /*
        Above is the same as doing it in 3 lines
        int month;
        int day;
        int year;
     */


        month = 7;
        day= 31;
        year= 2021;
        System.out.println("Date:" + month + "/" + day + "/" + year);

        month = 8;
        day= 1;
        System.out.println("Tomorrows date:" + month + "/" + day + "/" + year);



    }

}
