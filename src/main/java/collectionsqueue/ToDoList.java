package collectionsqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ToDoList {
    private List<ToDo> todos = new LinkedList<>();

    public void addToDo(ToDo toDo) {
        todos.add(toDo);
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();
        for ( ToDo actual : todos ) {
            if ( actual.isUrgent() == true ) {
                result.addFirst(actual);
            } else {
                result.addLast(actual);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addToDo(new ToDo("kenyeret venni", false));
        toDoList.addToDo(new ToDo("varrónő", true));
        toDoList.addToDo(new ToDo("gyereknek télikabát", false));
        toDoList.addToDo(new ToDo("autó olajcsere", true));
        Deque<ToDo> todos = toDoList.getTodosInUrgencyOrder();
        System.out.println(todos);
        System.out.println(todos.pop().getDescription());
        System.out.println(todos.pop().getDescription());
        System.out.println(todos.pop().getDescription());
        System.out.println(todos.pop().getDescription());
    }

}
