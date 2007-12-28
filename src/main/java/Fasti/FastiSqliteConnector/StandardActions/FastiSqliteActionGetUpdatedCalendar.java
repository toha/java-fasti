/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetUpdatedCalendar;
import java.util.ArrayList;
import net.fortuna.ical4j.model.Calendar;

public  class FastiSqliteActionGetUpdatedCalendar extends FastiActionGetUpdatedCalendar {
    public FastiSqliteActionGetUpdatedCalendar() {
        super();
        this.setName(FastiSqliteActionGetUpdatedCalendar.class.getName());
    }

    @Override
    public ArrayList<Calendar> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
