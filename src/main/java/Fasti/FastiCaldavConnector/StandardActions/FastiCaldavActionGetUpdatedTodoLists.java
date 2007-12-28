/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetUpdatedTodoLists;
import java.util.ArrayList;
import net.fortuna.ical4j.model.component.VToDo;

public  class FastiCaldavActionGetUpdatedTodoLists extends FastiActionGetUpdatedTodoLists {
    public FastiCaldavActionGetUpdatedTodoLists() {
        super();
        this.setName(FastiCaldavActionGetUpdatedTodoLists.class.getName());
    }

    @Override
    public ArrayList<VToDo> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
