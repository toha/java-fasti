/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiTodoListAction;
import Fasti.FastiConnector.FastiAction.TodoListActions.FastiActionGetTodoList;
import net.fortuna.ical4j.model.component.VToDo;

public  class FastiCaldavActionGetTodoList extends FastiActionGetTodoList {
    public FastiCaldavActionGetTodoList() {
        super();
        this.setName(FastiCaldavActionGetTodoList.class.getName());
    }

    @Override
    public VToDo runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
