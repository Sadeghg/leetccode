package io.mercury;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean solutionOne(String s) {
        Map<Character, Character> map = Map.of
                (
                        '[', ']',
                        '{', '}',
                        '(', ')'
                );

        Stack<Character> stack = new Stack<>();
        for (Character character: s.toCharArray()){
            if(character == '[' || character == '(' || character == '{')
                stack.push(character);
            else if(stack.isEmpty() || (map.containsKey(stack.peek()) && map.get(stack.pop()) != character))
                return false;
        }

        return stack.isEmpty();
    }
}

