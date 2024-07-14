package io.mercury;

public class TwoSum2InputArrayIsSorted {

    public int[] solutionOne(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum > target)
                right--;
            else if (sum < target)
                left++;
            else
                return new int[]{left + 1, right + 1};
        }
        return new int[]{};
    }
}
