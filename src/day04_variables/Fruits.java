package day04_variables;

public class Fruits {
    public static void main(String[] args) {

        int apples = 12;
        int grapes = 13;
        int bananas = 20;

        System.out.println("Number of apples:" +  apples);

        System.out.println("Number of Grapes:" + grapes);

        System.out.println("Number of bananas:" + bananas);

        int totalNumberOfFruits =  apples + grapes + bananas;
        System.out.println("total number of fruits: " + totalNumberOfFruits);

        //we got new shipment and we have 50 apples now
        apples = 50;
        totalNumberOfFruits =  apples + grapes + bananas; //reassigned and counted again

        System.out.println("After shipment");
        System.out.println("Number of apples:" +  apples);

        System.out.println("Number of Grapes:" + grapes);

        System.out.println("Number of bananas:" + bananas);
        System.out.println("total number of fruits: " + totalNumberOfFruits);

    }
}
