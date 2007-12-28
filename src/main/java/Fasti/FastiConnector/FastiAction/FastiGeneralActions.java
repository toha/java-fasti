/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction;

/**
 *
 * @author tobi
 */
public abstract class FastiGeneralActions extends FastiAction {

    public abstract void saveState();
    public abstract Object runAction();
    public abstract void undoAction();

}
