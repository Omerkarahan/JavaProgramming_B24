package day54_abstraction.person;

public abstract class Employee extends Person{

    String jobTitle;
    double salary;

    public abstract void work();
}
/*


    Employee (abstract) inherits Person

        instance variables:
            job title, salary

        abstract method:

            work()

    Make Child classes of Employee and implements methods:

        Tester, Developer, Chef, Server
 */