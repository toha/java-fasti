/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import junit.framework.Test;
import Fasti.Test.FastiTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
        suite.addTest(FastiSqliteShowEventAddEditTabActionTest.suite());
        suite.addTest(FastiSqliteActionConnectTest.suite());
        suite.addTest(FastiSqliteActionGetTodoProgressTest.suite());
        suite.addTest(FastiSqliteActionSetTodoListTest.suite());
        suite.addTest(FastiSqliteActionPrintSomethingTest.suite());
        suite.addTest(FastiSqliteShowCalendarContextMenuActionTest.suite());
        suite.addTest(FastiSqliteActionRemoveCalendarTest.suite());
        suite.addTest(FastiSqliteActionGetDeletedTodosTest.suite());
        suite.addTest(FastiSqliteActionDisconnectTest.suite());
        suite.addTest(FastiSqliteActionGetNewTodoListsTest.suite());
        suite.addTest(FastiSqliteActionGetTodoListTest.suite());
        suite.addTest(FastiSqliteShowConfigurationMenueActionTest.suite());
        suite.addTest(FastiSqliteActionGetDeletedTodoListsTest.suite());
        suite.addTest(FastiSqliteActionRemoveEventTest.suite());
        suite.addTest(FastiSqliteActionGetNewEventsTest.suite());
        suite.addTest(FastiSqliteActionGetNewCalendarTest.suite());
        suite.addTest(FastiSqliteShowTodoListContextMenuActionTest.suite());
        suite.addTest(FastiSqliteActionGetUpdatedTodosTest.suite());
        suite.addTest(FastiSqliteShowCalendarAddEditTabActionTest.suite());
        suite.addTest(FastiSqliteActionGetTodosTest.suite());
        suite.addTest(FastiSqliteActionGetUpdatedTodoListsTest.suite());
        suite.addTest(FastiSqliteActionAddTodoTest.suite());
        suite.addTest(FastiSqliteActionRemoveTodoTest.suite());
        suite.addTest(FastiSqliteActionRemoveTodoListTest.suite());
        suite.addTest(FastiSqliteActionGetCalendarTest.suite());
        suite.addTest(FastiSqliteActionGetEventsTest.suite());
        suite.addTest(FastiSqliteActionSetTodoProgressTest.suite());
        suite.addTest(FastiSqliteActionAddEventTest.suite());
        suite.addTest(FastiSqliteActionGetUpdatedEventsTest.suite());
        suite.addTest(FastiSqliteActionSetCalendarTest.suite());
        suite.addTest(FastiSqliteActionSetEventTest.suite());
        suite.addTest(FastiSqliteActionAddCalendarTest.suite());
        suite.addTest(FastiSqliteActionGetDeletedEventsTest.suite());
        suite.addTest(FastiSqliteActionSetTodoTest.suite());
        suite.addTest(FastiSqliteActionGetTodoTest.suite());
        suite.addTest(FastiSqliteActionGetUpdatedCalendarTest.suite());
        suite.addTest(FastiSqliteActionAddTodoListTest.suite());
        suite.addTest(FastiSqliteActionGetNewTodosTest.suite());
        suite.addTest(FastiSqliteActionGetDeletedCalendarTest.suite());
        suite.addTest(FastiSqliteShowEventContextMenuActionTest.suite());
        suite.addTest(FastiSqliteShowTodoContextMenuActionTest.suite());
        suite.addTest(FastiSqliteActionGetEventTest.suite());
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

}
