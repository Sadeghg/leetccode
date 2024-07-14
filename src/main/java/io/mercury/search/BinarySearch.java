package io.mercury.search;

import java.util.Arrays;

public class BinarySearch {
    public int solutionOne(int[] nums, int target) {
        int right = nums.length -1;
        int left = 0;

        while (left <= right){
            int middle = (left +right) /2;
            if (target < nums[middle])
                right = middle -1;
            else if (target > nums[middle])
                left = middle +1;
            else
                return middle;
        }
        return -1;
    }
}
