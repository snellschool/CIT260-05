/* Snell, Dallin
 * 19 JUN 18
 */
package byui.cit260.view;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Scanner;

/**
 *
 * @author Dallin
 */
public abstract class View implements ViewInterface {
    /**
     * default constructor for abstract class View
     */
    public View() {

    } // end of default constructor for abstract class View

    /**
     * 
     */
    @Override
    public void display() {
        boolean endOfView = false;
        String [] inputs = { null };

        do {
            inputs = getInputs();
            if(inputs[0].equals(null) || inputs[0].toUpperCase().equals("Q"))
                return;
            endOfView = doAction(inputs);
        } while(!endOfView);
    } // end of display()

    /**
     * 
     * @param promptMessage
     * @return 
     */
    @Override
    public String getInput(String promptMessage) {
        boolean valid = false;
        String retval = null;
        Scanner keyboard = new Scanner(System.in);

        while(!valid) {
           System.out.print(promptMessage);              // prompt user for input
           retval = keyboard.nextLine().trim();          // receive input from user
            
            if(retval.length() < 1) {                     // if user does not enter anything
                System.out.println("Error! You must enter a non-zero entry!");
                continue;                                   // breaks out of loop and resets at prompt
            } // end of conditional
            valid = true;                                   // ends loop
        } // end of while loop

        return retval;
    } // end of getInput()
} // end of abtract class View
