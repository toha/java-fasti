/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiTodoAction;
import Fasti.FastiConnector.FastiAction.TodoActions.FastiActionGetTodos;
import java.util.ArrayList;
import net.fortuna.ical4j.model.component.VToDo;

public  class FastiSqliteActionGetTodos extends FastiActionGetTodos {
    public FastiSqliteActionGetTodos() {
        super();
        this.setName(FastiSqliteActionGetTodos.class.getName());
    }

    @Override
    public ArrayList<VToDo> runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
