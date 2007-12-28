/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiTodoAction;
import Fasti.FastiConnector.FastiAction.TodoActions.FastiActionSetTodo;

public  class FastiCaldavActionSetTodo extends FastiActionSetTodo {
    public FastiCaldavActionSetTodo() {
        super();
        this.setName(FastiCaldavActionSetTodo.class.getName());
    }

    @Override
    public void saveState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void undoAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
