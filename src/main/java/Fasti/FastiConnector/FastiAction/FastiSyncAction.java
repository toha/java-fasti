/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction;

import java.util.GregorianCalendar;


public abstract class FastiSyncAction extends FastiAction {
    private GregorianCalendar fromTime;
    private GregorianCalendar toTime;

    public abstract void saveState();
    public abstract Object runAction();
    public abstract void undoAction();

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
