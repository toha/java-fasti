package com.fasti.fasti;

import Fasti.FastiCaldavConnector.FastiCaldavConnectorData;
import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionAddCalendar;
import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionGetCalendar;
import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionSetCalendar;
import Fasti.FastiConnector.FastiAction.TodoActions.FastiActionAddTodo;
import Fasti.FastiConnector.FastiAction.TodoActions.FastiActionRemoveTodo;
import Fasti.FastiData.FastiActionWorker;
import Fasti.FastiData.FastiDataManager;
import Fasti.FastiSqliteConnector.FastiSqliteConnectorData;
import Fasti.util.CalendarFactory;
import Fasti.util.Exceptions.FastiConnectorException;
import Fasti.util.Exceptions.FastiDataException;
import java.net.SocketException;
import java.text.ParseException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.property.Uid;
import net.fortuna.ical4j.model.Date;
import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.component.VToDo;
import net.fortuna.ical4j.util.UidGenerator;

/**
 * Unittest für Fasti
 */
public class AppTest 
    extends TestCase
{

        FastiDataManager dm = new FastiDataManager();
        FastiSqliteConnectorData fdc;
        FastiCaldavConnectorData fdc2;
        FastiActionWorker faw;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * Methode, die zur Initialisierung vor jedem Testfall aufgerufen wird.
     */
    public void setUp() {

        try {
            
            // Objekt fuer Verbindung zu SQLite erzeugen
            fdc = (FastiSqliteConnectorData)
                    dm.createConnector("Sqlite-Connector", 
                                       FastiSqliteConnectorData.class);
            fdc.setStd_connector(true);
            
            // SQLite-Verbindung dem DataManager uebergeben
            dm.addConnector(fdc);

            
            // Objekt fuer Verbindung zu Caldav-Server erzeugen
            fdc2 = (FastiCaldavConnectorData) 
                    dm.createConnector("Caldav-Connector", 
                                       FastiCaldavConnectorData.class);
            fdc2.setStd_connector(false);
            
            // Caldav-Verbindung dem DataManager uebergeben
            dm.addConnector(fdc2);

            // ActionWorker-Objekt erzeugen, das als Warteschlange zum 
            // Abarbeiten von Aktionen dient.
            faw =  dm.getActionWorker();
        }
        catch (Exception ex) {
            
        }

    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
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
        this.assertNotNull(calResult);

       
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
         this.assertEquals(result, true);

    } // testSetCalendarToCaldav()
    

    /**
     * @author Andree Klattenhoff (andreek)
     */
    public void testAddEventToCaldav()  {



    }


}
