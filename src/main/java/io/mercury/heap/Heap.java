package io.mercury.heap;


public class Heap {

    private int[] dataArr;
    private int size;
    private int maxsize;

    public Heap(int maxsize){
        this.maxsize = maxsize;
        this.size = 0;
        dataArr = new int[this.maxsize];
    }

    private int parent(int pos) { return (pos - 1) / 2; }

    private int leftChild(int pos) { return (2 * pos) + 1; }

    private int rightChild(int pos) {
        return (2 * pos) + 2;
    }

    private boolean isLeaf(int pos) {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos){
        int tmp;
        tmp = dataArr[fpos];
        dataArr[fpos] = dataArr[spos];
        dataArr[spos] = tmp;
    }

    private void maxHeapify(int pos){
        if (isLeaf(pos))
            return;

        if (dataArr[pos] < dataArr[leftChild(pos)]
                || dataArr[pos] < dataArr[rightChild(pos)]) {

            if (dataArr[leftChild(pos)]
                    > dataArr[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    public void insert(int element){
        dataArr[size] = element;

        int current = size;
        while (dataArr[current] > dataArr[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }

    public void print() {

        for (int i = 0; i < size / 2; i++) {

            System.out.print("Parent Node : " + dataArr[i]);

            if (leftChild(i) < size)
                System.out.print(" Left Child Node: "
                        + dataArr[leftChild(i)]);

            if (rightChild(i) < size)
                System.out.print(" Right Child Node: "
                        + dataArr[rightChild(i)]);

            System.out.println();
        }
    }

    public int extractMax() {
        int popped = dataArr[0];
        dataArr[0] = dataArr[--  size];
        dataArr[size] = 0;
        maxHeapify(0);
        return popped;
    }

}
