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
public class Actor implements Serializable{
    private Location currLoc;
    private Location prevLoc;
    
    /**
     * 
     */
    public Actor() {
    }

    /**
     * 
     * @param currLoc
     * @param prevLoc 
     */
    public Actor(Location currLoc, Location prevLoc) {
        this.currLoc = currLoc;
        this.prevLoc = prevLoc;
    }

    /**
     * 
     * @return 
     */
    public Location getCurrLoc() {
        return currLoc;
    }

    /**
     * 
     * @param currLoc 
     */
    public void setCurrLoc(Location currLoc) {
        this.currLoc = currLoc;
    }

    /**
     * 
     * @return 
     */
    public Location getPrevLoc() {
        return prevLoc;
    }

    /**
     * 
     * @param prevLoc 
     */
    public void setPrevLoc(Location prevLoc) {
        this.prevLoc = prevLoc;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.currLoc);
        hash = 17 * hash + Objects.hashCode(this.prevLoc);
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.currLoc, other.currLoc)) {
            return false;
        }
        if (!Objects.equals(this.prevLoc, other.prevLoc)) {
            return false;
        }
        return true;
    }
    
    
}
