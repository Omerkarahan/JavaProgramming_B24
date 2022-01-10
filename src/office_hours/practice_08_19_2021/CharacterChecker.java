package office_hours.practice_08_19_2021;

public class CharacterChecker {

    public static void main(String[] args) {

        char letter = 'a';

        if(letter >= 'a' && letter <= 'z'){ // if(letter >= 97 && letter <= 122
            System.out.println("lowercase");
        } else if(letter >= 'A' && letter <= 'Z'){
            System.out.println("uppercase");
        } else{
            System.out.println(letter + " is not a letter");
        }

    }

}
