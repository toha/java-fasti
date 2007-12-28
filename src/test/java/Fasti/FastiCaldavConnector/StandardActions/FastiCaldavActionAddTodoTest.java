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
public class FastiCaldavActionAddTodoTest extends FastiTest {
    
    public FastiCaldavActionAddTodoTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiCaldavActionAddTodoTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Test of saveState method, of class FastiCaldavActionAddTodo.
     */
    public void testSaveState() {
    }

    /**
     * Test of runAction method, of class FastiCaldavActionAddTodo.
     */
    public void testRunAction() {
    }

    /**
     * Test of undoAction method, of class FastiCaldavActionAddTodo.
     */
    public void testUndoAction() {
    }

    public class FastiCaldavActionAddTodoImpl extends FastiCaldavActionAddTodo {
    }

}
