/* Snell, Dallin
 * 13 JUN 18
 */
package byui.cit260.view;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 *
 * @author Dallin
 */
public class InventoryView extends View {
    /**
     * 
     */
    private short []    gemsArtifact;   // these variables might be moved later
    /**
     * 
     */
    private String []   names;          // currently they're here to make everything work
    // indice 0     red gems
    // indice 1     blue gems
    // indice 2     purple gems
    // indice 3     yellow gems
    // indice 4     artifacts

    /**
     * default constructor for InventoryView class
     */
    public InventoryView() {
       System.out.println("LOG: InventoryView object created.");//debugging
       this.gemsArtifact = new short[5]; // this also might be moved
       this.names = new String[5];
       this.names[0] = "Red";           // gems
       this.names[1] = "Blue";          // gems
       this.names[2] = "Purple";        // gems
       this.names[3] = "Yellow";        // gems
       this.names[4] = "artifacts";
    } // end of default constructor

    /**
     * displays the inventory when the user enters the command
     */
    void displayInventory() {
        int i = 0;                          // LCV

        System.out.println("viewInventory() called from InventoryView class");//debugging
        while(i < this.names.length) {
            if(this.gemsArtifact[i] == 0)   // if there are no gems or artifacts
                if(this.names[i].equals("artifacts")) // print for artifacts
                    System.out.println(StringUtils.capitalize(this.names[i]) + ": none");
                else                        // print for gems
                    System.out.println(this.names[i] + " gems: none");
            else                            // else if there are gems or artifacts
                if(this.names[i].equals("artifacts")) // print for artifacts
                    System.out.println(StringUtils.capitalize(this.names[i]) + ": " + 
                            this.gemsArtifact[i]);
                else                        // print for gems
                    System.out.println(this.names[i] + " gems: " + this.gemsArtifact[i]);

            ++i;                            // increment LCV
        } // end of while loop
    } // end of viewInventory()

    /**
     * 
     * @return the inputs from the user
     */
    @Override
    public String [] getInputs() {
        String [] retval = { null };

        retval[0] = this.getInput("G - View more information about gems\n"
                                + "A - View more information about artifacts\n"
                                + "Enter menu selection > ");

        return retval;
    } // end of doAction()

    /**
     * 
     * @param input the input from the user
     * @return a boolean indicating if the view should end
     */
    @Override
    public boolean doAction(String [] input) {
        char menuItem = input[0].toUpperCase().charAt(0);

        switch(menuItem) {
            case 'G': gemsInfo();       break;
            case 'A': artifactsInfo();  break;
            case 'Q': return true;
            default: System.out.println("Invalid menu item.");
        } // end of switch

        return false;
    } // end of doAction()

    /**
     * stub
     */
    void gemsInfo() {
        System.out.println("LOG: gemsInfo called");//debugging
    } // end of gemsInfo()

    /**
     * stub
     */
    void artifactsInfo() {
        System.out.println("LOG: artifactsInfo called");//debugging
    } // end of artifactsInfo()
} // end of InventoryView class
