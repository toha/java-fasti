/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiSyncAction;
import Fasti.FastiConnector.FastiAction.SyncActions.FastiActionGetUpdatedTodos;
import java.util.ArrayList;
import net.fortuna.ical4j.model.component.VToDo;

public  class FastiSqliteActionGetUpdatedTodos extends FastiActionGetUpdatedTodos {
    public FastiSqliteActionGetUpdatedTodos() {
        super();
        this.setName(FastiSqliteActionGetUpdatedTodos.class.getName());
    }

    @Override
    public ArrayList<VToDo> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
