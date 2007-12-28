/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionSetCalendar;
import Fasti.FastiConnector.FastiAction.FastiCalendarAction;


public  class FastiSqliteActionSetCalendar extends FastiActionSetCalendar {
    public FastiSqliteActionSetCalendar() {
        super();
        this.setName(FastiSqliteActionSetCalendar.class.getName());
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
