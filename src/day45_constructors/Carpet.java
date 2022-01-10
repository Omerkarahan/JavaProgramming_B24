package day45_constructors;

public class Carpet {
    /*

    info:
        width, length, unit price, if its persian, total price
        */
    double width;
    double length;
    double unitPrice;
    double totalPrice;
    boolean isPersian;


    /*

        constructor:
        initialize the variables

        calculate the total price:
        w * l * unit price

        if its persian add 200$
       */

    public Carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputIsPersian ){

        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputIsPersian;

        totalPrice = width * length * unitPrice;

        if(isPersian){
            totalPrice += 200;



        }
    }

    /*
        toString to print the total price

     */

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
