/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view;

import static javafx.application.Platform.exit;

/**
 *
 * @author megnol
 */
public class RiddleAnswerView extends View{
    /**
     * inputs received from the user
     */
    private static String [] input = { null };
    
     /**
     * default constructor for the RiddleAnswerView class
     */
    public RiddleAnswerView() {
    } // end of default constructor for the RiddleAnswerView class
    
    /**
     * 
     * @return 
     */
    @Override
    public String [] getInputs() {
        String [] retval = { null };

        retval[0]=this.getInput("Which riddle do you want to buy the answer to? Please enter a selection from the list:\n"
                        + "A\n"
                        + "B\n"
                        + "C\n"
                         + "E - Exit");

        return retval;
    } // end of getInputs()

     /**
     * 
     */
    private void riddleAnswerA() {
        System.out.println("The letter 'R'.");
    } // end of riddleAnswerA()

    /**
     * 
     */
    private void riddleAnswerB() {
        System.out.println("Four sisters and three brothers.");
    } // end of riddleAnswerB()

    /**
     * 
     */
    private void riddleAnswerC() {
        System.out.println("A keyboard.");
    } // end of riddleAnswerC()

    /**
     * 
     * @param inputs
     * @return 
     */
    @Override
    public boolean doAction(String[] inputs) {
       char menuItem = input[0].toUpperCase().charAt(0);  // convert to char and upper case
        switch (menuItem) {
            case 'A': riddleAnswerA();
                break;
            case 'B': riddleAnswerB();
                break;
            case 'C': riddleAnswerC();
                break;
            case 'E': exit();
                break;
            default: System.out.print("Invalid menu item.");
        } // end of switch
        return false; 
    } // end of doAction()
} // end of class RiddleAnswerView
