package datastructures;


import java.util.logging.Logger;

public class Queue {
    private int[] data = new int[10];
    private int qFront = -1;
    private int qBack = -1;
    public static final Logger LOGGER = Logger.getLogger(Queue.class.getName());

    public void enqueue(int item) {
        if (qBack == -1 && qFront == -1) {
            qBack++;
            qFront++;
            data[qFront] = item;
        } else {
            qBack++;
            data[qBack] = item;
        }


    }

    public void dequeue() {
        if (qBack == -1 && qFront == -1) {
            LOGGER.info("Queue is empty");
        } else {
            data[qFront] = 0;
            qFront++;
        }
    }

    public void display() {
        for (int item : data) {
            LOGGER.info(String.valueOf(item));
        }
    }
}
