/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.TodoActions;

import Fasti.FastiConnector.FastiAction.FastiTodoAction;
import java.util.ArrayList;

public abstract class FastiActionGetTodos extends FastiTodoAction {
    public FastiActionGetTodos() {
        this.setUndoable(false);
        this.setName(this.getClass().getName());
    }
    public void saveState() {}
    public abstract ArrayList<net.fortuna.ical4j.model.component.VToDo> runAction();
    public void undoAction() {}
}
