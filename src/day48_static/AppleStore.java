package day48_static;

public class AppleStore {
    public static void main(String[] args) {

        Iphone phone1= new Iphone("10", 1000);

        Iphone phone2 = new Iphone("11", "Black", 1300, 128);

        System.out.println(phone1);
        System.out.println(phone2);

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);

    }
}
