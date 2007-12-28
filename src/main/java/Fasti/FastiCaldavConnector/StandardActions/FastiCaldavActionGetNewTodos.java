/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetNewTodos;
import java.util.ArrayList;
import net.fortuna.ical4j.model.component.VToDo;

public  class FastiCaldavActionGetNewTodos extends FastiActionGetNewTodos {
    public FastiCaldavActionGetNewTodos() {
        super();
        this.setName(FastiCaldavActionGetNewTodos.class.getName());
    }

    @Override
    public ArrayList<VToDo> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
