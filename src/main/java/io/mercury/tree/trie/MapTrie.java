package io.mercury.tree.trie;

import java.util.HashMap;
import java.util.Map;

public class MapTrie {

    private Node root;
    public MapTrie(){
        root = new Node();
    }

    private static class Node{
        private final Map<Character, Node> subTree;
        private boolean isWord;

        private Node(){
            this(false);
        }

        private Node(boolean isWord) {
            this.subTree = new HashMap<>(26);
            this.isWord = isWord;
        }
    }

    public void insert(String word){
        Node current = root;
        for(int index = 0; index < word.length(); index ++){
            Character character = word.charAt(index);
            if (!current.subTree.containsKey(character))
                current.subTree.put(character, new Node());
            current = current.subTree.get(character);
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
            Character character = word.charAt(index);
            if (!current.subTree.containsKey(character))
                return null;
            current = current.subTree.get(character);
        }
        return current;
    }
}
