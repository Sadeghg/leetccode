package io.mercury.tree.trie;

public class ArrayTrie {

    private Node root;

    private static class Node{
        private final Node[] subTree;
        private final char character;
        private boolean isWord;

        private Node(char character) {
            this(character, false);
        }

        private Node(char character, boolean isWord) {
            this.character = character;
            this.isWord = isWord;
            this.subTree = new Node[26];
        }
    }

    public ArrayTrie() {
        root = new Node('\0');
    }

    public void insert(String word) {
        Node current = root;
        for (int index = 0; index < word.length(); index ++){
            char character = word.charAt(index);
            if (current.subTree[character - 'a'] == null)
                current.subTree[character - 'a'] = new Node(character);
            current = current.subTree[character - 'a'];
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        Node node = getNode(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }

    private Node getNode(String word){
        Node current = root;
        for (int index = 0; index < word.length(); index ++){
            char character = word.charAt(index);
            if (current.subTree[character - 'a'] == null)
                return null;
            current = current.subTree[character - 'a'];
        }
        return current;
    }

    public boolean searchWith(String word){
        return getNode(0, word, root);
    }

    private boolean getNode(int from, String word, Node root){
        for (int index = from; index < word.length(); index ++){
            char character = word.charAt(index);
            if (character == '.'){
                for (Node node: root.subTree){
                    if (node != null && getNode(index +1, word, node))
                        return true;
                }
                return false;
            }else {
                if (root.subTree[character - 'a'] != null)
                    root = root.subTree[character - 'a'];
                else
                    return false;
            }
        }

        return root.isWord;
    }
}
