package practice.with_eduardo.abstraction;

public class Dog extends Animal implements Animal2,Animal3{

    @Override
    public void step1() {

    }

    @Override
    public void doSomethingFromAnimal2() {

    }

    @Override
    public void step2() {

    }
    @Override
    public  void doSomethingFromAnimal3(){

    }

    @Override   //  annotations
    public void makeNoise() {
        System.out.println("Dog barks..");
    }
    public void doSomething() {
        System.out.println("Something from DOG");
    }
}
