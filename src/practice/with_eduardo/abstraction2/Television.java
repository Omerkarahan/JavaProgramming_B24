package practice.with_eduardo.abstraction2;

public class Television extends Electronic implements Bluetooth{

    @Override
    public void volume() {
        System.out.println("Television volume");
    }

    @Override
    public void pairing() {  // Bluetooth

    }

    @Override
    public void sendSignal() {  //Remote Control
        System.out.println("Sending 5 GHz");
    }
}
