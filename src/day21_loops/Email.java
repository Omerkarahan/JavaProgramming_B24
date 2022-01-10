package day21_loops;

public class Email {

    public static void main(String[] args) {

        String email = "saim@cybertekschool.com";

        int posOfAt = email.indexOf("@");

        String name = email.substring(0, posOfAt);
        String domain = email.substring(posOfAt);

        System.out.println("Name: " + name);
        System.out.println("Domain: " + domain);

    }
}
