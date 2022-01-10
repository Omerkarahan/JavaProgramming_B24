package day48_static;

public class Iphone {

    String model;
    String color;
    double price;
    int storage;

    static String brand;
    static String OS;

    static {
        brand = "Apple";
        OS = "IOS";
    }

    public Iphone(String model, double price){
        this.model = model;
        this.price = price;
    }

    public Iphone(String model, String color, double price, int storage){
        this(model, price);
        this.color = color;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}

/*
Task:

    iPhone

        instance variable:
            model, color, price, storage

        static variable:
            brand, operating system (os)

        constructor
            initialize all 4 variables

            optional: create another constructor that only needs model and price

        static block:
            initialize brand : Apple
            initialize os: IOS
 */