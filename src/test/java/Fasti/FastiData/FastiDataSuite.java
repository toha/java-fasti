/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiData;

import Fasti.Test.FastiTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author tobi
 */
public class FastiDataSuite extends FastiTest {
    
    public FastiDataSuite(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("FastiDataSuite");
        suite.addTest(FastiDataManagerTest.suite());
        suite.addTest(FastiActionWorkerTest.suite());
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

}
