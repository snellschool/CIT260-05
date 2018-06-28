/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package byui.cit260.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Dallin
 */
public class Map implements Serializable {
    /**
     * An array of locations within the map.
     */
    private Location [][] locs;
    /**
     * The number of rows in the map.
     */
    private int rows;
    /**
     * The number of columns in the map.
     */
    private int cols;

    /**
     * Map class default constructor.
     */
    public Map() {
    } // end of default construtor

    /**
     * 
     * @param locs 
     * @param rows 
     * @param cols 
     */
    public Map(Location [][] locs, int rows, int cols) {
        this.locs = locs;
        this.rows = rows;
        this.cols = cols;
    } // end of non-default construtor

    /**
     * 
     * @return 
     */
    public Location[][] getLocs() {
        return locs;
    } // end of getLocs()

    /**
     * 
     * @param locs 
     */
    public void setLocs(Location[][] locs) {
        this.locs = locs;
    } // end of setLocs()

    /**
     * 
     * @return 
     */
    public int getRows() {
        return rows;
    } // end of getRows()

    /**
     * 
     * @param rows 
     */
    public void setRows(int rows) {
        this.rows = rows;
    } // end of setRows()

    /**
     * 
     * @return 
     */
    public int getCols() {
        return cols;
    } // end of getCols()

    /**
     * 
     * @param cols 
     */
    public void setCols(int cols) {
        this.cols = cols;
    } // end of setCols()

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Arrays.deepHashCode(this.locs);
        hash = 53 * hash + this.rows;
        hash = 53 * hash + this.cols;
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
        final Map other = (Map) obj;
        if (this.rows != other.rows) {
            return false;
        }
        if (this.cols != other.cols) {
            return false;
        }
        if (!Arrays.deepEquals(this.locs, other.locs)) {
            return false;
        }
        return true;
    } // end of equals()
} // end of class Map
