package datastructures;

public class StackDemo {


    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(20);
        stack.display();
    }
}
