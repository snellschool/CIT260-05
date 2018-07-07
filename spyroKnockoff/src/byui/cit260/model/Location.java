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
public class Location implements Serializable {
    /**
     * Has the played visited the location yet?
     */
    boolean visited;
    /**
     * 
     */
    int xCoord;
    /**
     * 
     */
    int yCoord;
    /**
     * two-letter "symbol" of location
     */
    private String symbol;

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
        this.visited = false;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.symbol = "..";
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
    public boolean hasVisited() {
        return visited;
    } // end of hasVisited()

    /**
     * 
     * @param visited 
     */
    public void setVisited(boolean visited) {
        this.visited = visited;
    } // end of setVisited()

    /**
     * 
     * @return 
     */
    public String getSymbol() {
        return symbol;
    } // end of getSymbol()

    /**
     * 
     * @param symbol 
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    } // end of setSymbol()

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (this.visited ? 1 : 0);
        hash = 11 * hash + this.xCoord;
        hash = 11 * hash + this.yCoord;
        hash = 11 * hash + Objects.hashCode(this.symbol);
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
        if (this.visited != other.visited) {
            return false;
        }
        if (this.xCoord != other.xCoord) {
            return false;
        }
        if (this.yCoord != other.yCoord) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    } // end of equals()
} // end of class
