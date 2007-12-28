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
public class FastiSqliteActionRemoveTodoListTest extends FastiTest {
    
    public FastiSqliteActionRemoveTodoListTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiSqliteActionRemoveTodoListTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Test of saveState method, of class FastiSqliteActionRemoveTodoList.
     */
    public void testSaveState() {
    }

    /**
     * Test of runAction method, of class FastiSqliteActionRemoveTodoList.
     */
    public void testRunAction() {
    }

    /**
     * Test of undoAction method, of class FastiSqliteActionRemoveTodoList.
     */
    public void testUndoAction() {
    }

}
