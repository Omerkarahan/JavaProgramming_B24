package practice.with_eduardo.abstraction2;

public class Radio extends Electronic implements Bluetooth{
    @Override
    public void volume() {
        System.out.println("Radio volume");
    }
    @Override
    public void pairing() {

    }
    @Override
    public void sendSignal() {
        System.out.println("Sending 3.2 GHz");
    }
}
