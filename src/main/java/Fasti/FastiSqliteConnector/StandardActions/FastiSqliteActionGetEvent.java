/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.EventActions.FastiActionGetEvent;
import net.fortuna.ical4j.model.Calendar;


public class FastiSqliteActionGetEvent extends FastiActionGetEvent {
    public FastiSqliteActionGetEvent() {
        super();
        this.setName(FastiSqliteActionGetEvent.class.getName());
    }

    @Override
    public Calendar runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
