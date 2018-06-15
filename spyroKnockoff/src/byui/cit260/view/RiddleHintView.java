/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author megnol
 */
public class RiddleHintView {
     private static String [] input = { null };

    /**
     * default constructor for the HelpMenuView class
     */
    public RiddleHintView() {
        
    }

    /**
     * 
     */
    public void displayRiddleHintView() {
        boolean endOfView = false;

        do {
            input = getInputs();
            if(input[0].equals(null) || input[0].toUpperCase().equals("Q"))
                return;
            endOfView = doAction();
        } while(!endOfView);
        
        System.out.println(input[0]);//debugging
    } // end of displayRiddleHintView()

    /**
     * 
     * @return 
     */
    private String [] getInputs() {
        boolean valid = false;
        String [] retval = { null };
        Scanner keyboard = new Scanner(System.in);

        while(!valid) {
            System.out.print("Which riddle do you need help with? Please enter a selection from the list:\n"
                            + "A\n"
                            + "B\n"
                            + "C\n"
                            );
            input[0] = keyboard.nextLine().trim();      // receive input from user
            
            if(input[0].length() < 1) {                 // if user does not enter anything
                System.out.println("Error! You must enter a non-zero entry!");
                continue;                               // breaks out of loop and resets at prompt
            } // end of conditional

            retval[0] = input[0];                       // stores input in return value
            valid = true;                               // ends loop
        } // end of while loop
        
        System.out.println("\"" + input[0] + "\"");//debugging

        System.out.println("getInputs() called.");

        return retval;
    } // end of getInputs()

    /**
     * 
     * @return 
     */
    boolean doAction() {
       System.out.println("doAction() called.");//debugging
        
       char menuItem = input[0].toUpperCase().charAt(0);  // convert to char and upper case
        switch (menuItem) {
            case 'A': howToMove();
                break;
            case 'B': viewInventory();
                break;
            case 'C': viewRiddleHint();
                break;
            case 'E': exit();
                break;
            default: System.out.print("Invalid menu item.");
        } // end of switch
        return false; 
    } // end of doAction()

    /**
     * 
     */
    private void howToMove() {
        System.out.println("HOW TO MOVE:\nEnter the character from the list for the direction you want to go - either N, S, E, or W.");
    }

    /**
     * 
     */
    private void viewInventory() {
        System.out.println("viewInventory() is called");
    }

    /**
     * 
     */
    private void viewRiddleHint() {
        System.out.println("viewRiddleHint() is called");
    }
} // end of class RiddleHintView
