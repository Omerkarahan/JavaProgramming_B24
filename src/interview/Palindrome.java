package interview;

public class Palindrome {
    public static boolean palindr(String str){

        boolean isPalindrome = false;
        int j = str.length()-1;
        for(int i = 0; i < str.length()/2; i++){
            if (str.charAt(i) == str.charAt(j-i)){
                isPalindrome=true;
            }else {
                isPalindrome=false;
            }
        }
        return isPalindrome;

    }

    public static void main(String[] args) {
        System.out.println(palindr("civic"));
    }
}
