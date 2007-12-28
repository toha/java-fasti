/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetDeletedEvents;
import java.util.ArrayList;
import net.fortuna.ical4j.model.component.VEvent;


public class FastiCaldavActionGetDeletedEvents extends FastiActionGetDeletedEvents {
    public FastiCaldavActionGetDeletedEvents() {
        super();
        this.setName(FastiCaldavActionGetDeletedEvents.class.getName());
    }

    @Override
    public ArrayList<VEvent> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
