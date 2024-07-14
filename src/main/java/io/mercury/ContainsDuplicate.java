package io.mercury;

import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int []arr = {1, 2 ,3, 4, 5, 1, 7};

        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        

        Map<Integer, Boolean> occurrence = new HashMap<>();
        for(int num: nums){
            if(occurrence.containsKey(num))
                return true;
            occurrence.put(num, true);
        }
        return false;
    }
}
