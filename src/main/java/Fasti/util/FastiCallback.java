package Fasti.util;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author tobi
 */
public abstract class FastiCallback {

    private Object caller;
    private Object action_data;

    public abstract void notifyCaller();
    public abstract void setCaller(Object c);
    public abstract Object getCaller();
    public abstract void setActionData(Object ad);
    public abstract Object getActionData();
}
