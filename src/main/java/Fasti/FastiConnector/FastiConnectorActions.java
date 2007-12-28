/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector;

import java.util.HashMap;


public abstract class FastiConnectorActions {

    protected HashMap<Class,Class> connector_actions = new HashMap<Class,Class>();
    public HashMap<Class,Class> getConnectorActions() {
        return connector_actions;
    }
}
