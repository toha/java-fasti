/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.TodoListActions;

import Fasti.FastiConnector.FastiAction.FastiTodoListAction;

public abstract class FastiActionGetTodoList extends FastiTodoListAction {
    public FastiActionGetTodoList() {
        this.setUndoable(false);
        this.setName(this.getClass().getName());
    }
    public  void saveState() {}
    public abstract net.fortuna.ical4j.model.component.VToDo runAction();
    public void undoAction() {}
}
