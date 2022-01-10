package my_utilities;

import day51_inheritance.Modifier;

public class TestModifierOutsidePackage {
    public static void main(String[] args) {

        Modifier obj = new Modifier();
        System.out.println(obj.A);
        //System.out.println(obj.B); cannot be accessed because it is protected, and we are in a different package
       // System.out.println(obj.C); cannot be accessed because it is default, and we are in a different package
        // System.out.println(obj.D); cannot be accessed because it is private

    }

}
