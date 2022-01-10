package day02_print_statements;

import day49_encapsulation.AccessModifier;

public class ComeBackFromFuture {

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.a = 1;
      //  obj.b = 2; b is default so it can only be accessed in the same package
       // obj.c = 3; // c is private, cannot be accessed outside of  the class
    }
}
