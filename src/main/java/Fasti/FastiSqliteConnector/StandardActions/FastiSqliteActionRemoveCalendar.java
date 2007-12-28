/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionRemoveCalendar;
import Fasti.FastiConnector.FastiAction.FastiCalendarAction;

public  class FastiSqliteActionRemoveCalendar extends FastiActionRemoveCalendar {
    public FastiSqliteActionRemoveCalendar() {
        super();
        this.setName(FastiSqliteActionRemoveCalendar.class.getName());
    }

    @Override
    public void saveState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void undoAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
