/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import Fasti.Test.FastiTest;

/**
 *
 * @author tobi
 */
public class StandardActionsSuite extends FastiTest {
    
    public StandardActionsSuite(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("StandardActionsSuite");
        suite.addTest(FastiCaldavActionGetTodoListTest.suite());
        suite.addTest(FastiCaldavActionGetDeletedCalendarTest.suite());
        suite.addTest(FastiCaldavActionGetNewCalendarTest.suite());
        suite.addTest(FastiCaldavActionRemoveEventTest.suite());
        suite.addTest(FastiCaldavActionGetNewTodosTest.suite());
        suite.addTest(FastiCaldavActionGetEventTest.suite());
        suite.addTest(FastiCaldavActionGetDeletedEventsTest.suite());
        suite.addTest(FastiCaldavShowTodoListContextMenuActionTest.suite());
        suite.addTest(FastiCaldavActionDisconnectTest.suite());
        suite.addTest(FastiCaldavActionGetUpdatedTodosTest.suite());
        suite.addTest(FastiCaldavActionConnectTest.suite());
        suite.addTest(FastiCaldavActionSetCalendarTest.suite());
        suite.addTest(FastiCaldavActionAddTodoTest.suite());
        suite.addTest(FastiCaldavActionGetTodoTest.suite());
        suite.addTest(FastiCaldavShowTodoContextMenuActionTest.suite());
        suite.addTest(FastiCaldavActionGetNewTodoListsTest.suite());
        suite.addTest(FastiCaldavActionGetTodoProgressTest.suite());
        suite.addTest(FastiCaldavActionSetTodoTest.suite());
        suite.addTest(FastiCaldavActionGetNewEventsTest.suite());
        suite.addTest(FastiCaldavActionGetUpdatedTodoListsTest.suite());
        suite.addTest(FastiCaldavActionSetTodoProgressTest.suite());
        suite.addTest(FastiCaldavActionSetTodoListTest.suite());
        suite.addTest(FastiCaldavShowEventAddEditTabActionTest.suite());
        suite.addTest(FastiCaldavActionAddCalendarTest.suite());
        suite.addTest(FastiCaldavActionPrintSomethingTest.suite());
        suite.addTest(FastiCaldavActionGetDeletedTodosTest.suite());
        suite.addTest(FastiCaldavActionGetCalendarTest.suite());
        suite.addTest(FastiCaldavShowEventContextMenuActionTest.suite());
        suite.addTest(FastiCaldavShowCalendarContextMenuActionTest.suite());
        suite.addTest(FastiCaldavActionGetDeletedTodoListsTest.suite());
        suite.addTest(FastiCaldavActionRemoveCalendarTest.suite());
        suite.addTest(FastiCaldavActionSetEventTest.suite());
        suite.addTest(FastiCaldavActionAddTodoListTest.suite());
        suite.addTest(FastiCaldavShowConfigurationMenueActionTest.suite());
        suite.addTest(FastiCaldavActionGetUpdatedCalendarTest.suite());
        suite.addTest(FastiCaldavActionRemoveTodoTest.suite());
        suite.addTest(FastiCaldavActionGetUpdatedEventsTest.suite());
        suite.addTest(FastiCaldavShowCalendarAddEditTabActionTest.suite());
        suite.addTest(FastiCaldavActionRemoveTodoListTest.suite());
        suite.addTest(FastiCaldavActionGetTodosTest.suite());
        suite.addTest(FastiCaldavActionAddEventTest.suite());
        suite.addTest(FastiCaldavActionGetEventsTest.suite());
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

}
