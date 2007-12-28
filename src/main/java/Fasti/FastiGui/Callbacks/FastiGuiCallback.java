/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiGui.Callbacks;

import Fasti.util.FastiCallback;
import Fasti.FastiData.*;
import Fasti.FastiGui.FastiGui;

public abstract class FastiGuiCallback extends FastiCallback {

    private FastiGui caller = null;
    private Object action_data = null;

    public abstract void notifyCaller();

    @Override
    public void setCaller(Object c) {
        // TODO: Add try-catch
        caller = (FastiGui) c;
    }

    @Override
    public FastiGui getCaller() {
        return caller;
    }

    @Override
    public void setActionData(Object ad) {
        // Standardmaeßig keine Parameter
    }

    @Override
    public Object getActionData() {
        return action_data;
    }



}
