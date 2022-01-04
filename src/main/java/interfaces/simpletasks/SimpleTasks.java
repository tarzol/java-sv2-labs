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
        while (nextStep()) {
            //System.out.println(tasks.get(tasks.size()-1));
            //nextStep();
        }
    }

    public boolean nextStep() {
        if (tasks !=null && !tasks.isEmpty()) {
            System.out.println(tasks.get(tasks.size()-1));
            tasks.remove(tasks.size()-1);
        }
        if (tasks.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("alma");
        fruits.add("körte");
        fruits.add("szilva");
        SimpleTasks tasks = new SimpleTasks(fruits);
        tasks.run();
    }
}
