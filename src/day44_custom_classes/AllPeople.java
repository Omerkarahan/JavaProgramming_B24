package day44_custom_classes;



public class AllPeople {
    public static void main(String[] args) {

        // make Person object

        Person personOne = new Person(); // We made a Person object / we made an instance of Person class

        personOne.name = "James Bond";
        personOne.age = 40;
        // age = 40; there is no local age
        personOne.hairColor = "Black";
        personOne.sex = 'M';
        personOne.isMarried = false;

        // this will not print anything useful, for now
        System.out.println(personOne);

        // Q: How to print each field?
        // A: in order to access each instance variable we need to use the reference

        System.out.println("Name: " + personOne.name);
        System.out.println("Age: " + personOne.age);
        System.out.println("Hair color: " + personOne.hairColor);
        System.out.println("SEx: " + personOne.sex);
        System.out.println("Married: "+ (personOne.isMarried ? "yes" : "no"));

        // System.out.println(Person.name); name cannot be accessed because it is not being used with an object
    }


}
