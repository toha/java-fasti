/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.util;

import Fasti.ical4jext.Calname;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.property.ProdId;
import net.fortuna.ical4j.model.property.Version;

/**
 *
 * @author tobi
 */
public  class CalendarFactory {


    public static Calendar newInstance(String name) {
        Calendar c = newInstance();
        c.getProperties().add(new Calname(name));
        return c;
    }

    public static Calendar newInstance() {
        Calendar c = new Calendar();

        c.getProperties().add(new ProdId("Fasti"));
        c.getProperties().add(new Version("2.0", "2.0"));
        return c;
    }
}
