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
public class Location implements Serializable {
    int xCoord;
    int yCoord;

    /**
     * Location class default constructor
     */
    public Location() {
        
    } // end of default construtor

    /**
     * 
     * @param xCoord
     * @param yCoord 
     */
    public Location(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    } // end of constructor

    /**
     * 
     * @return 
     */
    public int getxCoord() {
        return xCoord;
    } // end of getxCoord()

    /**
     * 
     * @return 
     */
    public int getyCoord() {
        return yCoord;
    } // end of getyCoord()

    /**
     * 
     * @param xCoord 
     */
    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    } // end of setxCoord()

    /**
     * 
     * @param yCoord 
     */
    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    } // end of setyCoord()

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.xCoord;
        hash = 11 * hash + this.yCoord;
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
        final Location other = (Location) obj;
        if (this.xCoord != other.xCoord) {
            return false;
        }
        if (this.yCoord != other.yCoord) {
            return false;
        }
        return true;
    } // end of equals()
} // end of class
