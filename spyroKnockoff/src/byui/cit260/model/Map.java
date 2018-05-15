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
public class Map implements Serializable{
    private Area [] areas;
    
    /**
     * 
     */
    public Map() {
    }

    /**
     * 
     * @param areas 
     */
    public Map(Area[] areas) {
        this.areas = areas;
    }
    /**
    * 
    * @return 
    */
    public Area[] getAreas() {
        return areas;
    }

    /**
     * 
     * @param areas 
     */
    public void setAreas(Area[] areas) {
        this.areas = areas;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Arrays.deepHashCode(this.areas);
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
        final Map other = (Map) obj;
        if (!Arrays.deepEquals(this.areas, other.areas)) {
            return false;
        }
        return true;
    }
    
    
}
