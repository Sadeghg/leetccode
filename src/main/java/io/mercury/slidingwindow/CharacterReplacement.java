package io.mercury.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class CharacterReplacement {

    public int solutionOne(String s, int k) {

        Map<Character, Integer> characters = new HashMap<>();

        int left = 0;
        int right = 0;
        int result = 0;

        while (right < s.length()) { // A A B A B B A
            put(characters, s.charAt(right));
            while (right - left +1 - max(characters) > k){
                remove(characters,s.charAt(left));
                left ++;
            }

            result = Math.max(result, right -left +1);
            right ++;
        }

        return result;
    }

    public int solutionTwo(String s, int k) {

        Map<Character, Integer> characters = new HashMap<>();

        int left = 0;
        int right = 0;
        int result = 0;

        int maxF = 0;

        while (right < s.length()) {
            put(characters, s.charAt(right));
            maxF = Math.max(maxF, characters.get(s.charAt(right)));
            while (right - left +1 - maxF > k){
                remove(characters,s.charAt(left));
                left ++;
            }

            result = Math.max(result, right -left +1);
            right ++;
        }

        return result;
    }

    private void put(Map<Character, Integer> map, Character key) {
        if (map.containsKey(key))
            map.put(key, map.get(key) + 1);
        else
            map.put(key, 1);
    }

    private void remove(Map<Character, Integer> map, Character key) {
        Integer count = map.get(key);
        map.put(key, count -1);
    }

    private int max(Map<Character, Integer> characterIntegerMap){
        int max = 0;
        for (Character key: characterIntegerMap.keySet())
            if (characterIntegerMap.get(key) > max)
                max = characterIntegerMap.get(key);
        return max;
    }
}
