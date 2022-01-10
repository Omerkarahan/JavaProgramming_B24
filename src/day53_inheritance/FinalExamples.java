package day53_inheritance;

public class FinalExamples {

    final int a;
    public static final String PLANET = "Earth";

    public FinalExamples (int a ){
        this.a = a;
    }

    public static void main(String[] args) {

        FinalExamples obj = new FinalExamples(5);
        System.out.println(obj.a);
        // obj.a = 10;
    }
}
