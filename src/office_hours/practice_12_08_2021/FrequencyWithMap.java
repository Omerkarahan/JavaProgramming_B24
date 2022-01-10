package office_hours.practice_12_08_2021;

import java.util.HashMap;
import java.util.Map;

public class FrequencyWithMap {
    /*
    Create a method that will accept a String and print out the frequency of evry chracter in the String (Use maps, format doesn't need to match the output exactly)

    Ex:
    input: "apple"
    output: a = 1
            p = 2
            l = 1
            e = 1
     */
    // a
    public static void frequencyOfChar(String str){

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){

            char letter = str.charAt(i);

            if(map.containsKey(letter)){
                // count
                int currentCount = map.get(letter);
                map.put(letter, currentCount + 1);

            } else {
                // will run anytime we check a new character that isn't in our map yet
                map.put(letter, 1);
            }

        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        frequencyOfChar("aappleee");
    }
}
