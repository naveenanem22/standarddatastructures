package datastructures;

public class MaxHeap {
    private int[] data;
    private int nextAvailableSpot;

    MaxHeap(int size) {
        data = new int[size];
    }

    public void upHeapify(int i) {

        if (i != 0 && data[i] > data[(i - 1) / 2]) {
            int temp = data[i];
            data[i] = data[(i - 1) / 2];
            data[(i - 1) / 2] = temp;

            upHeapify((i - 1) / 2);
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

    public void display() {
        for (int i = 0; i <= nextAvailableSpot; i++) {
            System.out.println(data[i]);
        }
    }

    public int getMaxIndex(int index1, int index2) {
        return data[index2] > data[index1] ? index2 : index1;
    }

    public void downHeapify(int i) {
        int maxChildIndex = 0;

        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;

        if (rightIndex < nextAvailableSpot)
            maxChildIndex = getMaxIndex(leftIndex, rightIndex);
        else if (leftIndex < nextAvailableSpot)
            maxChildIndex = leftIndex;
        else
            return;

        if (data[i] < data[maxChildIndex]) {
            int temp = data[i];
            data[i] = data[maxChildIndex];
            data[maxChildIndex] = temp;
            downHeapify(maxChildIndex);
        }

    }

    public void extractMax() {
        int extractedMax = data[0];
        data[0] = data[nextAvailableSpot - 1];
        data[nextAvailableSpot - 1] = 0;
        nextAvailableSpot--;
        downHeapify(0);
        System.out.println("Extracted max: " + extractedMax);
    }
}
