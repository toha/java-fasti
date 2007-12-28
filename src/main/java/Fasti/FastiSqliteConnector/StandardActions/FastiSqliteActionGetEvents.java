/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.EventActions.FastiActionGetEvents;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import net.fortuna.ical4j.model.Calendar;


public  class FastiSqliteActionGetEvents extends FastiActionGetEvents {
    private GregorianCalendar fromTime = null;
    private GregorianCalendar toTime = null;

    public FastiSqliteActionGetEvents() {
        super();
        this.setName(FastiSqliteActionGetEvents.class.getName());
    }
    /**
     * @return the fromTime
     */
    @Override
    public GregorianCalendar getFromTime() {
        return fromTime;
    }

    /**
     * @param fromTime the fromTime to set
     */
    @Override
    public void setFromTime(GregorianCalendar fromTime) {
        this.fromTime = fromTime;
    }

    /**
     * @return the toTime
     */
    @Override
    public GregorianCalendar getToTime() {
        return toTime;
    }

    /**
     * @param toTime the toTime to set
     */
    @Override
    public void setToTime(GregorianCalendar toTime) {
        this.toTime = toTime;
    }

    @Override
    public ArrayList<Calendar> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
