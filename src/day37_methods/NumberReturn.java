package day37_methods;

public class NumberReturn {

    public static void main(String[] args) {
        System.out.println(convertNumberToWord(5));
        System.out.println(convertNumberToWord(-1));
        System.out.println(convertNumberToWord(7));
    }

    public static String convertNumberToWord(int num){

        if(num <= 0 || num > 10){
            return "Out of range";
        }

        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};


        return words[num - 1];
    }
}
