/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.EventActions;

import Fasti.FastiConnector.FastiAction.FastiEventAction;


public abstract class FastiActionRemoveEvent extends FastiEventAction {
    public FastiActionRemoveEvent() {
        this.setUndoable(true);
        this.setName(this.getClass().getName());
    }
    public abstract void saveState();
    public abstract Boolean  runAction();
    public abstract void undoAction();     
}
