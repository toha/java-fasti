/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiSqliteConnector;

import Fasti.FastiConnector.FastiAction.CalendarActions.*;
import Fasti.FastiConnector.FastiAction.EventActions.*;
import Fasti.FastiConnector.FastiAction.GeneralActions.*;
import Fasti.FastiConnector.FastiAction.SyncActions.*;
import Fasti.FastiConnector.FastiAction.TodoActions.*;
import Fasti.FastiConnector.FastiAction.TodoListActions.*;
import Fasti.FastiConnector.FastiAction.UIActions.*;
import Fasti.FastiConnector.FastiConnectorActions;
import Fasti.FastiSqliteConnector.StandardActions.*;


public class FastiSqliteConnectorActions extends FastiConnectorActions {

    public FastiSqliteConnectorActions() {
        connector_actions.put(FastiActionAddCalendar.class, FastiSqliteActionAddCalendar.class);
        connector_actions.put(FastiActionGetCalendar.class, FastiSqliteActionGetCalendar.class);
        connector_actions.put(FastiActionRemoveCalendar.class, FastiSqliteActionRemoveCalendar.class);
        connector_actions.put(FastiActionSetCalendar.class, FastiSqliteActionSetCalendar.class);
        connector_actions.put(FastiActionAddEvent.class, FastiSqliteActionAddEvent.class);
        connector_actions.put(FastiActionGetEvent.class, FastiSqliteActionGetEvent.class);
        connector_actions.put(FastiActionGetEvents.class, FastiSqliteActionGetEvents.class);
        connector_actions.put(FastiActionRemoveEvent.class, FastiSqliteActionRemoveEvent.class);
        connector_actions.put(FastiActionSetEvent.class, FastiSqliteActionSetEvent.class);
        connector_actions.put(FastiActionConnect.class, FastiSqliteActionConnect.class);
        connector_actions.put(FastiActionDisconnect.class, FastiSqliteActionDisconnect.class);
        connector_actions.put(FastiActionGetDeletedCalendar.class, FastiSqliteActionGetDeletedCalendar.class);
        connector_actions.put(FastiActionGetDeletedTodoLists.class, FastiSqliteActionGetDeletedTodoLists.class);
        connector_actions.put(FastiActionGetDeletedEvents.class, FastiSqliteActionGetDeletedEvents.class);
        connector_actions.put(FastiActionGetNewCalendar.class, FastiSqliteActionGetNewCalendar.class);
        connector_actions.put(FastiActionGetNewEvents.class, FastiSqliteActionGetNewEvents.class);
        connector_actions.put(FastiActionGetNewTodoLists.class, FastiSqliteActionGetNewTodoLists.class);
        connector_actions.put(FastiActionGetNewTodos.class, FastiSqliteActionGetNewTodos.class);
        connector_actions.put(FastiActionGetUpdatedCalendar.class, FastiSqliteActionGetUpdatedCalendar.class);
        connector_actions.put(FastiActionGetUpdatedEvents.class, FastiSqliteActionGetUpdatedEvents.class);
        connector_actions.put(FastiActionGetUpdatedTodoLists.class, FastiSqliteActionGetUpdatedTodoLists.class);
        connector_actions.put(FastiActionGetUpdatedTodos.class, FastiSqliteActionGetUpdatedTodos.class);
        connector_actions.put(FastiActionAddTodo.class, FastiSqliteActionAddTodo.class);
        connector_actions.put(FastiActionGetTodo.class, FastiSqliteActionGetTodo.class);
        connector_actions.put(FastiActionGetTodoProgress.class, FastiSqliteActionGetTodoProgress.class);
        connector_actions.put(FastiActionGetTodos.class, FastiSqliteActionGetTodos.class);
        connector_actions.put(FastiActionRemoveTodo.class, FastiSqliteActionRemoveTodo.class);
        connector_actions.put(FastiActionSetTodo.class, FastiSqliteActionSetTodo.class);
        connector_actions.put(FastiActionSetTodoProgress.class, FastiSqliteActionSetTodoProgress.class);
        connector_actions.put(FastiActionAddTodoList.class, FastiSqliteActionAddTodoList.class);
        connector_actions.put(FastiActionGetTodoList.class, FastiSqliteActionGetTodoList.class);
        connector_actions.put(FastiActionRemoveTodoList.class, FastiSqliteActionRemoveTodoList.class);
        connector_actions.put(FastiActionSetTodoList.class, FastiSqliteActionSetTodoList.class);
        connector_actions.put(FastiShowCalendarAddEditTabAction.class, FastiSqliteShowCalendarAddEditTabAction.class);
        connector_actions.put(FastiShowCalendarContextMenuAction.class, FastiSqliteShowCalendarContextMenuAction.class);
        connector_actions.put(FastiShowConfigurationMenueAction.class, FastiSqliteShowConfigurationMenueAction.class);
        connector_actions.put(FastiShowEventAddEditTabAction.class, FastiSqliteShowEventAddEditTabAction.class);
        connector_actions.put(FastiShowEventContextMenuAction.class, FastiSqliteShowEventContextMenuAction.class);
        connector_actions.put(FastiShowTodoContextMenuAction.class, FastiSqliteShowTodoContextMenuAction.class);
        connector_actions.put(FastiShowTodoListContextMenuAction.class, FastiSqliteShowTodoListContextMenuAction.class);    }

}
