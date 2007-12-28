/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetDeletedCalendar;
import java.util.ArrayList;
import net.fortuna.ical4j.model.Calendar;


public  class FastiCaldavActionGetDeletedCalendar extends FastiActionGetDeletedCalendar {
    public FastiCaldavActionGetDeletedCalendar() {
        super();
        this.setName(FastiCaldavActionGetDeletedCalendar.class.getName());
    }

    @Override
    public ArrayList<Calendar> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
