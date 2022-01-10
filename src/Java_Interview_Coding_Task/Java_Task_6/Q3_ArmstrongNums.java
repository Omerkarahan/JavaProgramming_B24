package Java_Interview_Coding_Task.Java_Task_6;

public class Q3_ArmstrongNums {
    /**
     *Armstrong numbers
     * - Write a method that can check if a number is Armstrong number
     * Example = 153 ==> 1*1*1 + 5*5*5 +3*3*3
     */
    public static void main(String[] args) {
        isArmstrongNumber(1578);
    }

    /**
     * What is Armstrong number and how to check given number is Armstrong number?
     * Armstrong number is very specific number, The sum of the cubes of every digit of a given number gives the number itself.
     *
     */
    public static void isArmstrongNumber(int num){

    int temp;
    int remainder;
    int sumCube=0;

    temp=num;
// I will use while loop for this example because
    while(num>0){
        remainder=num%10;
        num=num/10;

        sumCube = sumCube+(remainder*remainder*remainder); // 1) 153 %10 =15,3 and remainder is -->3; 2) 15 %10 = 1,5 and remainder is --5; 3) 1 %10 = 1 and reminder is 1
           }
    if(temp==sumCube){
        System.out.println(sumCube +" is an Armstrong number");
    }else{
        System.out.println(sumCube +" is not an Armstrong number");
    }



}
}