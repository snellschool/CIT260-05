/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package byui.cit260.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

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
     * The description of the map.
     */
    private String description;

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
     * @param description 
     */
    public Map(Location [][] locs, int rows, int cols, String description) {
        this.locs = locs;
        this.rows = rows;
        this.cols = cols;
        this.description = description;
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
    public String getDescription() {
        return description;
    } // end of getDescription()

    /**
     * 
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    } // end of setDescription()

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Arrays.deepHashCode(this.locs);
        hash = 89 * hash + this.rows;
        hash = 89 * hash + this.cols;
        hash = 89 * hash + Objects.hashCode(this.description);
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
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Arrays.deepEquals(this.locs, other.locs)) {
            return false;
        }
        return true;
    } // end of equals()
} // end of class Map
