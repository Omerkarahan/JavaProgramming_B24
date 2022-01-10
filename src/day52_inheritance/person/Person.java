package day52_inheritance.person;

import java.util.ArrayList;

public class Person {

    String name;
    int age;
    int birthYear;
    ArrayList<String> hobbies;

    public Person(){

    }

    public Person(String name, int age , int birthYear){
        this.name= name;
        this.age = age;
        this.birthYear = birthYear;
        hobbies = new ArrayList<>();

    }

    public void walk(){
        System.out.println(name + " is walking");
    }

}
