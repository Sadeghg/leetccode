package io.mercury.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CombinationSumTwo {

    public static void main(String[] args) {
        combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
    }

    public static List<List<Integer>> combinationSum2(
            int[] candidates,
            int target
    ) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(
                target,
                0,
                0,
                result,
                new Stack<>(),
                candidates
        );
        return result;
    }

    private static void backtrack(
            int target,
            int sum,
            int index,
            List<List<Integer>> elected,
            Stack<Integer> candidates,
            int[] numbers
    ){
        if (target == sum){
            elected.add(
                    List.copyOf(
                            candidates
                    )
            );
        }

        if (sum > target || index >= numbers.length){
            return;
        }

        int prev = -1;
        for (int j = index; j < numbers.length; j++) {
            int value = numbers[j];
            if (value == prev) {
                continue;
            }
            candidates.push(value);
            backtrack(
                    target,
                    sum + value,
                    j + 1,
                    elected,
                    candidates,
                    numbers
            );
            candidates.pop();
            prev = value;
        }
    }
}
