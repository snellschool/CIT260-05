/* Snell, Dallin
 * 12 JUN 18
 */
package byui.cit260.view;

import java.util.Scanner;

/**
 *
 * @author Dallin
 */
public class GameMenuView {
    private static String [] input = new String[1];
    
    /**
     * default constructor for GameMenuView class
     */
    public GameMenuView() {
        
    }

    /**
     * 
     */
    void displayGameMenuView() {
        boolean endView = false;

        do {
            input = getInputs();
            if(input[0].equals(null) || input[0].toUpperCase().equals("Q"))
                    return;
            endView = doAction(input);
        } while(!endView);
    } // end of displayGameMenuView()

    /**
     * 
     * @return 
     */
    String [] getInputs() {
        boolean valid = false;
        String [] retval = { null };
        Scanner keyboard = new Scanner(System.in);

        System.out.println("I - View Inventory\n"
                        + "M = View Map\n"
                        + "S = Save current game\n"
                        + "Q = Quit current game\n\n");
        do {
            System.out.print("Enter menu selection > ");    // prompt user for input
            input[0] = keyboard.nextLine().trim();          // receive input from user
            
            if(input[0].length() < 1) {                     // if user does not enter anything
                System.out.println("Error! You must enter a non-zero entry!");
            } else {                                        // else, process input
                retval[0] = input[0];                       // stores input in return value
                valid = true;                               // ends loop
            } // end of conditional
        } while(!valid);

        System.out.println("getInputs() from GameMenuView called.");//debugging

        return retval;
    } // end of getInputs()

    /**
     * 
     * @param input input received from the user
     * @return 
     */
    boolean doAction(String [] input) {
        char menuItem = input[0].toUpperCase().charAt(0);
        InventoryView inventory = new InventoryView();
        MapView map = new MapView();
        
        // TODO: save the game when menu item is selected
        
        switch(menuItem) {
            case 'I': inventory.displayInventory();     break;  // display the inventory
            case 'M': map.displayMap();                 break;  // display the map
            case 'S': System.out.println("TODO: save game"); break;//debugging
            case 'Q': return true;                              // quit the view
            default: System.out.println("Invalid menu item.");  // error message
        } // end of switch

        return false;
    }
}
