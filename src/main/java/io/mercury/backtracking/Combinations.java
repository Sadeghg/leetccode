package io.mercury.backtracking;

import java.util.List;
import java.util.Stack;

public class Combinations {

    public static void main(String[] args) {
        combinations(4, 2);
    }

    public static void combinations(int n, int k) {
        Stack<List<Integer>> combinations = new Stack<>();
        helperVariantOne(1, new Stack<>(), combinations, n, k);
        System.out.println("halt");
    }

    private static void helperVariantOne(
            int number,
            Stack<Integer> candidates,
            Stack<List<Integer>> elected,
            int end,
            int size
    ) {
        if (candidates.size() == size) {
            elected.push(List.copyOf(candidates));
            return;
        }

        if (number > end)
            return;

        candidates.push(number);
        helperVariantOne(
                number + 1,
                candidates,
                elected,
                end,
                size
        );
        candidates.pop();

        helperVariantOne(
                number + 1,
                candidates,
                elected,
                end,
                size
        );
    }

    private static void helperVariantTwo(
            int number,
            Stack<Integer> currentCombination,
            Stack<List<Integer>> combination,
            int end,
            int size
    ) { 
        if (currentCombination.size() == size) {
            combination.push(List.copyOf(currentCombination));
            return;
        }

        if (number > end)
            return;

        for (int index = number; index <= end; index++) {
            currentCombination.push(index);
            helperVariantTwo(
                    index + 1,
                    currentCombination,
                    combination,
                    end,
                    size
            );
            currentCombination.pop();
        }

    }

}
