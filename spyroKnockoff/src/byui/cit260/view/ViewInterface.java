/* Snell, Dallin
 * 19 JUN 18
 */
package byui.cit260.view;

/**
 *
 * @author Dallin
 */
public interface ViewInterface {
    public void display();
    public String[] getInputs();
    public String getInput(String promptMessage);
    public boolean doAction(String[] inputs);
}
