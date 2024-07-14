package io.mercury.heap;

import java.util.*;

public class ClosestPointsToOrigin {

    private static class Node implements Comparable<Node> {
        private final int x;
        private final int y;

        private Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int x() {
            return x;
        }

        public int y() {
            return y;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(other.distance(), this.distance());
        }

        private int distance() {
            return this.x ^ 2 + this.y ^ 2;
        }
    }


    public int[][] kClosest(int[][] points, int k) {

        Queue<Node> queue = new PriorityQueue<>();
        for (int[] point : points) {
            int distance = (point[0] ^ 2) + (point[1] ^ 2);
            Node pointInfo = new Node(point[0], point[1]);
            if (queue.size() < k)
                queue.add(pointInfo);
            else if (queue.peek().distance() > distance) {
                queue.poll();
                queue.add(pointInfo);
            }
        }
        int[][] closestKElements = new int[k][2];
        for (int index = 0; index < k; index++) {
            Node pointInfo = queue.poll();
            closestKElements[index] = new int[]{pointInfo.x, pointInfo.y};
        }
        return closestKElements;
    }


}
