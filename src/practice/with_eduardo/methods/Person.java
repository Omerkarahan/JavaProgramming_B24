package practice.with_eduardo.methods;

public class Person {

    // instance fields or instance variables
    // access modifiers -> default, public, private, protected
     private String firstName;
     private String lastName;
     private int age;

     Person (){
     }

     Person (String firstName) {
         this.firstName = firstName; // constructor chaining
     }

     Person(String firstName, String lastName){
         this.firstName = firstName;
         this.lastName = lastName;
     }

     Person ( String firstName, String lastName, int age){
        this(firstName, lastName);
        this.age=age;
    }
        public String getFirstName(){
                 return this.firstName;
        }

        public String getLastName(){
                 return this.lastName;
        }
        public int getAge(){
                 return this.age;
        }

        public void setFirstName(String firstName){
         this.firstName = firstName;}
        public void setLastName(String lastName){
                 this.lastName = lastName;
        }
        public void setAge(int age){
         this.age = age;}

    @Override
    public String toString(){
         return "First Name " + this.firstName + " Last Name " + this.lastName +  " Age " + this.age;
    }

        }
