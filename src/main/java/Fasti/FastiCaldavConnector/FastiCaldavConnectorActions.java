/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Fasti.FastiCaldavConnector;

import Fasti.FastiConnector.FastiAction.CalendarActions.*;
import Fasti.FastiConnector.FastiAction.EventActions.*;
import Fasti.FastiConnector.FastiAction.GeneralActions.*;
import Fasti.FastiConnector.FastiAction.SyncActions.*;
import Fasti.FastiConnector.FastiAction.TodoActions.*;
import Fasti.FastiConnector.FastiAction.TodoListActions.*;
import Fasti.FastiConnector.FastiAction.UIActions.*;
import Fasti.FastiConnector.FastiConnectorActions;
import Fasti.FastiCaldavConnector.StandardActions.*;


public class FastiCaldavConnectorActions extends FastiConnectorActions {

    public FastiCaldavConnectorActions() {
        connector_actions.put(FastiActionAddCalendar.class, FastiCaldavActionAddCalendar.class);
        connector_actions.put(FastiActionGetCalendar.class, FastiCaldavActionGetCalendar.class);
        connector_actions.put(FastiActionRemoveCalendar.class, FastiCaldavActionRemoveCalendar.class);
        connector_actions.put(FastiActionSetCalendar.class, FastiCaldavActionSetCalendar.class);
        connector_actions.put(FastiActionAddEvent.class, FastiCaldavActionAddEvent.class);
        connector_actions.put(FastiActionGetEvent.class, FastiCaldavActionGetEvent.class);
        connector_actions.put(FastiActionGetEvents.class, FastiCaldavActionGetEvents.class);
        connector_actions.put(FastiActionRemoveEvent.class, FastiCaldavActionRemoveEvent.class);
        connector_actions.put(FastiActionSetEvent.class, FastiCaldavActionSetEvent.class);
        connector_actions.put(FastiActionConnect.class, FastiCaldavActionConnect.class);
        connector_actions.put(FastiActionDisconnect.class, FastiCaldavActionDisconnect.class);
        connector_actions.put(FastiActionGetDeletedCalendar.class, FastiCaldavActionGetDeletedCalendar.class);
        connector_actions.put(FastiActionGetDeletedTodoLists.class, FastiCaldavActionGetDeletedTodoLists.class);
        connector_actions.put(FastiActionGetDeletedEvents.class, FastiCaldavActionGetDeletedEvents.class);
        connector_actions.put(FastiActionGetNewCalendar.class, FastiCaldavActionGetNewCalendar.class);
        connector_actions.put(FastiActionGetNewEvents.class, FastiCaldavActionGetNewEvents.class);
        connector_actions.put(FastiActionGetNewTodoLists.class, FastiCaldavActionGetNewTodoLists.class);
        connector_actions.put(FastiActionGetNewTodos.class, FastiCaldavActionGetNewTodos.class);
        connector_actions.put(FastiActionGetUpdatedCalendar.class, FastiCaldavActionGetUpdatedCalendar.class);
        connector_actions.put(FastiActionGetUpdatedEvents.class, FastiCaldavActionGetUpdatedEvents.class);
        connector_actions.put(FastiActionGetUpdatedTodoLists.class, FastiCaldavActionGetUpdatedTodoLists.class);
        connector_actions.put(FastiActionGetUpdatedTodos.class, FastiCaldavActionGetUpdatedTodos.class);
        connector_actions.put(FastiActionAddTodo.class, FastiCaldavActionAddTodo.class);
        connector_actions.put(FastiActionGetTodo.class, FastiCaldavActionGetTodo.class);
        connector_actions.put(FastiActionGetTodoProgress.class, FastiCaldavActionGetTodoProgress.class);
        connector_actions.put(FastiActionGetTodos.class, FastiCaldavActionGetTodos.class);
        connector_actions.put(FastiActionRemoveTodo.class, FastiCaldavActionRemoveTodo.class);
        connector_actions.put(FastiActionSetTodo.class, FastiCaldavActionSetTodo.class);
        connector_actions.put(FastiActionSetTodoProgress.class, FastiCaldavActionSetTodoProgress.class);
        connector_actions.put(FastiActionAddTodoList.class, FastiCaldavActionAddTodoList.class);
        connector_actions.put(FastiActionGetTodoList.class, FastiCaldavActionGetTodoList.class);
        connector_actions.put(FastiActionRemoveTodoList.class, FastiCaldavActionRemoveTodoList.class);
        connector_actions.put(FastiActionSetTodoList.class, FastiCaldavActionSetTodoList.class);
        connector_actions.put(FastiShowCalendarAddEditTabAction.class, FastiCaldavShowCalendarAddEditTabAction.class);
        connector_actions.put(FastiShowCalendarContextMenuAction.class, FastiCaldavShowCalendarContextMenuAction.class);
        connector_actions.put(FastiShowConfigurationMenueAction.class, FastiCaldavShowConfigurationMenueAction.class);
        connector_actions.put(FastiShowEventAddEditTabAction.class, FastiCaldavShowEventAddEditTabAction.class);
        connector_actions.put(FastiShowEventContextMenuAction.class, FastiCaldavShowEventContextMenuAction.class);
        connector_actions.put(FastiShowTodoContextMenuAction.class, FastiCaldavShowTodoContextMenuAction.class);
        connector_actions.put(FastiShowTodoListContextMenuAction.class, FastiCaldavShowTodoListContextMenuAction.class);    }

}
