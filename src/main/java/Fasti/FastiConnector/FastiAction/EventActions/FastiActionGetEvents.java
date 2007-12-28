/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.EventActions;

import Fasti.FastiConnector.FastiAction.FastiEventAction;
import java.util.ArrayList;
import java.util.GregorianCalendar;


public abstract class FastiActionGetEvents extends FastiEventAction {
    private GregorianCalendar fromTime = null;
    private GregorianCalendar toTime = null;

    public FastiActionGetEvents() {
        this.setUndoable(false);
        this.setName(this.getClass().getName());
    }

    public void saveState() {}
    public abstract ArrayList<net.fortuna.ical4j.model.Calendar>  runAction();
    public void undoAction() {}



    /**
     * @return the fromTime
     */
    public GregorianCalendar getFromTime() {
        return fromTime;
    }

    /**
     * @param fromTime the fromTime to set
     */
    public void setFromTime(GregorianCalendar fromTime) {
        this.fromTime = fromTime;
    }

    /**
     * @return the toTime
     */
    public GregorianCalendar getToTime() {
        return toTime;
    }

    /**
     * @param toTime the toTime to set
     */
    public void setToTime(GregorianCalendar toTime) {
        this.toTime = toTime;
    }
}
