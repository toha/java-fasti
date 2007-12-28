/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.Test;

import Fasti.FastiCaldavConnector.FastiCaldavConnectorData;
import Fasti.FastiData.FastiActionWorker;
import Fasti.FastiData.FastiDataManager;
import Fasti.FastiSqliteConnector.FastiSqliteConnectorData;
import junit.framework.TestCase;

/**
 *
 * @author tobi
 */
public abstract class FastiTest extends TestCase {

        protected FastiDataManager dm = new FastiDataManager();
        protected FastiSqliteConnectorData fdc;
        protected FastiCaldavConnectorData fdc2;
        protected FastiActionWorker faw;

    public FastiTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {


        try {

            // Objekt fuer Verbindung zu SQLite erzeugen
            fdc = (FastiSqliteConnectorData)
                    dm.createConnector("Sqlite-Connector",
                                       FastiSqliteConnectorData.class);
            fdc.setStd_connector(true);

            // SQLite-Verbindung dem DataManager uebergeben
            dm.addConnector(fdc);


            // Objekt fuer Verbindung zu Caldav-Server erzeugen
            fdc2 = (FastiCaldavConnectorData)
                    dm.createConnector("Caldav-Connector",
                                       FastiCaldavConnectorData.class);
            fdc2.setStd_connector(false);

            // Caldav-Verbindung dem DataManager uebergeben
            dm.addConnector(fdc2);

            // ActionWorker-Objekt erzeugen, das als Warteschlange zum
            // Abarbeiten von Aktionen dient.
            faw =  dm.getActionWorker();
        }
        catch (Exception ex) {
            fail("Fehler beim aufsetzen der Testumgebung");
        }
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }



}
