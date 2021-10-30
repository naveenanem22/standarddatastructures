package datastructures;

import junit.framework.Assert;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
class StackDemoTest {
    @Test
    void mainTest(){
        String[] emptyArray = new String[1];
        StackDemo.main(emptyArray);
        assertTrue(true);
    }
}
