package practice.with_eduardo.methods;

public class PersonDemo {
    public static void main(String[] args) {
       Person john = new Person("John");
        System.out.println(john); //First Name John Last Name null Age 0
        john.setLastName("Smith");
        john.setAge(20);
        System.out.println(john); //First Name John Last Name Smith Age 20
    }

}
