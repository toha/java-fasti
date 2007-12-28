/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;


import Fasti.FastiConnector.FastiAction.TodoActions.FastiActionAddTodo;


/**
 *
 * @author michael
 */
public class FastiSqliteActionAddTodo extends FastiActionAddTodo {
    public FastiSqliteActionAddTodo() {
        super();
        this.setName(FastiSqliteActionAddTodo.class.getName());
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
