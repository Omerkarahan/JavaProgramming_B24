package day49_encapsulation;

public class TestModifier {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.a = 1;
        obj.b = 2;
       // obj.c = 3; c is private so we cannot access it outside of the class

        Paper paper = new Paper();
        paper.cut();
        paper.fold();
       // paper.write(); is private


    }
}
