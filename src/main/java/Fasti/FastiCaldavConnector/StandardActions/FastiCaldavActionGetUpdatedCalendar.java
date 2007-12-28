/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetUpdatedCalendar;
import java.util.ArrayList;
import net.fortuna.ical4j.model.Calendar;

public  class FastiCaldavActionGetUpdatedCalendar extends FastiActionGetUpdatedCalendar {
    public FastiCaldavActionGetUpdatedCalendar() {
        super();
        this.setName(FastiCaldavActionGetUpdatedCalendar.class.getName());
    }

    @Override
    public ArrayList<Calendar> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
