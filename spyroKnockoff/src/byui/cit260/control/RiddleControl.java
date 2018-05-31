/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

/**
 *
 * @author megnol & Dallin Snell
 */
public class riddleControl {
    public static int riddleMathFirst(int choiceOne, int choiceTwo) {
        int xVal = 0;
        int yVal = 0;
        
        if((choiceOne <= 0 || choiceOne >= 5) || (choiceTwo <= 0 || choiceTwo >= 5))
            return -1; // if the user entered invalid choices
        
        //	SWITCH(choiceOne)
//		1: xVal = 3
//		2: xVal = 7
//		3: xVal = 28
//		4: xVal = 42
//
//	SWITCH(choiceTwo)
//		1: yVal = 42
//		2: yVal = 0
//		3: yVal = -5
//		4: yVal = 5
//
    return (((5 * xVal) + (3 * yVal) - 7) == (-7)) ? 1 : 0;
//END
    } // end of riddleMathFirst()
} // end of class RiddleControl
