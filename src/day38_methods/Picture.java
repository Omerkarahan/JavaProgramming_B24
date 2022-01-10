package day38_methods;

public class Picture {
    public static void main(String[] args) {
        draw(50);
        draw("Red");
    }

    public static void draw(String color){
        System.out.println("Using 1 color");
    }

    public static void draw(String color1, String color2){
        System.out.println("Using 2 colors");

    }

    public static void draw(int size){
        System.out.println("Drawing " + size + " inches picture");
    }
}
