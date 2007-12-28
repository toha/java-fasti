/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiGui.Callbacks;


public class FastiAddEventCallback extends FastiGuiCallback {

    public void notifyCaller() {
        if (getCaller() == null) {
            // TODO: Throw Exception
        }

       getCaller().onAddEventDone();
    }

}
