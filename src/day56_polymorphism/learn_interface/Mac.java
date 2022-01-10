package day56_polymorphism.learn_interface;

public interface Mac {

    public  static final String NAME = "Mac";  // whenever we see capital that means these are final variables
    String SOFTWARE = "IOS";

    void turnOn(); // public abstract method

    public static void getBrand(){
        System.out.println("Apple");
    }

    public  default void type(){ //  static is accesable by class name,  default is accesbale by the obj
        System.out.println("Typing");
    }

}

class Runner2{
    public static void main(String[] args) {
        Mac.getBrand();
        System.out.println(Mac.NAME);
        System.out.println(Mac.SOFTWARE);
    }
}