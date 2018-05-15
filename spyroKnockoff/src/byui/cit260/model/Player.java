/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author megnol
 */
public class Player implements Serializable {
    private String playerName;
    private long bestScore;
    
    /**
     * 
     */
    public Player() {
    }
    
    /**
     * 
     * @param playerName
     * @param bestScore 
     */
    public Player(String playerName, long bestScore) {
        this.playerName = playerName;
        this.bestScore = bestScore;
    }
    
    /**
     * 
     * @return 
     */
    public String getPlayerName() {
        return playerName;
    }
    
    /**
     * 
     * @param playerName 
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    /**
     * 
     * @return 
     */
    public long getBestScore() {
        return bestScore;
    }
    
    /**
     * 
     * @param bestScore 
     */
    public void setBestScore(long bestScore) {
        this.bestScore = bestScore;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.playerName);
        hash = 89 * hash + (int) (this.bestScore ^ (this.bestScore >>> 32));
        return hash;
    }

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
        final Player other = (Player) obj;
        if (this.bestScore != other.bestScore) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }
    
    
    
}
