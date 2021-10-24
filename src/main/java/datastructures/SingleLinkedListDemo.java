package datastructures;

public class SingleLinkedListDemo {
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
        System.out.println("Search Result: "+result != null ? result.getItem(): "Not found");
    }
}
