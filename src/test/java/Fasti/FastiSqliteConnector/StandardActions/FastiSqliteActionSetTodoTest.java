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
public class FastiSqliteActionSetTodoTest extends FastiTest {
    
    public FastiSqliteActionSetTodoTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiSqliteActionSetTodoTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Test of saveState method, of class FastiSqliteActionSetTodo.
     */
    public void testSaveState() {
    }

    /**
     * Test of runAction method, of class FastiSqliteActionSetTodo.
     */
    public void testRunAction() {
    }

    /**
     * Test of undoAction method, of class FastiSqliteActionSetTodo.
     */
    public void testUndoAction() {
    }

}
