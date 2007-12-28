/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetDeletedEvents;
import java.util.ArrayList;
import net.fortuna.ical4j.model.component.VEvent;


public class FastiSqliteActionGetDeletedEvents extends FastiActionGetDeletedEvents {
    public FastiSqliteActionGetDeletedEvents() {
        super();
        this.setName(FastiSqliteActionGetDeletedEvents.class.getName());
    }

    @Override
    public ArrayList<VEvent> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
