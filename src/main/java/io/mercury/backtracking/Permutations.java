package io.mercury.backtracking;

import java.util.*;
import java.util.stream.Collectors;

public class Permutations {

    public static void main(String[] args) {
       List<List<Integer>> variantOne = permutations(List.of(1, 2, 3, 4));
       List<List<Integer>> variantTwo = permutationsVariants(List.of(1, 2, 3, 4));
        System.out.println(variantOne.equals(variantTwo));
        System.out.println("halt");
    }

    public static List<List<Integer>> permutations(List<Integer> numbers){
        return helper(0, numbers);
    }



    private static List<List<Integer>> helper(
            int index,
            List<Integer> numbers
    ){

        if (index == numbers.size()){
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>());
            return list;
        }

        List<List<Integer>> permutations = new ArrayList<>();
        List<List<Integer>> current = helper(index +1, numbers);

        for (List<Integer> permutation: current){
            for (int j = 0; j <= permutation.size(); j ++){
                List<Integer> copy = new ArrayList<>(permutation);
                copy.add(j, numbers.get(index));
                permutations.add(copy);
            }
        }
        return permutations;
    }

    public static List<List<Integer>> permutationsVariants(List<Integer> numbers){
        List<List<Integer>> permutations = new ArrayList<>();
        permutations.add(new ArrayList<>());

        for (Integer number: numbers){
            List<List<Integer>> current = new ArrayList<>();

            for (List<Integer> permutation: permutations){
                for(int j= 0; j <= permutation.size(); j ++){
                    List<Integer> copy = new ArrayList<>(permutation);
                    copy.add(j, number);
                    current.add(copy);
                }
            }
            permutations = current;
        }
        return permutations;
    }




    private static List<Integer> fill(int[]nums){
        List<Integer> numbers = new ArrayList<>();
        for (Integer num: nums){
            numbers.add(num);
        }
        return numbers;
    }
}
