package day53_inheritance.rules;

public class B extends A{

//    cannot change the signature name or parameters
    @Override
    public int getNum(){
        return 5;
    }
}
