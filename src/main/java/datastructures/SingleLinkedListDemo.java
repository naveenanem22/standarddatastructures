package datastructures;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SingleLinkedListDemo {
    private static final Logger LOGGER = Logger.getLogger(SingleLinkedListDemo.class.getName());
    public static void main(String[] args){

        SingleLinkedList sll = new SingleLinkedList();
        sll.append(10);
        sll.append(20);
        sll.append(30);
        sll.insertAtBeginning(35);
        sll.append(40);
        sll.append(50);
        sll.insertAtBeginning(5);
        sll.insertAtBeginning(25);
        sll.traverse();
        Node result = sll.search(20);
        LOGGER.log(Level.INFO,"Result: {0}", result != null ? Integer.toString(result.getItem()) : "Not found");
    }
}
