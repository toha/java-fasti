/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.GeneralActions;

import Fasti.FastiConnector.FastiAction.FastiGeneralActions;

public abstract class FastiActionConnect extends FastiGeneralActions {
    public FastiActionConnect() {
        this.setUndoable(false);
        this.setName(this.getClass().getName());
    }
    public void saveState() {}
    public abstract Boolean  runAction();
    public void undoAction() {}

}
