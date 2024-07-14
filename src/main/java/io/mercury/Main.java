//package io.mercury;
//
//import io.mercury.linkedlist.*;
//import io.mercury.search.KokoEatBananas;
//import io.mercury.search.SearchMatrix;
//import io.mercury.slidingwindow.CharacterReplacement;
//import io.mercury.tree.variantOne.BinarySearchTree;
//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        ContainsDuplicate main = new ContainsDuplicate();
//        int[] arr = {3, 3};
////        System.out.println(main.solutionOne(arr));
//
//
//        ValidAnagram isAnagram = new ValidAnagram();
////        System.out.println(isAnagram.solutionTwo("rhhhhht", "carhhhh"));
//
//        GroupAnagram groupAnagram = new GroupAnagram();
//        String[] s = new String[1];
//        String[] s2 = {"eat","tea","tan","ate","nat","bat"};
//        String[] s3 = {"bdddddddddd","bbbbbbbbbbc"};
//        s[0] = "";
////        System.out.println(groupAnagram.groupAnagrams(s3));
//
//        ValidParentheses validParentheses = new ValidParentheses();
//        System.out.println(validParentheses.solutionOne(")"));
//
//       ValidPalindrome validPalindrome = new ValidPalindrome();
//       String string = "A man, a plan, a canal, Panama";
//       String race = "!!!";
//       System.out.println(validPalindrome.solutionOne(race));
//
//       TwoSum2InputArrayIsSorted twoSum2InputArrayIsSorted = new TwoSum2InputArrayIsSorted();
//
//       int[] nums = new int[]{-1,0};
//       System.out.println(Arrays.toString(twoSum2InputArrayIsSorted.solutionOne(nums, -1)));
//
//       ThreeSum sum = new ThreeSum();
//       System.out.println(sum.solutionOne(new int[]{-1,0,1,2,-1,-4}));
//
//
//       BinarySearchTree binarySearchTree = new BinarySearchTree(100);
//
//       binarySearchTree.insert(100);
//
//       binarySearchTree.insert(150);
//       binarySearchTree.insert(140);
//       binarySearchTree.insert(160);
//       binarySearchTree.insert(130);
//       binarySearchTree.insert(155);
//       binarySearchTree.insert(170);
//       binarySearchTree.insert(145);
//
//        binarySearchTree.insert(50);
//        binarySearchTree.insert(40);
//        binarySearchTree.insert(60);
//        binarySearchTree.insert(30);
//        binarySearchTree.insert(55);
//        binarySearchTree.insert(56);
//        binarySearchTree.insert(57);
//        binarySearchTree.insert(58);
//        binarySearchTree.insert(70);
//        binarySearchTree.insert(45);
//
////        binarySearchTree.print2D();
//
//
////        binarySearchTree.remove(50);
//
////        binarySearchTree.print2D();
////
////        ListNode six = new ListNode(6);
////        ListNode five = new ListNode(5, six);
////        ListNode four = new ListNode(4, five);
////        ListNode three = new ListNode(3, four);
////        ListNode two = new ListNode(2, three);
////        ListNode one = new ListNode(1, two);
//
////        System.out.println(one.print());
////        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
////        ListNode reversed = reverseLinkedList.solutionOne(one);
////        ListNode reversed2 = reverseLinkedList.solutionTwo(one);
////        System.out.println("____________________");
////        System.out.println(reversed2.print());
////        System.out.println("____________________");
//
////        ListNode one = new ListNode(8);
////        ListNode six = new ListNode(6, one);
////        ListNode five = new ListNode(5, six);
////        ListNode three = new ListNode(3);
////        ListNode four = new ListNode(4, three);
////        ListNode two = new ListNode(2, four);
////
////        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
////        ListNode node = addTwoNumbers.solutionOne(five, two);
////        System.out.println("finished");
//
//
////        ListNode four2 = new ListNode(4);
////        ListNode two2 = new ListNode(2, four2);
////        ListNode one2 = new ListNode(1, two2);
////        ListNode three1 = new ListNode(3);
////        ListNode two1 = new ListNode(2, three1);
////        ListNode one1 = new ListNode(1, two1);
////
////        MergeTwoLists mergeTwoLists = new MergeTwoLists();
////        ListNode res = mergeTwoLists.solutionTwo(one1, one2);
////        System.out.println(res);
//
//
////        ListNode seven = new ListNode(7);
////        ListNode six = new ListNode(6, seven);
////        ListNode five = new ListNode(5, six);
////        ListNode four = new ListNode(4, five);
//        ListNode four = new ListNode(4);
//        ListNode three = new ListNode(3, four);
//        ListNode two = new ListNode(2, three);
//        ListNode one = new ListNode(1, two);
//
//        ReorderList reorderList = new ReorderList();
//        reorderList.reorderList(one);
//
//        int[][] matrix =  {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//        SearchMatrix searchMatrix = new SearchMatrix();
//        boolean answer = searchMatrix.solutionOne(matrix, 3);
//        System.out.println(answer);
//
//        int[] piles = {30,11,23,4,20};
//        int[] piles2 = {312884470};
//        int[] piles3 = {1,1,1,999999999};
//        KokoEatBananas kokoEatBananas = new KokoEatBananas();
////        System.out.println(kokoEatBananas.solutionOne(piles, 6));
////        System.out.println(kokoEatBananas.solutionOne(piles, 5));
//        System.out.println(kokoEatBananas.solutionOne(piles2, 312884469));
////        System.out.println(kokoEatBananas.solutionOne(piles3, 10));
//
//
//        CharacterReplacement characterReplacement = new CharacterReplacement();
//        characterReplacement.solutionOne("AABABBA",1 );
//
//
//    }
//
//
//}