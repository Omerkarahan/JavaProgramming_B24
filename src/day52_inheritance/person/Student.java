package day52_inheritance.person;

public class Student extends Person{

    String schoolName;

    public Student(String name, int age, int birthYear, String schoolName){
        super(name, age, birthYear);
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

}
