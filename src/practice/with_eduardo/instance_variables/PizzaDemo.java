package practice.with_eduardo.instance_variables;

public class PizzaDemo {
    public static void main(String[] args) {
        Pizza aPizza = new Pizza("small", 2, 3);
        System.out.println(aPizza);
        System.out.println(aPizza.calculateCost());


        Pizza bPizza = new Pizza("large");
        bPizza.setCheese(2);
        bPizza.setPepperoni(3);

        System.out.println(bPizza);
        System.out.println(bPizza.getCheese());
        System.out.println(bPizza.getPepperoni());
        System.out.println(bPizza.calculateCost());

    }
}
