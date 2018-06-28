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

    /**
     * 
     * @return 
     */
    public int getAmount() {
        return this.amount;
    } // end of getAmount()

    /**
     * 
     * @param amount 
     */
    public void setAmount(int amount) {
        this.amount = amount;
    } // end of setAmount()

    /**
     * 
     * @return 
     */
    public String getItem() {
        return this.item;
    } // end of getItem()

    /**
     * 
     * @param item 
     */
    public void setItem(String item) {
        this.item = item;
    } // end of setItem()

    /**
     * 
     * @return 
     */
    public String getDescription() {
        return this.description;
    } // end of getDescription()

    /**
     * 
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    } // end of setDescription()
} // end of class InventoryItem
