package day58_exception.intro;

public class FirstTry {
    public static void main(String[] args) {

        System.out.println("First line");

        try {
            String s = "java";
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(100));
        }
        catch (StringIndexOutOfBoundsException e){ // e is just a name / reference
            System.out.println("We got exception");
            e.printStackTrace();
        }



        System.out.println("Last line");
    }
}
