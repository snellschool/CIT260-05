/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author megnol
 */
public class Game implements Serializable{
    /**
     * 
     */
    private long currentScore;
    /**
     * The player object that belongs to a given Game object.
     */
    private Player player;
    /**
     * 
     */
    private InventoryItem [] inventory;
    /**
     * 
     */
    private Map map;
    
    /**
     * Game class default constructor
     */
    public Game() {
    } // end of default constructor

    /**
     * 
     * @param currentScore 
     */
    public Game(long currentScore) {
        this.currentScore = currentScore;
    } // end of constructor

    
    /**
     * 
     * @return 
     */
    public long getCurrentScore() {
        return currentScore;
    } // end of getCurrentScore()

    /**
     * 
     * @param currentScore 
     */
    public void setCurrentScore(long currentScore) {
        this.currentScore = currentScore;
    } // end of setCurrentScore()

    /**
     * 
     * @return 
     */
    public Player getPlayer() {
        return player;
    } // end of getPlayer()

    /**
     * 
     * @param player 
     */
    public void setPlayer(Player player) {
        this.player = player;
    } // end of setPlayer()
    
    /**
     * 
     * @param inventory 
     */
    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    } // end of setInventory()

    /**
     * 
     * @return 
     */
    public InventoryItem[] getInventory() {
        return inventory;
    } // end of getInventory()

    /**
     * 
     * @return 
     */
    public Map getMap() {
        return map;
    } // end of getMap()

    /**
     * 
     * @param map 
     */
    public void setMap(Map map) {
        this.map = map;
    } // end of setMap()

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (this.currentScore ^ (this.currentScore >>> 32));
        hash = 79 * hash + Objects.hashCode(this.player);
        hash = 79 * hash + Arrays.deepHashCode(this.inventory);
        hash = 79 * hash + Objects.hashCode(this.map);
        return hash;
    } // end of hashCode()

    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.currentScore != other.currentScore) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    } // end of equals()
} // end of class Game
