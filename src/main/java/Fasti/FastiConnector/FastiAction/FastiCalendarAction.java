/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction;


public abstract class FastiCalendarAction extends FastiAction {

    protected net.fortuna.ical4j.model.Calendar calendar;

    public abstract void saveState();
    public abstract Object runAction();
    public abstract void undoAction();

    public void setCalendar(net.fortuna.ical4j.model.Calendar c) {
        calendar = c;
    }

    public net.fortuna.ical4j.model.Calendar getCalendar() {
        return calendar;
    }
}
