/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiData;


import Fasti.FastiConnector.FastiAction.FastiAction;
import Fasti.FastiConnector.FastiConnectorData;
import Fasti.util.Exceptions.FastiDataException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author andree
 */
public class FastiActionWorker {

    // Queue, die vom Thread abgearbeitet wird
    Queue<FastiAction> action_queue = new LinkedList<FastiAction>();

    // Stack, in dem Aktionen eingefügt werden, die Rückgängig gemacht werden können
    Stack action_stack = new Stack();

    // Falls das Backend im Offline-Modus ist, werden die Aktionen, die nur im
    // Online-Modus verfügbar sind, hier gespeichert.
    Queue<FastiAction> offline_queue = new LinkedList<FastiAction>();

    private FastiDataManager datamanager;
    private Logger  logger = Logger.getLogger(FastiActionWorker.class.getName());

    public FastiActionWorker(FastiDataManager dm) {
        datamanager = dm;
        logger.setLevel(Level.ERROR);
    }

    /**
     * Wird in einem neuen Thread gestartet.
     * Arbeitet Aktionen aus der Warteschlange sequentiell ab.
     */
    public void runActionThread() {

    }

    /**
     * Erstellt die angegebene Aktion fuer den angegebenen Connector
     * @param action_name Name der Aktion
     * @param connector Connector auf dem die Aktion ausgeführt wird
     * @return erstellte Aktion
     */
    public FastiAction createAction(Class action_class, String connector_name) throws FastiDataException {
        FastiAction fa = null;
        FastiConnectorData connector = null;
        try {
            connector =  datamanager.getConnectorByName(connector_name);
        }
        catch (Exception ex) {
            throw new FastiDataException("error getting given connector: " + ex.getMessage());
        }
        if (connector != null) {
            if (connector.getActions().getConnectorActions().containsKey(action_class)) {
                try {
                   
                    fa = (FastiAction) connector.getActions().getConnectorActions().get(action_class).newInstance();
                    fa.setConnector(connector);
                }
                catch (Exception ex) {
                    throw new FastiDataException("error creating given action: " + ex.getMessage());
                }
            }
            else {
                throw new FastiDataException("given action doesn't exists");
            }
        }
        else {
            throw new FastiDataException("error getting given connector");
        }

        return fa;
    }

    /**
     * Erstellt angegebene Aktion für alle Connectoren.
     * @param action_name Name der Aktion
     * @return Arraylist der erstellten Aktionen
     */
    public ArrayList<FastiAction> createActions(Class action_class) throws FastiDataException, InstantiationException, IllegalAccessException {
        ArrayList<FastiAction> actions = new ArrayList<FastiAction>();
        HashMap<String, FastiConnectorData> connectors = datamanager.getConnectors();


        Collection c = connectors.values();

        Iterator itr = c.iterator();

        while(itr.hasNext()) {
            FastiConnectorData con = (FastiConnectorData) itr.next();
            FastiAction action = createAction(action_class,  con.getName());
            actions.add(action);
        }
        return actions;
        
    }

    /**
     * Fügt eine Aktion zur Aktions-Warteschlange hinzu.
     * @param action Aktion die hinzugefügt werden soll
     */
    public void addActionToQueue(FastiAction action) {
        if (datamanager.isOffline()) {
            if (action.getConnector().isOnline_connector()) {
                // Das Backend ist im Offline-Modus und die Aktion soll auf 
                // einem Online-Connector ausgeführt werden. Also wird die Aktion
                // zur Offline-Queue hinzgefügt, die abgearbeitet wird, sobald
                // der Backend wieder in den Online-Modus wechselt.
                offline_queue.add(action);
                return;
            }
        }

        // backend ist online. Action direkt in die Warteschlange
        action_queue.add(action);
        
    }

    /**
     * Fügt mehrere Aktionen zur Aktions-Warteschlange hinzu.
     * @param actions Aktionen die hinzugefügt werden sollen
     */
    public void addActionsToQueue(ArrayList<FastiAction> actions) {
        Iterator itr = actions.iterator();
        while(itr.hasNext()) {
            FastiAction fa = (FastiAction) itr.next();
            addActionToQueue(fa);
        }
    }

    /**
     * Entfernt die am längsten in der Queue enthaltene Aktion aus dieser und 
     * gibt sie zurück. Wird nur intern vom Action-Thread benutzt
     * @param
     */
    private FastiAction removeActionFromQueue() {
        FastiAction fa = (FastiAction) action_queue.remove();
        return fa;
    }

    /**
     * Führt eine Aktion direkt aus und gibt das von den Aktionen erhaltene Ergebnis direkt zurück
     * @param action
     * @return Ergebnis der Aktion
     */
    public Object runAction(FastiAction action) {

        if (action.isUndoable())
            action.saveState();

        
        Object result = action.runAction();

        if (action.isUndoable())
            pushActionStack(action);

        if (action.getCallback() == null) {
            
        }
            
        else {
            action.getCallback().notifyCaller();
        }

        if (action.isUndoable())
            action_stack.add(action);

        return result;
    }

    /**
     * Führt mehrere Aktion direkt aus und gibt das von den Aktionen
     * erhaltene Ergenis als ArrayList zurück
     * @param actions auszuführende Aktionen als ArrayList
     * @return Ergebnis der Aktionen als ArrayList
     */
    public ArrayList<Object> runActions(ArrayList<FastiAction> actions) {
        ArrayList<Object> reslist = new ArrayList<Object>();
        Iterator itr = actions.iterator();
        while(itr.hasNext()) {
            FastiAction fa = (FastiAction) itr.next();
            Object result = runAction(fa);
            reslist.add(result);
        }

        return reslist;
    }

    /**
     * Legt eine abgearbeitete Aktion auf den Stack ab, um diese bei Bedarf
     * rückgängig machen zu können.
     * @param action Aktion
     */
    public void pushActionStack(FastiAction action) {
        action_stack.push(action);
    }

    /**
     * Holt die letzte Aktion  aus dem Stack
     * @return Aktion aus dem Stack
     */
    public FastiAction popActionStack() {
        FastiAction fa = (FastiAction) action_stack.pop();
        return fa;
    }

    /**
     * @return the datamanager
     */
    public FastiDataManager getDatamanager() {
        return datamanager;
    }

    /**
     * @param datamanager the datamanager to set
     */
    public void setDatamanager(FastiDataManager datamanager) {
        this.datamanager = datamanager;
    }




}
