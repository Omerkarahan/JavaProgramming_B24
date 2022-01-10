package Java_Interview_Coding_Task;

public class main {
    public static void main(String[] args) {
        String obj1 = new String("Esin");
        String obj3 = "Esin";
        String obj4 = "Esin";
        String obj2 = new String("Esin");

        if (obj1 == obj2) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }

        if (obj3 == obj4) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }

        if (obj1.equals(obj2)) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }
    }
}