package datastructures;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Stack {
    private int[] data = new int[10];
    private int pointer;
    private static final Logger LOGGER = Logger.getLogger(Stack.class.getName());

    public void push(int item){
        data[pointer]=item;
        pointer++;
    }

    public int pop(){
        if(pointer == 0){
            LOGGER.info("Stack is empty");
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
            LOGGER.log(Level.INFO,"Item: {0}",item);
        }
    }

}
