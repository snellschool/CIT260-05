/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spyroknockoff;
import byui.cit260.model.*;

/**
 *
 * @author Dallin
 */
public class SpyroKnockoff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game play = new Game(42);                   // debugging
        Area area = new Area();                     // debugging
        Actor act = new Actor(null, null);          // debugging
        Inventory inven = new Inventory(42, 42);    // debugging
        Location loc = new Location(2, 5);          // debugging
        Map map = new Map();                        // debugging
        Player player = new Player("Megan", 12345); // debugging
        Riddle ridd = new Riddle();                 // debugging
        
        System.out.println("Game hash: " + play.hashCode());    // debugging
        System.out.println("Area hash: " + area.hashCode());    // debugging
        System.out.println("Actor hash: " + act.hashCode());    // debugging
        System.out.println("Inventory hash: " + inven.hashCode()); // debugging
        System.out.println("Location hash: " + loc.hashCode()); // debugging
        System.out.println("Map hash: " + map.hashCode());      // debugging
        System.out.println("Player hash: " + player.hashCode()); // debugging
        System.out.println("Riddle hash: " + ridd.hashCode());  // debugging
    }
    
}
