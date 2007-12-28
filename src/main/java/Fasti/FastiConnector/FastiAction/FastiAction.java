/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction;

import Fasti.FastiConnector.FastiConnectorData;
import Fasti.util.FastiCallback;


public abstract class FastiAction {
    public FastiCallback callback = null;
    public boolean undoable = false;
    public String name;
    public FastiConnectorData connector;


    public abstract void saveState();
    public abstract Object runAction();
    public abstract void undoAction();


    /**
     * @param callback the callback to set
     */
    public void setCallback(FastiCallback callback) {
        this.callback = callback;
    }

    /**
     * @return the undoable
     */
    public Boolean isUndoable() {
        return undoable;
    }

    public FastiCallback getCallback() {
        return null;
    }

    /**
     * @param undoable the undoable to set
     */
    public void setUndoable(boolean undoable) {
        this.undoable = undoable;
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
     * @return the connector
     */
    public FastiConnectorData getConnector() {
        return connector;
    }

    /**
     * @param connector the connector to set
     */
    public void setConnector(FastiConnectorData connector) {
        this.connector = connector;
    }



}
