/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionGetCalendar;
import Fasti.FastiConnector.FastiAction.FastiCalendarAction;
import net.fortuna.ical4j.model.Calendar;


public  class FastiCaldavActionGetCalendar extends FastiActionGetCalendar {
    public FastiCaldavActionGetCalendar() {
        super();
        this.setName(FastiCaldavActionGetCalendar.class.getName());
    }

    @Override
    public Calendar runAction() {
        //this.getConnector().getLogger().info("Kalender holen vom Caldav-Server");
        return null;
    }

}
