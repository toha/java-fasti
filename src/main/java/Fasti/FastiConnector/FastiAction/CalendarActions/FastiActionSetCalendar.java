/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.CalendarActions;

import Fasti.FastiConnector.FastiAction.FastiCalendarAction;


public abstract class FastiActionSetCalendar extends FastiCalendarAction {
    public FastiActionSetCalendar() {
        this.setUndoable(true);
        this.setName(this.getClass().getName());
    }
    public abstract void saveState();
    public abstract Boolean  runAction();
    public abstract void undoAction();
}
