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
public class Area implements Serializable {
    Location loc;
    int gems;
    int relics;
    Riddle riddle;

    /**
     * 
     */
    public Area() {
        this.loc = null;
        this.gems = 0;
        this.relics = 0;
        this.riddle = null;
    }

    /**
     * 
     * @param loc
     * @param gems
     * @param relics
     * @param riddle 
     */
    public Area(Location loc, int gems, int relics, Riddle riddle) {
        this.loc = loc;
        this.gems = gems;
        this.relics = relics;
        this.riddle = riddle;
    }

    /**
     * 
     * @return 
     */
    public Location getLoc() {
        return loc;
    }

    /**
     * 
     * @param loc 
     */
    public void setLoc(Location loc) {
        this.loc = loc;
    }

    /**
     * 
     * @return 
     */
    public int getGems() {
        return gems;
    }

    /**
     * 
     * @param gems 
     */
    public void setGems(int gems) {
        this.gems = gems;
    }

    /**
     * 
     * @return 
     */
    public int getRelics() {
        return relics;
    }

    /**
     * 
     * @param relics 
     */
    public void setRelics(int relics) {
        this.relics = relics;
    }

    /**
     * 
     * @return 
     */
    public Riddle getRiddle() {
        return riddle;
    }

    /**
     * 
     * @param riddle 
     */
    public void setRiddle(Riddle riddle) {
        this.riddle = riddle;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.loc);
        hash = 79 * hash + this.gems;
        hash = 79 * hash + this.relics;
        hash = 79 * hash + Objects.hashCode(this.riddle);
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
        final Area other = (Area) obj;
        if (this.gems != other.gems) {
            return false;
        }
        if (this.relics != other.relics) {
            return false;
        }
        if (!Objects.equals(this.loc, other.loc)) {
            return false;
        }
        if (!Objects.equals(this.riddle, other.riddle)) {
            return false;
        }
        return true;
    }
} // end of class
