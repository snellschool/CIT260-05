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
        System.out.println("riddleMathFirst");
        int choiceOne = 1;
        int choiceTwo = 3;
        int expResult = 1;
        int result = riddleControl.riddleMathFirst(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // second test
        System.out.println("riddleMathFirst");
        choiceOne = 0;
        choiceTwo = 1;
        expResult = -1;
        result = riddleControl.riddleMathFirst(choiceOne, choiceTwo);
        assertEquals(expResult, result);
        
        // third test
        System.out.println("riddleMathFirst");
        choiceOne = 5;
        choiceTwo = 2;
        expResult = -1;
        result = riddleControl.riddleMathFirst(choiceOne, choiceTwo);
        assertEquals(expResult, result);
    } // end of testRiddleMathFirst()
} // end of class riddleControlTest
