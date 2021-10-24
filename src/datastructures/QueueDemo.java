package datastructures;

public class QueueDemo {
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(50);
        queue.enqueue(40);
        queue.dequeue();
        queue.dequeue();

        queue.display();


    }
}
