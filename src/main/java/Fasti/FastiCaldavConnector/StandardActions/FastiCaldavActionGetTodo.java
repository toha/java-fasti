/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiTodoAction;
import Fasti.FastiConnector.FastiAction.TodoActions.FastiActionGetTodo;
import net.fortuna.ical4j.model.component.VToDo;

public  class FastiCaldavActionGetTodo extends FastiActionGetTodo {
    public FastiCaldavActionGetTodo() {
        super();
        this.setName(FastiCaldavActionGetTodo.class.getName());
    }

    @Override
    public VToDo runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
