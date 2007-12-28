/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiGui;

import Fasti.FastiCaldavConnector.FastiCaldavConnectorData;
import Fasti.FastiConnector.FastiAction.TodoActions.FastiActionAddTodo;
import Fasti.FastiData.FastiActionWorker;
import Fasti.FastiData.FastiDataManager;

import Fasti.FastiSqliteConnector.FastiSqliteConnectorData;
import Fasti.util.Exceptions.FastiConnectorException;
import Fasti.util.Exceptions.FastiDataException;


public class FastiGui {
    public static void main( String[] args ) throws FastiDataException, FastiConnectorException, InstantiationException, IllegalAccessException
    {

        FastiDataManager dm = new FastiDataManager();
        FastiSqliteConnectorData fdc = (FastiSqliteConnectorData) dm.createConnector("Sqlite-Connector", FastiSqliteConnectorData.class);
        //FastiDummyConnectorData fdc = new FastiDummyConnectorData();
        //System.out.println(fdc.getName());
        fdc.setStd_connector(true);
        dm.addConnector(fdc);

        FastiCaldavConnectorData fdc2 = (FastiCaldavConnectorData) dm.createConnector("Caldav-Connector", FastiCaldavConnectorData.class);
 
        fdc2.setStd_connector(false);
        dm.addConnector(fdc2);

        FastiActionWorker faw =  dm.getActionWorker();

        
        //FastiDummyActionPrintSomething action = FastiDummyActionPrintSomething.class.newInstance();
        //System.out.println(action.getCallback());


       //ArrayList<FastiAction> fa = (ArrayList<FastiAction>) faw.createActions(FastiActionGetCalendar.class);
       //FastiActionAddEvent addevent = (FastiActionAddEvent) faw.createAction(FastiActionAddEvent.class, "Sqlite-Connector");




        FastiActionAddTodo adtodo = (FastiActionAddTodo) faw.createAction(FastiActionAddTodo.class, "Sqlite-Connector");
        //faw.runActions(fa);


    }


    public void onAddCalendarDone() {

    }

    public void onAddEventDone() {

    }
}
