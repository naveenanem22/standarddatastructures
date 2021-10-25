package datastructures;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StackTest {

   @Test
    void pushTest(){
       Stack stack = new Stack();
       stack.push(10);
       stack.push(20);
       assertEquals(2, stack.getPointer());
   }

}
