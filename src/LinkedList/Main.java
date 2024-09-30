package LinkedList;

import java.util.*;

public class Main
{
    public static void main(String [] args){
        LinkedList<String> actions = new LinkedList<>();

// Perform actions
        actions.add("Action 1");
        actions.add("Action 2");
        actions.add("Action 3");

// Undo the last action
        String undoAction = actions.removeLast();
        System.out.println("Undo: " + undoAction);

// Redo the last undone action
        actions.add(undoAction);
        System.out.println("Redo: " + undoAction);

    }
}
