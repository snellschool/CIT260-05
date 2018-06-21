/* Snell, Dallin
 * 06 JUN 18
 * CIT260.05
 */
package byui.cit260.view;
import byui.cit260.control.GameControl;
import byui.cit260.model.Player;

/**
 *
 * @author Dallin
 */
public abstract class StartProgramView extends View {
    /**
     * 
     */
    public StartProgramView() {
        
    } // end of default constructor

    /**
     * 
     * @return the inputs from the user
     */
    @Override
    public String [] getInputs() {
        String [] retval = { null };

        System.out.println("During this game, you will move around in the game\n"
                + "finding relics and gems. At various points in the game, you\n"
                + "will be asked riddles to which you must determine the answer.\n"
                + "Successful completion of the riddles will award you gems and\n"
                + "allow you to progress in the game. Winning the game is\n"
                + "dependant on successful completion of the riddles.\n\n");

        retval[0] = this.getInput("Enter your name > ");    // prompt user for input

        return retval;
    } // end of getInputs()
    
    /**
     * 
     * @return 
     */
    boolean doAction() {
        String [] input = null;
        
        String playersName = input[0];                       // save first value from array into variable 'playersName'
        Player player = GameControl.savePlayer(playersName); // save playersName in variable 'player'
        if (player == null) {
            System.out.println("Could not create player. Please enter your name."); // Error message
        return false;
        }   //ENDIF

        System.out.println("=================================================" + 
                "\nWelcome to the game, " + playersName + 
                ". We hope you have a lot of fun!" + 
                "\n=================================================");

//        MainMenuView mainMenuView = new MainMenuView();      // create the new View object
//        mainMenuView.displayMainMenuView();                  // display new View

        return true;
    } // end of doAction()
} // end of class StartProgramView
