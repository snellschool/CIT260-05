/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spyroknockoff;
import byui.cit260.model.*;
import byui.cit260.view.*;

/**
 *
 * @author Dallin
 */
public class SpyroKnockoff {
    private static Player player = null;
    private static Game currentGame = null;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    /**
     * 
     * @return 
     */
    public static Player getPlayer() {
        return player;
    }

    /**
     * 
     * @param player 
     */
    public static void setPlayer(Player player) {
        SpyroKnockoff.player = player;
    }

    /**
     * 
     * @return 
     */
    public static Game getCurrentGame() {
        return currentGame;
    }

    /**
     * 
     * @param currentGame 
     */
    public static void setCurrentGame(Game currentGame) {
        SpyroKnockoff.currentGame = currentGame;
    } 
} // end of class SpyroKnockoff
