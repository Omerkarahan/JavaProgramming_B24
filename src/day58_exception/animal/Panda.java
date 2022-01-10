package day58_exception.animal;

public class Panda extends Animal{
    @Override
    public Panda getAnimal(){
        return new Panda();
}

}
