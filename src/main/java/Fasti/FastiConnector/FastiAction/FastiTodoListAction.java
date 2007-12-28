/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction;


public abstract class FastiTodoListAction extends FastiAction {

    private net.fortuna.ical4j.model.component.VToDo todolist;

    public abstract void saveState();
    public abstract Object runAction();
    public abstract void undoAction();

    /**
     * @return the todolist
     */
    public net.fortuna.ical4j.model.component.VToDo getTodoList() {
        return todolist;
    }

    /**
     * @param todolist the todolist to set
     */
    public void setTodoList(net.fortuna.ical4j.model.component.VToDo todolist) {
        this.todolist = todolist;
    }

}