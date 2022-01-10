package day54_abstraction.person;

public class WorkPlace {
    public static void main(String[] args) {

        // Person person = new Person(); cannot create an object of Person because it is abstract

        // Employee employee = new Employee(); we can not create an object of Employee because it is an abstract class

        Tester tester = new Tester();
        tester.work();
        tester.sleep(30);
        tester.jobTitle = "Tester";

        Developer developer = new Developer();
        developer.work();
       developer.sleep(20);

       Chef chef = new Chef();
       chef.work();
       chef.sleep(60);
    }
}
