/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiData;

import Fasti.FastiConnector.FastiAction.CalendarActions.FastiActionAddCalendar;
import Fasti.util.Exceptions.FastiDataException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author tobi
 */
public class FastiActionWorkerTest extends TestCase {
    
    public FastiActionWorkerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiActionWorkerTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }


    /**
     * @author Tobias Hartwich (tha)
     */
    public void testActionWorker() throws FastiDataException  {
        FastiDataManager dm2 = new FastiDataManager();

        // Erstellen einer Aktion testen
        FastiActionAddCalendar fa = (FastiActionAddCalendar)
                dm2.getActionWorker().createAction(FastiActionAddCalendar.class, "Sqlite-Connector");
        assertEquals(fa.getClass(), FastiActionAddCalendar.class);


        // Erstellen von mehreren Aktionen testen


        // Hinzufügen einer Aktion zur Warteschlange


        // Das gleiche im Offline-Modus


        // Direktes Ausführen einer Aktion über den ActionWorker

        // Undo testen

    }

    /**
     * Test of runActionThread method, of class FastiActionWorker.
     */
    public void testRunActionThread() {
    }

    /**
     * Test of createAction method, of class FastiActionWorker.
     */
    public void testCreateAction() throws Exception {
    }

    /**
     * Test of createActions method, of class FastiActionWorker.
     */
    public void testCreateActions() throws Exception {
    }

    /**
     * Test of addActionToQueue method, of class FastiActionWorker.
     */
    public void testAddActionToQueue() {
    }

    /**
     * Test of addActionsToQueue method, of class FastiActionWorker.
     */
    public void testAddActionsToQueue() {
    }

    /**
     * Test of runAction method, of class FastiActionWorker.
     */
    public void testRunAction() {
    }

    /**
     * Test of runActions method, of class FastiActionWorker.
     */
    public void testRunActions() {
    }

    /**
     * Test of pushActionStack method, of class FastiActionWorker.
     */
    public void testPushActionStack() {
    }

    /**
     * Test of popActionStack method, of class FastiActionWorker.
     */
    public void testPopActionStack() {
    }

    /**
     * Test of getDatamanager method, of class FastiActionWorker.
     */
    public void testGetDatamanager() {
    }

    /**
     * Test of setDatamanager method, of class FastiActionWorker.
     */
    public void testSetDatamanager() {
    }

}
