package day49_encapsulation;

public class ReviewStatic1 {
    static int i = 6;
    int a =4;

    public static void main(String[] args) { // main method
        System.out.println("A");
        new ReviewStatic1();
        method1();
    }

    public ReviewStatic1(){ // constructor
        System.out.println("B");
    }

    static { // static block
        System.out.println("C");
       // System.out.println(a); // cannot uses variable in statick block
    }

    public static void method1(){ // static method
        System.out.println("D");
        System.out.println(i);
        //System.out.println(a); // cannot use instance variable in static method

    }
    public void method2(){ // instance method
        System.out.println(i);
    }


}
