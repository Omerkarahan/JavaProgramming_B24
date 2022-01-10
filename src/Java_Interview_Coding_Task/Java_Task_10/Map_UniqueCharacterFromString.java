package Java_Interview_Coding_Task.Java_Task_10;

import java.util.Map;
import java.util.TreeMap;

public class Map_UniqueCharacterFromString {
    /**
     *1. Map -- Unique character from String
     * Write a method that returns the unique characters from a String using Map.
     *
     */

    public static void main(String[] args) {
        String str = "Sentences";

        Map<Character, Integer> map = frequencyOfCharacters(str);

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println();

        uniqueCharacters(map);
    }

    public static void uniqueCharacters(Map<Character, Integer> map) {
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1)
                System.out.println(entry);
        }
    }

    public static Map<Character, Integer> frequencyOfCharacters(String str) {
        Map<Character, Integer> stringMap = new TreeMap<>();

        for (char character : str.toCharArray()) {
            if (stringMap.containsKey(character)) {
                stringMap.put(character, stringMap.get(character) + 1);
            } else {
                stringMap.put(character, 1);
            }
        }

        return stringMap;
    }
}
