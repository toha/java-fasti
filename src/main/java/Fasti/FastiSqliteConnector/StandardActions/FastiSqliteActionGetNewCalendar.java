/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetNewCalendar;
import java.util.ArrayList;
import net.fortuna.ical4j.model.Calendar;


public  class FastiSqliteActionGetNewCalendar extends FastiActionGetNewCalendar {
    public FastiSqliteActionGetNewCalendar() {
        super();
        this.setName(FastiSqliteActionGetNewCalendar.class.getName());
    }

    @Override
    public ArrayList<Calendar> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
