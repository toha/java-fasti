/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector;

import Fasti.FastiConnector.*;


public class FastiCaldavConnectorData extends FastiConnectorData {

    public FastiCaldavConnectorData() {
        super(FastiCaldavConnectorData.class);
        actions = new FastiCaldavConnectorActions();
        online_connector = true;
    }




}
