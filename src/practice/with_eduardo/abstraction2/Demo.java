package practice.with_eduardo.abstraction2;

public class Demo {

    public static void main(String[] args) {
        Television tv = new Television();
        tv.turnOn();
        tv.volume();
        tv.turnOff();
        tv.sendSignal();

        System.out.println();
        Radio aRadio = new Radio();
        aRadio.volume();
        aRadio.sendSignal();

        Electronic something = new Radio();
        Radio someRadio = (Radio) something;
        someRadio.pairing();
    }
}
