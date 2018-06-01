/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dallin
 */
public class riddleControlTest {
    
    public riddleControlTest() {
    }

    /**
     * Test of riddleMathFirst method, of class riddleControl.
     */
    @Test
    public void testRiddleMathFirst() {
        //first test
        System.out.println("riddleMathFirst-1");
        int choiceOne = 1;
        int choiceTwo = 3;
        int expResult = 1;
        int result = riddleControl.riddleMathFirst(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // second test
        System.out.println("riddleMathFirst-2");
        choiceOne = 0;
        choiceTwo = 1;
        expResult = -1;
        result = riddleControl.riddleMathFirst(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // third test
        System.out.println("riddleMathFirst-3");
        choiceOne = 5;
        choiceTwo = 2;
        expResult = -1;
        result = riddleControl.riddleMathFirst(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // fourth test
        System.out.println("riddleMathFirst-4");
        choiceOne = 4;
        choiceTwo = 0;
        expResult = -1;
        result = riddleControl.riddleMathFirst(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // fifth test
        System.out.println("riddleMathFirst-5");
        choiceOne = 1;
        choiceTwo = 4;
        expResult = 0;
        result = riddleControl.riddleMathFirst(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // sixth test
        System.out.println("riddleMathFirst-6");
        choiceOne = 4;
        choiceTwo = 1;
        expResult = 0;
        result = riddleControl.riddleMathFirst(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // seventh test
        System.out.println("riddleMathFirst-7");
        choiceOne = 4;
        choiceTwo = 4;
        expResult = 0;
        result = riddleControl.riddleMathFirst(choiceOne, choiceTwo);
        assertEquals(expResult, result);
    } // end of testRiddleMathFirst()

    /**
     * Test of riddleMathSecond method, of class riddleControl.
     */
    @Test
    public void testRiddleMathSecond() {
        System.out.println("riddleMathSecond-1");
        int choiceOne = 0;
        int choiceTwo = 0;
        int expResult = 0;
        int result = riddleControl.riddleMathSecond(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of riddleMathThird method, of class riddleControl.
     */
    @Test
    public void testRiddleMathThird() {
        //first test
        System.out.println("riddleMathThird-1");
        int choiceOne = 2;
        int choiceTwo = 3;
        int expResult = 1;
        int result = riddleControl.riddleMathThird(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // second test
        System.out.println("riddleMathThird-2");
        choiceOne = 0;
        choiceTwo = 1;
        expResult = -1;
        result = riddleControl.riddleMathThird(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // third test
        System.out.println("riddleMathThird-3");
        choiceOne = 5;
        choiceTwo = 2;
        expResult = -1;
        result = riddleControl.riddleMathThird(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // fourth test
        System.out.println("riddleMathThird-4");
        choiceOne = 4;
        choiceTwo = 0;
        expResult = -1;
        result = riddleControl.riddleMathThird(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // fifth test
        System.out.println("riddleMathThird-5");
        choiceOne = 1;
        choiceTwo = 4;
        expResult = 0;
        result = riddleControl.riddleMathThird(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // sixth test
        System.out.println("riddleMathThird-6");
        choiceOne = 4;
        choiceTwo = 1;
        expResult = 0;
        result = riddleControl.riddleMathThird(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // seventh test
        System.out.println("riddleMathThird-7");
        choiceOne = 4;
        choiceTwo = 4;
        expResult = 0;
        result = riddleControl.riddleMathThird(choiceOne, choiceTwo);
        assertEquals(expResult, result);
    } // end of riddleMathThird()
} // end of class riddleControlTest
