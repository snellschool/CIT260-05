/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view;

import byui.cit260.control.GameControl;
import spyroknockoff.SpyroKnockoff;

/**
 *
 * @author megnol
 */
public abstract class MainMenuView extends View {
    /**
     * default constructor for MainMenuView
     */
    public MainMenuView() {

    } // end of default constructor for MainMenuView

    /**
     * 
     * @return 
     */
    @Override
    public String [] getInputs() {
        String [] retval = { null };

        retval[0] = this.getInput("N - New Game\n"
                                + "L - Load Game\n"
                                + "W - Erase Game\n"
                                + "H = Help Menu\n"
                                + "Q = Quit Game\n\n"
                                + "Enter menu selection > ");

        return retval;
    } // end of getInputs()

    /**
     * 
     * @param input the input from the user
     * @return a boolean indicating if the view should end
     */
    @Override
    public boolean doAction(String [] input) {
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
