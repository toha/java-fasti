/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.EventActions.FastiActionAddEvent;
import Fasti.FastiConnector.FastiAction.FastiEventAction;


public class FastiSqliteActionAddEvent extends FastiActionAddEvent {
    public FastiSqliteActionAddEvent() {
        super();
        this.setName(FastiSqliteActionAddEvent.class.getName());
    }


    @Override
    public void saveState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void undoAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
