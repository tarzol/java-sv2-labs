package interfaces.simplethread;

import java.util.ArrayList;
import java.util.List;

public class SimpleThread implements Runnable {
    private List<String> tasks = new ArrayList<>();

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void run() {
        while (!tasks.isEmpty()) {
            nextStep();
        }
    }

    public void nextStep() {
        if (tasks !=null && !tasks.isEmpty()) {
            tasks.remove(tasks.size()-1);
        }
    }



}
