

package Fasti.FastiData;

import Fasti.FastiConnector.FastiConnectorData;
import Fasti.util.Exceptions.FastiConnectorException;
import Fasti.util.Exceptions.FastiDataException;
import Fasti.util.Exceptions.FastiSynchronisationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author benjamin
 */
public class FastiDataManager {
    private FastiConnectorData std_connector = null;
    private HashMap<String,FastiConnectorData> connectors = new HashMap<String,FastiConnectorData>();
    private ArrayList<FastiConnectorData> available_connectors = new ArrayList<FastiConnectorData>();

    private FastiActionWorker action_worker = new FastiActionWorker(this);
    private Boolean offline_modus = true;

    private TimeZone timezone;
    Locale locale;
    

    private Logger  logger = Logger.getLogger(FastiDataManager.class.getName());


    public FastiDataManager() {
        logger.setLevel(Level.ERROR);

    }

    /**
     * Versetzt das Backend in den Offline-Modus
     */
    public void setOfflineMode() {
        offline_modus = true;
    }

    /**
     * Versetzt das Backend in den Online-Modus
     */
    public void setOnlineMode() {
        offline_modus = false;
    }

    /**
     * Ist das Backend im Offline-Modus?
     * @return true, falls das Backend im Offline-Modus ist, false sonst
     */
    public Boolean isOffline() {
        return offline_modus;
    }



    /**
     * Laedt die Konfiguration für das Backend.
     * Dazu gehören unter Anderen
     *  - Informationen über aktive Connectoren
     *  - Konfigurationen der Connectoren
     *  - Offline-Aktionen, die erst beim nächsten Online gehen ausgeführt werden.
     * @throws FastiDataException
     */
    public void loadGlobalConfiguration() throws FastiDataException {

    }

    /**
     * setzt die gesamte Konfiguration des Backends und der Connectoren
     * @throws FastiDataException
     */
    // TODO: define Paramters
    public void setGlobalConfiguration() throws FastiDataException {

    }

    /**
     * speichert gesamte Konfiguration des Backends und die Offline-Queue
     * @throws FastiDataException
     */
    public void saveGlobalConfiguration() throws FastiDataException {

    }


    public FastiConnectorData createConnector(String name, Class type)  throws FastiDataException {
        FastiConnectorData fcd = null;
        try {
            fcd = (FastiConnectorData) type.newInstance();
            fcd.setName(name);

            // Logger setzen
            //Logger  l = Logger.getLogger(type.getName());
            //l.setLevel(Level.INFO);
            //fcd.setLogger(l);
            
        } catch (InstantiationException ex) {
            //TODO: Richtig Exception-Handling
            java.util.logging.Logger.getLogger(FastiDataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastiDataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        return fcd;
    }

    /**
     * Fügt einen Connector zum Backend hinzu
     * @param c
     * @throws FastiDataException
     */
    public void addConnector(FastiConnectorData c) throws FastiDataException, FastiConnectorException {
        if (connectors.containsKey(c.getName())) {
            throw new FastiConnectorException("Ein Connector mit diesem Namen ist schon vorhangen");
        }
        
        connectors.put(c.getName(), c);
        if (c.isStd_connector())
            std_connector = c;
    }

    /**
     * Löscht einen Connector aus dem Backend
     * @param connector_name Name des Connectors
     * @throws FastiDataException
     */
    public void deleteConnector(String connector_name) throws FastiDataException {
        connectors.remove(connector_name);

        //TODO: Alle Aktionen in den Warteschlangen für den zu entfernenden Connector loeschen
    }

    /**
     * Laedt die Connectoren bei Programmstart
     * @throws FastiConnectorException
     */
    private void initilizeConnectors() throws FastiConnectorException  {

    }

    /**
     * Liefert den Standard-Connector (sqlite)
     * @return Standard-Connector
     */
    public FastiConnectorData getStandardConnector() {

        return std_connector;
    }

    /**
     * Setzt den Standard-Connector
     * @param c
     * @throws FastiConnectorException
     */
    public void setStandardConnector(FastiConnectorData c) throws FastiConnectorException {
        std_connector = c;
    }

    public FastiConnectorData getConnectorByName(String name) {
        if (connectors.containsKey(name)) {
            return connectors.get(name);
        }
        else {
            //TODO Exceptionhandling
            return null;
        }
    }

    /**
     * Setzt eine Zeitzone für das gesamte Backend
     * @param tz
     * @throws FastiDataException
     */
    public void setTimeZone(TimeZone tz)  throws FastiDataException  {

    }   

    /**
     * Gibt die aktuelle Zeitzone zurück
     * @return
     */
    public TimeZone getTimeZone()  {

        return null;
    }   

    /**
     * Setzt das Locale-Objekt
     * @param l
     * @throws FastiDataException
     */
    public void setLocale(Locale l)  throws FastiDataException  {

    }   

    /**
     * Gibt das Locale-Objekt zurück
     * @return
     */
    public Locale getLocale() {
        // TODO: Vllt. Eher deep-copy des Locales damit GUI es nicht direkt veraendern kann.
        return locale;
    }

    /**
     * Synchronisiert zwei Connectoren
     * @param c
     * @param c2
     * @throws FastiSynchronisationException
     */
    public void sychronizeConnectors(FastiConnectorData c, FastiConnectorData c2) throws FastiSynchronisationException {

    }

    /**
     * Gibt den ActionWorker zurück, mit dem Aktionen ausgeführt werden können
     * @return
     */
    public FastiActionWorker getActionWorker() {
        return action_worker;
    }

    /**
     * @return the std_connector
     */
    public FastiConnectorData getStd_connector() {
        return std_connector;
    }

    /**
     * @param std_connector the std_connector to set
     */
    public void setStd_connector(FastiConnectorData std_connector) {
        this.std_connector = std_connector;
    }

    public HashMap<String,FastiConnectorData> getConnectors() {
        return connectors;
    }
}
