package datastructures;

public class MinHeapDemo {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(20);
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(30);
        minHeap.insert(15);
        minHeap.insert(9);
        minHeap.insert(25);
        minHeap.insert(50);
        minHeap.insert(100);
        minHeap.insert(58);
        minHeap.insert(45);
        minHeap.insert(70);
        minHeap.display();
        minHeap.extractMin();
        minHeap.display();
        minHeap.extractMin();
        minHeap.display();
    }
}
