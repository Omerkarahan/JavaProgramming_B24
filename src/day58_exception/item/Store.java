package day58_exception.item;

public class Store {

    public static void main(String[] args) {


        Eragon obj1 = new Eragon(); // itself

        Book obj2 = new Eragon(); // parent

        Item obj3 = new Eragon(); // parent

        // also have Interface for reference

        obj1.use();
        obj2.use();
        obj3.use();
        // whenever it comes to execution it always does from object side wgich is Eragon

       // new Book("").use();  in here Book obj so it execute from Book class

        obj1.sell();
       // obj2.sell();  // Book as a reference does not know what is sell method is
        ((Eragon)obj2).sell();
       // obj3.sell(); //Item as a reference does not know what is sell method is
        Eragon newObj = (Eragon)obj3;
        newObj.sell();


        purchase(new Item("wooden spoon"));
        purchase(obj1);
        purchase(new Book("Harry Potter"));
    }

    public static void purchase(Item item){
        System.out.println("Purchasing " + item.name);
    }
}
