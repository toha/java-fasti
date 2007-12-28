/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.property.Comment;
import net.fortuna.ical4j.model.property.Uid;
import Fasti.FastiConnector.FastiAction.EventActions.FastiActionAddEvent;
import Fasti.FastiConnector.FastiAction.EventActions.FastiActionGetEvent;
import Fasti.Test.FastiTest;
import junit.framework.Test;
import Fasti.Test.FastiTest;
import Fasti.ical4jext.Calname;
import Fasti.util.Exceptions.FastiDataException;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Andreek
 */
public class FastiSqliteActionAddEventTest extends FastiTest {
    
    public FastiSqliteActionAddEventTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiSqliteActionAddEventTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Test of saveState method, of class FastiSqliteActionAddEvent.
     * 
     * Create a new Calendar with a VEvent and add this to SQlite Connector.
     * We run FastiGetEventAction to compare with created object for FastiAddEventAction.
     * 
     * @throws FastiDataException 
     */
    public void testSaveState() throws FastiDataException {
    	// Create calendar
    	Calendar myCalendar = new Calendar();
    	myCalendar.getProperties().add(new Calname("myCalendar"));
    	
    	// Create a event with some properties
    	VEvent myEvent = new VEvent(new DateTime(), "myEvent");
    	Uid myEventUid = new Uid("myEvent");
    	Comment myEventComment = new Comment("myEvent some comments");
    	myEvent.getProperties().add(myEventUid);
    	myEvent.getProperties().add(myEventComment);
    	
    	// Add event to calendar
    	myCalendar.getComponents().add(myEvent);
    	
    	// declare FastiActionAddEvent
    	FastiActionAddEvent addevent = (FastiActionAddEvent) faw.createAction(FastiActionAddEvent.class, "Sqlite-Connector");
    	addevent.setEvent(myCalendar);
    	
    	// run action
    	boolean resultAdd = addevent.runAction();
    	// add event action with success
    	assertTrue(resultAdd);
    	
    	// declare FastiActionGetEvent
    	FastiActionGetEvent getevent = (FastiActionGetEvent) faw.createAction(FastiActionGetEvent.class, "SQlite-Connector");
    	getevent.setEvent(myCalendar);
    	
    	//run action
    	Calendar resultGet = getevent.runAction();
    	// myCalendar is equals with the result of FastiActionGetEvent.
    	assertEquals(myCalendar, resultGet);

    }

    /**
     * Test of runAction method, of class FastiSqliteActionAddEvent.
     */
    public void testRunAction() {
    }

    /**
     * Test of undoAction method, of class FastiSqliteActionAddEvent.
     */
    public void testUndoAction() {
    }

}
