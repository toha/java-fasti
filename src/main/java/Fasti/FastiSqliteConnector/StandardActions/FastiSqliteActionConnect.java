/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiGeneralActions;
import Fasti.FastiConnector.FastiAction.GeneralActions.FastiActionConnect;

public class FastiSqliteActionConnect extends FastiActionConnect {
    public FastiSqliteActionConnect() {
        super();
        this.setName(FastiSqliteActionConnect.class.getName());
    }

    @Override
    public Boolean runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
