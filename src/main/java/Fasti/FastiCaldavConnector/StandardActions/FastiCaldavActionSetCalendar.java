/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionSetCalendar;
import Fasti.FastiConnector.FastiAction.FastiCalendarAction;

/**
 *
 * @author jeldrik
 */
public  class FastiCaldavActionSetCalendar extends FastiActionSetCalendar {
    public FastiCaldavActionSetCalendar() {
        super();
        this.setName(FastiCaldavActionSetCalendar.class.getName());
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
