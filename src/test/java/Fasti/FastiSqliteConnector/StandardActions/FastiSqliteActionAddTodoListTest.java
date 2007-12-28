/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.Test.FastiTest;
import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author tobi
 */
public class FastiSqliteActionAddTodoListTest extends FastiTest {
    
    public FastiSqliteActionAddTodoListTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiSqliteActionAddTodoListTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Test of saveState method, of class FastiSqliteActionAddTodoList.
     */
    public void testSaveState() {
    }

    /**
     * Test of runAction method, of class FastiSqliteActionAddTodoList.
     */
    public void testRunAction() {
    }

    /**
     * Test of undoAction method, of class FastiSqliteActionAddTodoList.
     */
    public void testUndoAction() {
    }

}
