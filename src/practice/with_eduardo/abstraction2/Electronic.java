package practice.with_eduardo.abstraction2;

public abstract class Electronic {

    public abstract void volume();

    public void turnOn() {
        System.out.println("TURN ON");
    }
    public void turnOff () {
        System.out.println("TURN OFF");
    }
}
