package io.mercury;

import java.util.Stack;

public class MinStack {

    private final Stack<Integer> stack;
    private final Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        if(min.empty() || val <= min.peek())
            min.push(val);
        stack.push(val);
    }

    public void pop() {
        if(stack.peek().equals(min.peek()))
            min.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
