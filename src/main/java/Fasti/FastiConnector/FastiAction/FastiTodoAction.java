/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction;


public abstract class FastiTodoAction extends FastiAction {

    private net.fortuna.ical4j.model.Calendar cal;

    public abstract void saveState();
    public abstract Object runAction();
    public abstract void undoAction();

    /**
     * @return the todo
     */
    public net.fortuna.ical4j.model.Calendar getTodo() {
        return cal;
    }

    /**
     * @param todo the todo to set
     */
    public void setTodo(net.fortuna.ical4j.model.Calendar cal) {
        this.cal = cal;
    }

}
