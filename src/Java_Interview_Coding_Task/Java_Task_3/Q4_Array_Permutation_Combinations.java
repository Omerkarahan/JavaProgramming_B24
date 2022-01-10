package Java_Interview_Coding_Task.Java_Task_3;

public class Q4_Array_Permutation_Combinations {
    /**
     * -- Permutation combinations
     * Given an array of 3 characters print all permutation combinations from the given characters.
     */

    public static void permutation(String str, String result) {

        if (str.length() == 0) {
            System.out.println(result + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String r = str.substring(0, i) + str.substring(i + 1);
            permutation(r, result + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        permutation(str, " ");
    }

}














