package day50_inheritance;

public class UsingAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.age = 10;
        // animal has acces to 3 variabes
        Dog dog = new Dog();
        dog.age = 10;
        dog.hasTail = true;

        // dog has  access to 4 vriables

        Lion lion = new Lion();
        lion.numberOfClaws = 5;
        lion.roar();

       // lion has access to 5 variables an 1 method
    }


}
