/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector;

import Fasti.FastiData.FastiDataManager;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;



public abstract class FastiConnectorData {
    protected String name;
    protected boolean std_connector = false;
    protected boolean online_connector = false;
    protected Object configuration;
    protected Logger logger;
    protected TimeZone timezone;
    protected Locale locale;
    protected FastiDataManager datamanager;
    protected FastiConnectorActions actions;

    public FastiConnectorData(Class type) {
        logger = Logger.getLogger(type.getName());

        logger.setLevel(Level.ERROR);

        //logger.info("blaaa");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the configuration
     */
    public Object getConfiguration() {
        return configuration;
    }

    /**
     * @param configuration the configuration to set
     */
    public void setConfiguration(Object configuration) {
        this.configuration = configuration;
    }

    /**
     * @return the logger
     */
    public Logger getLogger() {
        return logger;
    }

    /**
     * @param logger the logger to set
     */
    public void setLogger(org.apache.log4j.Logger l) {
        this.logger = l;
    }

    /**
     * @return the timezone
     */
    public TimeZone getTimezone() {
        return timezone;
    }

    /**
     * @param timezone the timezone to set
     */
    public void setTimezone(TimeZone timezone) {
        this.timezone = timezone;
    }

    /**
     * @return the locale
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * @param locale the locale to set
     */
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    /**
     * @return the std_connector
     */
    public boolean isStd_connector() {
        return std_connector;
    }

    /**
     * @param std_connector the std_connector to set
     */
    public void setStd_connector(boolean std_connector) {
        this.std_connector = std_connector;
    }

    /**
     * @return the actions
     */
    public FastiConnectorActions getActions() {
        return actions;
    }


    /**
     * @param datamanager the datamanager to set
     */
    public void setDatamanager(FastiDataManager datamanager) {
        this.datamanager = datamanager;
    }

    /**
     * @return the online_connector
     */
    public boolean isOnline_connector() {
        return online_connector;
    }

    /**
     * @param online_connector the online_connector to set
     */
    public void setOnline_connector(boolean online_connector) {
        this.online_connector = online_connector;
    }


 
    
}
