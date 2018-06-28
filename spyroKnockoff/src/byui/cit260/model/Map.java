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
 * @author megnol
 */
public class Map implements Serializable {
    /**
     * 
     */
    private Area [] areas;
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
     * @param areas 
     * @param rows 
     * @param cols 
     */
    public Map(Area[] areas, int rows, int cols) {
        this.areas = areas;
        this.rows = rows;
        this.cols = cols;
    } // end of non-default construtor

    /**
    * 
    * @return 
    */
    public Area[] getAreas() {
        return areas;
    } // end of getAreas()

    /**
     * 
     * @param areas 
     */
    public void setAreas(Area[] areas) {
        this.areas = areas;
    } // end of setAreas()

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
        int hash = 7;
        hash = 17 * hash + Arrays.deepHashCode(this.areas);
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
        if (!Arrays.deepEquals(this.areas, other.areas)) {
            return false;
        }
        return true;
    } // end of equals()
} // end of class Map
