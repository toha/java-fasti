/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionGetCalendar;
import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionSetCalendar;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import Fasti.Test.FastiTest;
import Fasti.util.Exceptions.FastiDataException;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.property.Uid;
import net.fortuna.ical4j.util.UidGenerator;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.DateTime;

/**
 *
 * @author tobi
 */
public class FastiCaldavActionSetCalendarTest extends FastiTest {
    
    public FastiCaldavActionSetCalendarTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiCaldavActionSetCalendarTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }


    /**
     * Testfall zum Aktualisieren eines bestehenden Kalenders
     *
     * @author Michael Jacobsen (michaelj)
     */
    public void testSetCalendarToCaldav() throws FastiDataException,
                                                 java.net.SocketException {

        /**
         * Kalender holen
         */
         // Fuer die Abfrage einen Kalender mit eindeutiger
         // Identifikation erzeugen
        Calendar calQuery = new Calendar();
        calQuery.getProperties().add( new Uid("abcdefg123456") );

        // Entsprechendes FastiAction-Objekt erzeugen, ueber das
        // Kalender geladen wird
        FastiActionGetCalendar actionGet = (FastiActionGetCalendar)
                faw.createAction(FastiActionGetCalendar.class,
                "Sqlite-Connector");
        // Abzufragender Kalender dem FastiAction-Objekt uebergeben
        actionGet.setCalendar(calQuery);
        // Aktion ausfuehren
        Calendar calResult = (Calendar) faw.runAction(actionGet);

        // Zusicherung, dass Kalender existiert
        TestCase.assertNotNull(calResult);


        /**
         * Etwas am Kalender aendern
         */
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(java.util.Calendar.MONTH,
                     java.util.Calendar.DECEMBER);
        calendar.set(java.util.Calendar.DAY_OF_MONTH, 25);

        VEvent christmas = new VEvent(new DateTime(), "Weihnachten");

        // Eindeutige UID fuer diesen Termin erzeugen
        UidGenerator ug = new UidGenerator("1");
        christmas.getProperties().add(ug.generateUid());

        // Termin hinzufuegen
        calResult.getComponents().add(christmas);


        /**
         *  Geaenderten Kalender zurueckschreiben
         */
         // Entsprechendes FastiAction-Objekt erzeugen, ueber das die
         // Aktion ausgefuehrt wird.
         FastiActionSetCalendar actionSet = (FastiActionSetCalendar)
                faw.createAction(FastiActionSetCalendar.class,
                "Sqlite-Connector");
         // Kalender uebergeben, der zurueckgeschrieben werden soll
         actionSet.setCalendar(calResult);
         // Aktion ausfuehren
         boolean result = actionSet.runAction();

         // Zusicherung, dass alles erfolgreich verlief
         TestCase.assertEquals(result, true);

    } // testSetCalendarToCaldav()


    /**
     * Test of undoAction method, of class FastiCaldavActionSetCalendar.
     */
    public void testUndoAction() {

    }

}
