package day52_inheritance.lyft;

public class Drive {
    public static void main(String[] args) {

        Lyft lyft = new Lyft();
        System.out.println(lyft.calculateRate(5));

        LyftXL lyftXL = new LyftXL();
        System.out.println(lyftXL.calculateRate(5));

        Lux lux = new Lux();
        System.out.println(lux.calculateRate(5));

    }
}
