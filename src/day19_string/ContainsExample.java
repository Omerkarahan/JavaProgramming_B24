package day19_string;

public class ContainsExample {

    public static void main(String[] args) {

        String name = " james mr ";

        System.out.println(name.contains("mr"));;

        String address = "204948 road  w drive, 98090";
        System.out.println(address.contains("204") && address.contains("drive"));
        System.out.println(address.contains("300") && address.contains("drive"));

    }
}
