package io.mercury.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> elected = new ArrayList<>();
        dfs(
                0,
                s,
                elected,
                new Stack<>()
        );
        return elected;
    }

    private void dfs(
            int index,
            String word,
            List<List<String>> elected,
            Stack<String> candidates
    ) {
        if (index >= word.length()) {
            elected.add(
                    List.copyOf(
                            candidates
                    )
            );
            return;
        }
        for (int j = index; j < word.length(); j++) {
            if (isPalindrome(
                    word,
                    index,
                    j
            )){
                candidates.push(
                        word.substring(
                                index,
                                j +1
                        )
                );
                dfs(
                        j +1,
                        word,
                        elected,
                        candidates
                );
            }
        }
    }

    private boolean isPalindrome(
            String word,
            int left,
            int right
    ) {
        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
