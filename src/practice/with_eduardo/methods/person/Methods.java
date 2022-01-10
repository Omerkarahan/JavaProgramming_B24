package practice.with_eduardo.methods.person;

public class Methods {

    public static void main(String[] args) {  // void it does not have return, just execute, We use string it is parameter and we can just pass the string
        Methods.display(); // static method we can access in same class by class name
       Methods methodObj = new Methods(); // if we do not have static method if we have void method we need to creat an obj
       methodObj.display2(); // then run with the object name
    }

    public static void display() {  // display is name of method
        System.out.println("Print a message");
    }

    public void display2(){
        System.out.println("display2");
    }
}
