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
public abstract class RiddleHintView extends View{
    private static String [] input = { null };
    /**
     * default constructor for the RiddleHintView class
     */
    public RiddleHintView() {
        
    }

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
     * @return 
     */
    boolean doAction() {
        
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

    /**
     * 
     */
    private void riddleHintA() {
        System.out.println("Think literally.");
    }

    /**
     * 
     */
    private void riddleHintB() {
        System.out.println("The difference between brothers and sisters is 1.");
    }

    /**
     * 
     */
    private void riddleHintC() {
        System.out.println("You have interracted with this very recently.");
    }
    
    /**
     * 
     */
    private void buyRiddleAnswer() {
//        RiddleAnswerView riddleAnswerView = new RiddleAnswerView();
//        riddleAnswerView.displayRiddleAnswerView();
    }
} // end of class RiddleHintView
