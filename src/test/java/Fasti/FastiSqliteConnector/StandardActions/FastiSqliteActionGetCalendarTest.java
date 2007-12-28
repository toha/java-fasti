/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionGetCalendar;
import junit.framework.Test;
import Fasti.Test.FastiTest;
import Fasti.util.Exceptions.FastiDataException;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.property.Uid;

/**
 *
 * @author tobi
 */
public class FastiSqliteActionGetCalendarTest extends FastiTest {
    
    public FastiSqliteActionGetCalendarTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiSqliteActionGetCalendarTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * @author Robin Ryder (robin1)
     */
    public void testGetCalendarFromSqlite() throws FastiDataException {
        //Kalender mit eindeutiger Id erstellen
        Calendar c = new Calendar();
        Uid id = new Uid("abcdefg123456");
        c.getProperties().add(id);
         //  Kalender holen
        FastiActionGetCalendar actionGet = (FastiActionGetCalendar)
                faw.createAction(FastiActionGetCalendar.class,"Sqlite-Connector");
        actionGet.setCalendar(c);
        Calendar calResult = (Calendar) faw.runAction(actionGet);
        //Erzeugten Kalender mit geholtem Kalender vergleichen
        assertEquals(c,calResult);
    }

}
