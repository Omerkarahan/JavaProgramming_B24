package day08_relational_logical_operators;

public class AgeCheck {

    public static void main(String[] args) {

        int age = 12;
        boolean isAToddler = age <= 3;
        boolean isASenior = age >= 65;

        System.out.println("Isstill a toddler: " + isAToddler);
        System.out.println("Is a senior: " +isASenior);

        // 3 > age < 65 - > not java code



    }
}
