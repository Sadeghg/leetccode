package io.mercury.tree.variantOne;

import io.mercury.tree.common.TreeNode;

public class BinarySearchTree {

    public Node root;

    public static class Node {

        Node left;
        Node right;

        Integer value;

        Node(Integer value) {
            this.value = value;
        }
    }

    public BinarySearchTree(Integer value) {
        this.root = new Node(value);
    }
    public BinarySearchTree() {
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(Integer value) {
        Node node = new Node(value);
        if (root == null)
            root = node;
        else
            insertToNode(root, value);
    }

    public void insertToNode(Node node, Integer value) {
        if (node.value < value)
            if (node.right != null)
                insertToNode(node.right, value);
            else
                node.right = new Node(value);

        else if (node.value > value)
            if (node.left != null)
                insertToNode(node.left, value);
            else
                node.left = new Node(value);
    }

    public Node RInsertToNode(Node node, Integer value) {
        if (node == null) return new Node(value);

        if (value < node.value)
            node.left = RInsertToNode(node.left, value);
        else if (value > node.value)
            node.right = RInsertToNode(node.right, value);

        return node;
    }

    public void RInsertToNode(Integer value) {
        if (root == null) root = new Node(value);
        RInsertToNode(root, value);
    }

    public boolean contains(Integer value) {
        return contains(root, value);
    }

    public boolean contains(Node node, Integer value) {
        if (node == null) return false;
        int compare = value.compareTo(node.value);
        if (compare < 0)
            return contains(node.left, value);
        else if (compare > 0)
            return contains(node.right, value);
        else
            return true;
    }

    public Node get(Integer value) {
        return get(root, value);
    }

    public Node get(Node node, Integer value) {
        if (node == null) return null;
        int compare = value.compareTo(node.value);
        if (compare < 0)
            return get(node.left, value);
        else if (compare > 0)
            return get(node.right, value);
        else
            return node;
    }

    public void removeTried(Integer value) {
        Node node = get(value);
        if (node == null)
            return;

        if (node.left == null && node.right == null)
            node = null;
        else if (node.left != null && node.right == null)
            node = node.left;
        else if (node.left == null)
            node = node.right;
        else {
            Node currentNode = node.right;
            if (currentNode.left != null)
                while (currentNode.left != null)
                    currentNode = currentNode.left;

            node.value = currentNode.value;
            currentNode = currentNode.right;
            System.out.println(currentNode);
        }
    }

    public Node remove(Integer value){
        return remove(root, value);
    }

    private Node remove(Node node, Integer value){
        if (node == null)
            return null;

        if (node.value > value)
            node.left = remove(node.left, value);
        else if (node.value < value)
            node.right = remove(node.right, value);
        else {
            if (node.right == null)
                return node.left;
            if (node.left == null)
                return node.right;

            Node current = node.right;
            while (current.left != null)
                current = current.left;

            node.value = current.value;
            node.right = remove(node.right, node.value);
        }
        return node;
    }


    public void traverse() {
        traverse(root);
    }

    public void traverse(Node node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        traverse(node.right);
        traverse(node.left);
    }


    public int max() {
        return max(0, root);
    }

    public int max(int count, Node node) {
        if (node == null)
            return count;
        count ++;
        int val = node.value;
        int leftCount = max(count, node.right);
        int rightCount = max(count, node.left);
        return Math.max(leftCount, rightCount);
    }

    private static final int COUNT  = 7;
    private void print2DUtil(Node root, int space)
    {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.value + "\n");

        print2DUtil(root.left, space);
    }

    public void print2D()
    {
        print2DUtil(root, 0);
    }

    public void invertTree(){
        invertTree(root);
    }
    private void invertTree(Node node) {
        if (node == null)
            return;
        Node left = node.left;
        Node right = node.right;
        invertTree(node.right);
        invertTree(node.left);
        node.left = right;
        node.right = left;
    }

    public int kthSmallest(TreeNode root, int k){
        if(root == null) return 1;

        int left = kthSmallest(root.left, k) +1;
        int right = kthSmallest(root.right, k) +1;
        return 0;
    }
}
