/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiTodoListAction;
import Fasti.FastiConnector.FastiAction.TodoListActions.FastiActionAddTodoList;

public class FastiSqliteActionAddTodoList extends FastiActionAddTodoList  {
    public FastiSqliteActionAddTodoList() {
        super();
        this.setName(FastiSqliteActionAddTodoList.class.getName());
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
