/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.TodoListActions;

import Fasti.FastiConnector.FastiAction.FastiTodoListAction;

public abstract class FastiActionRemoveTodoList extends FastiTodoListAction  {
    public FastiActionRemoveTodoList() {
        this.setUndoable(true);
        this.setName(this.getClass().getName());
    }
    public abstract void saveState();
    public abstract Boolean runAction();
    public abstract void undoAction();
}
