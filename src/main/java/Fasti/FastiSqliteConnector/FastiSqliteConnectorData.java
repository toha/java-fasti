/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector;

import Fasti.FastiConnector.*;


public class FastiSqliteConnectorData extends FastiConnectorData {

    public FastiSqliteConnectorData() {
        super(FastiSqliteConnectorData.class);
        actions = new FastiSqliteConnectorActions();
        online_connector = false;
    }




}
