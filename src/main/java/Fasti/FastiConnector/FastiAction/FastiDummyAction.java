/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction;


public abstract class FastiDummyAction extends FastiAction  {

    public abstract void saveState();
    public abstract Object runAction();
    public abstract void undoAction();

}
