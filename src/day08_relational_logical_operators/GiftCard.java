package day08_relational_logical_operators;

public class GiftCard {
    public static void main(String[] args) {

        // gift card balance
        // item 1 price = 40
        // item 2 price = 100
        // calculate the remaining balance of gift card

        double balance = 200;
        System.out.println("Gift card balance: " + balance);
        System.out.println("buy item 1 and is cost $40");
        balance -= 40;
        System.out.println("Gift card balance: " + balance);
        System.out.println("buy item 2 and it cost $100");

        balance -= 100;
        System.out.println("Gift card balance: " + balance);


    }
}
