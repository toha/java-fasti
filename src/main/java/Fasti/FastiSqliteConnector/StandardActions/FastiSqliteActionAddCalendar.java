/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionAddCalendar;


public class FastiSqliteActionAddCalendar extends FastiActionAddCalendar {
    public FastiSqliteActionAddCalendar() {
        super();
        this.setName(FastiSqliteActionAddCalendar.class.getName());
    }

    @Override
    public void saveState() {
        
    }

    @Override
    public Boolean runAction() {
        return false;
    }

    @Override
    public void undoAction() {
        
    }


}
