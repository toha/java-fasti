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
public class FastiCaldavActionConnectTest extends FastiTest {
    
    public FastiCaldavActionConnectTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiCaldavActionConnectTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Test of runAction method, of class FastiCaldavActionConnect.
     */
    public void testRunAction() {
    }

}
