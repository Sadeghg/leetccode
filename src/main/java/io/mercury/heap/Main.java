package io.mercury.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        System.out.println("The Max Heap is ");
//
//        Heap maxHeap = new Heap(15);
//
//        maxHeap.insert(5);
//        maxHeap.insert(3);
//        maxHeap.insert(17);
//        maxHeap.insert(10);
//        maxHeap.insert(84);
//        maxHeap.insert(19);
//        maxHeap.insert(6);
//        maxHeap.insert(22);
//        maxHeap.insert(9);
//
//        maxHeap.print();
//
//        System.out.println("The max val is "
//                + maxHeap.extractMax());
//
//        System.out.println();
//        System.out.println();
//        maxHeap.print();
//
//        System.out.println("The max val is "
//                + maxHeap.extractMax());
//        System.out.println();

        ClosestPointsToOrigin closestPointsToOrigin = new ClosestPointsToOrigin();
        int [][] arr = {{3, 3,}, {5, -1}, {-2, 4}};
        int [][] points = closestPointsToOrigin.kClosest(arr, 2);

        System.out.println(points);

    }
}
