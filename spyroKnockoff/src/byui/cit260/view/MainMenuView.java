/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view;

import byui.cit260.control.GameControl;
import java.util.Scanner;
import spyroknockoff.SpyroKnockoff;

/**
 *
 * @author megnol
 */
class MainMenuView {
    private static String [] input = new String[1];

    /**
     * 
     */
    public void displayMainMenuView() {
        boolean endView = false;
        do {
            input = getInputs();
            if(input[0].equals(null) || input[0].toUpperCase().equals("Q"))
                    return;
            endView = doAction(input);
        } while(!endView);
    } // end of displayMainMenuView()

    /**
     * 
     * @return 
     */
    String [] getInputs() {
        boolean valid = false;
        String [] retval = { null };
        Scanner keyboard = new Scanner(System.in);

        System.out.println("N - New Game\n"
                        + "L - Load Game\n"
                        + "W - Erase Game\n"
                        + "H = Help Menu\n"
                        + "Q = Quit Game\n\n");
        while(!valid) {
            System.out.print("Enter menu selection > ");    // prompt user for input
            input[0] = keyboard.nextLine().trim();          // receive input from user
            
            if(input[0].length() < 1) {                     // if user does not enter anything
                System.out.println("Error! You must enter a non-zero entry!");
                continue;                                   // breaks out of loop and resets at prompt
            } // end of conditional

            retval[0] = input[0];                           // stores input in return value
            valid = true;                                   // ends loop
        } // end of while loop

        System.out.println("getInputs() from MainMenuView called.");//debugging

        return retval;
    } // end of getInputs()

    /**
     * 
     * @param input the input from the user
     * @return a boolean indicating if the view should end
     */
    boolean doAction(String [] input) {
        char menuItem = input[0].toUpperCase().charAt(0);

        switch(menuItem) {
            case 'N': startNewGame();   break;
            case 'R': restartGame();    break;
            case 'H': getHelp();        break;
            case 'Q': return true;
            default: System.out.println("Invalid menu item.");
        } // end of switch

        return false;
    } // end of doAction()

    /**
     * 
     */
    private void startNewGame() {
        GameControl.createNewGame(SpyroKnockoff.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    } // end of startNewGame()

    /**
     * 
     */
    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    } // end of restartGame()

    /**
     * 
     */
    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    } // end of getHelp()
} // end of class MainMenuView
