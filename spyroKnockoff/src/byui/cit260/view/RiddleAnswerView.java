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
class RiddleAnswerView {
    private static String [] input = { null };
    
     /**
     * default constructor for the RiddleAnswerView class
     */
    public RiddleAnswerView() {
        
    }

    /**
     * 
     */
    public void displayRiddleAnswerView() {
        boolean endOfView = false;

        do {
            input = getInputs();
            if(input[0].equals(null) || input[0].toUpperCase().equals("Q"))
                return;
            endOfView = doAction();
        } while(!endOfView);
        
        System.out.println(input[0]);//debugging
    } // end of displayRiddleAnswerView()

    /**
     * 
     * @return 
     */
    private String [] getInputs() {
        boolean valid = false;
        String [] retval = { null };
        Scanner keyboard = new Scanner(System.in);

        while(!valid) {
            System.out.print("Which riddle do you want to buy the answer to? Please enter a selection from the list:\n"
                            + "A\n"
                            + "B\n"
                            + "C\n"
                            + "E - Exit");
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
            case 'A': riddleAnswerA();
                break;
            case 'B': riddleAnswerB();
                break;
            case 'C': riddleAnswerC();
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
    private void riddleAnswerA() {
        System.out.println("The letter 'R'.");
    }

    /**
     * 
     */
    private void riddleAnswerB() {
        System.out.println("Four sisters and three brothers.");
    }

    /**
     * 
     */
    private void riddleAnswerC() {
        System.out.println("A keyboard.");
    }
} // end of class RiddleAnswerView
