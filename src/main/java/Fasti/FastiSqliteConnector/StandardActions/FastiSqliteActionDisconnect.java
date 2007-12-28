/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiGeneralActions;
import Fasti.FastiConnector.FastiAction.GeneralActions.FastiActionDisconnect;


public  class FastiSqliteActionDisconnect extends FastiActionDisconnect {
    public FastiSqliteActionDisconnect() {
        super();
        this.setName(FastiSqliteActionDisconnect.class.getName());
    }

    @Override
    public Boolean runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
