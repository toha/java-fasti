/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionGetCalendar;
import Fasti.FastiConnector.FastiAction.TodoActions.FastiActionAddTodo;
import junit.framework.Test;
import Fasti.Test.FastiTest;
import Fasti.util.CalendarFactory;
import Fasti.util.Exceptions.FastiDataException;
import java.text.ParseException;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Date;
import net.fortuna.ical4j.model.component.VToDo;

/**
 *
 * @author tobi
 */
public class FastiSqliteActionAddTodoTest extends FastiTest {
    
    public FastiSqliteActionAddTodoTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiSqliteActionAddTodoTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * @author Jeldrik Geraedts (geraedts)
     */
    public void testAddTodoToSqlite() throws FastiDataException, ParseException  {
        // Todo erstellen
        // --------------
        //Kalender mit eindeutigem Namen erstellen
        Calendar c = CalendarFactory.newInstance("addtodotest");
        //Im SQLite-Connector die AddToDoAction anlegen
        FastiActionAddTodo addtodo = (FastiActionAddTodo) faw.createAction(FastiActionAddTodo.class, "Sqlite-Connector");
        //Ein VToDo anlegen
        VToDo todo = new VToDo(new Date("20100501"), "Test");
        //Dem Kalender das Todo hinzufuegen
        c.getComponents().add(todo);
        addtodo.setTodo(c);
        //Die Aktion ausfuehren

        Boolean erg = addtodo.runAction();
        //Das Ergebnis der Aktion pruefen
        assertTrue("Rueckgabewert der Aktion ist False!", erg);

        // Todo abfragen, um Rueckgabewert der Methode zu pruefen
        // ------------------------------------------------------
        //Abfrage-Kalender erstellen
        Calendar c2 = CalendarFactory.newInstance("addtodotest");
        // Aktion erstellen um Kalender wieder abzufragen
        FastiActionGetCalendar getcal = (FastiActionGetCalendar) faw.createAction(FastiActionGetCalendar.class, "Sqlite-Connector");
        // Kalender zur Aktion hinzufuegen
        getcal.setCalendar(c2);
        // Kalender aus der DB per UID abfragen
        Calendar ergc = (Calendar) faw.runAction(getcal);

        // Hinzugefuegten Kalender mit zurueckgeliefertem Kalender vergleichen
        assertEquals( "Kalender gleichen sich nicht!", c, ergc );
    }
    /**
     * Test of undoAction method, of class FastiSqliteActionAddTodo.
     */
    public void testUndoAction() {
    }

}
