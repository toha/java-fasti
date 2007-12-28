/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetNewTodoLists;
import java.util.ArrayList;
import net.fortuna.ical4j.model.component.VToDo;

public  class FastiSqliteActionGetNewTodoLists extends FastiActionGetNewTodoLists {
    public FastiSqliteActionGetNewTodoLists() {
        super();
        this.setName(FastiSqliteActionGetNewTodoLists.class.getName());
    }

    @Override
    public ArrayList<VToDo> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
