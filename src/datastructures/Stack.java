package datastructures;

public class Stack {
    private int[] data = new int[10];
    private int pointer;

    public void push(int item){
        data[pointer]=item;
        pointer++;
    }

    public int pop(){
        if(pointer == 0){
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            int removedItem = data[pointer-1];
            data[pointer-1] = 0;
            pointer--;
            return removedItem;
        }
    }

    public void display(){
        for(int item : data){
            System.out.println(item);
        }
    }

}
