package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleTasks implements Runnable  {

    private List<String> tasks;

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (!tasks.isEmpty()) {
            nextStep();
        }
    }

    public void nextStep() {
        if (tasks !=null && !tasks.isEmpty()) {
            System.out.println(tasks.get(tasks.size()-1));
            tasks.remove(tasks.size()-1);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    public static void main(String[] args) {
        SimpleTasks tasks = new SimpleTasks(Arrays.asList("alma", "körte", "szilva"));
        tasks.run();
    }
}
