/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetNewCalendar;
import java.util.ArrayList;
import net.fortuna.ical4j.model.Calendar;


public  class FastiCaldavActionGetNewCalendar extends FastiActionGetNewCalendar {
    public FastiCaldavActionGetNewCalendar() {
        super();
        this.setName(FastiCaldavActionGetNewCalendar.class.getName());
    }

    @Override
    public ArrayList<Calendar> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
