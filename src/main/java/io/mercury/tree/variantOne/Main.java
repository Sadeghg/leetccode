package io.mercury.tree.variantOne;

import io.mercury.tree.common.TreeNode;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        BinarySearchTree bst = new BinarySearchTree();
//
//        bst.insert(10);
//        bst.insert(5);
//        bst.insert(7);
//        bst.insert(2);
//        bst.insert(1);
//        bst.insert(4);
//        bst.insert(8);
//        bst.insert(15);
//        bst.insert(11);
//        bst.insert(51);
//        bst.insert(3);
//
//        bst.print2D();
//        bst.invertTree();
//
//        System.out.println("\n");
//        System.out.println("\n");
//        System.out.println("\n");
//        System.out.println("\n");
//        System.out.println("\n");
//
//        bst.print2D();
//
//        System.out.println(bst.max());
//
//        BinarySearchTree searchTree = new BinarySearchTree();
//
//        searchTree.insert(3);
//        searchTree.insert(1);
//        searchTree.insert(15);
//        searchTree.insert(20);
//        searchTree.insert(7);
//
//        System.out.println(isBalanced(searchTree.root));
//
//        searchTree.print2D();

        BinarySearchTree bst = new BinarySearchTree();


        bst.insert(50);
        bst.insert(10);
        bst.insert(9);
        bst.insert(37);
        bst.insert(36);
        bst.insert(28);
        bst.insert(27);
        bst.insert(41);
        bst.insert(21);

        bst.insert(17);
        bst.insert(18);
        bst.insert(19);

//        bst.remove(10);
        bst.remove(10);

        bst.print2D();

//        Stack<Iteger> stack = new Stack<>();
//        stack.isEmpty()





    }



    static boolean isBalanced = true;

    public static boolean isBalanced(BinarySearchTree.Node root) {
        length(0, root);
        return isBalanced;
    }

    public static int length(int length, BinarySearchTree.Node  node){
        if(node == null)
            return length;
        length ++;
        int val = node.value;
        int left = length(length, node.left);
        int right = length(length, node.right);
        if (Math.abs(left - right) > 1) isBalanced = false;

        return Math.max(left, right);
    }
}
