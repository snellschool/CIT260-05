/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view;

import java.util.Scanner;

/**
 *
 * @author megnol
 */
public class HelpMenuView {
    private static String [] input = { null };
    
    public void displayHelpMenuView() {
        boolean endOfView = false;

        do {
            input = getInputs();
            if(input[0].equals(null) || input[0].toUpperCase().equals("Q"))
                return;
            endOfView = doAction();
        } while(!endOfView);
        
        System.out.println(input[0]);//debugging
    } // end of displayHelpMenuView()
     
    private String [] getInputs() {
        boolean valid = false;
        String [] retval = { null };
        Scanner keyboard = new Scanner(System.in);

        while(!valid) {
            System.out.print("Please enter a selection from the list:\n"
                    + "M - Move\n"
                    + "I - View Inventory\n"
                    + "R - Riddle/math hints\n"
                    + "E - Exit\n");    // prompt user for input
            input[0] = keyboard.nextLine().trim();     // receive input from user
            
            if(input[0].length() < 1) {                // if user does not enter anything
                System.out.println("Error! You must enter a non-zero entry!");
                continue;                           // breaks out of loop and resets at prompt
            } // end of conditional

            retval[0] = input[0];                      // stores input in return value
            valid = true;                              // ends loop
        } // end of while loop
        
        System.out.println("\"" + input[0] + "\"");//debugging
        
        for(int i = 0; i < 1; ++i)      // bogus code :)
            while(i < 1) {              // bogus code :)
                System.out.println("getInputs() called.");
                ++i;
            }

        return retval;
    } // end of getInputs()
    
    /**
     * 
     * @return 
     */
    boolean doAction() {
       System.out.println("doAction() called.");//debugging
        
       char menuItem = input[0].toUpperCase().charAt(0);  // convert to char and upper case
        switch (menuItem) {                               // SWITCH menuItem
            case 'M':
                break;
            case 'I':
                break;
            case 'R':
                break;
            case 'E':
                break;
            default: System.out.print("Invalid menu item.");
        } // ENDSWITCH
        return false; 
    } // end of doAction()
} // end of class HelpMenuView
