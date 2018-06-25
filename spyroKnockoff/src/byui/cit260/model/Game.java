/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.model;

import java.io.Serializable;

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
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.currentScore ^ (this.currentScore >>> 32));
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
        return true;
    } // end of equals()

    /**
     * 
     * @param inventory 
     */
    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    } // end of setInventory()

    /**
     * 
     * @param map 
     */
    public void setMap(Map map) {
        this.map = map;
    } // end of setMap()
} // end of class Game
