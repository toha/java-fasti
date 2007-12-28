/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionGetCalendar;
import Fasti.FastiConnector.FastiAction.FastiCalendarAction;
import net.fortuna.ical4j.model.Calendar;

/**
 *
 * @author tobi
 */
public  class FastiSqliteActionGetCalendar extends FastiActionGetCalendar {
    public FastiSqliteActionGetCalendar() {
        super();
        this.setName(FastiSqliteActionGetCalendar.class.getName());
    }

    @Override
    public Calendar runAction() {
        //this.getConnector().getLogger().info("Kalender holen vom Sqlite-File");
        throw new UnsupportedOperationException("not implemented");
    }

}
