package Java_Interview_Coding_Task.Java_Task_1;

public class q5_reverse {
    /**
     *  (String) Write return method that can reverse String
    Ex: Reverse("ABCD"); ==> DCBA

     */

    public static String Reverse(String letter) {
        String reverse = "";

        for (int i =letter.length() - 1;i>0; i--) {
            reverse += letter.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(Reverse("ABCD"));
    }
}