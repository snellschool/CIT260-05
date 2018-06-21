/* 12 JUN 18
 */
package byui.cit260.view;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author megnol
 */
public abstract class HelpMenuView extends View {
    private static String [] input = { null };

    /**
     * default constructor for the HelpMenuView class
     */
    public HelpMenuView() {
        
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String [] getInputs() {
        String [] retval = { null };

        retval[0] = this.getInput("Please enter a selection from the list:\n"
                            + "M - Move\n"
                            + "I - View Inventory\n"
                            + "R - Riddle/math hints\n"
                            + "E - Exit\n");

        return retval;
    } // end of getInputs()

    /**
     * 
     * @return 
     */
    boolean doAction() {
        
       char menuItem = input[0].toUpperCase().charAt(0);  // convert to char and upper case
        switch (menuItem) {
            case 'M': howToMove();
                break;
            case 'I': viewInventory();
                break;
            case 'R': viewRiddleHint();
                break;
            case 'E': exit();
                break;
            default: System.out.print("Invalid menu item.");
        } // ENDSWITCH
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
} // end of class HelpMenuView
