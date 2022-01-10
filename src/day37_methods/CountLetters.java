package day37_methods;

public class CountLetters {

    /*
         String, letter

         How many times is the letter in the String

         Example:
            apple, p
            -> 2

        return type: int
        method name: frequencyOfLetter
        parameters: String, char
     */
    public static void main(String[] args) {
        System.out.println(frequencyOfLetter("Apple", 'p'));
        System.out.println(frequencyOfLetter("java", 'a'));
        System.out.println(frequencyOfLetter("anagram", 'a'));
    }
    public static int frequencyOfLetter(String word, char letter){

        int counter = 0;

        for (int i = 0; i < word.length(); i++){

            if(word.charAt(i) == letter){
                counter++;
            }

        }

        return counter;

    }
}
