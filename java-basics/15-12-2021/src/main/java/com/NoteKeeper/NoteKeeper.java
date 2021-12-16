package com.NoteKeeper;

import java.util.*;

public class NoteKeeper {
    PriorityQueue<String> todoListCompleted = new PriorityQueue<String>();
    PriorityQueue<String> todoListNotCompleted = new PriorityQueue<String>();
    PriorityQueue<String> todoList = new PriorityQueue<String>();
    ArrayList<String> removedList = new ArrayList<>();


    public void addItemsInToDoList(String item, boolean completedOrNotCompleted) {
        if (completedOrNotCompleted) {
            todoListCompleted.add(item);
            todoList.addAll(todoListCompleted);
        } else {
            todoListNotCompleted.add(item);
            todoList.addAll(todoListNotCompleted);
        }

    }

    public String checkItemAddedInToDoList(String item) {
        String existingItem = null;
        for (String list : todoList) {
            if (list == item) {
                existingItem = item;
                break;
            }
        }
        return existingItem;
    }


    public boolean removeItemsFromToDoList(String item) {
        return todoList.removeIf(list -> list == item);
    }


    public boolean retrieveItemsFromRemovedList(String item) {
        boolean task = false;
        removedList.add(item);
        todoList.removeIf(list -> list == item);
        todoList.addAll(removedList);
        if (todoList.contains(item)) {
            task = true;
        }
        return task;
    }

    public boolean listOfItemsCompletedOrNotCompleted(String completedOrNotCompletedList) {
        boolean task = false;
        for (String list : todoListCompleted) {
            if (list == completedOrNotCompletedList) {
                task = true;
            }
        }
        for (String list : todoListNotCompleted) {
            if (list == completedOrNotCompletedList) {
                task = false;
            }

        }
        return task;
    }


}
