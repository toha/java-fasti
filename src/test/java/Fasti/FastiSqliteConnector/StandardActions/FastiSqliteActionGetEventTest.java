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
public class FastiSqliteActionGetEventTest extends FastiTest {
    
    public FastiSqliteActionGetEventTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiSqliteActionGetEventTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Test of runAction method, of class FastiSqliteActionGetEvent.
     */
    public void testRunAction() {
    }

}
