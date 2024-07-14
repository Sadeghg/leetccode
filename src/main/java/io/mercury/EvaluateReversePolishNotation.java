package io.mercury;

import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<String> operators = List.of("+", "-", "*", "/");

        for (String string: tokens){
            if (operators.contains(string)){
                int firstNum = stack.pop();
                int secondNum = stack.pop();

                switch (string) {
                    case "+" -> stack.push(secondNum + firstNum);
                    case "-" -> stack.push(secondNum - firstNum);
                    case "*" -> stack.push(secondNum * firstNum);
                    case "/" -> stack.push(secondNum / firstNum);
                }
            }
            else
                stack.push(Integer.parseInt(string));
        }

        return stack.peek();
    }
}
