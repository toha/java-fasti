/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiData;

import Fasti.FastiSqliteConnector.FastiSqliteConnectorData;
import Fasti.Test.FastiTest;
import Fasti.util.Exceptions.FastiConnectorException;
import Fasti.util.Exceptions.FastiDataException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author tobi
 */
public class FastiDataManagerTest extends FastiTest {
    
    public FastiDataManagerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FastiDataManagerTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * @author Tobias Hartwich (tha)
     */
    public void testDataManager() throws FastiDataException, FastiConnectorException  {
        FastiDataManager dm2 = new FastiDataManager();
        // Prüfen ob ein Connector korrekt erstellt wird
            FastiSqliteConnectorData connector = (FastiSqliteConnectorData)
                    dm2.createConnector("Sqlite-Connector",
                                       FastiSqliteConnectorData.class);

            assertEquals(connector.getClass(), FastiSqliteConnectorData.class);



        // Standard-Connector setzen und abfragen
            dm2.setStandardConnector(connector);
            assertSame(connector, dm2.getStandardConnector());


    }

    /**
     * Test of setOfflineMode method, of class FastiDataManager.
     */
    public void testSetOfflineMode() {
    }

    /**
     * Test of setOnlineMode method, of class FastiDataManager.
     */
    public void testSetOnlineMode() {
    }

    /**
     * Test of isOffline method, of class FastiDataManager.
     */
    public void testIsOffline() {
    }

    /**
     * Test of loadGlobalConfiguration method, of class FastiDataManager.
     */
    public void testLoadGlobalConfiguration() throws Exception {
    }

    /**
     * Test of setGlobalConfiguration method, of class FastiDataManager.
     */
    public void testSetGlobalConfiguration() throws Exception {
    }

    /**
     * Test of saveGlobalConfiguration method, of class FastiDataManager.
     */
    public void testSaveGlobalConfiguration() throws Exception {
    }

    /**
     * Test of createConnector method, of class FastiDataManager.
     */
    public void testCreateConnector() throws Exception {
    }

    /**
     * Test of addConnector method, of class FastiDataManager.
     */
    public void testAddConnector() throws Exception {
    }

    /**
     * Test of deleteConnector method, of class FastiDataManager.
     */
    public void testDeleteConnector() throws Exception {
    }

    /**
     * Test of getStandardConnector method, of class FastiDataManager.
     */
    public void testGetStandardConnector() {
    }

    /**
     * Test of setStandardConnector method, of class FastiDataManager.
     */
    public void testSetStandardConnector() throws Exception {
    }

    /**
     * Test of getConnectorByName method, of class FastiDataManager.
     */
    public void testGetConnectorByName() {
    }

    /**
     * Test of setTimeZone method, of class FastiDataManager.
     */
    public void testSetTimeZone() throws Exception {
    }

    /**
     * Test of getTimeZone method, of class FastiDataManager.
     */
    public void testGetTimeZone() {
    }

    /**
     * Test of setLocale method, of class FastiDataManager.
     */
    public void testSetLocale() throws Exception {
    }

    /**
     * Test of getLocale method, of class FastiDataManager.
     */
    public void testGetLocale() {
    }

    /**
     * Test of sychronizeConnectors method, of class FastiDataManager.
     */
    public void testSychronizeConnectors() throws Exception {
    }

    /**
     * Test of getActionWorker method, of class FastiDataManager.
     */
    public void testGetActionWorker() {
    }

    /**
     * Test of getStd_connector method, of class FastiDataManager.
     */
    public void testGetStd_connector() {
    }

    /**
     * Test of setStd_connector method, of class FastiDataManager.
     */
    public void testSetStd_connector() {
    }

    /**
     * Test of getConnectors method, of class FastiDataManager.
     */
    public void testGetConnectors() {
    }

}
