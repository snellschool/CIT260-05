/* Snell, Dallin
** CIT260.05
*/


package byui.cit260.control;

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
        if(noOfRows < 0 || noOfColumns < 0)
            return null;
        else if(items == null || items.length < 1)
            return null;
        
        Map map = new Map();
        map.setCols(noOfColumns);
        map.setRows(noOfRows);
//locations = createLocations(noOfRows, noOfColumns)
//Assign the locations array to the map
//scenes = createScenes()
//questions = createQuestions()
//assignQuestionsToScenes()
//assignItemsToScenes()
//assignScenesToLocations()
//return map
        return null;//debugging
    } // end of createMap()

    /**
     * 
     * @param rows
     * @param columns
     * @return 
     */
    private static Location[][] createLocations(int rows, int columns) {

        return null;//debugging
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
     * @param items
     * @param scenes 
     */
    private static void assignItemsToScenes(InventoryItem[] items,Scene[] scenes) {
        
    } // end of assignItemsToScenes()

    private static void assignScenesToLocations(Scene[] scenes, Location[][] locations) {
        
    } // end of assignScenesToLocations()
} // end of MapControl class
