/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.DummyActions.FastiActionPrintSomething;
import Fasti.FastiConnector.FastiAction.FastiDummyAction;


public class FastiSqliteActionPrintSomething extends FastiActionPrintSomething {

    private String something = "";

    public FastiSqliteActionPrintSomething() {
        super();
        this.setName(FastiSqliteActionPrintSomething.class.getName());
    }

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

    @Override
    public Boolean runAction() {
        //this.getConnector().getLogger().info("Gebe etwas aus: " + something);
        System.out.println(something);
        return true;
    }

    

}
