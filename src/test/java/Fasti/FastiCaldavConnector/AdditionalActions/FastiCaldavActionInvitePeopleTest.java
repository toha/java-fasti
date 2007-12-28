/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.AdditionalActions;

import Fasti.Test.FastiTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author tobi
 */
public class FastiCaldavActionInvitePeopleTest extends FastiTest {
    
    public FastiCaldavActionInvitePeopleTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiCaldavActionInvitePeopleTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Test of saveState method, of class FastiCaldavActionInvitePeople.
     */
    public void testSaveState() {
    }

    /**
     * Test of runAction method, of class FastiCaldavActionInvitePeople.
     */
    public void testRunAction() {
    }

    /**
     * Test of undoAction method, of class FastiCaldavActionInvitePeople.
     */
    public void testUndoAction() {
    }

    public class FastiCaldavActionInvitePeopleImpl extends FastiCaldavActionInvitePeople {
    }

}
