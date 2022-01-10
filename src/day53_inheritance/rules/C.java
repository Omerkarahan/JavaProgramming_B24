package day53_inheritance.rules;

public class C extends A{

    @Override
    public int getNum(){
        return 6;
    }

    // getNum method cannot change access modifier cuz it is public, and they can only be made more accessible in overriding
    @Override
    public String getName(){
        return "str";
    }

    // getName method can be changed to protected, or public access because they are more accessible. Or can stay default (same)
}
