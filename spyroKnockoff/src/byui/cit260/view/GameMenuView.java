/* Snell, Dallin
 * 12 JUN 18
 * CIT260.05
 */


package byui.cit260.view;

import byui.cit260.model.Game;
import byui.cit260.model.Location;
import byui.cit260.model.Map;
import spyroknockoff.SpyroKnockoff;

/**
 *
 * @author Dallin
 */
public abstract class GameMenuView extends View {
    /**
     * receives inputs from the user
     */
    private static String [] input = new String[1];
    
    /**
     * default constructor for GameMenuView class
     */
    public GameMenuView() {
        
    } // end of default constructor for GameMenuView class

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
            case 'I': inventory.displayInventory();     break;      // display the inventory
            case 'M': displayMap();                     break;      // display the map
            case 'S': System.out.println("TODO: save game"); break;//debugging
            case 'Q': return true;                                  // quit the view
            default: System.out.println("Invalid menu item.");      // error message
        } // end of switch

        return false;
    } // end of doAction()

    /**
     * 
     */
    private void displayMap() {
        Game currGame = SpyroKnockoff.getCurrentGame();
        Map mapObj = currGame.getMap();                         // get current game Map object
        Location[][] locs = mapObj.getLocs();                   // gets the locations from the map object
        Location here = null;                                   // used in for loops

        System.out.println("Spyro Knockoff");                   // title
        System.out.println("|1\t|2\t|3\t|4\t5|");               // column numbers/dividers
    //for every row in map
        // https://onlinegdb.com/Sk2ONs0G7
        // this works given it isn't a variable length array; see above link for example
        for(int r = 0; r < locs.length; ++r) {
            // this might have to be longer or short depending on how it looks when finished
            System.out.println("----------------------------"); // row divider
            System.out.print(r);                                // row number
            // this works given it isn't a variable length array
            for(int c = 0; c < locs[0].length; ++c) {
                System.out.print("|");                          // column divider
                here = locs[r][c];                              // get location from map
                if(here.hasVisited())                           // checks if user has visited here
                    here.getSymbol();                           // gets the symbol associated with here
                else                                            // if user has not visited here...
                    System.out.print("??");                     // print unknown
                // end of visited conditional
            } // end of column for loop
            System.out.print("|");                              // ending column divider?
        } // end of row for loop
        System.out.println("----------------------------");     // row divider
    } // end of displayMap()
} // end of GameMenuView class
