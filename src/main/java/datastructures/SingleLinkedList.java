package datastructures;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SingleLinkedList {

    private Node head;
    private Node tail;

private static final Logger LOGGER = Logger.getLogger(SingleLinkedList.class.getName());

    public void append(int item){
        //  Create a new node
        Node node = new Node(item, null);

        //  Set first node to head and tail
        if(head == null){
            this.setHead(node);
            this.setTail(node);
            return;
        }

        // Insert at end
        tail.setNext(node);
        tail = node;
    }

    public void insertAtBeginning(int item){
        // Create a new node
        Node node = new Node(item, null);

        // Set first node to head and tail
        if(head == null){
            this.setHead(node);
            this.setTail(node);
        }

        // Insert at beginning
        node.setNext(head);
        head = node;
    }


    public void traverse(){
        if(head == null)
            LOGGER.info("Singly Linked list is empty.");
        else {
            Node pointer = head;
            do{
                LOGGER.log(Level.INFO, "Item: {0}",pointer.getItem());
                pointer = pointer.getNext();
            }while(pointer.getNext() != null);
        }

    }




    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node search(int item){
        if(head == null)
            return null;

        Node pointer = head;
        do{
            if(pointer.getItem() == item)
                return pointer;
            pointer = pointer.getNext();
        }while(pointer.getNext() != null);

        return null;
    }


}

class Node {
    private int item;
    private Node next;

    Node(int item, Node next){
        this.item = item;
        this.next = next;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
