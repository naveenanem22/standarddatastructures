package datastructures;

public class MinHeap {
    private int[] data;
    private int nextAvailableSpot;

    MinHeap(int size) {
        data = new int[size];
    }

    public void upHeapify(int i) {
        if (i != 0 && data[i] < data[(i - 1) / 2]) {
            int temp = data[i];
            data[i] = data[(i - 1) / 2];
            data[(i - 1) / 2] = temp;
            upHeapify((i - 1) / 2);
        }
    }

    public int getMinIndex(int index1, int index2) {
        return data[index2] < data[index1] ? index2 : index1;
    }

    public void downHeapify(int i) {
        int minChildIndex = 0;

        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;

        if (rightIndex < nextAvailableSpot)
            minChildIndex = getMinIndex(leftIndex, rightIndex);
        else if (leftIndex < nextAvailableSpot)
            minChildIndex = leftIndex;
        else
            return;

        if (data[i] > data[minChildIndex]) {
            int temp = data[i];
            data[i] = data[minChildIndex];
            data[minChildIndex] = temp;
            downHeapify(minChildIndex);
        }
    }

    public void extractMin() {
        int extractedMin = data[0];
        data[0] = data[nextAvailableSpot - 1];
        data[nextAvailableSpot - 1] = 0;
        nextAvailableSpot--;
        downHeapify(0);
        System.out.println("Extracted min: " + extractedMin);
    }

    public void display() {
        for (int i = 0; i <= nextAvailableSpot; i++) {
            System.out.println(data[i]);
        }
    }

    public void insert(int item) {
        if (nextAvailableSpot == 0) {
            data[0] = item;
        } else {
            data[nextAvailableSpot] = item;
            upHeapify(nextAvailableSpot);
        }
        nextAvailableSpot++;
    }
}
