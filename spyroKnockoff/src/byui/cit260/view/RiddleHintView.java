/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.view;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author megnol
 */
public class RiddleHintView extends View{
    /**
     * inputs received from the user
     */
    private static String [] input = { null };
    /**
     * default constructor for the RiddleHintView class
     */
    public RiddleHintView() {
    } // end of default constructor for the RiddleHintView class

    /**
     * 
     * @return 
     */
    @Override
    public String [] getInputs() {
        String [] retval = { null };

        retval[0] = this.getInput("Which riddle do you need help with? Please enter a selection from the list:\n"
                    + "A\n"
                    + "B\n"
                    + "C\n"
                    + "D - Buy the answer"
                    + "E - Exit");

        return retval;
    } // end of getInputs()

    /**
     * 
     */
    private void riddleHintA() {
        System.out.println("Think literally.");
    } // end of riddleHintA()

    /**
     * 
     */
    private void riddleHintB() {
        System.out.println("The difference between brothers and sisters is 1.");
    } // end of riddleHintB()

    /**
     * 
     */
    private void riddleHintC() {
        System.out.println("You have interacted with this very recently.");
    } // end of riddleHintC()
    
    /**
     * 
     */
    private void buyRiddleAnswer() {
//        RiddleAnswerView riddleAnswerView = new RiddleAnswerView();
//        riddleAnswerView.displayRiddleAnswerView();
    } // end of buyRiddleAnswer()

    /**
     * 
     * @param inputs
     * @return 
     */
    @Override
    public boolean doAction(String[] inputs) {
       char menuItem = input[0].toUpperCase().charAt(0);  // convert to char and upper case
        switch (menuItem) {
            case 'A': riddleHintA();
                break;
            case 'B': riddleHintB();
                break;
            case 'C': riddleHintC();
                break;
            case 'D': buyRiddleAnswer();
                break;
            case 'E': exit();
                break;
            default: System.out.print("Invalid menu item.");
        } // end of switch
        return false;
    } // end of doAction()
} // end of class RiddleHintView
