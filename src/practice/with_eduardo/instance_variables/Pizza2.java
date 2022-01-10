package practice.with_eduardo.instance_variables;

public class Pizza2 {


        String size;
        int numOfCheeseTop;
        int numOfPepperoniTop;
        //double tip;
        double totalCost;

        public Pizza2(String size, int numOfCheeseTop, int numOfPepperoniTop) {
            this.size = size;
            this.numOfCheeseTop = numOfCheeseTop;
            this.numOfPepperoniTop = numOfPepperoniTop;
            //this.tip = tip;
        }

        public void customizeOrder(String size, int numOfCheeseTop, int numOfPepperoniTop) {
            this.size = size;
            this.numOfCheeseTop = numOfCheeseTop;
            this.numOfPepperoniTop = numOfPepperoniTop;
        }


        public double calcCost() {

            if (size.equalsIgnoreCase("small")) {
                totalCost = 10 + (numOfCheeseTop * 1) + (numOfPepperoniTop * 1.5);
            } else if (size.equalsIgnoreCase("medium")) {
                totalCost = 12 + (numOfCheeseTop * 1) + (numOfPepperoniTop * 1.5);
            } else if (size.equalsIgnoreCase("large")) {
                totalCost = 14 + (numOfCheeseTop * 1) + (numOfPepperoniTop * 1.5);
            }
            return totalCost;
        }

        @Override
        public String toString() {
            return "Pizza{" +
                    "size='" + size + '\'' +
                    ", numOfCheeseTop=" + numOfCheeseTop +
                    ", numOfPepperoniTop=" + numOfPepperoniTop +
                    "totalCost" + totalCost +
                    '}';
        }
    }
        /*
Pizza - custom classes

    create a custom class for Pizza that should contain the following:
            variables:
                    size (either small, medium, large)
                    number of cheese topping
                    number of veggie topping
                    tip

            constructor

            methods:
                    customizeOrder(): allows user to set the size and toppings of Pizza
                    calcCost(): returns the total cost  as double
                    toString(): get the full information and total cost of Pizza


            Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1$ per cheese topping
 */

