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
public class FastiCaldavActionAddTodoListTest extends FastiTest {
    
    public FastiCaldavActionAddTodoListTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiCaldavActionAddTodoListTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Test of saveState method, of class FastiCaldavActionAddTodoList.
     */
    public void testSaveState() {
    }

    /**
     * Test of runAction method, of class FastiCaldavActionAddTodoList.
     */
    public void testRunAction() {
    }

    /**
     * Test of undoAction method, of class FastiCaldavActionAddTodoList.
     */
    public void testUndoAction() {
    }

    public class FastiCaldavActionAddTodoListImpl extends FastiCaldavActionAddTodoList {
    }

}
