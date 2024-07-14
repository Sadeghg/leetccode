package io.mercury.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public int solutionOne(String s) {
        Set<Character> characters = new HashSet<>();

        int left = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right ++){
            while(characters.contains(s.charAt(right))){
                characters.remove(s.charAt(left));
                left ++;
            }
            characters.add(s.charAt(right));
            result = Math.max(result, characters.size());
        }
        return result;
    }

    public int solutionTwo(String s){
        Set<Character> characters = new HashSet<>();

        int left = 0;
        int right = 0;
        int result = 0;

        while (right < s.length()){
            if (!characters.contains(s.charAt(right))){
                characters.add(s.charAt(right));
                result = Math.max(result, characters.size());
                right ++;
            }else {
                characters.remove(s.charAt(left));
                left ++;
            }
        }
        return result;
    }
}
