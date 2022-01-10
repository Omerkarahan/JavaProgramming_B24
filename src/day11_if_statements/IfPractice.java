package day11_if_statements;

public class IfPractice {
    public static void main(String[] args) {

        double hourlyRate = 10.5;
        double hoursWorked = 35;
        double netPay ;

        String message;

        if(hoursWorked > 40){
             // overtime calculation

            double overTimesHours = hoursWorked - 40;
            netPay =  40 * hourlyRate;
            netPay += overTimesHours * hourlyRate * 1.5;  // netPay = netPay + new calc

            message = "Wow you worked" + hoursWorked + " hours so you got paid for" + overTimesHours + " hours overtime, so your total net pay is: "
+ netPay;

        } else {
            netPay = hoursWorked * hourlyRate;

            message = "You Worked" + hoursWorked + " your total net pay is: " + netPay;
        }
        System.out.println(message);

    }
}
