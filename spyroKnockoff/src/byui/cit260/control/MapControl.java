/* Snell, Dallin
** CIT260.05
*/


package byui.cit260.control;

import byui.cit260.model.Actor;
import byui.cit260.model.InventoryItem;
import byui.cit260.model.Location;
import byui.cit260.model.Map;

/**
 * 
 * 
 * @author Dallin
 */
public class MapControl {
    /**
     * 
     * @param noOfRows
     * @param noOfColumns
     * @param items
     * @return 
     */
    public static Map createMap(int noOfRows, int noOfColumns, InventoryItem [] items) {
        /**
         * Determines if a function returning was successful.
         */
        int success = (-1);
        /**
         * 
         */
        Location [][] locations = null;

        if(noOfRows < 0 || noOfColumns < 0)
            return null;
        else if(items == null || items.length < 1)
            return null;
        
        Map map = new Map();
        map.setDescription("I am Map.");
        map.setCols(noOfColumns);
        map.setRows(noOfRows);
        locations = createLocations(noOfRows, noOfColumns);
        if(locations == null)
            return null;
        success = assignActorsToLocations(locations);
        if(success == (-1))
            return null;

        return map;
    } // end of createMap()

    /**
     * 
     * @param rows
     * @param columns
     * @return 
     */
    private static Location[][] createLocations(int rows, int columns) {
        Location [][] locations = null;
        System.out.println("createLocations method called from MapControl.");//debugging

        // Check for invalid inputs
        if(rows < 1 || columns < 1)
            return null;
        else
            locations = new Location[rows][columns];

        for(int i = 0; i < rows; ++i) {
            for(int c = 0; c < columns; ++c) {
                locations[i][c] = new Location(); // create new Location object in every location
                locations[i][c].setxCoord(i);
                locations[i][c].setyCoord(c);
            } // end of inner for loop
        } // end of outer for loop

        return locations;
    } // end of createLocations()

    private static Scene[] createScenes() {

        return null;//debugging
    } // end of createScences()

    /**
     * 
     * @return 
     */
    private static Question[] createQuestions() {

        return null;//debugging
    } // end of createQuestions()

    /**
     * 
     * @param questions
     * @param scenes 
     */
    private static void assignQuestionsToScenes(Question[] questions,Scene[] scenes) {

    } // end of assignQuestionsToScenes()

    /**
     * 
     */
    private static void assignItemsToLocation() {
        // we will be randomly generating items in a given location
        // so this method will not be developed further
    } // end of assignItemsToLocation()
    
    private static int assignActorsToLocations(Location[][] locations) {
        if (locations == null) // check for invalid input
            return -1;
        System.out.println("This method has been called.");//debugging
        
        Location location = locations[0][0];
        location.setActor(GameControl.actor1);
        int currLoc = Actor.getCurrLoc(Point);
        Actor.currLoc = 2;
        Actor.currLoc = 1;
        return 1;
    }
} // end of MapControl class
