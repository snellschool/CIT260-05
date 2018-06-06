/* Snell, Dallin
 * 06 JUN 18
 * CIT260.05
 */
package byui.cit260.view;
import java.util.Scanner;

/**
 *
 * @author Dallin
 */
public class StartProgramView {

    /**
     * 
     */
    public StartProgramView() {
        
    } // end of default constructor
    
    /**
     * 
     */
    public void displayStartProgramView() {
        boolean endOfView = false;
        String [] inputs = null;

        do {
            inputs = getInputs();
            if(inputs[0].equals(null) || inputs[0].toUpperCase().equals("Q"))
                return;
            endOfView = doAction();
        } while(!endOfView);
        
        System.out.println(inputs[0]);//debugging
    } // end of displayStartProgramView()
    
    /**
     * 
     * @return 
     */
    private String [] getInputs() {
        boolean valid = false;
        String input = null;
        String [] retval = {null};
        Scanner keyboard = new Scanner(System.in);

        System.out.println("TODO: Enter description here.");
        while(!valid) {
            System.out.print("Enter command > ");   // prompt user for input
            input = keyboard.nextLine().trim();     // receive input from user
            
            if(input.length() < 1) {                // if user does not enter anything
                System.out.println("Error! You must enter a non-zero entry!");
                continue;                           // breaks out of loop and resets at prompt
            } // end of conditional

            retval[0] = input;                      // stores input in return value
            valid = true;                           // ends loop
        } // end of while loop
        
        System.out.println("\"" + input + "\"");//debugging
        
        for(int i = 0; i < 1; ++i)      // bogus code :)
            while(i < 1) {              // bogus code :)
                System.out.println("getInputs() called.");
                ++i;
            }

        return retval;
    } // end of getInputs()
    
    /**
     * 
     * @return 
     */
    boolean doAction() {
        System.out.println("doAction() called.");

        return true;
    } // end of doAction()
} // end of class StartProgramView
