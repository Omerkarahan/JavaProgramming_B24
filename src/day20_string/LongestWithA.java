package day20_string;

public class LongestWithA {
    /*
    [Longest with A]
Given three String variables of some text find and print the longest word that also contains 'a'
Ex: "java"
"mouse" "computer" Output: java
Ex: "java"
"mouse" "apples" Output: apples

Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.
     */

    public static void main(String[] args) {

        String wordOne = "java";
        String wordTwo = "computer";
        String wordThree = "pples";

        String biggest = "";

        if(wordOne.contains("a") && wordOne.length() > biggest.length()){
            biggest = wordOne;
        }

        if(wordTwo.contains("a") && wordTwo.length() > biggest.length()){
            biggest = wordTwo;
        }

        if(wordThree.contains("a") && wordThree.length() > biggest.length()){
            biggest = wordThree;
        }
        //System.out.println("biggest:" +biggest);
        System.out.println(biggest.isEmpty() ? "None are valid" : "biggest: " + biggest);
    }
}
