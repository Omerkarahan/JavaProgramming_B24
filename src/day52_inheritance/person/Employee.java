package day52_inheritance.person;

public class Employee extends Person{

    String jobTitle;
    boolean isFullTime;

    public void work(){
        System.out.println(name + " is working as " + jobTitle);
    }

}
