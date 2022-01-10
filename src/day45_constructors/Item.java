package day45_constructors;

public class Item {

    String name;
    double price;

    @Override // do not worry about it
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
