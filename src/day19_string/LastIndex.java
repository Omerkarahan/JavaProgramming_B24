package day19_string;

public class LastIndex {

    public static void main(String[] args) {

        // indexOf() -> first occurrence
        // lastIndexOf() -> last occurrence
        //              0123
        String str = "java";
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));

        System.out.println(str.indexOf('v'));
        System.out.println(str.lastIndexOf('v'));



    }
}
