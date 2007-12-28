/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.EventActions.FastiActionRemoveEvent;
import Fasti.FastiConnector.FastiAction.FastiEventAction;


public  class FastiCaldavActionRemoveEvent extends FastiActionRemoveEvent {
    public FastiCaldavActionRemoveEvent() {
        super();
        this.setName(FastiCaldavActionRemoveEvent.class.getName());
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
