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

   @Test
   void popTest(){
      Stack stack = new Stack();
      assertEquals(0, stack.getPointer());
      stack.push(10);
      assertEquals(10, stack.pop());
   }

   @Test
   void displayTest(){
      Stack stack = new Stack();
      stack.push(10);
      stack.push(20);
      stack.display();
   }

   @Test
   void getDataTest(){
      Stack stack = new Stack();
      assertEquals(10, stack.getData().length);
   }

}
