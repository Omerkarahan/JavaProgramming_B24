package day34_methods;

public class GreetingMethod {
    /*

    method that will have the String parameter for the name
    Hello $name , how are you

     */

    public static void greeting(String name){
        System.out.println("Hello " + name + ", how are you?");
    }

    public static void main(String[] args) {
        greeting("Nadir");
        greeting("James Bond");
    }


}
