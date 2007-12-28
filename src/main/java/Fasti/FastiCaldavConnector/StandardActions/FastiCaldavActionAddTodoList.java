/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiTodoListAction;
import Fasti.FastiConnector.FastiAction.TodoListActions.FastiActionAddTodoList;

public abstract class FastiCaldavActionAddTodoList extends FastiActionAddTodoList  {
    public FastiCaldavActionAddTodoList() {
        super();
        this.setName(FastiCaldavActionAddTodoList.class.getName());
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
