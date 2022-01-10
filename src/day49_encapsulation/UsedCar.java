package day49_encapsulation;

public class UsedCar {
    public static void main(String[] args) {

        Car car = new Car("James", "LC0007", 40);
        System.out.println(car.driver);
        System.out.println(car.driver.name);
        System.out.println(car.driver.age);

        Car car2 = new Car("Adam", "238482", 35);
        System.out.println(car2);
        System.out.println(car2.driver);

    }
}
