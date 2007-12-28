/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.TodoActions;

import Fasti.FastiConnector.FastiAction.FastiTodoAction;

public abstract class FastiActionSetTodoProgress extends FastiTodoAction {
    public FastiActionSetTodoProgress() {
        this.setUndoable(true);
        this.setName(this.getClass().getName());
    }
    public abstract void saveState();
    public abstract Boolean runAction();
    public abstract void undoAction(); 
}
