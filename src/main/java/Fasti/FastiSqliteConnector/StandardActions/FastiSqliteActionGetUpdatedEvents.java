/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetUpdatedEvents;
import java.util.ArrayList;
import net.fortuna.ical4j.model.component.VEvent;

public  class FastiSqliteActionGetUpdatedEvents extends FastiActionGetUpdatedEvents {
    public FastiSqliteActionGetUpdatedEvents() {
        super();
        this.setName(FastiSqliteActionGetUpdatedEvents.class.getName());
    }

    @Override
    public ArrayList<VEvent> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
