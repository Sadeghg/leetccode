package io.mercury.backtracking;

import java.util.*;

public class Subsets {

    public static void main(String[] args) {
        subsetsWithoutDuplicates(List.of(1, 2, 3, 4));
    }

    private static void subsetsWithoutDuplicates(List<Integer> numbers){
        LinkedList<List<Integer>> subsets = new LinkedList<>();
        Stack<Integer> currentSet = new Stack<>();
        helper(0, numbers, currentSet, subsets);
        System.out.println("halt");
    }

    private static void helper(
            int index,
            List<Integer> numbers,
            Stack<Integer> currentSet,
            LinkedList<List<Integer>> subsets
            ){

        if (index >= numbers.size()){
            subsets.add(List.copyOf(currentSet));
            return;
        }

        currentSet.push(numbers.get(index));
        helper(
                index +1,
                numbers,
                currentSet,
                subsets
        );
        currentSet.pop();

//        while (index +1 < numbers.size() && numbers.get(index).equals(numbers.get(index +1)))
//            index ++;

        helper(
                index +1,
                numbers,
                currentSet,
                subsets
        );
    }
}
