/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.model;

import java.io.Serializable;

/**
 *
 * @author megnol
 */
public class Inventory implements Serializable{
    private int gems;
    private int relics;
    
    /**
     * 
     */
    public Inventory() {
    }

    /**
     * 
     * @param gems
     * @param relics 
     */
    public Inventory(int gems, int relics) {
        this.gems = gems;
        this.relics = relics;
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
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.gems;
        hash = 23 * hash + this.relics;
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
        final Inventory other = (Inventory) obj;
        if (this.gems != other.gems) {
            return false;
        }
        if (this.relics != other.relics) {
            return false;
        }
        return true;
    }
    
    
}
