/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiGeneralActions;
import Fasti.FastiConnector.FastiAction.GeneralActions.FastiActionDisconnect;


public  class FastiCaldavActionDisconnect extends FastiActionDisconnect {
    public FastiCaldavActionDisconnect() {
        super();
        this.setName(FastiCaldavActionDisconnect.class.getName());
    }

    @Override
    public Boolean runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
