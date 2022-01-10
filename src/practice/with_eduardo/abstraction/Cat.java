package practice.with_eduardo.abstraction;

public class Cat extends Animal implements Animal2{

    @Override
    public void step1(){

    }

    @Override
    public void doSomethingFromAnimal2() {
        System.out.println("From Animal 2");
    }

   @Override
    public void makeNoise() {
       System.out.println("Cat meows...");
    }
    @Override
    public void doSomething() {

    }


}
