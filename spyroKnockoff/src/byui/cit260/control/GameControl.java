/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import byui.cit260.model.Player;
import spyroknockoff.SpyroKnockoff;

/**
 *
 * @author megnol
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        System.out.println("createNewGame() of GameControl class called.");//debugging
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
}
