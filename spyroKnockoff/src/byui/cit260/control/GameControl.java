/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import byui.cit260.model.Player;

/**
 *
 * @author megnol
 */
public class GameControl {
    public static Player savePlayer(String name) {
        System.out.println("savePlayer() is called");
        return new Player();
    }
}
