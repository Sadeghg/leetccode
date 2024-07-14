package io.mercury;

import java.util.*;

public class GroupAnagram {   // 96 - 96 = 0

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s:  strs) {
            int[] alphabet = new int[26];
            for (int index = 0; index < s.length(); index++)
                alphabet[s.charAt(index) - 'a']++;

            String key = Arrays.toString(alphabet);
            if (map.containsKey(key)) {
                List<String> childs = new ArrayList<>(map.get(key));
                childs.add(s);
                map.put(key, childs);
            } else {
                map.put(key, List.of(s));
            }
        }

        return map.values().stream().toList();
    }

    }
