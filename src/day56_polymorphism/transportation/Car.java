package day56_polymorphism.transportation;

public class Car extends  Transportation{

    @Override
    public void go() {
        System.out.println("CAR -- car is driving");
    }
    public void openTrunk(){
        System.out.println("Opening the car trunk");
    }
}


