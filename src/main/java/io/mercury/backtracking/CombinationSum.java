package io.mercury.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CombinationSum {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 6, 7};
        List<List<Integer>> elected = combinationSum(
                numbers,
                7
        );
        System.out.println("Halt");
    }
    public static List<List<Integer>> combinationSum(
            int[] candidates,
            int target
    ) {
        List<List<Integer>> elected = new ArrayList<>();
        backtrack(
                target,
                0,
                0,
                elected,
                new Stack<>(),
                candidates
        );
        return elected;
    }

    private static void backtrack(
            int target,
            int sum,
            int index,
            List<List<Integer>> elected,
            Stack<Integer> candidates,
            int[] numbers
            ){

        if(index >= numbers.length){
            return;
        }
        int currentValue = numbers[index];
        if (sum == target){
            elected.add(
                    List.copyOf(candidates)
            );
            return;
        }

        if(sum > target){
            return;
        }

        candidates.push(currentValue);
        backtrack(
                target,
                sum + currentValue,
                index,
                elected,
                candidates,
                numbers
        );
        candidates.pop();

        backtrack(
                target,
                sum,
                index +1,
                elected,
                candidates,
                numbers
        );
    }
}
