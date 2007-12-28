/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.SyncActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import java.util.ArrayList;

public abstract class FastiActionGetUpdatedEvents extends FastiSyncAction {
    public FastiActionGetUpdatedEvents() {
        this.setUndoable(false);
        this.setName(this.getClass().getName());
    }
    public  void saveState() {}
    public  void undoAction() {}
    public abstract ArrayList<net.fortuna.ical4j.model.component.VEvent>  runAction();
}
