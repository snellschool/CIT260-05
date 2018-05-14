/*
 * Snell, Dallin
 * 14 MAY 18
 * CIT260
 */
package byui.cit260.model;

import java.io.Serializable;

/**
 *
 * @author Dallin
 */
public class Inventory implements Serializable{
    private double gems;            // number of gems user has collected
    private double relics;          // number of relics user has collected
    
    /**
     * Class constructor.
     */
    public Inventory() {
        gems = 0;
        relics = 0;
    }

    /**
     * 
     * @param gems
     * @param relics 
     */
    public Inventory(double gems, double relics) {
        this.gems = gems;
        this.relics = relics;
    }

    /**
     * 
     * @return number of gems user owns
     */
    public double getGems() {
        return gems;
    }

    /**
     * 
     * @param gems new number of gems for user
     */
    public void setGems(double gems) {
        this.gems = gems;
    }

    /**
     * 
     * @return number of relics user owns
     */
    public double getRelics() {
        return relics;
    }

    /**
     * 
     * @param relics 
     */
    public void setRelics(double relics) {
        this.relics = relics;
    }

    /**
     * 
     * @return hash of class
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.gems) ^ (Double.doubleToLongBits(this.gems) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.relics) ^ (Double.doubleToLongBits(this.relics) >>> 32));
        return hash;
    }

    /**
     * 
     * @param obj object to compare
     * @return boolean if objects are equal
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
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.gems) != Double.doubleToLongBits(other.gems)) {
            return false;
        }
        if (Double.doubleToLongBits(this.relics) != Double.doubleToLongBits(other.relics)) {
            return false;
        }
        return true;
    }
    
    
}
