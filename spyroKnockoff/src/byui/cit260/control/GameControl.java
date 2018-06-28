/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import byui.cit260.model.Actor;
import byui.cit260.model.Game;
import byui.cit260.model.InventoryItem;
import byui.cit260.model.Location;
import byui.cit260.model.Map;
import byui.cit260.model.Player;
import spyroknockoff.SpyroKnockoff;

/**
 *
 * @author megnol
 */
public class GameControl {
    public static int createNewGame(Player player) {
        /**
         * 
         */
        Game game = new Game();
        /**
         * 
         */
        Map map = new Map();
        /**
         * 
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

        System.out.println("createNewGame() of GameControl class called.");//debugging
        if(player == null)
            return -1; // failure

        SpyroKnockoff.setCurrentGame(game);
        game.setInventory(items);
        map = createMap(noOfRows, noOfCols, items);
        if(map == null)
            return -1; // failure
        game.setMap(map);
// TODO: Save a reference to the Player object in the game (?)
// TODO: actors = createActors()
// TODO: Save the list of actors in the Game object
// TODO: Assign an actor to the player
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
//    public static Actor [] createActors() {
//        /**
//         * 
//         */
//        Actor [] actors = null;
//        /**
//         * 
//         */
//        Actor actor1 = new Actor();
//        /**
//         * counter for Actor array
//         */
//        short count = 0;
//
//        actor1.setCurrLoc(new Location(0, 0));          // add actor's current location
//        actor1.setPrevLoc(new Location(0, 0));          // add actor's previous location
//
//        actors[count] = actor1;                         // add Actor to actor array
//
//        return actors;
//    } // end of createActors()
    /**
     * 
     * @return 
     */
    public static InventoryItem [] createItems() {
        InventoryItem[] items = new InventoryItem[25];  //Create an array large enough to hold all of the elements in the list
        //InventoryItem item =                                                //Create the next object to be added to the array
//Call setter methods to assign values to each attribute in the object
//Assign the object to the next position in the array
//Repeat the above three steps for each object to be added to the array
//…


        return items;
    } // end of createItems

    /**
     * 
     * @param noOfRows
     * @param noOfCols
     * @return 
     */
    public static Map createMap(int noOfRows, int noOfCols) {
        
        return null;//debugging
    } // end of createMap
} // end of class GameControl
