package day07_unary_operators;

public class Pizza {
    public static void main(String[] args) {

        String type = "cheese";
        int pizzaSlices = 8;
        int people = 4;

        int slicesPerPerson = pizzaSlices / people;
        // byte slicesPerPerson =(byte) (pizzaSlices / people);

        System.out.println(" We ordered " + type + " pizza with " + pizzaSlices +
                " slices, " + people + " people ate " + slicesPerPerson + " slices each ");






    }
}
