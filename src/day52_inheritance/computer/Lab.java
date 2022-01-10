package day52_inheritance.computer;

public class Lab {
    public static void main(String[] args) {
        Windows computerOne = new Windows(500);

        Windows computerTwo = new Windows(1000);

        System.out.println(computerTwo.os);
        System.out.println(computerTwo.memory);

       Mac computerThree = new Mac(1500);

       Mac computerFour = new Mac( 2000);

        System.out.println(computerFour);
    }
}
