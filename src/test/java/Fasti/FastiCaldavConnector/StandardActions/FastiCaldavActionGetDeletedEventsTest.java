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
public class FastiCaldavActionGetDeletedEventsTest extends FastiTest {
    
    public FastiCaldavActionGetDeletedEventsTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiCaldavActionGetDeletedEventsTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Test of runAction method, of class FastiCaldavActionGetDeletedEvents.
     */
    public void testRunAction() {
    }

}
