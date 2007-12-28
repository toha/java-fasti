/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiTodoListAction;
import Fasti.FastiConnector.FastiAction.TodoListActions.FastiActionGetTodoList;
import net.fortuna.ical4j.model.component.VToDo;

public  class FastiSqliteActionGetTodoList extends FastiActionGetTodoList {
    public FastiSqliteActionGetTodoList() {
        super();
        this.setName(FastiSqliteActionGetTodoList.class.getName());
    }

    @Override
    public VToDo runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
