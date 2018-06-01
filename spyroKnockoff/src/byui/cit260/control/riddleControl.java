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
    /**
     * 
     * @param choiceOne
     * @param choiceTwo
     * @return error or success code
     */
    public static int riddleMathFirst(int choiceOne, int choiceTwo) {
        int xVal = 0;
        int yVal = 0;
        
        if((choiceOne <= 0 || choiceOne >= 5) || (choiceTwo <= 0 || choiceTwo >= 5))
            return -1; // if the user entered invalid choices
        
        switch(choiceOne) {
            case 1: xVal = 3;
                break;
            case 2: xVal = 7;
                break;
            case 3: xVal = 28;
                break;
            case 4: xVal = 42;
                break;
        }

        switch(choiceTwo) {
            case 1: yVal = 42;
                break;
            case 2: yVal = 0;
                break;
            case 3: yVal = -5;
                break;
            case 4: yVal = 5;
                break;
        }

    return (((5 * xVal) + (3 * yVal) - 7) == (-7)) ? 1 : 0;
    } // end of riddleMathFirst()
    
    /**
     * 
     * @author megnol
     * 
     * @param choiceOne
     * @param choiceTwo
     * @return error or success code
     */
    public static int riddleMathSecond(int choiceOne, int choiceTwo) {
        int xVal = 0;
        int yVal = 0;
        
        if ((choiceOne <= 0 || choiceOne >= 5) || (choiceTwo <= 0 || choiceTwo >= 5))
            return -1; //if the user entered invalid choices
        
        switch(choiceOne) {
            case 1: xVal = 3;
                break;
            case 2: xVal = 7;
                break;
            case 3: xVal = 0;
                break;
            case 4: xVal = -2;
                break;
            }

	switch(choiceTwo) {
            case 1: yVal = -8;
                break;
            case 2: yVal = 2;
                break;
            case 3: yVal = 10;
                break;
            case 4: yVal = -5;
                break;
            }
	
        return (((3 * xVal) - (5 * yVal) + 2) == (-8)) ? 1 : 0;
	
    } // end of riddleMathSecond ()
    
    /**
     * 
     * @param choiceOne
     * @param choiceTwo
     * @return error or success code
     */
    public static int riddleMathThird(int choiceOne, int choiceTwo) {
        int xVal = 0;
        int yVal = 0;
        
        if((choiceOne <= 0 || choiceOne >= 5) || (choiceTwo <= 0 || choiceTwo >= 5))
            return -1; // if the user entered invalid choices
        
            switch(choiceOne) {
                case 1: xVal = 30;
                    break;
                case 2: xVal = 3;
                    break;
                case 3: xVal = 2;
                    break;
                case 4: xVal = 42;
                    break;
            }

            switch(choiceTwo) {
                case 1: yVal = 0;
                    break;
                case 2: yVal = 42;
                    break;
                case 3: yVal = -9;
                    break;
                case 4: yVal = -7;
                    break;
            }

    return ((7 * xVal) + (5 * yVal) + 24 == 0) ? 1 : 0;
    } // end of riddleMathThird()
} // end of class RiddleControl
