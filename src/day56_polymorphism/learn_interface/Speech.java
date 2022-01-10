package day56_polymorphism.learn_interface;

public class Speech implements  CanTalk{ // it was red because in abstract method we need implementation and we do it with override method

    @Override
    public void speak() {
        System.out.println("Speaking");
    }
}

class Runner {
    public static void main(String[] args) {

        Speech obj = new Speech();
        obj.speak();
        obj.whisper();
        //obj.yell(); not inherited
        CanTalk.yell();
        // CanTalk.whisper();  whisper is a instance method and we acces with objects

    }
}