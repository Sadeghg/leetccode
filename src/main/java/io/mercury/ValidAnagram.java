package io.mercury;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) { // anagram

        if (s.length() != t.length()) return false;

        Map<Character, Integer> charsOccurrence = new HashMap<>(); // a = 3, n = 1, g = 1, r = 1, m = 1
        int[] charCount = new int[26]; // 3 , 0 ,

        for (int index = 0; index < s.length(); index ++){
            Character character = s.charAt(index);
            int count = charsOccurrence.getOrDefault(character, 0);
            charsOccurrence.put(character, count +1);
        }

        for (int index = 0; index < t.length(); index ++){ // a = 0, n = 0, g = 0, r = 0, m = 0  // naaaggs
            Character character = t.charAt(index);
            int count = charsOccurrence.getOrDefault(character, 0);
            charsOccurrence.put(character, count -1);
        }

        for (Character key: charsOccurrence.keySet()){
            if (charsOccurrence.get(key) != 0)
                return false;
        }

        return true;

    }





















    public boolean solutionOne(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> chars = new HashMap<>();

        for (int index = 0; index < s.length(); index++) {
            Character firstCharacter = s.charAt(index);
            Character secondCharacter = t.charAt(index);

            increase(chars, firstCharacter);
            decrease(chars, secondCharacter);
        }

        for (Character key : chars.keySet()) {
            if (!chars.get(key).equals(0))
                return false;
        }

        return true;
    }

    private void increase(
            Map<Character, Integer> characters,
            Character character
    ) {
        Integer count = characters.getOrDefault(character, 0);
        characters.put(character, count +1);
    }

    private void decrease(
            Map<Character, Integer> characters,
            Character character
    ) {
        Integer count = characters.getOrDefault(character, 0);
        characters.put(character, count -1);
    }

    public boolean solutionTwo(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] charCounts = new int[26];
        for (int index = 0; index < s.length(); index++) {
            charCounts[s.charAt(index) - 'a']++;
            charCounts[t.charAt(index) - 'a']--;
        }

        for (int charCount : charCounts) {
            if (charCount != 0)
                return false;
        }

        return true;
    }


}
