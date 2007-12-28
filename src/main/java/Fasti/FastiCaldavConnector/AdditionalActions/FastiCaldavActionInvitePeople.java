/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.AdditionalActions;

import Fasti.FastiConnector.FastiAction.FastiAction;


public abstract class FastiCaldavActionInvitePeople extends FastiAction {
    public FastiCaldavActionInvitePeople() {
        super();
        this.setName(FastiCaldavActionInvitePeople.class.getName());
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
