/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetNewTodoLists;
import java.util.ArrayList;
import net.fortuna.ical4j.model.component.VToDo;

public  class FastiCaldavActionGetNewTodoLists extends FastiActionGetNewTodoLists {
    public FastiCaldavActionGetNewTodoLists() {
        super();
        this.setName(FastiCaldavActionGetNewTodoLists.class.getName());
    }

    @Override
    public ArrayList<VToDo> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
