package io.mercury;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> solutionOne(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        for (int index = 0; index < nums.length - 1; index++) {
            if (index > 0 && (nums[index] == nums[index - 1]))
                continue;
            int left = index + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[index] + nums[left] + nums[right];
                if (sum > 0)
                    right--;
                else if (sum < 0)
                    left++;
                else {
                    results.add(List.of(nums[index], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        left--;
                    left ++;
                    right --;
                }
            }
        }
        return results;
    }
}
