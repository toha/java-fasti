/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.EventActions.FastiActionGetEvent;
import net.fortuna.ical4j.model.Calendar;


public class FastiCaldavActionGetEvent extends FastiActionGetEvent {
    public FastiCaldavActionGetEvent() {
        super();
        this.setName(FastiCaldavActionGetEvent.class.getName());
    }

    @Override
    public Calendar runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
