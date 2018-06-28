/* Snell, Dallin
** CIT260.05
*/


package byui.cit260.control;

import byui.cit260.model.Actor;
import byui.cit260.model.Game;
import byui.cit260.model.InventoryItem;
import byui.cit260.model.ItemType;
import byui.cit260.model.Location;
import byui.cit260.model.Map;
import byui.cit260.model.Player;
import spyroknockoff.SpyroKnockoff;

/**
 *
 * @author Dallin
 */
public class GameControl {
    /**
     * The amount of gems to create later.
     */
    private static final int GEMSTOCREATE = 100;
    /**
     * The amount of relics to create later.
     */
    private static final int RELICSTOCREATE = 10;
    
    public static int createNewGame(Player player) {
        /**
         * The game object.
         */
        Game game = new Game();
        /**
         * The map object.
         */
        Map map = new Map();
        /**
         * All items that will be in the game.
         */
        InventoryItem [] items = createItems();
        /**
         * number of rows for Map
         */
        int noOfRows = 0;
        /**
         * number of columns for Map
         */
        int noOfCols = 0;

        if(player == null)
            return -1; // failure

        SpyroKnockoff.setCurrentGame(game);
        game.setInventory(items);
        map = MapControl.createMap(noOfRows, noOfCols, items);
        if(map == null)
            return -1; // failure
        game.setMap(map);
// TODO: Save a reference to the Player object in the game (?)
        return 1; // success!
    } // end of createNewGame()

    
    public static Player savePlayer(String name) {
        if(name.equals(null) || name.length() < 1) {
            return null;
        }

        Player player = new Player();
        player.setPlayerName(name);
        SpyroKnockoff.setPlayer(player);

        return player;
    } // end of savePlayer()

    /* I'm pretty sure we don't use actors in our game, but I'll keep it only
    ** commented out--just in case.
    */
    public static Actor [] createActors() {
        /**
         * 
         */
        Actor [] actors = null;
        /**
         * 
         */
        Actor actor1 = new Actor();
        /**
         * counter for Actor array
         */
        short count = 0;

        actor1.setCurrLoc(new Location(0, 0));          // add actor's current location
        actor1.setPrevLoc(new Location(0, 0));          // add actor's previous location

        actors[count] = actor1;                         // add Actor to actor array

        return actors;
    } // end of createActors()

    /**
     * 
     * @return the array of InventoryItems
     */
    public static InventoryItem [] createItems() {
        // array holding all Inventory Items in game
        InventoryItem[] items = new InventoryItem[25];
        // the first item (gems)
        InventoryItem item1 = new InventoryItem(GEMSTOCREATE, "gems", "All gems located within the game.");
        items[ItemType.gems.ordinal()] = item1;       // add first item to array
        // the second item (relics)
        InventoryItem item2 = new InventoryItem(RELICSTOCREATE, "relics", "All relics located within the game.");
        items[ItemType.relics.ordinal()] = item2;     // add second item to array

        return items;
    } // end of createItems
} // end of class GameControl
