/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetNewEvents;
import java.util.ArrayList;
import net.fortuna.ical4j.model.component.VEvent;


public class FastiSqliteActionGetNewEvents extends FastiActionGetNewEvents {
    public FastiSqliteActionGetNewEvents() {
        super();
        this.setName(FastiSqliteActionGetNewEvents.class.getName());
    }

    @Override
    public ArrayList<VEvent> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
