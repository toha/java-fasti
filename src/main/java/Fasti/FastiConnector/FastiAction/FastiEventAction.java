/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction;


public abstract class FastiEventAction extends FastiAction {

    private net.fortuna.ical4j.model.Calendar event;

    public abstract void saveState();
    public abstract Object runAction();
    public abstract void undoAction();

    public void setEvent(net.fortuna.ical4j.model.Calendar e) {
        event = e;
    }

}
