package practice.with_eduardo.abstraction;

import org.omg.CORBA.PUBLIC_MEMBER;

public abstract class Animal {

    // instance fields

    //methods
    public abstract void makeNoise();  // contract if u want tio inherit


public abstract void doSomething();

// methods with implementation
public void eat(){
    System.out.println("Animal eats");
}
}
