/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionRemoveCalendar;
import Fasti.FastiConnector.FastiAction.FastiCalendarAction;

public  class FastiCaldavActionRemoveCalendar extends FastiActionRemoveCalendar {
    public FastiCaldavActionRemoveCalendar() {
        super();
        this.setName(FastiCaldavActionRemoveCalendar.class.getName());
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
