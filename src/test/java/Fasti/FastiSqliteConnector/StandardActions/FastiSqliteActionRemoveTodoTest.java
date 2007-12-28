/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.TodoActions.FastiActionRemoveTodo;
import junit.framework.Test;
import Fasti.Test.FastiTest;
import Fasti.util.Exceptions.FastiDataException;
import java.text.ParseException;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Date;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.property.Uid;

/**
 *
 * @author tobi
 */
public class FastiSqliteActionRemoveTodoTest extends FastiTest {
    
    public FastiSqliteActionRemoveTodoTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiSqliteActionRemoveTodoTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * @author Benjamin (benjamin)
     */
    public void testRemoveTodoFromSqlite() throws FastiDataException, ParseException {

        // Kalender fuer die Abfrage erstellen
        Calendar c = new Calendar();
        Uid  id =  new Uid("Removetodotest");
        c.getProperties().remove(id);
        FastiActionRemoveTodo removetodo = (FastiActionRemoveTodo)
                faw.createAction(FastiActionRemoveTodo.class, "Sqlite-connector");
        VEvent todo = new VEvent(new Date("20100325"), "Test");
        c.getComponents().remove(todo);
        removetodo.setTodo(c);

        Boolean result =removetodo.runAction();
        assertTrue("Nicht True", result);






    }
    /**
     * Test of undoAction method, of class FastiSqliteActionRemoveTodo.
     */
    public void testUndoAction() {
    }

}
