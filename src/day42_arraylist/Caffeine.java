package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {

    /*

    ArrayList of caffeinated drinks

    Figure out how much caffeine each drink has, and store that into a new ArrayList

    coffee - 80
    tea - 50
    monster - 100
    red bull - 100
    coke - 70
    pepsi - 70
    bang - 100
    apple juice - 0

     */

    public static void main(String[] args) {

        // This is all the defined information to work with

        String [] allDrinks = {"coffee", "tea", "monster", "red bull", "coke", "pepsi", "bang", "apple juice"};

        ArrayList<String> drinkList = new ArrayList<>(Arrays.asList(allDrinks)); // we converted the array to Arraylist to make an ArrayList with values right away

        ArrayList<Integer> caffeineAmounts = new ArrayList<>(); // making an empty Arraylist use later


        // The for each loop goes through every drink element  and puts the caffeine amount into other ArrayList

        for(String eachDrink : drinkList){

            int caffeineNum = 0;
            switch (eachDrink){

                case "apple juice":
                    caffeineNum = 0;
                break;
                case "coffee":
                    caffeineNum = 80;
                    break;
                case "tea":
                    caffeineNum = 50;
                    break;
                case "monster":
                case "red bull":
                case"bang":
                    caffeineNum = 100;
                break;
                case "coke":
                case "pepsi":
                    caffeineNum = 70;

                 break;
        }
        caffeineAmounts.add(caffeineNum); // actual adding ofthe caffeine to the arraylist



        }

//        System.out.println(drinkList);
//        System.out.println(caffeineAmounts);

        // printing the drinks and caffeine

        System.out.println("===========  Caffeine Table =========");

        for (int i = 0; i < drinkList.size();  i++){

            System.out.println("Drink: " + drinkList.get(i));
            System.out.println("Caffeine amount: " + caffeineAmounts.get(i));
            System.out.println();

        }

        System.out.println("===========  Finished =========");
    }
}
