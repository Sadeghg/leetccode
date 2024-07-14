package io.mercury.tree.trie;

import java.util.*;

public class Main {
    public static void main(String[] args) {



        char[] nums = {'A','A','A', 'B','B','B'};
        System.out.println(leastInterval(nums, 3));



    }

    public static int leastInterval(char[] tasks, int n) {

        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Pair> queue = new LinkedList<>();
        Map<Character, Integer> counts = new HashMap<>();

        for(char character: tasks){
            int count = counts.getOrDefault(character, 0) +1;
            counts.put(character ,count);
        }

        for (Character key: counts.keySet())
            maxHeap.add(counts.get(key));

        int time = 0;
        while (!maxHeap.isEmpty() || !queue.isEmpty()){
            time ++;
            if (!maxHeap.isEmpty()){
                int count = maxHeap.poll() -1;
                if (count != 0)
                    queue.add(Pair.of(count, time +n));
            }
            if (!queue.isEmpty() && queue.peek().timestamp == time){
                int count = queue.poll().count;
                maxHeap.add(count);
            }
        }
        return time;
    }

    public static class Pair{
        public Integer count;
        public Integer timestamp;

        private Pair(Integer count, Integer timestamp) {
            this.count = count;
            this.timestamp = timestamp;
        }

        public static Pair of(Integer count, Integer timestamp){
            return new Pair(count, timestamp);
        }
    }
}
