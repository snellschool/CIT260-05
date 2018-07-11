/* Snell, Dallin
 * CIT260.05
 */
package spyroknockoff;
import byui.cit260.model.*;
import byui.cit260.view.StartProgramView;

/**
 *
 * @author Dallin
 */
public class SpyroKnockoff {
    /**
     * 
     */
    private static Player player = null;
    /**
     * 
     */
    private static Game currentGame = null;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.getInputs();
    } // end of main()

    /**
     * 
     * @return 
     */
    public static Player getPlayer() {
        return player;
    } // end of getPlayer()

    /**
     * 
     * @param player 
     */
    public static void setPlayer(Player player) {
        SpyroKnockoff.player = player;
    } // end of setPlayer()

    /**
     * 
     * @return 
     */
    public static Game getCurrentGame() {
        return currentGame;
    } // end of getCurrentGame()

    /**
     * 
     * @param currentGame 
     */
    public static void setCurrentGame(Game currentGame) {
        SpyroKnockoff.currentGame = currentGame;
    } // end of setCurrentGame()
} // end of class SpyroKnockoff
