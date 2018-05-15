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
    private long currentScore;
    
    /**
     * 
     */
    public Game() {
    }

    /**
     * 
     * @param currentScore 
     */
    public Game(long currentScore) {
        this.currentScore = currentScore;
    }

    
    /**
     * 
     * @return 
     */
    public long getCurrentScore() {
        return currentScore;
    }

    /**
     * 
     * @param currentScore 
     */
    public void setCurrentScore(long currentScore) {
        this.currentScore = currentScore;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.currentScore ^ (this.currentScore >>> 32));
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
        final Game other = (Game) obj;
        if (this.currentScore != other.currentScore) {
            return false;
        }
        return true;
    }
    
    
}
