package datastructures;

public class MaxHeapDemo {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(20);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(15);
        maxHeap.insert(9);
        maxHeap.insert(25);
        maxHeap.insert(50);
        maxHeap.insert(100);
        maxHeap.insert(58);
        maxHeap.insert(45);
        maxHeap.insert(70);
        maxHeap.display();
        maxHeap.extractMax();
        maxHeap.display();
        maxHeap.extractMax();
        maxHeap.display();
    }
}
