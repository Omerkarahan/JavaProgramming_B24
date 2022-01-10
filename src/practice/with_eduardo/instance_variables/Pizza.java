package practice.with_eduardo.instance_variables;

public class Pizza {

    private String size;
    private int quantityOfCheese;
    private int quantityOfPepperoni;

    Pizza(String size) {
        this.size = size;
    }

    Pizza(String size, int cheese, int pepperoni) {
        this.size = size;
        this.quantityOfCheese = cheese;
        this.quantityOfPepperoni = pepperoni;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCheese(int cheese) {
        this.quantityOfCheese = cheese;
    }

    public void setPepperoni(int pepperoni) {
        this.quantityOfPepperoni = pepperoni;
    }

    public String getSize() {
        return this.size;
    }

    public int getCheese() {
        return this.quantityOfCheese;
    }

    public int getPepperoni() {
        return this.quantityOfPepperoni;
    }

    public double calculateCost() {
        double totalCost = 0;
        if (size.equals("small")) {
            totalCost = 10 + (quantityOfCheese * 1) + (quantityOfPepperoni * 3);
        } else if (size.equals("medium")) {
            totalCost = 12 + (quantityOfCheese * 1) + (quantityOfPepperoni * 3);
        } else if (size.equals("large")) {
            totalCost = 14 + (quantityOfCheese * 1) + (quantityOfPepperoni * 3);
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Size: " + size + ", Cheese: " + quantityOfCheese + ", Pepperoni: " +
                quantityOfPepperoni + ", TOTAL COST: " + calculateCost();
    }
}