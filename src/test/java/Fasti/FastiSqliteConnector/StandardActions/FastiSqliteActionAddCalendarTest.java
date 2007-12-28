/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionAddCalendar;
import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionGetCalendar;
import Fasti.Test.FastiTest;
import junit.framework.Test;
import Fasti.Test.FastiTest;
import Fasti.util.CalendarFactory;
import Fasti.util.Exceptions.FastiDataException;
import net.fortuna.ical4j.model.Calendar;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author tobi
 */
public class FastiSqliteActionAddCalendarTest extends FastiTest {
    
    public FastiSqliteActionAddCalendarTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiSqliteActionAddCalendarTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * @author Tobias Hartwich(tha)
     * @throws FastiDataException
     */
    public void testAddCalendarToSqlite() throws FastiDataException {

        // Kalender der hinzugefuegt werden soll erstellen mit einem eindeutigen
        // Kalendernamen
        Calendar c = CalendarFactory.newInstance("Kalendernamef1");


        // Aktion erstellen um Kalender hinzuzufuegen
        FastiActionAddCalendar fa = (FastiActionAddCalendar)
                faw.createAction(FastiActionAddCalendar.class, "Sqlite-Connector");
        // Kalender zur Aktion hinzufuegen
        fa.setCalendar(c);
        // Aktion ausfuehren und Ergebnis ueberprüfen
        Boolean erg = (Boolean) faw.runAction(fa);
        //assertTrue( "Fehler beim ausführen der Aktion", erg );

        // Aktion erstellen um Kalender wieder abzufragen
        FastiActionGetCalendar fa2 = (FastiActionGetCalendar)
                faw.createAction(FastiActionGetCalendar.class, "Sqlite-Connector");
        // Kalender zur Aktion hinzufuegen
        fa2.setCalendar(c);
        // Aktion ausfuehren und Ergebnis ueberprüfen
        Calendar erg2 = (Calendar) faw.runAction(fa2);

        // Hinzugefuegten Kalender mit zurückgelieferten Kalender vergleichen
        assertEquals( "Hinzugefügter Kalender ist ungleich abgefragten Kalender",
                erg, erg2 );

        // Kalendernamen vergleichen
        assertEquals( "Kalendername fehlerhaft", "Kalendername",
                erg2.getProperties(Fasti.ical4jext.Calname.CALNAME));
    }


    /**
     * Test of undoAction method, of class FastiSqliteActionAddCalendar.
     */
    public void testUndoAction() {
    }

}
