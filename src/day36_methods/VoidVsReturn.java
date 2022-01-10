package day36_methods;

public class VoidVsReturn {

    public static void main(String[] args) {
        sayHello();
      //  String s = sayHello();
       // System.out.println(sayHello(););

        sayBye();

        String s = " java";
        char c = s.charAt(0);
        int i = s.length();
        char [] arr = s.toCharArray();
        String sub = s.substring(0,1);



        String bye = sayBye();
        System.out.println(bye);

        System.out.println(sayBye());
    }

    // this is a void method no params

    public static void sayHello(){
        System.out.println("Hello World");
    }

    public static String sayBye(){
        return "Bye World";
    }

}
