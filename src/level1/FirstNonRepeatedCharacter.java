package level1;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        Character ch = firstNonRepeatedCharacter("abcdeabcfdefg");
        System.out.println(ch);
    }

    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> characterHashMap = new LinkedHashMap<>();
        for (int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            characterHashMap.put(currChar, !characterHashMap.containsKey(currChar) ? 1: characterHashMap.get(currChar) + 1);
        }
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            Integer integer = characterHashMap.get(ch);
            if (integer != null && integer == 1) {
                return ch;
            }
        }
        return null;
    }

}
