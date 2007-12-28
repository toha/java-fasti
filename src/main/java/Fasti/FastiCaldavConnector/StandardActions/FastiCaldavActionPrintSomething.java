/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector.StandardActions;

import Fasti.FastiConnector.FastiAction.DummyActions.FastiActionPrintSomething;
import Fasti.FastiConnector.FastiAction.FastiDummyAction;


public class FastiCaldavActionPrintSomething extends FastiActionPrintSomething {

    private String something = "";

    public FastiCaldavActionPrintSomething() {
        super();
        this.setName(FastiCaldavActionPrintSomething.class.getName());
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
        System.out.println(something);
        return true;
    }

    

}
