/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiConnector.FastiAction.UIActions;

import Fasti.FastiConnector.FastiAction.FastiUIAction;

public abstract class FastiShowConfigurationMenueAction extends FastiUIAction {
    public FastiShowConfigurationMenueAction() {
        this.setUndoable(false);
        this.setName(this.getClass().getName());
    }
    public  void saveState() {}
    public  void undoAction() {}
    //TODO: Durch GUI-Objekt ersetzen
    public abstract Object runAction();
}
