/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionAddCalendar;


public class FastiCaldavActionAddCalendar extends FastiActionAddCalendar {
    public FastiCaldavActionAddCalendar() {
        super();
        this.setName(FastiCaldavActionAddCalendar.class.getName());
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
