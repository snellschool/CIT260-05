/*
 * Snell, Dallin
 * 14 MAY 18
 * CIT260
 */
package byui.cit260.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dallin
 */
public class Character implements Serializable {
    Location currLoc;
    Location previousLoc;

    /**
     * 
     */
    public Character() {
        
    }

    /**
     * 
     * @param currLoc
     * @param previousLoc 
     */
    public Character(Location currLoc, Location previousLoc) {
        this.currLoc = currLoc;
        this.previousLoc = previousLoc;
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
     * @return 
     */
    public Location getPreviousLoc() {
        return previousLoc;
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
     * @param previousLoc 
     */
    public void setPreviousLoc(Location previousLoc) {
        this.previousLoc = previousLoc;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.currLoc);
        hash = 67 * hash + Objects.hashCode(this.previousLoc);
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.currLoc, other.currLoc)) {
            return false;
        }
        if (!Objects.equals(this.previousLoc, other.previousLoc)) {
            return false;
        }
        return true;
    }
    
    
}
