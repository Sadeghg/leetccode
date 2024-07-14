package io.mercury;

import java.util.Map;

public class RomanToInteger {

    private int solutionOne(String string){
        Map<Character, Integer> numerals = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int result = 0;
        for (int index = 0; index < string.length(); index ++){
            int currentVal = numerals.get(string.charAt(index));
            if (index +1 < string.length() && currentVal < numerals.get(string.charAt(index +1)))
                result -= currentVal;
            else
                result += currentVal;
        }
        return result;
    }
}
