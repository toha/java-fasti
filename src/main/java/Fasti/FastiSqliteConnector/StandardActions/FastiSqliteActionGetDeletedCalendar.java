/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetDeletedCalendar;
import java.util.ArrayList;
import net.fortuna.ical4j.model.Calendar;


public  class FastiSqliteActionGetDeletedCalendar extends FastiActionGetDeletedCalendar {
    public FastiSqliteActionGetDeletedCalendar() {
        super();
        this.setName(FastiSqliteActionGetDeletedCalendar.class.getName());
    }

    @Override
    public ArrayList<Calendar> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
