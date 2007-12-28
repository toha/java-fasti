/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.TodoActions;

import Fasti.FastiConnector.FastiAction.FastiTodoAction;


public abstract class FastiActionGetTodoProgress extends FastiTodoAction {
    public FastiActionGetTodoProgress() {
        this.setUndoable(false);
        this.setName(this.getClass().getName());
    }
    public void saveState() {}
    public abstract net.fortuna.ical4j.model.component.VToDo runAction();
    public void undoAction() {}
}
