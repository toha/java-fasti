/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.CalendarActions;

import Fasti.FastiConnector.FastiAction.FastiCalendarAction;


public abstract class FastiActionGetCalendar extends FastiCalendarAction {
    public FastiActionGetCalendar() {
        this.setUndoable(false);
        this.setName(this.getClass().getName());
    }

    public void saveState() {}
    public abstract net.fortuna.ical4j.model.Calendar  runAction();
    public void undoAction() {}

}
