/* Snell, Dallin
 * 12 JUN 18
 */
package byui.cit260.view;

import java.util.Scanner;

/**
 *
 * @author Dallin
 */
public abstract class GameMenuView extends View{
    private static String [] input = new String[1];
    
    /**
     * default constructor for GameMenuView class
     */
    public GameMenuView() {
        
    }

    /**
     * 
     * @return 
     */
    @Override
    public String [] getInputs() {
        String [] retval = { null };

        retval[0] = this.getInput("I - View Inventory\n"
                        + "M = View Map\n"
                        + "S = Save current game\n"
                        + "Q = Quit current game\n\n");

        return retval;
    } // end of getInputs()

    /**
     * 
     * @param input input received from the user
     * @return 
     */
    boolean doAction() {
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
