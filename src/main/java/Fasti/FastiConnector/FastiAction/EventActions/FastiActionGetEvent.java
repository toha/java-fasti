/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.EventActions;

import Fasti.FastiConnector.FastiAction.FastiEventAction;


public abstract class FastiActionGetEvent extends FastiEventAction {
    public FastiActionGetEvent() {
        this.setUndoable(false);
        this.setName(this.getClass().getName());
    }
    public void saveState() {}
    public abstract net.fortuna.ical4j.model.Calendar  runAction();
    public void undoAction() {}
    
}
