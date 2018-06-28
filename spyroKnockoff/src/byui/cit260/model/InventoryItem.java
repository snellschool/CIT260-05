/* Snell, Dallin
** 28 JUN 18
** CIT260.05 - WEEK10
*/

package byui.cit260.model;

/**
 *
 * @author Dallin
 */
public class InventoryItem {
    /**
     * The amount of a given item.
     */
    private int amount;
    /**
     * The item itself.
     */
    private String item;
    /**
     * A description of the item in the inventory.
     */
    private String description;

    /**
     * default constructor
     */
    public InventoryItem() {
    } // end of default constructor

    /**
     * 
     * @param amount
     * @param item
     * @param description 
     */
    public InventoryItem(int amount, String item, String description) {
        this.amount = amount;
        this.item = item;
        this.description = description;
    } // end of non-default contructor

    
} // end of class InventoryItem
