package day49_encapsulation;

public class Traffic {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("red");
        // Cannot access color directly anymore.
       // System.out.println(light.color);

       // light.color = "brown";

        System.out.println(light.getColor());
        // light.color = "green"; we cannot change directly
        light.setColor("green");
        System.out.println(light.getColor());

        light.setColor("brown");
        System.out.println(light.getColor());
    }
}
