/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.FastiTodoAction;
import Fasti.FastiConnector.FastiAction.TodoActions.FastiActionGetTodoProgress;
import net.fortuna.ical4j.model.component.VToDo;


public  class FastiCaldavActionGetTodoProgress extends FastiActionGetTodoProgress {
    public FastiCaldavActionGetTodoProgress() {
        super();
        this.setName(FastiCaldavActionGetTodoProgress.class.getName());
    }

    @Override
    public VToDo runAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
