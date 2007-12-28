/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.DummyActions;

import Fasti.FastiConnector.FastiAction.FastiDummyAction;


public abstract class FastiActionPrintSomething extends FastiDummyAction {

    private String something = "";

    public FastiActionPrintSomething() {
        this.setUndoable(false);
        this.setName(this.getClass().getName());
    }

    public void saveState() {}
    public abstract Boolean  runAction();
    public void undoAction() {}

    /**
     * @return the something
     */
    public String getSomething() {
        return something;
    }

    /**
     * @param something the something to set
     */
    public void setSomething(String something) {
        this.something = something;
    }

    

}
