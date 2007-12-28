/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.EventActions.FastiActionAddEvent;
import Fasti.FastiConnector.FastiAction.FastiEventAction;

/**
 *
 * @author robin
 */
public class FastiCaldavActionAddEvent extends FastiActionAddEvent {
    public FastiCaldavActionAddEvent() {
        super();
        this.setName(FastiCaldavActionAddEvent.class.getName());
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
