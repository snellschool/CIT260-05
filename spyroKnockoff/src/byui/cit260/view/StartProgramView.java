/* Snell, Dallin
 * 06 JUN 18
 * CIT260.05
 */
package byui.cit260.view;
import byui.cit260.control.GameControl;
import byui.cit260.model.Player;
import java.util.Scanner;

/**
 *
 * @author Dallin
 */
public class StartProgramView {
    
    private static String [] input = { null };

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

        do {
            input = getInputs();
            if(input[0].equals(null) || input[0].toUpperCase().equals("Q"))
                return;
            endOfView = doAction();
        } while(!endOfView);
        
        System.out.println(input[0]);//debugging
    } // end of displayStartProgramView()
    
    /**
     * 
     * @return 
     */
    private String [] getInputs() {
        boolean valid = false;
        String [] retval = { null };
        Scanner keyboard = new Scanner(System.in);

        System.out.println("During this game, you will move around in the game\n"
                + "finding relics and gems. At various points in the game, you\n"
                + "will be asked riddles to which you must determine the answer.\n"
                + "Successful completion of the riddles will award you gems and\n"
                + "allow you to progress in the game. Winning the game is\n"
                + "dependant on successful completion of the riddles.\n\n");
        while(!valid) {
            System.out.print("Enter your name > ");    // prompt user for input
            input[0] = keyboard.nextLine().trim();     // receive input from user
            
            if(input[0].length() < 1) {                // if user does not enter anything
                System.out.println("Error! You must enter a non-zero entry!");
                continue;                           // breaks out of loop and resets at prompt
            } // end of conditional

            retval[0] = input[0];                      // stores input in return value
            valid = true;                              // ends loop
        } // end of while loop

        System.out.println("\"" + input[0] + "\"");//debugging
        
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
        System.out.println("doAction() called.");//debugging
        
        String playersName = input[0];                       // save first value from array into variable 'playersName'
        Player player = GameControl.savePlayer(playersName); // save playersName in variable 'player'
        if (player == null) {
            System.out.println("Could not create player. Please enter your name."); // Error message
        return false;
        }   //ENDIF

        System.out.println("=================================================" + 
                "\nWelcome to the game, " + playersName + 
                ".\nWe hope you have a lot of fun!" + 
                "\n=================================================");

        MainMenuView mainMenuView = new MainMenuView();      // create the new View object
        mainMenuView.displayMainMenuView();                  // display new View

        return true;
    } // end of doAction()
} // end of class StartProgramView
