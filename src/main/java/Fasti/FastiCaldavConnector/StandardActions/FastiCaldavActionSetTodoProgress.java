/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiTodoAction;
import Fasti.FastiConnector.FastiAction.TodoActions.FastiActionSetTodoProgress;

public  class FastiCaldavActionSetTodoProgress extends FastiActionSetTodoProgress {
    public FastiCaldavActionSetTodoProgress() {
        super();
        this.setName(FastiCaldavActionSetTodoProgress.class.getName());
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
