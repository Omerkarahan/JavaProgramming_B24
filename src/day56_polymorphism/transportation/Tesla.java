package day56_polymorphism.transportation;

public class Tesla  extends Car  implements SelfDrivable, Electric{


    @Override
    public void charge() {
        System.out.println("Tesla is charging");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is in auto pilot");
    }

    @Override
    public void go() {
        System.out.println("TESLA -- tesla is driving");
    }
}
