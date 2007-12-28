/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.EventActions.FastiActionRemoveEvent;
import Fasti.FastiConnector.FastiAction.FastiEventAction;


public  class FastiSqliteActionRemoveEvent extends FastiActionRemoveEvent {
    public FastiSqliteActionRemoveEvent() {
        super();
        this.setName(FastiSqliteActionRemoveEvent.class.getName());
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
